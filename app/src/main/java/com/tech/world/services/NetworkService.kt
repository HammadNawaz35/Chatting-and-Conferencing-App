package com.tech.world.services

import android.app.Service
import android.content.Intent
import android.os.IBinder
import com.tech.world.model.realms.GroupEvent
import com.tech.world.services.NetworkService
import com.tech.world.utils.DownloadManager
import com.tech.world.utils.DownloadManager.Companion.cancelAllTasks
import com.tech.world.utils.IntentUtils
import com.tech.world.utils.RealmHelper
import com.tech.world.utils.network.CallsManager
import com.tech.world.utils.network.FireManager
import com.tech.world.utils.network.GroupManager
import io.reactivex.disposables.CompositeDisposable
import kotlinx.coroutines.*
import kotlinx.coroutines.Dispatchers.Main

/**
 * Created by Devlomi on 31/12/2017.
 */
//this is responsible for sending and receiving files/data from firebase using Download Manager Class
class NetworkService : Service() {
    private val disposables = CompositeDisposable()
    private val fireManager = FireManager()
    private val groupManager = GroupManager()
    private val callsManager = CallsManager()
    private val downloadManager = DownloadManager()


    private val parentJob = SupervisorJob()
    private val scope = CoroutineScope(Main + parentJob)


    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        if (intent?.action != null) {
            val chatId = intent.getStringExtra(IntentUtils.EXTRA_CHAT_ID)
            if (intent.action == IntentUtils.INTENT_ACTION_UPDATE_GROUP) {
                val groupEvent: GroupEvent =
                    intent.getParcelableExtra(IntentUtils.EXTRA_GROUP_EVENT)!!
                val groupId = intent.getStringExtra(IntentUtils.EXTRA_GROUP_ID)
                disposables.add(groupManager.updateGroup(groupId!!, groupEvent).subscribe())
            }
            if (intent.action == IntentUtils.INTENT_ACTION_FETCH_AND_CREATE_GROUP) {
                val groupId = intent.getStringExtra(IntentUtils.EXTRA_GROUP_ID)
                disposables.add(groupManager.fetchAndCreateGroup(groupId!!).subscribe())
            } else if (intent.action == IntentUtils.INTENT_ACTION_HANDLE_REPLY) {
                val messageId = intent.getStringExtra(IntentUtils.EXTRA_MESSAGE_ID)
                val message = RealmHelper.getInstance().getMessage(messageId, chatId)
                if (message != null) {
                    scope.launch {
                        downloadManager.sendMessage(
                            message,
                            scope,
                            object : DownloadManager.OnComplete {
                                override fun onComplete(isSuccessful: Boolean) {
                                    if (isSuccessful) {
                                        //set other unread messages as read
                                        if (!message.isGroup) fireManager.setMessagesAsRead(
                                            this@NetworkService,
                                            message.chatId
                                        )
                                        //update unread count to 0
                                    }
                                }
                            })
                    }

                }
            } else if (intent.action == IntentUtils.INTENT_ACTION_SET_CALL_ENDED) {
                val callId = intent.getStringExtra(IntentUtils.CALL_ID)
                val otherUid = intent.getStringExtra(IntentUtils.OTHER_UID)
                val isIncoming = intent.getBooleanExtra(IntentUtils.IS_INCOMING, false)
                disposables.add(
                    callsManager.setCallEnded(callId!!, otherUid!!, isIncoming)
                        .subscribe({}) { throwable: Throwable? -> }
                )
            } else if (intent.action == IntentUtils.INTENT_ACTION_SET_CALL_DECLINED_FOR_GROUP) {
                val callId = intent.getStringExtra(IntentUtils.CALL_ID)
                val groupId = intent.getStringExtra(IntentUtils.EXTRA_GROUP_ID)
                disposables.add(
                    callsManager.setCallRejectedForGroup(callId!!, groupId!!)
                        .subscribe({}) { throwable: Throwable? -> }
                )
            } else {
                val messageId = intent.getStringExtra(IntentUtils.EXTRA_MESSAGE_ID)
                if (intent.action == IntentUtils.INTENT_ACTION_UPDATE_MESSAGE_STATE) {
                    val myUid = intent.getStringExtra(IntentUtils.EXTRA_MY_UID)
                    val state = intent.getIntExtra(IntentUtils.EXTRA_STAT, 0)
                    updateMessageStat(messageId, myUid, chatId, state)
                } else if (intent.action == IntentUtils.INTENT_ACTION_UPDATE_VOICE_MESSAGE_STATE) {
                    val myUid = intent.getStringExtra(IntentUtils.EXTRA_MY_UID)
                    updateVoiceMessageStat(messageId, chatId, myUid)
                } else {
                    val message = RealmHelper.getInstance().getMessage(messageId, chatId)
                    if (message != null) {
                        scope.launch {
                            downloadManager.request(message, scope, null)
                        }
                    }
                }
            }
        }
        return START_STICKY
    }

    fun updateMessageStat(messageId: String?, myUid: String?, chatId: String?, state: Int) {
        disposables.add(
            fireManager.updateMessagesState(myUid!!, messageId!!, state, false).subscribe()
        )
    }

    fun updateVoiceMessageStat(messageId: String?, chatId: String?, myUid: String?) {
        disposables.add(fireManager.updateVoiceMessageStat(myUid!!, messageId!!).subscribe())
    }

    override fun onDestroy() {
        cancelAllTasks()
        super.onDestroy()
        startService(Intent(this, NetworkService::class.java))
        disposables.dispose()
        cancelCoroutineJob()
    }

    private fun cancelCoroutineJob() = try {
        parentJob.cancel()
    } catch (e: Exception) {
    }

    override fun onBind(intent: Intent): IBinder? {
        return null
    }
}