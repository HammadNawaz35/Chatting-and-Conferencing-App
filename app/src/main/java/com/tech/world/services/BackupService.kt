package com.tech.world.services

import android.content.Intent
import android.util.Log
import androidx.core.app.NotificationCompat
import androidx.core.net.toUri
import androidx.lifecycle.LifecycleService
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.tech.world.extensions.writeFromFile
import com.tech.world.model.BackupInfo
import com.tech.world.model.constants.BackupTypes
import com.tech.world.utils.*
import com.google.gson.Gson
import kotlinx.coroutines.*
import kotlinx.coroutines.Dispatchers.IO
import java.io.File

class BackupService : LifecycleService() {


    companion object {
        private val _progress = MutableLiveData<Int>()
        val progress: LiveData<Int> get() = _progress

        private val _event = MutableLiveData<BackupServiceEvent>()
        val event: LiveData<BackupServiceEvent> get() = _event

        const val BACKUP_VERSION = "1.0"

    }

    val foregroundNotificationId = NotificationHelper.generateId()

    override fun onCreate() {
        super.onCreate()
        notificationHelper = NotificationHelper(this)
    }

    val backupFile = File(DirManager.backupFolder() + "/backup.zip")


    private val sentVoice = DirManager.sentVoiceMessageDir()
    private val receivedVoice = DirManager.voiceMessagesReceived()

    private val sentImages = DirManager.getSentImagesFolder()
    private val receivedImages = DirManager.receivedImagesDir()

    private val sentVideos = DirManager.sentVideoDir()
    private val receivedVideos = DirManager.receivedVideoDir()

    private val sentAudio = DirManager.getSentAudioFolder()
    private val receivedAudio = DirManager.getReceivedAudioFolder()

    private val sentFiles = DirManager.getSentFilesFolder()
    private val receivedFiles = DirManager.getReceivedFilesFolder()

    private val sentStickers = DirManager.getSentStickersFolder()
    private val receivedStickers = DirManager.getReceivedStickersFolder()

    private val parentJob = SupervisorJob()
    private val scope = CoroutineScope(Dispatchers.Main + parentJob)

    private val zipUtil: ZipUtil by lazy {
        ZipUtil()
    }

    private var backupNotification: NotificationCompat.Builder? = null
    private var notificationHelper: NotificationHelper? = null


    private var totalSize = 0L
    private var transferredBytes = 1L

    private fun getSentItems(): Array<String> {
        return arrayOf(sentVoice, sentImages, sentVideos, sentAudio, sentFiles, sentStickers)
    }

    private fun getReceivedItems(): Array<String> {
        return arrayOf(
            receivedVoice,
            receivedImages,
            receivedVideos,
            receivedAudio,
            receivedFiles,
            receivedStickers
        )
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        super.onStartCommand(intent, flags, startId)
        intent?.let { intent ->
            intent.action?.also { action ->
                if (action == IntentUtils.ACTION_START_BACKUP) {
                    intent.extras?.getInt(IntentUtils.INTENT_EXTRA_BACKUP_TYPE)?.let { backupType ->
                        intent.extras?.getString(IntentUtils.EXTRA_URI)?.let { uri ->
                            startForeground()
                            startBackup(backupType, uri)
                        }

                    }
                } else if (action == IntentUtils.ACTION_CANCEL_BACKUP) {
                    cancelBackup()
                }
            }
        }

        return START_STICKY
    }

    private fun cancelBackup() {
        val id = NotificationHelper.generateId()
        notificationHelper?.notifyNotification(
            id,
            notificationHelper?.createBackupFailedNotification(id)
                ?.build()
        )
        parentJob?.cancel()

        _event.value = BackupServiceEvent.BackupCancelled
        backupFile.delete()
        stopService()

    }

    private fun startForeground() {
        backupNotification =
            notificationHelper?.createBackupNotification(foregroundNotificationId, 0)
        startForeground(foregroundNotificationId, backupNotification?.build())
    }

    private fun startBackup(backupType: Int, uri: String) {

        _event.value = BackupServiceEvent.BackupStarted

        try {
            RealmBackupRestore().backup()
        } catch (e: Exception) {
            _event.value = BackupServiceEvent.BackupError(e)
            val id = NotificationHelper.generateId()
            notificationHelper?.notifyNotification(
                id,
                notificationHelper?.createBackupFailedNotification(id)
                    ?.build()
            )
            return
        }

        val databasesFolder = DirManager.getDatabasesFolder()


        val folderToZip = when (backupType) {
            BackupTypes.SENT_ITEMS_ONLY -> getSentItems()
            BackupTypes.RECEIVED_ITEMS_ONLY -> getReceivedItems()
            BackupTypes.SENT_AND_RECEIVED_VOICE -> arrayOf(sentVoice, receivedVoice)
            else -> getSentItems() + getReceivedItems()
        } + databasesFolder.path





        zipUtil.finishedBytes.observe(this) {
            transferredBytes += it

            val progress = 100.0 * transferredBytes / totalSize

            backupNotification?.setProgress(100, progress.toInt(), false)

            backupNotification?.let { notification ->
                notificationHelper?.notifyNotification(
                    foregroundNotificationId,
                    notification.build()
                )
            }


            _progress.value = progress.toInt()
        }




        scope.launch(IO) {
            try {
                totalSize = folderToZip.sumOf {
                    GetFolderSize.getSize(it)
                }

                val jsonFile = createJsonFile(backupType)


                zipUtil.zipFolders(folderToZip, arrayOf(jsonFile.path), backupFile.path)
                saveFileToUri(uri, backupFile)

                withContext(Dispatchers.Main) {
                    backupCompleted()
                }

                backupFile.delete()
                jsonFile.delete()

            } catch (e: Exception) {
                if (e is CancellationException) {
                    return@launch
                }
                withContext(Dispatchers.Main) {
                    _event.value = BackupServiceEvent.BackupError(e)
                    val id = NotificationHelper.generateId()
                    notificationHelper?.notifyNotification(
                        id,
                        notificationHelper?.createBackupFailedNotification(id)
                            ?.build()
                    )
                }
            }
        }

    }

    private fun saveFileToUri(uri: String, file: File) {
        contentResolver.openOutputStream(uri.toUri())?.use { outputStream ->
//            file.copyOutputStreamToFile(outputStream)
            outputStream.writeFromFile(file)
        } ?: throw Exception()
    }

    private fun createJsonFile(backupType: Int): File {
        val json = Gson().toJson(
            BackupInfo(
                backupType,
                BACKUP_VERSION,
                totalSize,
                System.currentTimeMillis()
            )
        )

        val jsonFile = File(cacheDir, "backup-info.json")
        if (jsonFile.exists()) {
            jsonFile.delete()
        }

        jsonFile.createNewFile()
        jsonFile.writeText(json)
        return jsonFile
    }

    private fun backupCompleted() {
        _event.value = BackupServiceEvent.BackupFinished
        val id = NotificationHelper.generateId()
        notificationHelper?.notifyNotification(
            id,
            notificationHelper?.createBackupCompletedNotification(id)
                ?.build()
        )

        reset()
        stopService()

    }

    private fun stopService() {
        stopForeground(true)
        stopSelf()
    }

    override fun onDestroy() {
        parentJob?.cancel()
        _event.value = null
        super.onDestroy()
    }

    private fun reset() {
        transferredBytes = 1
        totalSize = 0
    }

}

sealed class BackupServiceEvent {
    object BackupStarted : BackupServiceEvent()
    object BackupFinished : BackupServiceEvent()
    object BackupCancelled : BackupServiceEvent()
    data class BackupError(val error: Exception) : BackupServiceEvent()
}