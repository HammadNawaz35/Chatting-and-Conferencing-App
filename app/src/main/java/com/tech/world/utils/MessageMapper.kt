package com.tech.world.utils

import com.tech.world.model.constants.DBConstants
import com.tech.world.model.constants.DownloadUploadStat
import com.tech.world.model.constants.EncryptionType
import com.tech.world.model.constants.MessageType
import com.tech.world.model.realms.*
import com.tech.world.utils.network.FireManager
import com.google.firebase.database.DataSnapshot

object MessageMapper {
    @JvmStatic
    fun mapToMessage(dataSnapshot: DataSnapshot): Message {
        val messageId = dataSnapshot.child(DBConstants.MESSAGE_ID).value as? String ?: ""

        val isGroup = dataSnapshot.hasChild("isGroup")
        //getting data from fcm message and convert it to a message
        val phone = dataSnapshot.child(DBConstants.PHONE).value as? String ?: ""
        val content = dataSnapshot.child(DBConstants.CONTENT).value as? String ?: ""
        val timestamp = dataSnapshot.child(DBConstants.TIMESTAMP).value as? String ?: "0"
        val type = (dataSnapshot.child(DBConstants.TYPE).value as? String ?: "0").toInt()
        //get sender uid
        val fromId = dataSnapshot.child(DBConstants.FROM_ID).value as? String ?: ""
        val toId = dataSnapshot.child(DBConstants.TOID).value as? String ?: ""
        val metadata = dataSnapshot.child(DBConstants.METADATA).value as? String ?: ""

        val encryptionType = dataSnapshot.child(DBConstants.ENCRYPTION_TYPE).value as? String
            ?: EncryptionType.NONE
        //convert sent type to received
        val convertedType = MessageType.convertSentToReceived(type)

        //create the message
        val message = Message()
        message.content = content
        message.timestamp = timestamp
        message.fromId = fromId
        message.type = convertedType
        message.messageId = messageId
        message.metadata = metadata
        message.toId = toId
        val chatId = if (isGroup) toId else fromId
        message.chatId = chatId
        message.isGroup = isGroup
        if (isGroup) message.fromPhone = phone
        //set default state
        message.downloadUploadStat = DownloadUploadStat.FAILED
        message.encryptionType = encryptionType

        //check if it's text message
        if (MessageType.isSentText(type)) {
            //set the state to default
            message.downloadUploadStat = DownloadUploadStat.DEFAULT


            //check if it's a contact
        } else if (dataSnapshot.hasChild(DBConstants.CONTACT)) {
            message.downloadUploadStat = DownloadUploadStat.DEFAULT
            //get the json contact as String
            val contactStr = dataSnapshot.child(DBConstants.CONTACT).value as? String ?: ""
            val realmContact = RealmContact(content, arrayListOf(), contactStr)
            message.contact = realmContact


            //check if it's a location message
        } else if (dataSnapshot.hasChild(DBConstants.LOCATION)) {
            message.downloadUploadStat = DownloadUploadStat.DEFAULT

            val lat = dataSnapshot.child("lat").value as? String ?: ""
            val lng = dataSnapshot.child("lng").value as? String ?: ""
            if (lat.isNotEmpty() && lng.isNotEmpty()) {
                val name = dataSnapshot.child("name").value as? String ?: ""
                val address = dataSnapshot.child("address").value as? String ?: ""
                val location = RealmLocation(address, name, lat, lng)
                message.location = location
            }

        } else if (dataSnapshot.hasChild(DBConstants.THUMB)) {
            val thumb = dataSnapshot.child(DBConstants.THUMB).value as? String ?: ""

            //Check if it's Video and set Video Duration
            if (dataSnapshot.hasChild(DBConstants.MEDIADURATION)) {
                val mediaDuration = dataSnapshot.child(DBConstants.MEDIADURATION).value as? String
                    ?: ""
                message.mediaDuration = mediaDuration
            }
            message.thumb = thumb


            //check if it's Voice Message or Audio File
        } else if (dataSnapshot.hasChild(DBConstants.MEDIADURATION)
            && type == MessageType.SENT_VOICE_MESSAGE || type == MessageType.SENT_AUDIO
        ) {

            //set audio duration
            val mediaDuration = dataSnapshot.child(DBConstants.MEDIADURATION).value as? String ?: ""
            message.mediaDuration = mediaDuration

            //check if it's a File
        } else if (dataSnapshot.hasChild(DBConstants.FILESIZE)) {
            val fileSize = dataSnapshot.child(DBConstants.FILESIZE).value as? String ?: ""
            message.fileSize = fileSize
        }

        //if the message was quoted save it and get the quoted message
        if (dataSnapshot.hasChild("quotedMessageId")) {
            val quotedMessageId = dataSnapshot.child("quotedMessageId").value as? String ?: ""
            //sometimes the message is not saved because of threads,
            //so we need to make sure that we refresh the database before checking if the message is exists
            RealmHelper.getInstance().refresh()
            val quotedMessage = RealmHelper.getInstance().getMessage(quotedMessageId, chatId)
            if (quotedMessage != null)
                message.quotedMessage = QuotedMessage.messageToQuotedMessage(quotedMessage)
        }

        //if the message was quoted save it and get the quoted message
        if (dataSnapshot.hasChild("statusId")) {
            val statusId = dataSnapshot.child("statusId").value as? String ?: ""
            //sometimes the message is not saved because of threads,
            //so we need to make sure that we refresh the database before checking if the message is exists
            RealmHelper.getInstance().refresh()
            val status = RealmHelper.getInstance().getStatus(statusId)
            if (status != null) {
                message.status = status
                val quotedMessage = Status.statusToMessage(status, fromId)
                quotedMessage?.fromId = FireManager.uid
                quotedMessage?.chatId = fromId
                if (quotedMessage != null)
                    message.quotedMessage = QuotedMessage.messageToQuotedMessage(quotedMessage)
            }

        }

        return message
    }
}