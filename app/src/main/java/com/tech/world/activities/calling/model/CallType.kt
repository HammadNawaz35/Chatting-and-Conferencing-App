/*
 * Created on nov 2021
 */

package com.tech.world.activities.calling.model

enum class CallType(val value: Int) {
    VOICE(1),
    VIDEO(2),
    CONFERENCE_VOICE(3),
    CONFERENCE_VIDEO(4);

    fun isVideo() = this == VIDEO || this == CONFERENCE_VIDEO

    fun isGroupCall() = this == CONFERENCE_VIDEO || this == CONFERENCE_VOICE

    companion object {
        fun fromInt(value: Int) = values().first { it.value == value }
    }


}