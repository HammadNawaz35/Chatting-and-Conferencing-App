package com.tech.world.utils.enc

import com.tech.world.model.constants.EncryptionType
import com.tech.world.utils.enc.aes.AESCrypto
import com.tech.world.utils.enc.ethree.EthreeHelper
import kotlinx.coroutines.CoroutineScope

class DecryptionHelper {

    private val aesCrypto: AESCrypto by lazy {
        AESCrypto()
    }


    suspend fun decrypt(
        scope: CoroutineScope,
        fromId: String,
        message: String,
        encryptionType: String
    ): String {
        return when {
            encryptionType.equals(
                EncryptionType.AES,
                ignoreCase = true
            ) -> aesCrypto.decryptCipherTextWithRandomIV(message)
            encryptionType.equals(
                EncryptionType.E2E,
                ignoreCase = true
            ) -> EthreeHelper.decryptMessage(scope, fromId, message)
            else -> message
        }
    }


}