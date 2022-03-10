package com.tech.world.utils.enc

import android.util.Log
import com.tech.world.utils.enc.aes.AESCrypto
import com.virgilsecurity.android.ethree.interaction.EThree
import java.util.*

object PKPwEncryptUtil {
    private val STRING_CHARACTERS = ('0'..'z').toList().toTypedArray()
    private const val key = "3@4S^&sq_z"

    fun generatePKPwd(): String {
        var ranUUID = UUID.randomUUID().toString()
        ranUUID = ranUUID.dropLast(ranUUID.length / 2)

        val pwd = (1..32).map { STRING_CHARACTERS.random() }.joinToString("") + ranUUID
        val encrypted = AESCrypto().encryptPlainTextWithRandomIV(pwd, key)

        return EThree.derivePasswords(encrypted).backupPassword
    }


}