package com.tech.world.utils.enc

import android.util.Log
import com.tech.world.model.realms.Message
import com.tech.world.model.realms.RealmContact
import com.tech.world.model.realms.RealmLocation
import com.tech.world.utils.ContactMapper
import com.tech.world.utils.FireConstants
import kotlinx.coroutines.CoroutineScope

class MessageEncryptor(private val encryptionHelper: EncryptionHelper) {
    private lateinit var coroutineScope: CoroutineScope

    suspend fun encryptMessage(message: Message, coroutineScope: CoroutineScope): Message {
        this.coroutineScope = coroutineScope

        val encryptedContent = encryptContent(message)

        message.thumb = encryptThumb(message)
        message.contact = encryptContact(message)
        message.location = encryptLocation(message)

        if (message.isTextMessage && encryptedContent != null && encryptedContent.length > FireConstants.MAX_SIZE_STRING) {
            message.partialText = encryptPartialText(message)
        }

        message.content = encryptedContent

        return message

    }

    private suspend fun encryptContent(message: Message): String? {
        val content = message.content
        if (content.isNullOrEmpty()) {
            return null
        }
        val broadcastsUids =
            if (message.broadcastUids.isNullOrEmpty()) null else message.broadcastUids
        val toId = message.toId
        val uidToEncryptTo = SingleUidOrMultiple(toId, broadcastsUids)
        return encryptionHelper.encrypt(
            coroutineScope,
            uidToEncryptTo,
            content,
            message.encryptionType
        )
    }

    private suspend fun encryptPartialText(message: Message): String? {
        val content = message.content
        if (content.isNullOrEmpty()) {
            return null
        }

        val broadcastsUids =
            if (message.broadcastUids.isNullOrEmpty()) null else message.broadcastUids
        val toId = message.toId
        val uidToEncryptTo = SingleUidOrMultiple(toId, broadcastsUids)

        val split = content.dropLast(content.length / 2)
        return encryptionHelper.encrypt(
            coroutineScope,
            uidToEncryptTo,
            split,
            message.encryptionType
        )
    }

    private suspend fun encryptContact(message: Message): RealmContact? {
        val contact = message.contact ?: return null

        val name = contact.name
        val broadcastsUids =
            if (message.broadcastUids.isNullOrEmpty()) null else message.broadcastUids
        val toId = message.toId
        val uidToEncryptTo = SingleUidOrMultiple(toId, broadcastsUids)

        if (name != null) {
            contact.name =
                encryptionHelper.encrypt(
                    coroutineScope,
                    uidToEncryptTo,
                    name,
                    message.encryptionType
                )
        }

        val numbersCombined = ContactMapper.mapNumbersToString(contact.realmList)

        if (!numbersCombined.isNullOrBlank()) {
            contact.jsonString =
                encryptionHelper.encrypt(
                    coroutineScope,
                    uidToEncryptTo,
                    numbersCombined,
                    message.encryptionType
                )
        }


        return contact
    }

    private suspend fun encryptThumb(message: Message): String? {
        val thumb = message.thumb

        if (thumb.isNullOrEmpty()) {
            return null
        }

        val broadcastsUids =
            if (message.broadcastUids.isNullOrEmpty()) null else message.broadcastUids
        val toId = message.toId
        val uidToEncryptTo = SingleUidOrMultiple(toId, broadcastsUids)
        return encryptionHelper.encrypt(
            coroutineScope,
            uidToEncryptTo,
            thumb,
            message.encryptionType
        )

    }


    private suspend fun encryptLocation(message: Message): RealmLocation? {
        val location = message.location ?: return null

        val broadcastsUids =
            if (message.broadcastUids.isNullOrEmpty()) null else message.broadcastUids
        val toId = message.toId
        val uidToEncryptTo = SingleUidOrMultiple(toId, broadcastsUids)


        if (!location.name.isNullOrEmpty()) {
            location.name = encryptionHelper.encrypt(
                coroutineScope,
                uidToEncryptTo,
                location.name,
                message.encryptionType
            )
        }

        if (!location.address.isNullOrEmpty()) {
            location.address =
                encryptionHelper.encrypt(
                    coroutineScope,
                    uidToEncryptTo,
                    location.address,
                    message.encryptionType
                )
        }


        if (location.lat != null) {
            location.latStr =
                encryptionHelper.encrypt(
                    coroutineScope,
                    uidToEncryptTo,
                    location.lat.toString(),
                    message.encryptionType
                )
        }

        if (location.lng != null) {
            location.lngStr =
                encryptionHelper.encrypt(
                    coroutineScope,
                    uidToEncryptTo,
                    location.lng.toString(),
                    message.encryptionType
                )
        }


        return location
    }
}
