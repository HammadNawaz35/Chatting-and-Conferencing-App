package com.tech.world.extensions

import com.google.firebase.functions.HttpsCallableResult
import com.virgilsecurity.android.common.model.FindUsersResult
import com.virgilsecurity.android.ethree.interaction.EThree
import com.virgilsecurity.common.callback.OnCompleteListener
import com.virgilsecurity.common.callback.OnResultListener
import com.virgilsecurity.common.model.Completable
import com.virgilsecurity.common.model.Data
import com.virgilsecurity.common.model.Result
import kotlinx.coroutines.CompletableDeferred
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.GlobalScope

suspend fun Completable.await(scope: CoroutineScope = GlobalScope) {
    val deferred = CompletableDeferred<Unit>()
    addCallback(object : OnCompleteListener {
        override fun onError(throwable: Throwable) {
            deferred.completeExceptionally(throwable)
        }

        override fun onSuccess() {
            deferred.complete(Unit)
        }
    }, scope)

    return deferred.await()

}

suspend fun <T> Result<T>.await(scope: CoroutineScope = GlobalScope): T {
    val deferred = CompletableDeferred<T>()
    addCallback(object : OnResultListener<T> {
        override fun onError(throwable: Throwable) {
            deferred.completeExceptionally(throwable)
        }

        override fun onSuccess(result: T) {
            deferred.complete(result)
        }
    }, scope)

    return deferred.await()

}

