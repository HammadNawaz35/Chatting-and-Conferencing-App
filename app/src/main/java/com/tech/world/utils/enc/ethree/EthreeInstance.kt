package com.tech.world.utils.enc.ethree

import android.util.Log
import com.tech.world.utils.MyApp
import com.tech.world.utils.network.FireManager
import com.google.android.gms.tasks.Tasks
import com.google.firebase.functions.FirebaseFunctions
import com.virgilsecurity.android.common.callback.OnGetTokenCallback
import com.virgilsecurity.android.ethree.interaction.EThree
import kotlinx.coroutines.*
import kotlinx.coroutines.Dispatchers.IO

object EthreeInstance {
    private var eThree: EThree? = null


    @Synchronized
    fun initialize(scope: CoroutineScope = GlobalScope, identity: String = FireManager.uid): CompletableDeferred<EThree> {
        val deferred = CompletableDeferred<EThree>()


        scope.launch(IO) {


            if (eThree != null) {
                deferred.complete(eThree!!)
            }


            val tokenCallback = object : OnGetTokenCallback {
                override fun onGetToken(): String {
                    val tokenTask = FirebaseFunctions.getInstance()
                            .getHttpsCallable("getVirgilJwt")
                            .call()


                    val result = Tasks.await(tokenTask).data as Map<String, String>


                    return result["token"]!!
                }
            }


            eThree = EThree(identity, tokenCallback = tokenCallback, context = MyApp.context())
            deferred.complete(eThree!!)
        }

        return deferred

    }

}