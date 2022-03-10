package com.tech.world.job

import android.app.job.JobInfo
import android.app.job.JobParameters
import android.content.ComponentName
import android.content.Context
import android.os.Build
import android.os.PersistableBundle
import androidx.annotation.RequiresApi
import com.tech.world.model.realms.GroupEvent
import com.tech.world.model.realms.JobId
import com.tech.world.model.realms.User
import com.tech.world.utils.DownloadManager
import com.tech.world.utils.IntentUtils
import com.tech.world.utils.JobSchedulerSingleton
import com.tech.world.utils.RealmHelper
import com.tech.world.utils.network.CallsManager
import com.tech.world.utils.network.GroupManager
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.rxkotlin.addTo
import kotlinx.coroutines.*
import kotlinx.coroutines.Dispatchers.Main

@RequiresApi(api = Build.VERSION_CODES.LOLLIPOP_MR1)
class NetworkJobService : BaseJob() {
    var groupManager = GroupManager()
    var callsManager = CallsManager()
    var downloadManager = DownloadManager()


    private val parentJob = SupervisorJob()
    private val scope = CoroutineScope(Main + parentJob)


    override fun onStartJob(jobParameters: JobParameters): Boolean {


        val extras = jobParameters.extras
        val action = extras.getString(IntentUtils.ACTION_TYPE)
        val isVoiceMessage = isVoiceMessage(jobParameters)
        if (action == IntentUtils.INTENT_ACTION_UPDATE_GROUP) {
            val groupEventBundle = extras.getPersistableBundle(IntentUtils.EXTRA_GROUP_EVENT)
            val contextStart = groupEventBundle!!.getString(IntentUtils.EXTRA_CONTEXT_START)
            val eventType = groupEventBundle.getInt(IntentUtils.EXTRA_EVENT_TYPE)
            val contextEnd = groupEventBundle.getString(IntentUtils.EXTRA_CONTEXT_END)
            val groupEvent = GroupEvent(contextStart, eventType, contextEnd)
            val groupId = extras.getString(IntentUtils.EXTRA_GROUP_ID)

            groupManager.updateGroup(groupId!!, groupEvent)
                .subscribe({ user: List<User?>? ->
                    RealmHelper.getInstance().deletePendingGroupCreationJob(groupId)
                    onFinishJob(jobParameters, false)
                })

                { throwable: Throwable? ->
                    onFinishJob(jobParameters, true)
                }.addTo(disposables)

        } else if (action == IntentUtils.INTENT_ACTION_FETCH_AND_CREATE_GROUP) {
            val groupId = extras.getString(IntentUtils.EXTRA_GROUP_ID)
            groupManager.fetchAndCreateGroup(groupId!!)
                .subscribe({ user: User? ->
                    if (groupId != null) {
                        RealmHelper.getInstance().deletePendingGroupCreationJob(groupId)
                    }
                    onFinishJob(jobParameters, groupId == null)
                })

                { throwable: Throwable? ->
                    onFinishJob(jobParameters, groupId == null)
                }.addTo(disposables)

        } else if (action == IntentUtils.INTENT_ACTION_FETCH_USER_GROUPS_AND_BROADCASTS) {
            //we are keeping this since some users may still have this on older versions of the app
            onFinishJob(jobParameters, false)
        } else if (action == IntentUtils.INTENT_ACTION_SET_CALL_ENDED) {
            val callId = extras.getString(IntentUtils.CALL_ID)
            val otherUid = extras.getString(IntentUtils.OTHER_UID)
            val isIncoming = extras.getBoolean(IntentUtils.IS_INCOMING, true)

            callsManager.setCallEnded(callId!!, otherUid!!, isIncoming)
                .subscribe({ onFinishJob(jobParameters, false) })
                { throwable: Throwable? -> onFinishJob(jobParameters, true) }.addTo(disposables)

        } else if (action == IntentUtils.INTENT_ACTION_SET_CALL_DECLINED_FOR_GROUP) {
            val callId = extras.getString(IntentUtils.CALL_ID)
            val groupId = extras.getString(IntentUtils.EXTRA_GROUP_ID)

            callsManager.setCallRejectedForGroup(callId!!, groupId!!)
                .subscribe({ onFinishJob(jobParameters, false) })
                { throwable: Throwable? -> onFinishJob(jobParameters, true) }
                .addTo(disposables)

        } else {
            val messageId = extras.getString(IntentUtils.EXTRA_MESSAGE_ID)
            val chatId = extras.getString(IntentUtils.EXTRA_CHAT_ID)
            if (action == IntentUtils.INTENT_ACTION_UPDATE_MESSAGE_STATE) {
                val myUid = extras.getString(IntentUtils.EXTRA_MY_UID)
                val state = extras.getInt(IntentUtils.EXTRA_STAT, 0)
                fireManager.updateMessagesState(myUid!!, messageId!!, state, isVoiceMessage)
                    .subscribe({ jobFinished(jobParameters, false) })
                    { throwable: Throwable? ->
                        jobFinished(jobParameters, true)
                    }.addTo(disposables)
            } else if (action == IntentUtils.INTENT_ACTION_UPDATE_VOICE_MESSAGE_STATE) {
                val myUid = extras.getString(IntentUtils.EXTRA_MY_UID)
                fireManager.updateVoiceMessageStat(myUid!!, messageId!!)
                    .subscribe({ jobFinished(jobParameters, false) })
                    { throwable: Throwable? -> jobFinished(jobParameters, true) }
                    .addTo(disposables)
            } else if (action == IntentUtils.INTENT_ACTION_HANDLE_REPLY) {
                val message = RealmHelper.getInstance().getMessage(messageId, chatId)
                scope.launch {
                        if (message != null) {
                            downloadManager.sendMessage(
                                message,
                                scope,
                                object : DownloadManager.OnComplete {
                                    override fun onComplete(isSuccessful: Boolean) {
                                        if (isSuccessful) {
                                            //set other unread messages as read
                                            if (!message.isGroup) fireManager.setMessagesAsRead(
                                                this@NetworkJobService,
                                                message.chatId
                                            )
                                        }
                                        onFinishJob(jobParameters, !isSuccessful)
                                    }
                                })

                    }
                }

            } else {
                scope.launch {
                        val message = RealmHelper.getInstance().getMessage(messageId, chatId)
                        if (message != null) {
                            downloadManager.request(
                                message,
                                scope,
                                object : DownloadManager.OnComplete {
                                    override fun onComplete(isSuccess: Boolean) {
                                        onFinishJob(jobParameters, !isSuccess)
                                    }
                                })
                        }

                }

            }
        }
        return true
    }

    private fun isVoiceMessage(jobParameters: JobParameters): Boolean {
        return jobParameters.extras.getString(IntentUtils.ACTION_TYPE) == IntentUtils.INTENT_ACTION_UPDATE_VOICE_MESSAGE_STATE
    }

    override fun onStopJob(jobParameters: JobParameters): Boolean {
        val jobId = jobParameters.jobId
        val isVoiceMessage = isVoiceMessage(jobParameters)
        val id = RealmHelper.getInstance().getJobId(jobId, isVoiceMessage)
        cancelCoroutineJob()
        disposables.dispose()
        return true
    }

    private fun cancelCoroutineJob() = try {
        parentJob.cancel()
    } catch (e: Exception) {
    }

    private fun onFinishJob(jobParameters: JobParameters, needsReschedule: Boolean) {
        if (!needsReschedule) {
            val id = jobParameters.extras.getString(IntentUtils.ID)
            RealmHelper.getInstance().deleteJobId(id, isVoiceMessage(jobParameters))
        }
        jobFinished(jobParameters, needsReschedule)
    }

    companion object {
        @JvmStatic
        fun schedule(context: Context?, id: String?, bundle: PersistableBundle) {
            val component = ComponentName(context!!, NetworkJobService::class.java)
            val action = bundle.getString(IntentUtils.ACTION_TYPE)

            //if it's a voice message then we want to generate a new id
            // because in case if  the action was 'update message state' both will have the same id
            val jobId = JobId(id, action == IntentUtils.INTENT_ACTION_UPDATE_VOICE_MESSAGE_STATE)
            RealmHelper.getInstance().saveJobId(jobId)
            val mJobId = jobId.jobId
            val builder = JobInfo.Builder(mJobId, component)
                .setMinimumLatency(1)
                .setOverrideDeadline(1)
                .setPersisted(true)
                .setRequiredNetworkType(JobInfo.NETWORK_TYPE_ANY)
                .setExtras(bundle)
            val allPendingJobs = JobSchedulerSingleton.getInstance().allPendingJobs

            //only 100 job is allowed
            if (allPendingJobs.size < 95) JobSchedulerSingleton.getInstance()
                .schedule(builder.build())
        }

        fun cancel(messageId: String?) {
            val jobId = RealmHelper.getInstance().getJobId(messageId, false)
            if (jobId != -1) {
                JobSchedulerSingleton.getInstance().cancel(jobId)
            }
        }
    }
}