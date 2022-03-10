package com.tech.world.extensions

import android.net.Uri
import com.google.android.gms.auth.api.signin.internal.Storage
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.AuthResult
import com.google.firebase.database.*
import com.google.firebase.functions.HttpsCallableResult
import com.google.firebase.messaging.FirebaseMessaging
import com.google.firebase.storage.*
import durdinapps.rxfirebase2.RxFirebaseChildEvent
import durdinapps.rxfirebase2.RxFirebaseDatabase
import durdinapps.rxfirebase2.RxFirebaseStorage
import io.reactivex.Completable
import io.reactivex.Flowable
import io.reactivex.Maybe
import io.reactivex.Single
import kotlinx.coroutines.CompletableDeferred
import kotlinx.coroutines.Deferred
import java.io.File

fun FirebaseMessaging.subscribeToTopicRx(topicId: String): Completable {

    return Completable.create { emitter ->
        FirebaseMessaging.getInstance().subscribeToTopic(topicId).addOnCompleteListener { task ->
            if (task.isSuccessful) {
                emitter.onComplete()
            } else {
                emitter.onError(task.exception!!)
            }


        }
    }
}

fun FirebaseMessaging.unsubscribeFromTopicRx(topicId: String): Completable {

    return Completable.create { emitter ->
        FirebaseMessaging.getInstance().unsubscribeFromTopic(topicId).addOnCompleteListener { task ->
            if (task.isSuccessful) {
                emitter.onComplete()
            } else {
                emitter.onError(task.exception!!)
            }


        }
    }

}

fun Query.snapshotAtRefExists(): Single<Boolean> {
    return Single.create { emitter ->

        this.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(p0: DataSnapshot) {
                emitter.onSuccess(p0.exists())
            }

            override fun onCancelled(p0: DatabaseError) {
                emitter.onError(p0.toException())
            }
        })
    }
}


suspend fun <T> Task<T>.await(): T {
    val deferred = CompletableDeferred<T>()

    deferred.invokeOnCompletion {
        if (deferred.isCancelled) {
            // optional, handle coroutine cancellation however you'd like here
        }
    }

    this.addOnCompleteListener {

        if (it.exception == null) {
            deferred.complete(it.result)
        } else {
            deferred.completeExceptionally(it.exception!!)
        }
    }
    return deferred.await()
}

fun DatabaseReference.setValueRx(value: Any?): Completable {
    return RxFirebaseDatabase.setValue(this, value)
}

fun DatabaseReference.updateChildrenRx(map: Map<String, Any>): Completable {
    return RxFirebaseDatabase.updateChildren(this, map)
}

fun Query.observeSingleValueEvent(): Maybe<DataSnapshot> {
    return RxFirebaseDatabase.observeSingleValueEvent(this)
}


fun Query.observeChildEvent(): Flowable<RxFirebaseChildEvent<DataSnapshot>> {
    return RxFirebaseDatabase.observeChildEvent(this)
}

fun Query.observeValueEvent(): Flowable<DataSnapshot> {
    return RxFirebaseDatabase.observeValueEvent(this)
}

fun StorageReference.getFileRx(file: File): Single<FileDownloadTask.TaskSnapshot> {
    return RxFirebaseStorage.getFile(this, file)
}

fun StorageReference.putFileRx(uri: Uri): Single<UploadTask.TaskSnapshot> {
    return RxFirebaseStorage.putFile(this, uri)
}

fun StorageReference.getDownloadUrlRx(): Maybe<Uri> {
    return RxFirebaseStorage.getDownloadUrl(this)
}

fun DataSnapshot.toMap(): Map<String, Any> {
    val map = mutableMapOf<String, Any>()
    for (snapshot in this.children) {

        snapshot.key?.let { key ->
            snapshot.value?.let { value ->
                map[key] = value
            }
        }
    }
    return map
}
