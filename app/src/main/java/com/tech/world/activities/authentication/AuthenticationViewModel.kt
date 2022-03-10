package com.tech.world.activities.authentication

import android.os.Bundle
import android.util.Log
import androidx.core.os.bundleOf
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.tech.world.R
import com.tech.world.extensions.await
import com.tech.world.model.constants.EncryptionType
import com.tech.world.utils.enc.ethree.EthreeInstance
import com.tech.world.utils.IntentUtils
import com.tech.world.utils.MyApp
import com.tech.world.utils.RealmHelper
import com.tech.world.utils.SharedPreferencesManager
import com.tech.world.utils.enc.ethree.EthreeRegistration
import com.tech.world.utils.network.AuthManager
import com.tech.world.utils.network.FireManager
import com.google.firebase.FirebaseException
import com.google.firebase.auth.*
import com.virgilsecurity.android.common.exception.EThreeException
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class AuthenticationViewModel : ViewModel() {
    private var storedVerificationId = ""

    private val authManager = AuthManager()
    private val auth = FirebaseAuth.getInstance()
    private var currentPhoneNumber = ""

    private var resendToken: PhoneAuthProvider.ForceResendingToken? = null


    private val _showLoading = MutableLiveData<Boolean>()
    val showLoading: LiveData<Boolean> get() = _showLoading

    private val _showMessage = MutableLiveData<String>()
    val showMessage: LiveData<String> get() = _showMessage

    private val _goToAuthActivity = MutableLiveData<Unit>()
    val goToAuthActivity: LiveData<Unit> get() = _goToAuthActivity

    private val _verify = MutableLiveData<Pair<String, PhoneAuthProvider.OnVerificationStateChangedCallbacks>>()
    val verify: LiveData<Pair<String, PhoneAuthProvider.OnVerificationStateChangedCallbacks>> get() = _verify

    private val _goToEnterVerifyPhoneFragment = MutableLiveData<Bundle>()
    val goToEnterVerifyPhoneFragment: LiveData<Bundle> get() = _goToEnterVerifyPhoneFragment

    var signInJob: Job? = null

    private val encryptionType = MyApp.context().getString(R.string.encryption_type)

    private val authCallback = object : PhoneAuthProvider.OnVerificationStateChangedCallbacks() {
        override fun onVerificationCompleted(authCredential: PhoneAuthCredential) {
            login(authCredential)
        }

        override fun onVerificationFailed(e: FirebaseException) {
            _showLoading.value = false


            val message = if (e is FirebaseAuthException) {
                FirebaseAuthError.fromException(e).description
            } else {
                e.localizedMessage
            }

            _showMessage.value = message


        }

        override fun onCodeSent(verificationId: String, token: PhoneAuthProvider.ForceResendingToken) {
            super.onCodeSent(verificationId, token)

            storedVerificationId = verificationId
            resendToken = token

            _showLoading.value = false

            val bundle = bundleOf(Pair(IntentUtils.PHONE, currentPhoneNumber))
            _goToEnterVerifyPhoneFragment.value = bundle
        }
    }

    private fun isE2E() = encryptionType.equals(EncryptionType.E2E, ignoreCase = true)

    private fun login(credential: AuthCredential) {
        _showLoading.value = true

        signInJob = viewModelScope.launch {
            try {
                val authResult = auth.signInWithCredential(credential).await()
                val uid = authResult.user!!.uid
                FireManager().saveDeviceId(uid)

                SharedPreferencesManager.setDeviceIdSaved(true)


                val realmHelper = RealmHelper.getInstance()

                val shouldDeleteAfterLogin = realmHelper.shouldDeleteAfterLogin(uid)

                if (shouldDeleteAfterLogin) {
                    realmHelper.deleteRealm()
                }

                if (isE2E()) {
                    withContext(IO) {
                        val ethree = EthreeInstance.initialize(this, uid).await()
                        if (shouldDeleteAfterLogin) {
                            //delete old private key if exists when registering a new number on this device.
                            ethree.cleanup()
                        }
                        EthreeRegistration.registerEthree(ethree, this)
                    }
                    SharedPreferencesManager.setE2ESaved(true)
                }



                _showLoading.value = false
                _goToAuthActivity.value = Unit

            } catch (e: Exception) {
                _showLoading.value = false
                if (e is EThreeException && e.description == EThreeException.Description.USER_IS_ALREADY_REGISTERED) {

                    _goToAuthActivity.value = Unit
                } else {
                    val message = if (e is FirebaseAuthInvalidCredentialsException) {
                        MyApp.context().getString(R.string.invalid_verification_code)
                    } else {
                        MyApp.context().getString(R.string.unknown_error)
                    }
                    _showMessage.value = message
                }
            }
        }
    }


    fun verifyCode(code: String) {
        val credential = PhoneAuthProvider.getCredential(storedVerificationId, code)
        login(credential)
    }


    fun cancelVerification() {
        signInJob?.cancel()
    }


    fun verifyPhoneNumber(phoneNumber: String, countryCode: String) {
        _showLoading.value = true
        authManager.formatNumber(phoneNumber, countryCode)?.let { formattedNumber ->
            currentPhoneNumber = formattedNumber
            _verify.value = Pair(formattedNumber, authCallback)
        }
    }

    fun isLoggedIn(): Boolean {
        //if e2e is not enabled, it will be true by default.
        val isE2eSaved = if (isE2E()) {
            SharedPreferencesManager.isE2ESaved()
        } else {
            true
        }

        return FireManager.isLoggedIn() && isE2eSaved
    }


}