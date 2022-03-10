package com.tech.world.job;

import java.lang.System;

@androidx.annotation.RequiresApi(api = android.os.Build.VERSION_CODES.LOLLIPOP_MR1)
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001#B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0018\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001cH\u0002J\u0010\u0010!\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\"\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/tech/world/job/NetworkJobService;", "Lcom/tech/world/job/BaseJob;", "()V", "callsManager", "Lcom/tech/world/utils/network/CallsManager;", "getCallsManager", "()Lcom/tech/world/utils/network/CallsManager;", "setCallsManager", "(Lcom/tech/world/utils/network/CallsManager;)V", "downloadManager", "Lcom/tech/world/utils/DownloadManager;", "getDownloadManager", "()Lcom/tech/world/utils/DownloadManager;", "setDownloadManager", "(Lcom/tech/world/utils/DownloadManager;)V", "groupManager", "Lcom/tech/world/utils/network/GroupManager;", "getGroupManager", "()Lcom/tech/world/utils/network/GroupManager;", "setGroupManager", "(Lcom/tech/world/utils/network/GroupManager;)V", "parentJob", "Lkotlinx/coroutines/CompletableJob;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "cancelCoroutineJob", "", "isVoiceMessage", "", "jobParameters", "Landroid/app/job/JobParameters;", "onFinishJob", "needsReschedule", "onStartJob", "onStopJob", "Companion", "app_debug"})
public final class NetworkJobService extends com.tech.world.job.BaseJob {
    @org.jetbrains.annotations.NotNull()
    private com.tech.world.utils.network.GroupManager groupManager;
    @org.jetbrains.annotations.NotNull()
    private com.tech.world.utils.network.CallsManager callsManager;
    @org.jetbrains.annotations.NotNull()
    private com.tech.world.utils.DownloadManager downloadManager;
    private final kotlinx.coroutines.CompletableJob parentJob = null;
    private final kotlinx.coroutines.CoroutineScope scope = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.tech.world.job.NetworkJobService.Companion Companion = null;
    
    public NetworkJobService() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tech.world.utils.network.GroupManager getGroupManager() {
        return null;
    }
    
    public final void setGroupManager(@org.jetbrains.annotations.NotNull()
    com.tech.world.utils.network.GroupManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tech.world.utils.network.CallsManager getCallsManager() {
        return null;
    }
    
    public final void setCallsManager(@org.jetbrains.annotations.NotNull()
    com.tech.world.utils.network.CallsManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tech.world.utils.DownloadManager getDownloadManager() {
        return null;
    }
    
    public final void setDownloadManager(@org.jetbrains.annotations.NotNull()
    com.tech.world.utils.DownloadManager p0) {
    }
    
    @java.lang.Override()
    public boolean onStartJob(@org.jetbrains.annotations.NotNull()
    android.app.job.JobParameters jobParameters) {
        return false;
    }
    
    private final boolean isVoiceMessage(android.app.job.JobParameters jobParameters) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onStopJob(@org.jetbrains.annotations.NotNull()
    android.app.job.JobParameters jobParameters) {
        return false;
    }
    
    private final void cancelCoroutineJob() {
    }
    
    private final void onFinishJob(android.app.job.JobParameters jobParameters, boolean needsReschedule) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void schedule(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    android.os.PersistableBundle bundle) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J$\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\fH\u0007\u00a8\u0006\r"}, d2 = {"Lcom/tech/world/job/NetworkJobService$Companion;", "", "()V", "cancel", "", "messageId", "", "schedule", "context", "Landroid/content/Context;", "id", "bundle", "Landroid/os/PersistableBundle;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @kotlin.jvm.JvmStatic()
        public final void schedule(@org.jetbrains.annotations.Nullable()
        android.content.Context context, @org.jetbrains.annotations.Nullable()
        java.lang.String id, @org.jetbrains.annotations.NotNull()
        android.os.PersistableBundle bundle) {
        }
        
        public final void cancel(@org.jetbrains.annotations.Nullable()
        java.lang.String messageId) {
        }
    }
}