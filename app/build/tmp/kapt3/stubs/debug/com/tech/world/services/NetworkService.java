package com.tech.world.services;

import java.lang.System;

/**
 * Created by Devlomi on 31/12/2017.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0012H\u0016J\"\u0010\u0018\u001a\u00020\u00192\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019H\u0016J,\u0010\u001c\u001a\u00020\u00122\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010 \u001a\u0004\u0018\u00010\u001e2\u0006\u0010!\u001a\u00020\u0019J$\u0010\"\u001a\u00020\u00122\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010 \u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/tech/world/services/NetworkService;", "Landroid/app/Service;", "()V", "callsManager", "Lcom/tech/world/utils/network/CallsManager;", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "downloadManager", "Lcom/tech/world/utils/DownloadManager;", "fireManager", "Lcom/tech/world/utils/network/FireManager;", "groupManager", "Lcom/tech/world/utils/network/GroupManager;", "parentJob", "Lkotlinx/coroutines/CompletableJob;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "cancelCoroutineJob", "", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onDestroy", "onStartCommand", "", "flags", "startId", "updateMessageStat", "messageId", "", "myUid", "chatId", "state", "updateVoiceMessageStat", "app_debug"})
public final class NetworkService extends android.app.Service {
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    private final com.tech.world.utils.network.FireManager fireManager = null;
    private final com.tech.world.utils.network.GroupManager groupManager = null;
    private final com.tech.world.utils.network.CallsManager callsManager = null;
    private final com.tech.world.utils.DownloadManager downloadManager = null;
    private final kotlinx.coroutines.CompletableJob parentJob = null;
    private final kotlinx.coroutines.CoroutineScope scope = null;
    
    public NetworkService() {
        super();
    }
    
    @java.lang.Override()
    public int onStartCommand(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent, int flags, int startId) {
        return 0;
    }
    
    public final void updateMessageStat(@org.jetbrains.annotations.Nullable()
    java.lang.String messageId, @org.jetbrains.annotations.Nullable()
    java.lang.String myUid, @org.jetbrains.annotations.Nullable()
    java.lang.String chatId, int state) {
    }
    
    public final void updateVoiceMessageStat(@org.jetbrains.annotations.Nullable()
    java.lang.String messageId, @org.jetbrains.annotations.Nullable()
    java.lang.String chatId, @org.jetbrains.annotations.Nullable()
    java.lang.String myUid) {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    private final void cancelCoroutineJob() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.os.IBinder onBind(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
        return null;
    }
}