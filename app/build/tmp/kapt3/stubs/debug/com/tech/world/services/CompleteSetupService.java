package com.tech.world.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 &2\u00020\u0001:\u0001&B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\b\u0010\u001c\u001a\u00020\u0017H\u0016J\"\u0010\u001d\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020\b2\u0006\u0010!\u001a\u00020\bH\u0016J\u0019\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u001aH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$J\b\u0010%\u001a\u00020\u0017H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\'"}, d2 = {"Lcom/tech/world/services/CompleteSetupService;", "Landroidx/lifecycle/LifecycleService;", "()V", "notification", "Landroidx/core/app/NotificationCompat$Builder;", "notificationHelper", "Lcom/tech/world/utils/NotificationHelper;", "notificationId", "", "parentJob", "Lkotlinx/coroutines/CompletableJob;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "setupUserUseCase", "Lcom/tech/world/activities/setup/SetupUserUseCase;", "getSetupUserUseCase", "()Lcom/tech/world/activities/setup/SetupUserUseCase;", "setupUserUseCase$delegate", "Lkotlin/Lazy;", "totalBytes", "", "transferredBytes", "cancelRestore", "", "completeSetup", "imagePath", "", "username", "onDestroy", "onStartCommand", "intent", "Landroid/content/Intent;", "flags", "startId", "startRestore", "uri", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stopService", "Companion", "app_debug"})
public final class CompleteSetupService extends androidx.lifecycle.LifecycleService {
    private final kotlinx.coroutines.CompletableJob parentJob = null;
    private final kotlinx.coroutines.CoroutineScope scope = null;
    private long totalBytes = 1L;
    private long transferredBytes = 1L;
    private final int notificationId = 0;
    private androidx.core.app.NotificationCompat.Builder notification;
    private com.tech.world.utils.NotificationHelper notificationHelper;
    private final kotlin.Lazy setupUserUseCase$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.tech.world.services.CompleteSetupService.Companion Companion = null;
    private static final androidx.lifecycle.MutableLiveData<java.lang.Integer> _progressLiveData = null;
    private static final androidx.lifecycle.MutableLiveData<com.tech.world.services.SetupServiceEvent> _event = null;
    private static boolean isAcitve = false;
    
    public CompleteSetupService() {
        super();
    }
    
    private final com.tech.world.activities.setup.SetupUserUseCase getSetupUserUseCase() {
        return null;
    }
    
    @java.lang.Override()
    public int onStartCommand(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent, int flags, int startId) {
        return 0;
    }
    
    private final void completeSetup(java.lang.String imagePath, java.lang.String username) {
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.Exception.class})
    private final java.lang.Object startRestore(java.lang.String uri, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final void stopService() {
    }
    
    private final void cancelRestore() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J4\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u0019R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR$\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\t8F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u000b\u00a8\u0006\u001d"}, d2 = {"Lcom/tech/world/services/CompleteSetupService$Companion;", "", "()V", "_event", "Landroidx/lifecycle/MutableLiveData;", "Lcom/tech/world/services/SetupServiceEvent;", "_progressLiveData", "", "event", "Landroidx/lifecycle/LiveData;", "getEvent", "()Landroidx/lifecycle/LiveData;", "<set-?>", "", "isAcitve", "()Z", "setAcitve", "(Z)V", "progressLiveData", "getProgressLiveData", "startService", "", "context", "Landroid/content/Context;", "username", "", "localPhotoPath", "backupFileUri", "databaseFileUri", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.lifecycle.LiveData<java.lang.Integer> getProgressLiveData() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.lifecycle.LiveData<com.tech.world.services.SetupServiceEvent> getEvent() {
            return null;
        }
        
        public final boolean isAcitve() {
            return false;
        }
        
        private final void setAcitve(boolean p0) {
        }
        
        public final void startService(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String username, @org.jetbrains.annotations.Nullable()
        java.lang.String localPhotoPath, @org.jetbrains.annotations.Nullable()
        java.lang.String backupFileUri, @org.jetbrains.annotations.Nullable()
        java.lang.String databaseFileUri) {
        }
    }
}