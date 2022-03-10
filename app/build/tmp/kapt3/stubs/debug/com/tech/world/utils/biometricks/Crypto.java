package com.tech.world.utils.biometricks;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0003J\b\u0010\r\u001a\u00020\u000eH\u0007J\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/tech/world/utils/biometricks/Crypto;", "", "()V", "keyGenerator", "Ljavax/crypto/KeyGenerator;", "keyStore", "Ljava/security/KeyStore;", "createKey", "", "keyName", "", "invalidatedByBiometricEnrollment", "", "cryptoObject", "Landroidx/biometric/BiometricPrompt$CryptoObject;", "initCipher", "cipher", "Ljavax/crypto/Cipher;", "Companion", "app_debug"})
public final class Crypto {
    private final java.security.KeyStore keyStore = null;
    private final javax.crypto.KeyGenerator keyGenerator = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.tech.world.utils.biometricks.Crypto.Companion Companion = null;
    private static final java.lang.String DEFAULT_KEY_NAME = "default_key";
    
    public Crypto() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.M)
    public final androidx.biometric.BiometricPrompt.CryptoObject cryptoObject() {
        return null;
    }
    
    /**
     * Lifted code from the Google samples - https://github.com/googlesamples/android-FingerprintDialog/blob/master/kotlinApp/app/src/main/java/com/example/android/fingerprintdialog/MainActivity.kt
     *
     * Initialize the [Cipher] instance with the created key in the
     * [.createKey] method.
     *
     * @param keyName the key name to init the cipher
     * @return `true` if initialization is successful, `false` if the lock screen has
     * been disabled or reset after the key was generated, or if a fingerprint got enrolled after
     * the key was generated.
     */
    private final void initCipher(javax.crypto.Cipher cipher, java.lang.String keyName) {
    }
    
    /**
     * Lifted code from the Google Samples - https://github.com/googlesamples/android-FingerprintDialog/blob/master/kotlinApp/app/src/main/java/com/example/android/fingerprintdialog/MainActivity.kt
     *
     * Creates a symmetric key in the Android Key Store which can only be used after the user has
     * authenticated with fingerprint.
     *
     * @param keyName the name of the key to be created
     * @param invalidatedByBiometricEnrollment if `false` is passed, the created key will not
     * be invalidated even if a new fingerprint is enrolled.
     * The default value is `true`, so passing
     * `true` doesn't change the behavior
     * (the key will be invalidated if a new fingerprint is
     * enrolled.). Note that this parameter is only valid if
     * the app works on Android N developer preview.
     */
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.M)
    private final void createKey(java.lang.String keyName, boolean invalidatedByBiometricEnrollment) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/tech/world/utils/biometricks/Crypto$Companion;", "", "()V", "DEFAULT_KEY_NAME", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}