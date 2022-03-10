package com.tech.world.utils.biometricks;

import java.lang.System;

/**
 * Biometricks is the type of Biometric Authentication that
 * is available for this device, represented as a sealed class.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00042\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0006\u0007\u00a8\u0006\b"}, d2 = {"Lcom/tech/world/utils/biometricks/Biometricks;", "", "()V", "Available", "Companion", "None", "Lcom/tech/world/utils/biometricks/Biometricks$None;", "Lcom/tech/world/utils/biometricks/Biometricks$Available;", "app_debug"})
public abstract class Biometricks {
    @org.jetbrains.annotations.NotNull()
    public static final com.tech.world.utils.biometricks.Biometricks.Companion Companion = null;
    
    /**
     * Allows us to cache an instance of this helper
     */
    private static com.tech.world.utils.biometricks.internal.BiometricksHelper biometricksHelper;
    
    private Biometricks() {
        super();
    }
    
    /**
     * The device has no support for Biometric Authentication
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tech/world/utils/biometricks/Biometricks$None;", "Lcom/tech/world/utils/biometricks/Biometricks;", "()V", "app_debug"})
    public static final class None extends com.tech.world.utils.biometricks.Biometricks {
        @org.jetbrains.annotations.NotNull()
        public static final com.tech.world.utils.biometricks.Biometricks.None INSTANCE = null;
        
        private None() {
            super();
        }
    }
    
    /**
     * The device has support for Biometric Authentication
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0005\b\t\n\u000b\f\u00a8\u0006\r"}, d2 = {"Lcom/tech/world/utils/biometricks/Biometricks$Available;", "Lcom/tech/world/utils/biometricks/Biometricks;", "()V", "Face", "Fingerprint", "Iris", "Multiple", "Unknown", "Lcom/tech/world/utils/biometricks/Biometricks$Available$Face;", "Lcom/tech/world/utils/biometricks/Biometricks$Available$Fingerprint;", "Lcom/tech/world/utils/biometricks/Biometricks$Available$Iris;", "Lcom/tech/world/utils/biometricks/Biometricks$Available$Multiple;", "Lcom/tech/world/utils/biometricks/Biometricks$Available$Unknown;", "app_debug"})
    public static abstract class Available extends com.tech.world.utils.biometricks.Biometricks {
        
        private Available() {
            super();
        }
        
        /**
         * Device has Face Unlock ONLY
         */
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tech/world/utils/biometricks/Biometricks$Available$Face;", "Lcom/tech/world/utils/biometricks/Biometricks$Available;", "()V", "app_debug"})
        public static final class Face extends com.tech.world.utils.biometricks.Biometricks.Available {
            @org.jetbrains.annotations.NotNull()
            public static final com.tech.world.utils.biometricks.Biometricks.Available.Face INSTANCE = null;
            
            private Face() {
                super();
            }
        }
        
        /**
         * Device has Fingerprint ONLY
         */
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tech/world/utils/biometricks/Biometricks$Available$Fingerprint;", "Lcom/tech/world/utils/biometricks/Biometricks$Available;", "()V", "app_debug"})
        public static final class Fingerprint extends com.tech.world.utils.biometricks.Biometricks.Available {
            @org.jetbrains.annotations.NotNull()
            public static final com.tech.world.utils.biometricks.Biometricks.Available.Fingerprint INSTANCE = null;
            
            private Fingerprint() {
                super();
            }
        }
        
        /**
         * Device has Iris ONLY
         */
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tech/world/utils/biometricks/Biometricks$Available$Iris;", "Lcom/tech/world/utils/biometricks/Biometricks$Available;", "()V", "app_debug"})
        public static final class Iris extends com.tech.world.utils.biometricks.Biometricks.Available {
            @org.jetbrains.annotations.NotNull()
            public static final com.tech.world.utils.biometricks.Biometricks.Available.Iris INSTANCE = null;
            
            private Iris() {
                super();
            }
        }
        
        /**
         * Device has more than one biometric feature available ONLY
         */
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tech/world/utils/biometricks/Biometricks$Available$Multiple;", "Lcom/tech/world/utils/biometricks/Biometricks$Available;", "()V", "app_debug"})
        public static final class Multiple extends com.tech.world.utils.biometricks.Biometricks.Available {
            @org.jetbrains.annotations.NotNull()
            public static final com.tech.world.utils.biometricks.Biometricks.Available.Multiple INSTANCE = null;
            
            private Multiple() {
                super();
            }
        }
        
        /**
         * Device has a biometric type this library isn't aware of.
         *
         * This could happen if an older version of this library is
         * used on a newer device, with new biometric features.
         */
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/tech/world/utils/biometricks/Biometricks$Available$Unknown;", "Lcom/tech/world/utils/biometricks/Biometricks$Available;", "()V", "app_debug"})
        public static final class Unknown extends com.tech.world.utils.biometricks.Biometricks.Available {
            @org.jetbrains.annotations.NotNull()
            public static final com.tech.world.utils.biometricks.Biometricks.Available.Unknown INSTANCE = null;
            
            private Unknown() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ5\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010H\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J5\u0010\t\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010H\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Lcom/tech/world/utils/biometricks/Biometricks$Companion;", "", "()V", "biometricksHelper", "Lcom/tech/world/utils/biometricks/internal/BiometricksHelper;", "from", "Lcom/tech/world/utils/biometricks/Biometricks;", "context", "Landroid/content/Context;", "showPrompt", "Landroidx/biometric/BiometricPrompt$CryptoObject;", "fragment", "Landroidx/fragment/app/Fragment;", "promptInfo", "Lcom/tech/world/utils/biometricks/BiometricPromptInfo;", "showLoading", "Lkotlin/Function1;", "", "", "(Landroidx/fragment/app/Fragment;Lcom/tech/world/utils/biometricks/BiometricPromptInfo;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "activity", "Landroidx/fragment/app/FragmentActivity;", "(Landroidx/fragment/app/FragmentActivity;Lcom/tech/world/utils/biometricks/BiometricPromptInfo;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Allows a client to query the type of Biometrics available on the device.
         *
         * It is recommended that you cache this value as it will
         * not change over time, but it will be computed every time.
         */
        @org.jetbrains.annotations.NotNull()
        public final com.tech.world.utils.biometricks.Biometricks from(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        /**
         * Wrapper around [BiometricPrompt.authenticate] which handles many tricky issues for you.
         * It will:
         * - Wait for the app to be focused if not currently, as the prompt will fail to show
         * otherwise.
         * - Allow you to show/hide a loading indicator for when there's a delay showing the prompt.
         * - Give you information on if you need to show an error to the user or not.
         * ```
         * lifecycleScope.launch {
         *    try {
         *        val unlockedCryptObject = Biometricks.showPrompt(
         *            this@MainActivity,
         *            biometricPromptInfo
         *        ) { showLoading -> progressBar.visibility = if (showLoading) View.VISIBLE else View.INVISIBLE }
         *
         *        // success
         *    } catch (e: BiometricException) {
         *        // failure
         *        if (e.shouldShow) {
         *            // show error to the user
         *        }
         *    }
         * }
         * ```
         *
         * @param activity The host activity.
         * @param biometricPromptInfo The [BiometricPromptInfo] to display in the prompt.
         * @param showLoading Callback to show/hide a loading indicator for when there's a delay
         * showing the prompt. This is only used on api 28 as after that it shows immediately.
         */
        @org.jetbrains.annotations.Nullable()
        @androidx.annotation.MainThread()
        public final java.lang.Object showPrompt(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.FragmentActivity activity, @org.jetbrains.annotations.NotNull()
        com.tech.world.utils.biometricks.BiometricPromptInfo promptInfo, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> showLoading, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super androidx.biometric.BiometricPrompt.CryptoObject> continuation) {
            return null;
        }
        
        /**
         * Wrapper around [BiometricPrompt.authenticate] which handles many tricky issues for you.
         * It will:
         * - Wait for the app to be focused if not currently, as the prompt will fail to show
         * otherwise.
         * - Allow you to show/hide a loading indicator for when there's a delay showing the prompt.
         * - Give you information on if you need to show an error to the user or not.
         * ```
         * lifecycleScope.launch {
         *    try {
         *        val unlockedCryptObject = Biometricks.showPrompt(
         *            this@MainActivity,
         *            lockedCryptoObject,
         *            biometricPromptInfo
         *        ) { showLoading -> progressBar.visibility = if (showLoading) View.VISIBLE else View.INVISIBLE }
         *
         *        // success
         *    } catch (e: BiometricException) {
         *        // failure
         *        if (e.shouldShow) {
         *            // show error to the user
         *        }
         *    }
         * }
         * ```
         *
         * @param fragment The host fragment.
         * as you many not get 'secure' biometrics if you don't include it.
         * @param biometricPromptInfo The [BiometricPromptInfo] to display in the prompt.
         * @param showLoading Callback to show/hide a loading indicator for when there's a delay
         * showing the prompt. This is only used on api 28 as after that it shows immediately.
         */
        @org.jetbrains.annotations.Nullable()
        @androidx.annotation.MainThread()
        public final java.lang.Object showPrompt(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.NotNull()
        com.tech.world.utils.biometricks.BiometricPromptInfo promptInfo, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> showLoading, @org.jetbrains.annotations.NotNull()
        kotlin.coroutines.Continuation<? super androidx.biometric.BiometricPrompt.CryptoObject> continuation) {
            return null;
        }
    }
}