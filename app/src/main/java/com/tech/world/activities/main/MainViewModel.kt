package com.tech.world.activities.main

import android.app.Application
import android.content.Intent
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.tech.world.R
import com.tech.world.common.DisposableViewModel
import com.tech.world.activities.main.status.StatusFragmentEvent
import com.tech.world.common.DisposableAndroidViewModel
import com.tech.world.common.extensions.toDeffered
import com.tech.world.extensions.setValueRx
import com.tech.world.extensions.snapshotAtRefExists
import com.tech.world.job.DeleteStatusJob
import com.tech.world.model.constants.EncryptionType
import com.tech.world.model.realms.TextStatus
import com.tech.world.model.constants.StatusType
import com.tech.world.model.realms.Status
import com.tech.world.model.realms.User
import com.tech.world.utils.*
import com.tech.world.utils.enc.ethree.EthreeInstance
import com.tech.world.utils.enc.ethree.EthreeRegistration
import com.tech.world.utils.network.FireManager
import com.tech.world.utils.update.UpdateChecker
import com.google.firebase.database.DataSnapshot
import io.reactivex.Completable
import io.reactivex.Maybe
import io.reactivex.disposables.Disposable
import io.reactivex.rxkotlin.addTo
import kotlinx.coroutines.*
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.Dispatchers.Main

class MainViewModel(private val context: Application) : DisposableAndroidViewModel(context) {

    private val realmHelper = RealmHelper.getInstance()
    var lastSyncTime = 0L

    private val _statusLiveData = MutableLiveData<StatusFragmentEvent>()
    val statusLiveData: LiveData<StatusFragmentEvent>
        get() = _statusLiveData

    private val _queryTextChange = MutableLiveData<String>()
    val queryTextChange: LiveData<String>
        get() = _queryTextChange

    fun onQueryTextChange(text: String) {
        _queryTextChange.value = text
    }

    private val encryptionType = MyApp.context().getString(R.string.encryption_type)


    companion object {
        //15Sec
        const val WAIT_TIME = 15000
    }

    fun fetchStatuses(users: List<User>) {

        //wait for 15 sec before re-fetching statuses
        if (lastSyncTime == 0L || System.currentTimeMillis() - lastSyncTime > WAIT_TIME) {
            viewModelScope.launch {
                try {
                    val statusesIds = mutableListOf<String>()
                    fetchImageAndVideosStatuses(users, statusesIds)
                    fetchTextStatuses(users, statusesIds)
                    realmHelper.deleteDeletedStatusesLocally(statusesIds)
                    lastSyncTime = System.currentTimeMillis()
                    updateUi()

                } catch (e: Exception) {
                    e.printStackTrace()
                }

            }
        }
    }

    private fun updateUi() {
        _statusLiveData.value = StatusFragmentEvent.StatusInsertedEvent()
    }


    private fun handleStatus(dataSnapshot: DataSnapshot, statusesIds: MutableList<String>) {


        if (dataSnapshot.value != null) {
            //get every status
            for (snapshot in dataSnapshot.children) {
                val userId = snapshot.ref.parent!!.key
                val statusId = snapshot.key
                val status = snapshot.getValue(Status::class.java)
                status!!.statusId = statusId
                status.userId = userId

                if (status.type == StatusType.TEXT) {
                    val textStatus = snapshot.getValue(TextStatus::class.java)
                    textStatus!!.statusId = statusId!!
                    status.textStatus = textStatus
                }

                statusesIds.add(statusId!!)
                //check if status is exists in local database , if not save it
                if (realmHelper.getStatus(status.statusId) == null) {
                    realmHelper.saveStatus(userId, status)
                    //schedule a job after 24 hours to delete this status locally
                    DeleteStatusJob.schedule(userId, statusId)
                }


            }

        }
    }

    private suspend fun fetchImageAndVideosStatuses(
        users: List<User>,
        statusesIds: MutableList<String>
    ) {
        //add all statuses to this list to delete deleted statuses if needed
        //get current time before 24 hours (Yesterday)
        val timeBefore24Hours = TimeHelper.getTimeBefore24Hours()
        //get all user statuses that are not passed 24 hours


        val jobs = mutableListOf<Deferred<DataSnapshot>>()


        val job = viewModelScope.async {
            for (user in users!!) {
                val query = FireConstants.statusRef.child(user.uid)
                    .orderByChild("timestamp")
                    .startAt(timeBefore24Hours.toDouble())


                val dataSnapshot = query.toDeffered()

                jobs.add(dataSnapshot)
            }

        }


        job.await()
        val datasnapshots = jobs.awaitAll()
        datasnapshots.forEach {
            handleStatus(it, statusesIds)
        }


    }

    private suspend fun fetchTextStatuses(users: List<User>, statusesIds: MutableList<String>) {
//        val statusesIds = mutableListOf<String>()

        //add all statuses to this list to delete deleted statuses if needed
        //get current time before 24 hours (Yesterday)
        val timeBefore24Hours = TimeHelper.getTimeBefore24Hours()
        //get all user statuses that are not passed 24 hours


        val jobs = mutableListOf<Deferred<DataSnapshot>>()

        val job = viewModelScope.async {
            for (user in users!!) {
                val query = FireConstants.textStatusRef.child(user.uid)
                    .orderByChild("timestamp")
                    .startAt(timeBefore24Hours.toDouble())


                val dataSnapshot = query.toDeffered()

                jobs.add(dataSnapshot)
            }

        }


        job.await()
        val datasnapshots = jobs.awaitAll()
        datasnapshots.forEach {
            handleStatus(it, statusesIds)
        }


    }

    fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        data?.let {
            _statusLiveData.value =
                StatusFragmentEvent.OnActivityResultEvent(requestCode, resultCode, data)
        }

    }

    //if user is coming from an old version, then delete the already received messages from his db
    fun deleteOldMessagesIfNeeded() {

        if (!SharedPreferencesManager.isDeletedUnfetchedMessage()) {

            val deleteUserMessages =
                FireConstants.userMessages.child(FireManager.uid).setValueRx(null)
            val deleteDeletedMessages =
                FireConstants.deletedMessages.child(FireManager.uid).setValueRx(null)
            val deleteNewGroupsEvents =
                FireConstants.newGroups.child(FireManager.uid).setValueRx(null)
            val setDeletedOldMessagesToTrue =
                FireConstants.hasDeletedOldMessages.child(FireManager.uid).setValueRx(true)
            val completable = Completable.merge(
                arrayListOf(
                    deleteUserMessages,
                    deleteDeletedMessages,
                    deleteNewGroupsEvents
                )
            )

            FireConstants.hasDeletedOldMessages.child(FireManager.uid).snapshotAtRefExists()
                .flatMapCompletable { isExists ->

                    if (isExists) {
                        return@flatMapCompletable Completable.complete()
                    }

                    return@flatMapCompletable completable


                }.andThen(setDeletedOldMessagesToTrue)
                .doOnComplete {
                    SharedPreferencesManager.setDeletedUnfetchedMessage(true)
                }.subscribe({

                }, { throwable ->

                }).addTo(disposables)
        }
    }

    fun checkForUpdate(): Maybe<Boolean> {
        return UpdateChecker(context).checkForUpdate()
    }

    fun saveDeviceId() {
        viewModelScope.launch {
            try {
                FireManager().saveDeviceId(FireManager.uid)
                SharedPreferencesManager.setDeviceIdSaved(true)
            } catch (e: Exception) {

            }
        }
    }

    private fun isE2E() = encryptionType.equals(EncryptionType.E2E, ignoreCase = true)


    fun setupE2eIfNeeded() {
        if (isE2E() && !SharedPreferencesManager.isE2ESaved()) {
            viewModelScope.launch(IO) {
                try {
                    val ethree = EthreeInstance.initialize(this, FireManager.uid).await()
                    EthreeRegistration.registerEthree(ethree, this)
                    withContext(Main) {
                        SharedPreferencesManager.setE2ESaved(true)
                    }
                } catch (e: Exception) {

                }
            }


        }
    }

    fun saveAppVersion() {
        //save app ver if it's not saved before
        if (!SharedPreferencesManager.isAppVersionSaved() || SharedPreferencesManager.getAppVersion() != AppVerUtil.getAppVersion(
                MyApp.context()
            )
        ) {
            FireConstants.usersRef.child(FireManager.uid).child("ver")
                .setValue(AppVerUtil.getAppVersion(MyApp.context()))
                .addOnSuccessListener { SharedPreferencesManager.setAppVersionSaved(true) }
        }
    }


}


