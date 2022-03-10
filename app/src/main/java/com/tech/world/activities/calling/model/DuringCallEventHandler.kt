/*
 * Created on nov 2021
 */

package com.tech.world.activities.calling.model

interface DuringCallEventHandler : AGEventHandler {
    fun onUserJoined(uid: Int)
    fun onDecodingRemoteVideo(uid: Int,  elapsed: Int)
    fun onJoinChannelSuccess(channel: String?, uid: Int, elapsed: Int)
    fun onUserOffline(uid: Int, reason: Int)
    fun onExtraCallback(type: Int,  data: Array<Any?>)
}