package com.tech.world.activities.authentication;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010+\u001a\u00020\u0005J\b\u0010,\u001a\u00020\tH\u0002J\u0006\u0010-\u001a\u00020\tJ\u0010\u0010.\u001a\u00020\u00052\u0006\u0010/\u001a\u000200H\u0002J\u000e\u00101\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u000bJ\u0016\u00103\u001a\u00020\u00052\u0006\u00104\u001a\u00020\u000b2\u0006\u00105\u001a\u00020\u000bR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e0\r0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00178F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00178F\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u00178F\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010\u0019R\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000b0\u00178F\u00a2\u0006\u0006\u001a\u0004\b!\u0010\u0019R\u001c\u0010\"\u001a\u0004\u0018\u00010#X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u000e\u0010(\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R#\u0010)\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000e0\r0\u00178F\u00a2\u0006\u0006\u001a\u0004\b*\u0010\u0019\u00a8\u00066"}, d2 = {"Lcom/tech/world/activities/authentication/AuthenticationViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_goToAuthActivity", "Landroidx/lifecycle/MutableLiveData;", "", "_goToEnterVerifyPhoneFragment", "Landroid/os/Bundle;", "_showLoading", "", "_showMessage", "", "_verify", "Lkotlin/Pair;", "Lcom/google/firebase/auth/PhoneAuthProvider$OnVerificationStateChangedCallbacks;", "auth", "Lcom/google/firebase/auth/FirebaseAuth;", "authCallback", "authManager", "Lcom/tech/world/utils/network/AuthManager;", "currentPhoneNumber", "encryptionType", "goToAuthActivity", "Landroidx/lifecycle/LiveData;", "getGoToAuthActivity", "()Landroidx/lifecycle/LiveData;", "goToEnterVerifyPhoneFragment", "getGoToEnterVerifyPhoneFragment", "resendToken", "Lcom/google/firebase/auth/PhoneAuthProvider$ForceResendingToken;", "showLoading", "getShowLoading", "showMessage", "getShowMessage", "signInJob", "Lkotlinx/coroutines/Job;", "getSignInJob", "()Lkotlinx/coroutines/Job;", "setSignInJob", "(Lkotlinx/coroutines/Job;)V", "storedVerificationId", "verify", "getVerify", "cancelVerification", "isE2E", "isLoggedIn", "login", "credential", "Lcom/google/firebase/auth/AuthCredential;", "verifyCode", "code", "verifyPhoneNumber", "phoneNumber", "countryCode", "app_debug"})
public final class AuthenticationViewModel extends androidx.lifecycle.ViewModel {
    private java.lang.String storedVerificationId = "";
    private final com.tech.world.utils.network.AuthManager authManager = null;
    private final com.google.firebase.auth.FirebaseAuth auth = null;
    private java.lang.String currentPhoneNumber = "";
    private com.google.firebase.auth.PhoneAuthProvider.ForceResendingToken resendToken;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _showLoading = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _showMessage = null;
    private final androidx.lifecycle.MutableLiveData<kotlin.Unit> _goToAuthActivity = null;
    private final androidx.lifecycle.MutableLiveData<kotlin.Pair<java.lang.String, com.google.firebase.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks>> _verify = null;
    private final androidx.lifecycle.MutableLiveData<android.os.Bundle> _goToEnterVerifyPhoneFragment = null;
    @org.jetbrains.annotations.Nullable()
    private kotlinx.coroutines.Job signInJob;
    private final java.lang.String encryptionType = null;
    private final com.google.firebase.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks authCallback = null;
    
    public AuthenticationViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getShowLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getShowMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<kotlin.Unit> getGoToAuthActivity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<kotlin.Pair<java.lang.String, com.google.firebase.auth.PhoneAuthProvider.OnVerificationStateChangedCallbacks>> getVerify() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<android.os.Bundle> getGoToEnterVerifyPhoneFragment() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlinx.coroutines.Job getSignInJob() {
        return null;
    }
    
    public final void setSignInJob(@org.jetbrains.annotations.Nullable()
    kotlinx.coroutines.Job p0) {
    }
    
    private final boolean isE2E() {
        return false;
    }
    
    private final void login(com.google.firebase.auth.AuthCredential credential) {
    }
    
    public final void verifyCode(@org.jetbrains.annotations.NotNull()
    java.lang.String code) {
    }
    
    public final void cancelVerification() {
    }
    
    public final void verifyPhoneNumber(@org.jetbrains.annotations.NotNull()
    java.lang.String phoneNumber, @org.jetbrains.annotations.NotNull()
    java.lang.String countryCode) {
    }
    
    public final boolean isLoggedIn() {
        return false;
    }
}