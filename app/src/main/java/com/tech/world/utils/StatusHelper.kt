package com.tech.world.utils

import com.tech.world.model.constants.MessageType
import com.tech.world.model.constants.StatusType
import com.tech.world.model.realms.Status

object StatusHelper {
    fun getStatusTypeDrawable(statusType: Int): Int {
        return MessageTypeHelper.getMessageTypeDrawable(mapStatusTypeToMessageType(statusType))
    }

    fun getStatusContent(status: Status): String {
        var type = mapStatusTypeToMessageType(status.type)
        return MessageTypeHelper.getTypeText(type)
    }

     fun mapStatusTypeToMessageType(statusType: Int): Int {
        return when (statusType) {
            StatusType.IMAGE -> {
                MessageType.SENT_IMAGE
            }
            StatusType.VIDEO -> {
                MessageType.SENT_VIDEO
            }
            else -> {
                MessageType.SENT_TEXT
            }
        }
    }
}