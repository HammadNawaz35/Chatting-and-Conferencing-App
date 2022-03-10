package com.tech.world.utils.enc

import android.util.Log
import com.tech.world.model.realms.Message
import com.tech.world.model.realms.RealmContact
import com.tech.world.model.realms.RealmLocation
import com.tech.world.utils.ContactMapper
import kotlinx.coroutines.CoroutineScope

class MessageDecryptor(private val decryptionHelper: DecryptionHelper) {
    private lateinit var coroutineScope: CoroutineScope

    suspend fun decryptMessage(message: Message, coroutineScope: CoroutineScope): Message {
        this.coroutineScope = coroutineScope

        message.content = decryptContent(message)
        message.thumb = decryptThumb(message)
        message.contact = decryptContact(message)
        message.location = decryptLocation(message)
        message.partialText = decryptPartialText(message)
        return message

    }

    private suspend fun decryptContent(message: Message): String? {
        val content = message.content
        if (content.isNullOrEmpty()) {
            return null
        }

        val fromId = message.fromId

        return decryptionHelper.decrypt(coroutineScope, fromId, content, message.encryptionType)
    }

    private suspend fun decryptPartialText(message: Message): String? {
        val partialText = message.partialText
        if (partialText.isNullOrEmpty()) {
            return null
        }

        val fromId = message.fromId

        return decryptionHelper.decrypt(coroutineScope, fromId, partialText, message.encryptionType)
    }

    private suspend fun decryptContact(message: Message): RealmContact? {
        val contact = message.contact ?: return null
        val jsonString = message.contact.jsonString

        val name = contact.name
        val fromId = message.fromId

        if (name != null) {
            contact.name =
                decryptionHelper.decrypt(coroutineScope, fromId, name, message.encryptionType)
        }


        if (jsonString != null) {
            val decryptedJsonString =
                decryptionHelper.decrypt(coroutineScope, fromId, jsonString, message.encryptionType)
            val phoneNumbersList = ContactMapper.mapStringToNumbers(decryptedJsonString)
            contact.updateRealmList(phoneNumbersList)
        }

        return contact
    }

    private suspend fun decryptThumb(message: Message): String? {
        val thumb = message.thumb

        if (thumb.isNullOrEmpty()) {
            return null
        }

        val fromId = message.fromId

        return decryptionHelper.decrypt(coroutineScope, fromId, thumb, message.encryptionType)

    }

    private suspend fun decryptLocation(message: Message): RealmLocation? {
        val location = message.location ?: return null

        val fromId = message.fromId


        if (!location.name.isNullOrEmpty()) {
            location.name = decryptionHelper.decrypt(
                coroutineScope,
                fromId,
                location.name,
                message.encryptionType
            )
        }

        if (!location.address.isNullOrEmpty()) {
            location.address = decryptionHelper.decrypt(
                coroutineScope,
                fromId,
                location.address,
                message.encryptionType
            )
        }


        if (location.latStr != null) {
            val decryptedLatStr = decryptionHelper.decrypt(
                coroutineScope,
                fromId,
                location.latStr,
                message.encryptionType
            )
            location.latStr = decryptedLatStr
            location.lat = decryptedLatStr.toDouble()
        }

        if (location.lngStr != null) {
            val decryptedLngStr = decryptionHelper.decrypt(
                coroutineScope,
                fromId,
                location.lngStr,
                message.encryptionType
            )
            location.lngStr = decryptedLngStr
            location.lng = decryptedLngStr.toDouble()
        }



        return location
    }
}
