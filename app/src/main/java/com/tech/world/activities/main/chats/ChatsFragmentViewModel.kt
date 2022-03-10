package com.tech.world.activities.main.chats

import com.tech.world.common.DisposableViewModel
import com.tech.world.model.realms.User
import com.tech.world.utils.TimeHelper
import com.tech.world.utils.network.FireManager
import io.reactivex.rxkotlin.addTo
import java.util.*

class ChatsFragmentViewModel : DisposableViewModel() {
    private val currentDownloads = mutableListOf<String>()


    fun fetchUserImage(pos: Int, user: User) {
        if (user.isBroadcastBool)return
        if (TimeHelper.canFetchUserImage(Date().time, user.lastTimeFetchedImage) && !currentDownloads.contains(user.uid)) {
            currentDownloads.add(user.uid)
            FireManager.checkAndDownloadUserThumbImg(user).subscribe({image ->

            }, { throwable ->

            }).addTo(disposables)
        }
    }

    override fun onCleared() {
        super.onCleared()
        disposables.clear()
    }

}