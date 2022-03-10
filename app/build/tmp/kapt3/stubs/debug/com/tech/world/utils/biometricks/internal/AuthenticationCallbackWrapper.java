package com.tech.world.utils.biometricks.internal;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nJ\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\fH\u0016J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/tech/world/utils/biometricks/internal/AuthenticationCallbackWrapper;", "Landroidx/biometric/BiometricPrompt$AuthenticationCallback;", "continuation", "Lkotlin/coroutines/Continuation;", "Landroidx/biometric/BiometricPrompt$CryptoObject;", "(Lkotlin/coroutines/Continuation;)V", "authenticationFailed", "", "isCancel", "errorCode", "", "onAuthenticationError", "", "errString", "", "onAuthenticationFailed", "onAuthenticationSucceeded", "result", "Landroidx/biometric/BiometricPrompt$AuthenticationResult;", "app_debug"})
public final class AuthenticationCallbackWrapper extends androidx.biometric.BiometricPrompt.AuthenticationCallback {
    private final kotlin.coroutines.Continuation<androidx.biometric.BiometricPrompt.CryptoObject> continuation = null;
    private boolean authenticationFailed = false;
    
    public AuthenticationCallbackWrapper(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.biometric.BiometricPrompt.CryptoObject> continuation) {
        super();
    }
    
    @java.lang.Override()
    public void onAuthenticationError(int errorCode, @org.jetbrains.annotations.NotNull()
    java.lang.CharSequence errString) {
    }
    
    @java.lang.Override()
    public void onAuthenticationSucceeded(@org.jetbrains.annotations.NotNull()
    androidx.biometric.BiometricPrompt.AuthenticationResult result) {
    }
    
    @java.lang.Override()
    public void onAuthenticationFailed() {
    }
    
    /**
     * If the prompt was canceled we don't want to show an error ourselves
     */
    public final boolean isCancel(int errorCode) {
        return false;
    }
}