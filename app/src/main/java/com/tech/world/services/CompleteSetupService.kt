package com.tech.world.services

import android.content.Context
import android.content.Intent
import android.util.Log
import androidx.core.app.NotificationCompat
import androidx.core.net.toUri
import androidx.lifecycle.LifecycleService
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.tech.world.activities.setup.SetupUserUseCase
import com.tech.world.extensions.writeToFile
import com.tech.world.extensions.unzip
import com.tech.world.utils.*
import kotlinx.coroutines.*
import java.io.File
import java.util.*

class CompleteSetupService : LifecycleService() {
    private val parentJob = SupervisorJob()
    private val scope = CoroutineScope(Dispatchers.Main + parentJob)

    private var totalBytes = 1L
    private var transferredBytes = 1L
    private val notificationId = NotificationHelper.generateId()
    private var notification: NotificationCompat.Builder? = null
    private var notificationHelper: NotificationHelper? = null

    private val setupUserUseCase: SetupUserUseCase by lazy {
        SetupUserUseCase()
    }

    companion object {
        private val _progressLiveData = MutableLiveData<Int>()
        val progressLiveData: LiveData<Int> get() = _progressLiveData

        private val _event = MutableLiveData<SetupServiceEvent>()
        val event: LiveData<SetupServiceEvent> get() = _event


        var isAcitve = false
            private set

        fun startService(
            context: Context,
            username: String,
            localPhotoPath: String?,
            backupFileUri: String?,
            databaseFileUri: String?
        ) {
            Intent(context, CompleteSetupService::class.java).apply {
                putExtra(IntentUtils.EXTRA_USERNAME, username)
                putExtra(IntentUtils.EXTRA_PICKED_PHOTO, localPhotoPath)
                putExtra(IntentUtils.EXTRA_PICKED_BACKUP, backupFileUri)
                putExtra(IntentUtils.EXTRA_DB_FILE_URI, databaseFileUri)
                context.startService(this)
            }
        }
    }


    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        super.onStartCommand(intent, flags, startId)
        intent?.let { intent ->
            isAcitve = true

            val imagePath = intent.extras?.getString(IntentUtils.EXTRA_PICKED_PHOTO)
            val backupFileUri = intent.extras?.getString(IntentUtils.EXTRA_PICKED_BACKUP)
            val username = intent.extras?.getString(IntentUtils.EXTRA_USERNAME) ?: " "
            val dbFileUri = intent.extras?.getString(IntentUtils.EXTRA_DB_FILE_URI)

            notificationHelper = NotificationHelper(this)
            notification =
                notificationHelper?.createRestoreNotification(notificationId, 0)
            startForeground(notificationId, notification?.build())

            setupUserUseCase.completeSetupLiveData.observe(this) {
                val (isSuccess, throwable) = it
                if (isSuccess) {
                    _event.value = SetupServiceEvent.SetupFinished
                } else {
                    _event.value = SetupServiceEvent.SetupError(throwable!!)
                }
                stopService()
            }

            scope.launch(Dispatchers.IO) {
                try {

                    withContext(Dispatchers.Main) {
                        _event.value = SetupServiceEvent.SetupStarted
                    }

                    if (backupFileUri != null) {
                        withContext(Dispatchers.Main) {
                            _event.value = SetupServiceEvent.RestoreStarted
                        }
                        startRestore(backupFileUri)
                        withContext(Dispatchers.Main) {
                            SharedPreferencesManager.setFinishedRestoreBackup(true)
                            //delete it since we don't need it anymore
                            SharedPreferencesManager.removeBackupFileUri()
                            _event.value = SetupServiceEvent.SetupFinalizing
                        }
                    } else if (dbFileUri != null) {

                        withContext(Dispatchers.Main) {
                            val file = File(
                                DirManager.getDatabasesFolder(),
                                RealmBackupRestore.EXPORT_REALM_FILE_NAME
                            )
                            contentResolver.openInputStream(dbFileUri.toUri())?.use { inputStream ->
                                inputStream.writeToFile(file)
                            }
                            RealmBackupRestore().restore(true)
                            SharedPreferencesManager.removeBackupFileUri()
                        }

                    }


                    withContext(Dispatchers.Main) {
                        completeSetup(imagePath, username)
                    }


                } catch (e: Exception) {
                    if (e is CancellationException) {
                        return@launch
                    }
                    withContext(Dispatchers.Main) {
                        notificationHelper?.createRestoreBackupFailedNotification(notificationId)
                        _event.value = SetupServiceEvent.SetupError(e)
                    }

                    stopService()

                }
            }


        }

        return START_STICKY
    }

    private fun completeSetup(imagePath: String?, username: String) {
        setupUserUseCase.completeSetup(imagePath, username)
    }


    @Throws(Exception::class)
    private suspend fun startRestore(uri: String) {


        val file = File(DirManager.mainAppFolder())
        val tempZipFile = File(cacheDir, UUID.randomUUID().toString() + ".zip")

        contentResolver.openInputStream(uri.toUri())?.use { inputStream ->
            inputStream.writeToFile(tempZipFile)
        }

        totalBytes = tempZipFile.length()

        tempZipFile.unzip(file) { size ->
            transferredBytes += size

            val progress = 100.0 * transferredBytes / totalBytes
            notification?.setProgress(100, progress.toInt(), false)
            notificationHelper?.notifyNotification(notificationId, notification?.build())
            _progressLiveData.postValue(progress.toInt())
        }



        withContext(Dispatchers.Main) {
            RealmBackupRestore().restore(true)
        }
        tempZipFile.delete()

    }

    private fun stopService() {
        stopForeground(true)
        stopSelf()
    }

    private fun cancelRestore() {
        parentJob.cancel()
        _event.value = SetupServiceEvent.SetupCancelled
    }

    override fun onDestroy() {
        parentJob.cancel()
        _progressLiveData.value = null
        _event.value = null
        isAcitve = false
        setupUserUseCase.onDestroy()
        super.onDestroy()
    }
}

sealed class SetupServiceEvent {
    object SetupStarted : SetupServiceEvent()
    object RestoreStarted : SetupServiceEvent()
    object SetupFinished : SetupServiceEvent()
    object SetupFinalizing : SetupServiceEvent()
    object SetupCancelled : SetupServiceEvent()
    data class SetupError(val error: Throwable) : SetupServiceEvent()
}