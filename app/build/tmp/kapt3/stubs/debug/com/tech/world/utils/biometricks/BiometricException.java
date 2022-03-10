package com.tech.world.utils.biometricks;

import java.lang.System;

/**
 * Error for when the biometric prompt fails for whatever reason.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0010"}, d2 = {"Lcom/tech/world/utils/biometricks/BiometricException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "code", "", "errString", "", "shouldShow", "", "(ILjava/lang/CharSequence;Z)V", "getCode", "()I", "getErrString", "()Ljava/lang/CharSequence;", "getShouldShow", "()Z", "app_debug"})
public final class BiometricException extends java.lang.Exception {
    
    /**
     * The error code, see `BiometricPrompt.ERROR_*`
     */
    private final int code = 0;
    
    /**
     * The error string to possibly show to users.
     */
    @org.jetbrains.annotations.NotNull()
    private final java.lang.CharSequence errString = null;
    
    /**
     * Sometimes the user has already seen the error in the prompt itself, sometimes not. If this is
     * true, you should show the error to the user yourself.
     */
    private final boolean shouldShow = false;
    
    public BiometricException(@BiometricError()
    int code, @org.jetbrains.annotations.NotNull()
    java.lang.CharSequence errString, boolean shouldShow) {
        super();
    }
    
    /**
     * The error code, see `BiometricPrompt.ERROR_*`
     */
    public final int getCode() {
        return 0;
    }
    
    /**
     * The error string to possibly show to users.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.CharSequence getErrString() {
        return null;
    }
    
    /**
     * Sometimes the user has already seen the error in the prompt itself, sometimes not. If this is
     * true, you should show the error to the user yourself.
     */
    public final boolean getShouldShow() {
        return false;
    }
}