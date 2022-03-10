package com.tech.world.utils.enc

import com.tech.world.R
import com.tech.world.model.constants.EncryptionType
import com.tech.world.model.realms.Message
import com.tech.world.utils.MyApp.Companion.context

object EncryptionTypeUseCase {
     fun getEncryptionType(message: Message): String? {
        val encryptionTypeSetting =
            context().getString(R.string.encryption_type)
        return if (message.isGroup && !encryptionTypeSetting.equals(
                EncryptionType.NONE,
                ignoreCase = true
            )
        ) {
            EncryptionType.AES
        } else encryptionTypeSetting
    }
}