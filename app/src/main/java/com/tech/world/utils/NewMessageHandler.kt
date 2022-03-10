package com.tech.world.utils

import android.content.Context
import com.tech.world.model.realms.TempMessage
import com.tech.world.common.extensions.toDeffered
import com.tech.world.model.constants.*
import com.tech.world.model.realms.*
import com.tech.world.services.CallingService
import com.tech.world.utils.enc.MessageDecryptor
import com.tech.world.utils.network.CallsManager
import com.tech.world.utils.network.FireManager
import com.tech.world.utils.network.FireManager.Companion.uid
import com.tech.world.utils.network.GroupManager
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.rxkotlin.addTo
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.Dispatchers.Main
import kotlinx.coroutines.withContext

class NewMessageHandler(
    private val context: Context,
    private val fireManager: FireManager,
    private val messageDecryptor: MessageDecryptor,
    private val disposables: CompositeDisposable
) {
    //fire notification
    suspend fun handleNewMessage(phone: String, message: Message) {
        withContext(Main) {
            try {

                //if message is already exists don't save it
                if (RealmHelper.getInstance()
                        .getTempMessage(message.messageId) != null || RealmHelper.getInstance()
                        .getMessage(message.messageId) != null
                ) {
                    return@withContext
                }
                val chatId = message.chatId


                //if unknown number contacted us ,we want to download his data and save it in local db
                if (!message.isGroup && RealmHelper.getInstance().getUser(chatId) == null)
                    fireManager.fetchAndSaveUserByPhone(phone).subscribe()
                        .addTo(disposables) //CAN WE ADD THIS TO DISPOSABLES

                //check if auto download is enabled for current network type
                val canDownload = SharedPreferencesManager.canDownload(
                    message.type,
                    NetworkHelper.getCurrentNetworkType(context)
                )
                if (canDownload) {
                    //set state to downloading
                    message.downloadUploadStat = DownloadUploadStat.LOADING
                }

                //save message to database
                if (message.isGroup) {
                    val user = RealmHelper.getInstance().getUser(chatId)
                    if (user != null) {
                        saveMessageAndUpdateCount(message, user)
                    }
                } else {
                    saveMessageAndUpdateCount(message, phone)
                }

                //start auto download
                if (canDownload) {
                    ServiceHelper.startNetworkRequest(context, message.messageId, chatId)
                }


                val messageId = message.messageId
                if (!message.isGroup)
                    setMessageStat(messageId, chatId)


                //if the current activity is not alive OR the activity chatId is not the same with the current chat id
                //then fire notification
                if (chatId != MyApp.currentChatId) {
                    NotificationHelper(context).fireNotification(message.chatId)
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }


    }

    private suspend fun saveMessageAndUpdateCount(
        encryptedMessage: Message,
        phone: String,
    ) {
        val tempMessage = TempMessage.mapMessageToTempMessage(encryptedMessage)
        RealmHelper.getInstance().saveObjectToRealm(tempMessage)

        encryptedMessage.thumb = fetchThumbIfNeeded(encryptedMessage)
        encryptedMessage.content = fetchContentIfNeeded(encryptedMessage)

        var decryptedMessage: Message
        withContext(IO) {
            decryptedMessage = messageDecryptor.decryptMessage(encryptedMessage, this)
        }


        RealmHelper.getInstance().deleteTempMessage(tempMessage.messageId)


        //set message as seen if same chat is already open
        if (NotificationHelper.isBelowApi24() && MyApp.currentChatId == decryptedMessage.chatId) {
            decryptedMessage.isSeen = true
        }

        //save message
        RealmHelper.getInstance().saveMessageFromFCM(context, decryptedMessage, phone)

        //if the current activity is not alive OR the activity chatId is not the same with the current chat id
        //then increment unread count
        if (MyApp.currentChatId != decryptedMessage.chatId) {
            RealmHelper.getInstance()
                .saveUnreadMessage(decryptedMessage.messageId, decryptedMessage.chatId)
        }


    }

    private suspend fun saveMessageAndUpdateCount(
        encryptedMessage: Message,
        user: User,
    ) {


        val tempMessage = TempMessage.mapMessageToTempMessage(encryptedMessage)
        RealmHelper.getInstance().saveObjectToRealm(tempMessage)


        var decryptedMessage: Message
        encryptedMessage.thumb = fetchThumbIfNeeded(encryptedMessage)
        encryptedMessage.content = fetchContentIfNeeded(encryptedMessage)
        withContext(IO) {
            decryptedMessage = messageDecryptor.decryptMessage(encryptedMessage, this)
        }


        RealmHelper.getInstance().deleteTempMessage(tempMessage.messageId)

        //set message as seen if same chat is already open
        if (NotificationHelper.isBelowApi24() && MyApp.currentChatId == decryptedMessage.chatId) {
            decryptedMessage.isSeen = true
        }
        //save message
        RealmHelper.getInstance().saveMessageFromFCM(decryptedMessage, user)

        //if the current activity is not alive OR the activity chatId is not the same with the current chat id
        //then increment unread count
        if (MyApp.currentChatId != decryptedMessage.chatId) {
            RealmHelper.getInstance()
                .saveUnreadMessage(decryptedMessage.messageId, decryptedMessage.chatId)
        }


    }

    //update the sender with message state (received)
    private fun setMessageStat(messageId: String, chatId: String) {
        ServiceHelper.startUpdateMessageStatRequest(
            context,
            messageId,
            uid,
            chatId,
            MessageStat.RECEIVED
        )
    }

    fun handleDeletedMessage(map: Map<String, Any>) {
        (map["messageId"] as? String)?.let { messageId ->
            //if it's already exists do nothing
            if (RealmHelper.getInstance().getDeletedMessage(messageId) != null) return
            if (RealmHelper.getInstance().getTempMessage(messageId) != null) return


            val message = RealmHelper.getInstance().getMessage(messageId)
            RealmHelper.getInstance().setMessageDeleted(messageId)
            RealmHelper.getInstance().deleteTempMessage(messageId)
            if (message != null) {
                if (message.downloadUploadStat == DownloadUploadStat.LOADING) {
                    if (MessageType.isSentType(message.type)) {
                        DownloadManager.cancelUpload(message.messageId)
                    } else DownloadManager.cancelDownload(message.messageId)
                }
                NotificationHelper(context).messageDeleted(message)
            }
        }
    }

    fun handleGroupEvent(map: Map<String, Any>) {
        val groupId = map["groupId"] as? String
        val eventId = map["eventId"] as? String
        val contextStart = map["contextStart"] as? String
        val eventType = (map["eventType"] as? String ?: "0").toInt()
        val contextEnd = map["contextEnd"] as? String
        //if this event was by the admin himself  OR if the event already exists do nothing
        if (contextStart == SharedPreferencesManager.getPhoneNumber() || RealmHelper.getInstance()
                .getMessage(eventId) != null
        ) {
            return
        }

        val groupEvent = GroupEvent(contextStart, eventType, contextEnd, eventId)
        val pendingGroupJob = PendingGroupJob(groupId, PendingGroupTypes.CHANGE_EVENT, groupEvent)
        RealmHelper.getInstance().saveObjectToRealm(pendingGroupJob)
        ServiceHelper.updateGroupInfo(context, groupId, groupEvent)
    }

    fun handleNewGroup(map: Map<String, Any>) {
        val groupId = map["groupId"] as? String
        //if it's already exists do nothing
        if (RealmHelper.getInstance().getPendingGroupJob(groupId) != null) return

        val user = RealmHelper.getInstance().getUser(groupId)


        //if the group is not exists,fetch and download it
        if (user == null) {
            val pendingGroupJob = PendingGroupJob(groupId, PendingGroupTypes.CREATION_EVENT, null)
            RealmHelper.getInstance().saveObjectToRealm(pendingGroupJob)
            ServiceHelper.fetchAndCreateGroup(context, groupId)
        } else {
            val users = user.group.users
            val userById = ListUtil.getUserById(uid, users)

            //if the group is not active or the group does not contain current user
            // then fetch and download it and set it as Active
            if (!user.group.isActive || !users.contains(userById)) {
                val pendingGroupJob =
                    PendingGroupJob(groupId, PendingGroupTypes.CREATION_EVENT, null)
                RealmHelper.getInstance().saveObjectToRealm(pendingGroupJob)
                ServiceHelper.fetchAndCreateGroup(context, groupId)
            }
        }
    }

    fun handleNewCall(fireCall: FireCall) {

        val storedFirecall = RealmHelper.getInstance().getFireCall(fireCall.callId)
        if (storedFirecall != null) return

        if (MyApp.isIsCallActive || TimeHelper.isTimePassedBySeconds(
                System.currentTimeMillis(),
                fireCall.timestamp,
                CallsManager.CALL_TIEMOUT_SECONDS
            )
        ) {
            fireCall.direction = FireCallDirection.MISSED
            RealmHelper.getInstance().saveObjectToRealm(fireCall)
            NotificationHelper(context).createMissedCallNotification(
                fireCall.user,
                fireCall.phoneNumber
            )

            return
        }




        if (fireCall.isGroupCall) {
            if (fireCall.user != null) {
                GroupManager().fetchAndCreateGroup(fireCall.user.uid).subscribe({}, { })
                    .addTo(disposables)
            }

        } else {
            if (fireCall.user != null) {
                FireManager.fetchUserByUid(fireCall.user.uid).subscribe({}, { error -> })
                    .addTo(disposables)
            }
        }




        RealmHelper.getInstance().saveObjectToRealm(fireCall)
        context.startService(
            CallingService.getStartIntent(
                context,
                fireCall,
                IntentUtils.NOTIFICATION_ACTION_START_INCOMING
            )
        )


    }

    /*
    * this will fetch UnDownloaded data like thumb and videoThumb
    * since they're encrypted and exceeds FCM Payload Size 4096 Bytes
    * and FCM will empty these out.
    * */
    private suspend fun fetchThumbIfNeeded(message: Message): String? {
        if (message.type == MessageType.RECEIVED_IMAGE ||
            message.type == MessageType.RECEIVED_VIDEO &&
            message.thumb.isNullOrEmpty()
        ) {
            val dataSnapshot =
                FireConstants.userMessages.child(FireManager.uid).child(message.messageId)
                    .child(DBConstants.THUMB).toDeffered().await()
            return dataSnapshot.value as? String
        }

        return message.thumb


    }

    private suspend fun fetchContentIfNeeded(message: Message): String? {
        if (message.type == MessageType.RECEIVED_TEXT &&
            message.content.isNullOrEmpty()
        ) {
            val dataSnapshot =
                FireConstants.userMessages.child(FireManager.uid).child(message.messageId)
                    .child(DBConstants.CONTENT).toDeffered().await()
            return dataSnapshot.value as? String
        }

        return message.content

    }


}