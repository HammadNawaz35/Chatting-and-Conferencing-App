package com.tech.world.utils.biometricks;

import java.lang.System;

/**
 * This will force you to pass [BiometricPrompt.CryptoObject] and deviceCredentialAllowed to false.
 *
 * See Javadocs for [BiometricPrompt.PromptInfo.Builder]
 *
 * https://developer.android.com/reference/androidx/biometric/BiometricPrompt.PromptInfo.Builder
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0002\u0010\fR\u0011\u0010\u000b\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012\u00a8\u0006\u0017"}, d2 = {"Lcom/tech/world/utils/biometricks/BiometricPromptInfo;", "", "title", "", "negativeButtonText", "cryptoObject", "Landroidx/biometric/BiometricPrompt$CryptoObject;", "subtitle", "description", "deviceCredentialAllowed", "", "confirmationRequired", "(Ljava/lang/String;Ljava/lang/String;Landroidx/biometric/BiometricPrompt$CryptoObject;Ljava/lang/String;Ljava/lang/String;ZZ)V", "getConfirmationRequired", "()Z", "getCryptoObject", "()Landroidx/biometric/BiometricPrompt$CryptoObject;", "getDescription", "()Ljava/lang/String;", "getDeviceCredentialAllowed", "getNegativeButtonText", "getSubtitle", "getTitle", "app_debug"})
public final class BiometricPromptInfo {
    
    /**
     * Required
     */
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String title = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String negativeButtonText = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.biometric.BiometricPrompt.CryptoObject cryptoObject = null;
    
    /**
     * Optional
     */
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String subtitle = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String description = null;
    private final boolean deviceCredentialAllowed = false;
    private final boolean confirmationRequired = false;
    
    public BiometricPromptInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String negativeButtonText, @org.jetbrains.annotations.NotNull()
    androidx.biometric.BiometricPrompt.CryptoObject cryptoObject, @org.jetbrains.annotations.Nullable()
    java.lang.String subtitle, @org.jetbrains.annotations.Nullable()
    java.lang.String description, boolean deviceCredentialAllowed, boolean confirmationRequired) {
        super();
    }
    
    /**
     * Required
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNegativeButtonText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.biometric.BiometricPrompt.CryptoObject getCryptoObject() {
        return null;
    }
    
    /**
     * Optional
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSubtitle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final boolean getDeviceCredentialAllowed() {
        return false;
    }
    
    public final boolean getConfirmationRequired() {
        return false;
    }
}