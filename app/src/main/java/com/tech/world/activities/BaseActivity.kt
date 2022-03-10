package com.tech.world.activities

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import com.tech.world.Base
import com.tech.world.extensions.observeChildEvent
import com.tech.world.extensions.setValueRx
import com.tech.world.extensions.toMap
import com.tech.world.model.constants.DBConstants
import com.tech.world.utils.*
import com.tech.world.utils.enc.DecryptionHelper
import com.tech.world.utils.enc.EncryptionHelper
import com.tech.world.utils.enc.MessageDecryptor
import com.tech.world.utils.network.FireManager
import com.tech.world.utils.update.UpdateChecker
import io.reactivex.Completable
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.rxkotlin.addTo
import kotlinx.coroutines.Dispatchers.Main
import kotlinx.coroutines.launch


abstract class BaseActivity : AppCompatActivity(), Base {
    override val disposables = CompositeDisposable()
    abstract fun enablePresence(): Boolean
    private var presenceUtil: PresenceUtil? = null
    val fireManager = FireManager()
    private lateinit var newMessageHandler: NewMessageHandler

    private var logoutReceiver: BroadcastReceiver? = null

    //used to clean up like dismissing dialogs
    open fun goingToUpdateActivity() {}

    private var needsUpdate = false

    private val decryptionHelper: DecryptionHelper by lazy {
        DecryptionHelper()
    }

    private val messageDecryptor: MessageDecryptor by lazy {
        MessageDecryptor(decryptionHelper)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        needsUpdate = UpdateChecker(this).needsUpdate()
        if (!needsUpdate) {

            if (enablePresence())
                presenceUtil = PresenceUtil()

            newMessageHandler = NewMessageHandler(this, fireManager, messageDecryptor, disposables)
            //if user is coming from an old version, then delete the already received messages from his db
            if (SharedPreferencesManager.isDeletedUnfetchedMessage()) {
                attachNewMessageListener()
                attachDeletedMessageListener()
                attachNewGroupListener()
                attachNewCallsListener()
            }
        }

        logoutReceiver = object : BroadcastReceiver() {
            override fun onReceive(p0: Context?, p1: Intent?) {
                startLoggedOutActivity()
            }
        }
    }


    override fun onStart() {
        super.onStart()
        if (needsUpdate) {
            startUpdateActivity()
        }

        logoutReceiver?.let {
            LocalBroadcastManager.getInstance(this)
                .registerReceiver(it, IntentFilter(IntentUtils.ACTION_LOGOUT))
        }


    }


    override fun onStop() {
        super.onStop()

        logoutReceiver?.let {
            LocalBroadcastManager.getInstance(this).unregisterReceiver(it)
        }
    }


    fun startLoggedOutActivity() {
        startActivity(Intent(this@BaseActivity, LoggedOutActivity::class.java))
        finish()
    }

    fun startUpdateActivity() {
        goingToUpdateActivity()
        startActivity(Intent(this, UpdateActivity::class.java).apply {
            addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        })
        finish()
    }

    private fun attachNewGroupListener() {
        FireConstants.newGroups.child(FireManager.uid).observeChildEvent().subscribe({ snap ->
            val dataSnapshot = snap.value

            if (dataSnapshot.value != null) {
                (dataSnapshot.child(DBConstants.GROUP_ID).value as? String)?.let { groupId ->
                    newMessageHandler.handleNewGroup(dataSnapshot.toMap())

                    deleteNewGroupEvent(groupId).subscribe().addTo(disposables)

                }
            }


        }, { error -> }).addTo(disposables)
    }

    private fun attachDeletedMessageListener() {
        FireConstants.deletedMessages.child(FireManager.uid).observeChildEvent().subscribe({ snap ->
            val dataSnapshot = snap.value

            if (dataSnapshot.value != null) {
                (dataSnapshot.child(DBConstants.MESSAGE_ID).value as? String)?.let { messageId ->
                    newMessageHandler.handleDeletedMessage(dataSnapshot.toMap())

                    deleteDeletedMessage(messageId).subscribe().addTo(disposables)

                }
            }


        }, { error -> }).addTo(disposables)
    }


    private fun attachNewMessageListener() {
        FireConstants.userMessages.child(FireManager.uid).observeChildEvent().subscribe({ snap ->
            val dataSnapshot = snap.value
            if (dataSnapshot.value != null) {
                (dataSnapshot.child(DBConstants.MESSAGE_ID).value as? String)?.let { messageId ->
                    val phone = dataSnapshot.child(DBConstants.PHONE).value as? String ?: ""
                    val message = MessageMapper.mapToMessage(dataSnapshot)
                    lifecycleScope.launch(Main) {
                        try {
                            newMessageHandler.handleNewMessage(phone, message)

                            deleteMessage(messageId).subscribe().addTo(disposables)
                        } catch (e: Exception) {
                            e.printStackTrace()
                        }
                    }

                }

            }
        }, { error -> }).addTo(disposables)
    }

    private fun attachNewCallsListener() {
        FireConstants.userCalls.child(FireManager.uid).observeChildEvent().subscribe({ snap ->
            val dataSnapshot = snap.value

            CallMapper.mapToFireCall(dataSnapshot)?.let { fireCall ->


                newMessageHandler.handleNewCall(fireCall)

                deleteNewCall(fireCall.callId).subscribe().addTo(disposables)


            }
        }, { error -> }).addTo(disposables)
    }

    private fun deleteMessage(messageId: String): Completable {
        return FireConstants.userMessages.child(FireManager.uid).child(messageId).setValueRx(null)
    }

    private fun deleteDeletedMessage(messageId: String): Completable {
        return FireConstants.deletedMessages.child(FireManager.uid).child(messageId)
            .setValueRx(null)
    }

    private fun deleteNewGroupEvent(groupId: String): Completable {
        return FireConstants.newGroups.child(FireManager.uid).child(groupId).setValueRx(null)
    }

    private fun deleteNewCall(callId: String): Completable {
        return FireConstants.userCalls.child(FireManager.uid).child(callId).setValueRx(null)
    }


    override fun onResume() {
        super.onResume()
        if (enablePresence()) {
            presenceUtil?.onResume()
            MyApp.baseActivityResumed()
        }

        (this.application as? MyApp)?.let { application ->
            if (application.isHasMovedToForeground && SharedPreferencesManager.isFingerprintLockEnabled()) {

                val lastActive = SharedPreferencesManager.getLastActive()
                val lockAfter = SharedPreferencesManager.getLockAfter()


                if (lockAfter == 0 || TimeHelper.isTimePassedByMinutes(
                        System.currentTimeMillis(),
                        lastActive,
                        lockAfter
                    )
                )
                    startActivity(Intent(this, LockscreenActivity::class.java))


            }
        }

    }


    override fun onPause() {
        super.onPause()
        if (enablePresence()) {
            presenceUtil?.onPause()
            MyApp.baseActivityPaused()
        }


    }

    override fun onDestroy() {
        super.onDestroy()
        disposables.dispose()
        presenceUtil?.onDestroy()

    }


}