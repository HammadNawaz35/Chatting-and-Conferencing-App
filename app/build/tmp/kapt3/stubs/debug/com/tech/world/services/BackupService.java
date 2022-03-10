package com.tech.world.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 A2\u00020\u0001:\u0001AB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010*\u001a\u00020+H\u0002J\b\u0010,\u001a\u00020+H\u0002J\u0010\u0010-\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\nH\u0002J\u0013\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001200H\u0002\u00a2\u0006\u0002\u00101J\u0013\u00102\u001a\b\u0012\u0004\u0012\u00020\u001200H\u0002\u00a2\u0006\u0002\u00101J\b\u00103\u001a\u00020+H\u0016J\b\u00104\u001a\u00020+H\u0016J\"\u00105\u001a\u00020\n2\b\u00106\u001a\u0004\u0018\u0001072\u0006\u00108\u001a\u00020\n2\u0006\u00109\u001a\u00020\nH\u0016J\b\u0010:\u001a\u00020+H\u0002J\u0018\u0010;\u001a\u00020+2\u0006\u0010<\u001a\u00020\u00122\u0006\u0010=\u001a\u00020\u0004H\u0002J\u0018\u0010>\u001a\u00020+2\u0006\u0010.\u001a\u00020\n2\u0006\u0010<\u001a\u00020\u0012H\u0002J\b\u0010?\u001a\u00020+H\u0002J\b\u0010@\u001a\u00020+H\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n \u0013*\u0004\u0018\u00010\u00120\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n \u0013*\u0004\u0018\u00010\u00120\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n \u0013*\u0004\u0018\u00010\u00120\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\n \u0013*\u0004\u0018\u00010\u00120\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\n \u0013*\u0004\u0018\u00010\u00120\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\n \u0013*\u0004\u0018\u00010\u00120\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001b\u001a\n \u0013*\u0004\u0018\u00010\u00120\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001c\u001a\n \u0013*\u0004\u0018\u00010\u00120\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001d\u001a\n \u0013*\u0004\u0018\u00010\u00120\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001e\u001a\n \u0013*\u0004\u0018\u00010\u00120\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001f\u001a\n \u0013*\u0004\u0018\u00010\u00120\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010 \u001a\n \u0013*\u0004\u0018\u00010\u00120\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010$\u001a\u00020%8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b&\u0010\'\u00a8\u0006B"}, d2 = {"Lcom/tech/world/services/BackupService;", "Landroidx/lifecycle/LifecycleService;", "()V", "backupFile", "Ljava/io/File;", "getBackupFile", "()Ljava/io/File;", "backupNotification", "Landroidx/core/app/NotificationCompat$Builder;", "foregroundNotificationId", "", "getForegroundNotificationId", "()I", "notificationHelper", "Lcom/tech/world/utils/NotificationHelper;", "parentJob", "Lkotlinx/coroutines/CompletableJob;", "receivedAudio", "", "kotlin.jvm.PlatformType", "receivedFiles", "receivedImages", "receivedStickers", "receivedVideos", "receivedVoice", "scope", "Lkotlinx/coroutines/CoroutineScope;", "sentAudio", "sentFiles", "sentImages", "sentStickers", "sentVideos", "sentVoice", "totalSize", "", "transferredBytes", "zipUtil", "Lcom/tech/world/utils/ZipUtil;", "getZipUtil", "()Lcom/tech/world/utils/ZipUtil;", "zipUtil$delegate", "Lkotlin/Lazy;", "backupCompleted", "", "cancelBackup", "createJsonFile", "backupType", "getReceivedItems", "", "()[Ljava/lang/String;", "getSentItems", "onCreate", "onDestroy", "onStartCommand", "intent", "Landroid/content/Intent;", "flags", "startId", "reset", "saveFileToUri", "uri", "file", "startBackup", "startForeground", "stopService", "Companion", "app_debug"})
public final class BackupService extends androidx.lifecycle.LifecycleService {
    @org.jetbrains.annotations.NotNull()
    public static final com.tech.world.services.BackupService.Companion Companion = null;
    private static final androidx.lifecycle.MutableLiveData<java.lang.Integer> _progress = null;
    private static final androidx.lifecycle.MutableLiveData<com.tech.world.services.BackupServiceEvent> _event = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BACKUP_VERSION = "1.0";
    private final int foregroundNotificationId = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.io.File backupFile = null;
    private final java.lang.String sentVoice = null;
    private final java.lang.String receivedVoice = null;
    private final java.lang.String sentImages = null;
    private final java.lang.String receivedImages = null;
    private final java.lang.String sentVideos = null;
    private final java.lang.String receivedVideos = null;
    private final java.lang.String sentAudio = null;
    private final java.lang.String receivedAudio = null;
    private final java.lang.String sentFiles = null;
    private final java.lang.String receivedFiles = null;
    private final java.lang.String sentStickers = null;
    private final java.lang.String receivedStickers = null;
    private final kotlinx.coroutines.CompletableJob parentJob = null;
    private final kotlinx.coroutines.CoroutineScope scope = null;
    private final kotlin.Lazy zipUtil$delegate = null;
    private androidx.core.app.NotificationCompat.Builder backupNotification;
    private com.tech.world.utils.NotificationHelper notificationHelper;
    private long totalSize = 0L;
    private long transferredBytes = 1L;
    
    public BackupService() {
        super();
    }
    
    public final int getForegroundNotificationId() {
        return 0;
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.io.File getBackupFile() {
        return null;
    }
    
    private final com.tech.world.utils.ZipUtil getZipUtil() {
        return null;
    }
    
    private final java.lang.String[] getSentItems() {
        return null;
    }
    
    private final java.lang.String[] getReceivedItems() {
        return null;
    }
    
    @java.lang.Override()
    public int onStartCommand(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent, int flags, int startId) {
        return 0;
    }
    
    private final void cancelBackup() {
    }
    
    private final void startForeground() {
    }
    
    private final void startBackup(int backupType, java.lang.String uri) {
    }
    
    private final void saveFileToUri(java.lang.String uri, java.io.File file) {
    }
    
    private final java.io.File createJsonFile(int backupType) {
        return null;
    }
    
    private final void backupCompleted() {
    }
    
    private final void stopService() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    private final void reset() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\r\u00a8\u0006\u0010"}, d2 = {"Lcom/tech/world/services/BackupService$Companion;", "", "()V", "BACKUP_VERSION", "", "_event", "Landroidx/lifecycle/MutableLiveData;", "Lcom/tech/world/services/BackupServiceEvent;", "_progress", "", "event", "Landroidx/lifecycle/LiveData;", "getEvent", "()Landroidx/lifecycle/LiveData;", "progress", "getProgress", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.lifecycle.LiveData<java.lang.Integer> getProgress() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.lifecycle.LiveData<com.tech.world.services.BackupServiceEvent> getEvent() {
            return null;
        }
    }
}