package com.tech.world.utils.enc.ethree

import android.util.Log
import com.tech.world.extensions.await
import kotlinx.coroutines.*
import kotlinx.coroutines.Dispatchers.IO
import kotlin.jvm.Throws

object EthreeHelper {

    @Throws
    suspend fun encryptMessage(scope: CoroutineScope, toId: String, message: String): String {
        val deferred = CompletableDeferred<String>()
        scope.launch(IO) {
            try {
                val ethree = EthreeInstance.initialize(this).await()
                val toCard = ethree.findUser(toId).await(this)
                deferred.complete(ethree.authEncrypt(message, toCard))
            } catch (e: Exception) {
                deferred.completeExceptionally(e)
            }

        }
        return deferred.await()

    }


    @Throws
    suspend fun encryptMessage(scope: CoroutineScope, toIds: List<String>, message: String): String {
        val deferred = CompletableDeferred<String>()
        scope.launch(IO) {
            try {
                val ethree = EthreeInstance.initialize(this).await()
                val toCards = ethree.findUsers(toIds, checkResult = false).await(this)
                deferred.complete(ethree.authEncrypt(message, toCards))
            } catch (e: Exception) {
                deferred.completeExceptionally(e)
            }

        }
        return deferred.await()

    }

    @Throws
    suspend fun decryptMessage(scope: CoroutineScope, fromId: String, encryptedMessage: String): String {
        val deferred = CompletableDeferred<String>()

        scope.launch(IO) {
            try {
                val ethree = EthreeInstance.initialize(this).await()
                val fromCard = ethree.findUser(fromId).await(this)
                deferred.complete(ethree.authDecrypt(encryptedMessage, fromCard))
            } catch (e: Exception) {
                deferred.completeExceptionally(e)
            }

        }

        return deferred.await()

    }
}
