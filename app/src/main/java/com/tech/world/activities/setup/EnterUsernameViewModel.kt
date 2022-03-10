package com.tech.world.activities.setup

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.tech.world.common.extensions.toDeffered
import com.tech.world.extensions.observeSingleValueEvent
import com.tech.world.utils.FireConstants
import com.tech.world.utils.network.FireManager
import io.reactivex.Observable
import kotlinx.coroutines.launch

class EnterUsernameViewModel : ViewModel() {

    private val _loadUserImage = MutableLiveData<String>()
    val loadUserImageLiveData: LiveData<String>
        get() = _loadUserImage

    fun fetchUserImage() {

        viewModelScope.launch {

            val snapshot = FireConstants.usersRef.child(FireManager.uid)
                .toDeffered().await()

            val photoUrl = snapshot.child("photo").value as? String?

            if (photoUrl != null) {
                _loadUserImage.value = photoUrl
            }

        }
    }

}