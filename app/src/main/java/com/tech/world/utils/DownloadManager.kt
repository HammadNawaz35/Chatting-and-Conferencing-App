package com.tech.world.utils

import android.net.Uri
import android.os.Build
import android.util.Log
import com.tech.world.events.OnNetworkComplete
import com.tech.world.events.UpdateNetworkProgress
import com.tech.world.job.NetworkJobService
import com.tech.world.model.ProgressData
import com.tech.world.model.constants.DownloadUploadStat
import com.tech.world.model.constants.MessageStat
import com.tech.world.model.constants.MessageType
import com.tech.world.model.realms.Message
import com.tech.world.utils.enc.EncryptionHelper
import com.tech.world.utils.enc.MessageEncryptor
import com.tech.world.utils.mediastore.MessageMediaStore
import com.tech.world.utils.network.FireManager.Companion.getRef
import com.google.firebase.storage.FileDownloadTask
import com.google.firebase.storage.StorageException
import com.google.firebase.storage.UploadTask
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.Dispatchers.Main
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.greenrobot.eventbus.EventBus
import java.io.File
import java.util.*

/**
 * Created by Devlomi on 06/01/2018.
 */
//this class is responsible for making upload/download files from Firebase Storage
//it's also responsible for saving messages in database
class DownloadManager {

    companion object {
        //save the file download task to cancel it later if user wants to
        var downloadTaskHashmap = HashMap<String, FileDownloadTask>()

        //save the file upload task to cancel it later if user wants to
        var uploadTaskHashMap = HashMap<String, UploadTask>()

        //used in activity to get the current progress
        @JvmField
        var progressDataHashMap = HashMap<String, ProgressData>()


        @JvmStatic
        fun cancelDownload(message: Message) {
            val messageId = message.messageId
            if (downloadTaskHashmap.containsKey(messageId)) {
                val fileDownloadTask = downloadTaskHashmap[messageId]
                fileDownloadTask!!.cancel()
                downloadTaskHashmap.remove(messageId)
                FileUtils.deleteFile(message.localPath)
            }
            removeProgressFromHashmap(messageId)
            RealmHelper.getInstance()
                .changeDownloadOrUploadStat(messageId, DownloadUploadStat.CANCELLED)
            if (BuildVerUtil.isOreoOrAbove()) {
                NetworkJobService.cancel(messageId)
            }
        }

        @JvmStatic
        fun cancelDownload(messageId: String) {
            val message = RealmHelper.getInstance().getMessage(messageId)
            if (downloadTaskHashmap.containsKey(messageId)) {
                val fileDownloadTask = downloadTaskHashmap[messageId]
                fileDownloadTask!!.cancel()
                downloadTaskHashmap.remove(messageId)
                FileUtils.deleteFile(message.localPath)
            }
            removeProgressFromHashmap(messageId)
            RealmHelper.getInstance()
                .changeDownloadOrUploadStat(messageId, DownloadUploadStat.CANCELLED)
            if (BuildVerUtil.isOreoOrAbove()) {
                NetworkJobService.cancel(messageId)
            }
        }

        @JvmStatic
        fun cancelUpload(message: Message) {
            val messageId = message.messageId
            if (uploadTaskHashMap.containsKey(messageId)) {
                val uploadTask = uploadTaskHashMap[messageId]
                uploadTask!!.cancel()
                uploadTaskHashMap.remove(messageId)
            }
            removeProgressFromHashmap(messageId)
            RealmHelper.getInstance()
                .changeDownloadOrUploadStat(messageId, DownloadUploadStat.CANCELLED)
            if (BuildVerUtil.isOreoOrAbove()) {
                NetworkJobService.cancel(messageId)
            }
        }

        @JvmStatic
        fun cancelUpload(messageId: String) {
            if (uploadTaskHashMap.containsKey(messageId)) {
                val uploadTask = uploadTaskHashMap[messageId]
                uploadTask!!.cancel()
                uploadTaskHashMap.remove(messageId)
            }
            removeProgressFromHashmap(messageId)
            RealmHelper.getInstance()
                .changeDownloadOrUploadStat(messageId, DownloadUploadStat.CANCELLED)
            if (BuildVerUtil.isOreoOrAbove()) {
                NetworkJobService.cancel(messageId)
            }
        }


        @JvmStatic
        fun cancelAllTasks() {
            for (s in downloadTaskHashmap.keys) {
                cancelDownload(s) /*second param is just dummy param here :D*/
            }
            for (s in uploadTaskHashMap.keys) {
                cancelUpload(s) /*second param is just dummy param here :D*/
            }
        }

        private fun removeProgressFromHashmap(messageId: String) {
            if (progressDataHashMap.containsKey(messageId)) progressDataHashMap.remove(messageId)
        }
    }

    private val encryptionHelper = EncryptionHelper()
    private val messageEncryptor = MessageEncryptor(encryptionHelper)

    //download from firebase storage
    fun download(message: Message, onComplete: OnComplete?) {
        val type = message.type
        val link = message.content
        val messageId = message.messageId
        val receiverId = message.chatId
        if (link.isNullOrEmpty()) return

        //generate file in the correct directory
        val file: File =
            when (type) {
                MessageType.RECEIVED_FILE -> DirManager.generateFileForFilesType(
                    type,
                    Util.getFileNameFromPath(link)
                )
                MessageType.RECEIVED_AUDIO -> DirManager.generateAudioFile(
                    type,
                    Util.getFileExtensionFromPath(link)
                )
                else -> DirManager.generateFile(type)
            }


        //get firebase storage ref
        val ref = FireConstants.storageRef.child(link)
        setMessageContent(link, message)


        //get download task
        val task = ref.getFile(file)

        //save task to hashmap
        fillTaskHashmap(messageId, task)


        //listen for progress
        task.addOnProgressListener { taskSnapshot ->
            val progressDouble = 100.0 * taskSnapshot.bytesTransferred / taskSnapshot.totalByteCount

            //get progress
            val progress = progressDouble.toInt()
            //save progress to hashmap
            fillProgressHashmap(messageId, receiverId, progress)

            //update activity with the progress
            updateProgress(messageId, progress)
        }.addOnCompleteListener { task ->
            //update activity UI
            onComplete(messageId)
            removeTaskFromHashmap(messageId)
            removeProgressFromHashmap(messageId)

            //if download completed successfully and the user did not cancel the process
            if (task.isSuccessful && message.completeAfterDownload()) {

                // if it's a video generate the video thumb (without blur)
                if (MessageType.isVideo(type)) {
                    val videoThumb = BitmapUtils.generateVideoThumbAsBase64(file.path)
                    if (videoThumb != null) RealmHelper.getInstance()
                        .setVideoThumb(messageId, message.chatId, videoThumb)
                }
                //update downloadupload state to success
                RealmHelper.getInstance()
                    .updateDownloadUploadStat(messageId, DownloadUploadStat.SUCCESS, file.path)
                if (BuildVerUtil.isApi29OrAbove()) {
                    try {
                        MessageMediaStore.saveToMediaStore(message, file.name)?.let { uri ->
                            setMessageUri(uri, message)
                        }

                    } catch (e: Exception) {
                        e.printStackTrace()
                    }
                }

                updateJobCallback(true, onComplete)


            } else {
                val exception = task.exception as StorageException?
                //if this process was not cancelled by the user (a network failure for example) then set the state as failed
                if (exception != null && exception.errorCode != StorageException.ERROR_CANCELED) {
                    RealmHelper.getInstance()
                        .changeDownloadOrUploadStat(messageId, DownloadUploadStat.FAILED)
                    updateJobCallback(false, onComplete)
                } else {
                    updateJobCallback(true, onComplete)
                }
                //delete uncompleted file from device
                FileUtils.deleteFile(file.path)
            }
        }
    }


    private fun updateJobCallback(isSuccess: Boolean, onComplete: OnComplete?) {
        onComplete?.onComplete(isSuccess)
    }

    private fun fillProgressHashmap(messageId: String, receiverId: String, progress: Int) {
        val progressData = ProgressData(progress, receiverId, messageId)
        progressDataHashMap[messageId] = progressData
    }


    private fun fillTaskHashmap(messageId: String, downloadTask: FileDownloadTask) {
        downloadTaskHashmap[messageId] = downloadTask
    }

    private fun fillTaskHashmap(messageId: String, uploadTask: UploadTask) {
        uploadTaskHashMap[messageId] = uploadTask
    }

    private fun removeTaskFromHashmap(messageId: String) {
        if (uploadTaskHashMap.containsKey(messageId)) uploadTaskHashMap.remove(messageId)
        if (downloadTaskHashmap.containsKey(messageId)) downloadTaskHashmap.remove(messageId)
    }


    private fun updateProgress(id: String, progress: Int) {
        EventBus.getDefault().post(UpdateNetworkProgress(id, progress))
    }

    private fun onComplete(id: String) {
        EventBus.getDefault().post(OnNetworkComplete(id))
    }

    //send a message to Firebase database
    suspend fun sendMessage(message: Message, scope: CoroutineScope, onComplete: OnComplete?) {
        withContext(Main) {
            try {


                val copiedMessage = RealmHelper.getInstance().copyMessage(message)
                var encryptedMessage: Message
                withContext(IO) {
                    encryptedMessage = messageEncryptor.encryptMessage(copiedMessage, this)
                }


                val pushKey = message.messageId

                //convert message object to a Map
                val postValues = encryptedMessage.toMap()

                val childUpdates: MutableMap<String, Any> = HashMap()
                //add message id and the map
                childUpdates[pushKey] = postValues

                //send the message to firebase database
                FireConstants.getMessageRef(message.isGroup, message.isBroadcast, message.chatId)
                    .updateChildren(childUpdates)
                    .addOnCompleteListener { task -> //update message state to SENT if it's success
                        if (task.isSuccessful) {
                            // if it's a broadcast update all copied messages
                            if (message.isBroadcast) {
                                val broadcastedMessages =
                                    RealmHelper.getInstance().getMessages(message.messageId)
                                for (broadcastedMessage in broadcastedMessages) {
                                    RealmHelper.getInstance().updateMessageStatLocally(
                                        broadcastedMessage.messageId,
                                        broadcastedMessage.chatId,
                                        MessageStat.SENT
                                    )
                                }
                            } else {
                                RealmHelper.getInstance()
                                    .updateMessageStatLocally(pushKey, MessageStat.SENT)
                            }
                        }
                        updateJobCallback(task.isSuccessful, onComplete)
                    }
            } catch (e: Exception) {
            }
        }


    }

    private suspend fun upload(message: Message, scope: CoroutineScope, onComplete: OnComplete?) {


        //get file path
        val filePath = message.localPath
        val pushKey = message.messageId
        //get file name from file path
        val fileName = Util.getFileNameFromPath(filePath)
        //get receiver uid
        val receiverId = message.toId

        //get correct ref in firebase storage folders ,if it's an image it will be saved in images folder
        //if it's a video it will be saved in video folder
        val ref = getRef(message.type, fileName)
        val task = ref.putFile(Uri.fromFile(File(filePath)))
        fillTaskHashmap(pushKey, task)
        task.addOnProgressListener { taskSnapshot ->
            try {
                val bytesTransferred = taskSnapshot.bytesTransferred.toInt()
                val totalBytes = taskSnapshot.totalByteCount.toInt()
                val progress = 100 * bytesTransferred / totalBytes
                fillProgressHashmap(pushKey, receiverId, progress)

                //update progress in UI
                updateProgress(pushKey, progress)
            } catch (e: Exception) {
            }
        }.addOnCompleteListener { task ->
            //UPDATE UI
            onComplete(pushKey)
            removeProgressFromHashmap(pushKey)
            removeTaskFromHashmap(pushKey)


            // check if upload is success && the user is not cancelled the upload request
            if (task.isSuccessful && message.completeAfterDownload()) {

                //get the firebase folder path to save it locally (used when forwarding a message
                // so we don't re-upload files to firebase storage
                val filePathBucket = task.result.storage.path
                //save it locally
                setMessageContent(filePathBucket, message)




                scope.launch(Main) {
                    try {
                        val copiedMessage = RealmHelper.getInstance().copyMessage(message)

                        var encryptedMessage: Message
                        withContext(IO) {

                            encryptedMessage =
                                messageEncryptor.encryptMessage(copiedMessage, this)
                        }
                        val postValues = encryptedMessage.toMap()
                        val childUpdates: MutableMap<String, Any> = HashMap()
                        childUpdates[pushKey] = postValues

                        FireConstants.getMessageRef(
                            message.isGroup,
                            message.isBroadcast,
                            message.chatId
                        ).updateChildren(childUpdates)
                            .addOnCompleteListener { mTask -> //update download upload state if it's success or not
                                RealmHelper.getInstance().updateDownloadUploadStat(
                                    pushKey,
                                    if (mTask.isSuccessful) DownloadUploadStat.SUCCESS else DownloadUploadStat.FAILED
                                )
                                updateJobCallback(mTask.isSuccessful, onComplete)
                            }
                    } catch (e: Exception) {
                        updateJobCallback(false, onComplete)
                    }

                }

            } else {
                //if this process was not cancelled by the user (a network failure for example) then set the state as failed
                val exception = task.exception as StorageException?
                if (exception != null && exception.errorCode != StorageException.ERROR_CANCELED) {
                    RealmHelper.getInstance()
                        .changeDownloadOrUploadStat(pushKey, DownloadUploadStat.FAILED)
                    updateJobCallback(false, onComplete)
                } else {
                    updateJobCallback(true, onComplete)
                }
            }

        }

    }

    //save file link from firebase storage in realm to use it later when forward a message
    private fun setMessageContent(filePath: String, message: Message) {
        try {
            //save it when the message is not saved to realm yet
            message.content = filePath
            RealmHelper.getInstance().changeMessageContent(message.messageId, filePath)
        } catch (e: IllegalStateException) {
            e.printStackTrace()
            //otherwise  the message is exists and update it using transaction
            RealmHelper.getInstance().changeMessageContent(message.messageId, filePath)
        }
    }

    private fun setMessageUri(uri: Uri, message: Message) {
        try {
            //save it when the message is not saved to realm yet
            message.uri = uri.toString()
            RealmHelper.getInstance().setMessageUri(message.messageId, uri.toString())
        } catch (e: IllegalStateException) {
            e.printStackTrace()
            //otherwise  the message is exists and update it using transaction
            RealmHelper.getInstance().setMessageUri(message.messageId, uri.toString())
        }
    }


    suspend fun request(message: Message, scope: CoroutineScope, onComplete: OnComplete?) {
        val type = message.type
        if (MessageType.isSentType(type)) {
            when (type) {
                MessageType.SENT_TEXT, MessageType.SENT_CONTACT, MessageType.SENT_LOCATION -> sendMessage(
                    message,
                    scope,
                    onComplete
                )
                else -> if (message.isForwarded) {
                    sendMessage(message, scope, onComplete)
                } else {
                    upload(message, scope, onComplete)
                }
            }
        } else {
            download(message, onComplete)
        }
    }

    interface OnComplete {
        fun onComplete(isSuccess: Boolean)
    }
}