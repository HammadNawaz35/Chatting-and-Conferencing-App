package com.tech.world.utils.biometricks.internal;

import java.lang.System;

/**
 * Internal logic to compute the [Biometricks] type.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0012B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0013"}, d2 = {"Lcom/tech/world/utils/biometricks/internal/BiometricksHelper;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "availableFeatures", "", "Lcom/tech/world/utils/biometricks/internal/BiometricksHelper$BiometricFeature;", "biometricManager", "Landroidx/biometric/BiometricManager;", "packageManager", "Landroid/content/pm/PackageManager;", "type", "Lcom/tech/world/utils/biometricks/Biometricks;", "getType", "()Lcom/tech/world/utils/biometricks/Biometricks;", "type$delegate", "Lkotlin/Lazy;", "BiometricFeature", "app_debug"})
public final class BiometricksHelper {
    
    /**
     * Used to query available features on the device.
     */
    private final android.content.pm.PackageManager packageManager = null;
    
    /**
     * Allows us to determine if the device is capable of authenticating with Biometrics.
     */
    private final androidx.biometric.BiometricManager biometricManager = null;
    
    /**
     * A list of all known biometrics, filtered by those which are available.
     */
    private final java.util.List<com.tech.world.utils.biometricks.internal.BiometricksHelper.BiometricFeature> availableFeatures = null;
    
    /**
     * This Biometricks type is computed lazily and cached.
     */
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy type$delegate = null;
    
    public BiometricksHelper(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    /**
     * This Biometricks type is computed lazily and cached.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.tech.world.utils.biometricks.Biometricks getType() {
        return null;
    }
    
    /**
     * Class to compute availability of a biometric feature from the [PackageManager]
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000b\u0010\rR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0012"}, d2 = {"Lcom/tech/world/utils/biometricks/internal/BiometricksHelper$BiometricFeature;", "", "packageManager", "Landroid/content/pm/PackageManager;", "feature", "", "minSdk", "", "type", "Lcom/tech/world/utils/biometricks/Biometricks$Available;", "(Landroid/content/pm/PackageManager;Ljava/lang/String;ILcom/tech/world/utils/biometricks/Biometricks$Available;)V", "isAvailable", "", "()Z", "isAvailable$delegate", "Lkotlin/Lazy;", "getType", "()Lcom/tech/world/utils/biometricks/Biometricks$Available;", "app_debug"})
    static final class BiometricFeature {
        @org.jetbrains.annotations.NotNull()
        private final com.tech.world.utils.biometricks.Biometricks.Available type = null;
        @org.jetbrains.annotations.NotNull()
        private final kotlin.Lazy isAvailable$delegate = null;
        
        public BiometricFeature(@org.jetbrains.annotations.NotNull()
        android.content.pm.PackageManager packageManager, @org.jetbrains.annotations.NotNull()
        java.lang.String feature, int minSdk, @org.jetbrains.annotations.NotNull()
        com.tech.world.utils.biometricks.Biometricks.Available type) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.tech.world.utils.biometricks.Biometricks.Available getType() {
            return null;
        }
        
        public final boolean isAvailable() {
            return false;
        }
    }
}