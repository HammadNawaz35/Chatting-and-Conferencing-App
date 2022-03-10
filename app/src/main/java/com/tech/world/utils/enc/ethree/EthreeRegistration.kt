package com.tech.world.utils.enc.ethree

import com.tech.world.extensions.await
import com.tech.world.utils.FireConstants
import com.tech.world.utils.enc.PKPwEncryptUtil
import com.tech.world.utils.network.FireManager
import com.virgilsecurity.android.common.exception.EThreeException
import com.virgilsecurity.android.ethree.interaction.EThree
import kotlinx.coroutines.CoroutineScope
import kotlin.jvm.Throws

object EthreeRegistration {

    suspend fun registerEthree(eThree: EThree, coroutineScope: CoroutineScope) {
        try {
            eThree.register().await(coroutineScope)
            backupPrivateKey(eThree, coroutineScope)
        } catch (e: Exception) {
            if (e is EThreeException && e.description == EThreeException.Description.USER_IS_ALREADY_REGISTERED) {
                restorePrivateKey(eThree, coroutineScope)
            } else {
                throw e
            }
        }
    }

    private suspend fun restorePrivateKey(eThree: EThree, coroutineScope: CoroutineScope) {
        val keyPwd = getKeyPwdToDb()
        eThree.restorePrivateKey(keyPwd).await(coroutineScope)
    }

    private suspend fun backupPrivateKey(eThree: EThree, coroutineScope: CoroutineScope) {
        val password = PKPwEncryptUtil.generatePKPwd()
        eThree.backupPrivateKey(password).await(coroutineScope)
        saveKeyPwd(password)
    }


    private suspend fun saveKeyPwd(pwd: String) {
        try {
            FireConstants.pkPwd.child(FireManager.uid).setValue(pwd).await()
        } catch (e: Exception) {
        }
    }

    @Throws
    private suspend fun getKeyPwdToDb(): String {
        return FireConstants.pkPwd.child(FireManager.uid).get().await().value as String
    }


}