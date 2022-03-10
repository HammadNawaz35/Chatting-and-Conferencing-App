/*
 * Created on nov 2021
 */

package com.tech.world.utils

import android.util.Log
import com.tech.world.activities.calling.model.CallType
import com.tech.world.model.constants.DBConstants
import com.tech.world.model.constants.FireCallDirection
import com.tech.world.model.realms.FireCall
import com.tech.world.model.realms.Group
import com.tech.world.model.realms.User
import com.tech.world.utils.network.FireManager
import com.google.firebase.database.DataSnapshot

object CallMapper {
    fun mapToFireCall(dataSnapshot: DataSnapshot): FireCall? {

        if (dataSnapshot.value != null) {
            (dataSnapshot.child(DBConstants.CALL_ID).value as? String)?.let { callId ->


                val fromId = dataSnapshot.child("callerId").value as? String ?: ""

                val typeInt = (dataSnapshot.child("callType").value as? Long)?.toInt() ?: CallType.VOICE.value
                val type = CallType.fromInt(typeInt)


                val groupId = dataSnapshot.child("groupId").value as? String ?: ""

                val isGroupCall = type.isGroupCall()

                if (!isGroupCall && FireManager.uid.isEmpty()) return@let
                if (isGroupCall && groupId.isEmpty()) return@let
                val channel = dataSnapshot.child("channel").value as? String ?: return@let

                val groupName = dataSnapshot.child("groupName").value as? String ?: ""

                val timestamp = dataSnapshot.child("timestamp").value as? Long
                        ?: System.currentTimeMillis()
                val phoneNumber = dataSnapshot.child("phoneNumber").value as? String ?: ""

                val isVideo = type.isVideo()

                val uid = if (isGroupCall) groupId else fromId


                var user: User

                val storedUser = RealmHelper.getInstance().getUser(uid)

                if (storedUser == null) {
                    //make dummy user temporarily
                    user = User().apply {
                        if (isGroupCall) {
                            this.uid = groupId!!
                            this.isGroupBool = true
                            this.userName = groupName
                            this.group = Group().apply {
                                this.groupId = groupId
                                this.isActive = true
                                this.setUsers(mutableListOf(SharedPreferencesManager.getCurrentUser()))
                            }

                        } else {
                            this.uid = uid
                            this.phone = phoneNumber
                        }
                    }
                } else {
                    user = storedUser
                }

                return FireCall(callId, user, FireCallDirection.INCOMING, timestamp, phoneNumber, isVideo, typeInt, channel)


            }

        }
        return null

    }
}