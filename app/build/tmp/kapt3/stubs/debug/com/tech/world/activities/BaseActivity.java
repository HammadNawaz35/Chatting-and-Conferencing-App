package com.tech.world.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020 H\u0002J\b\u0010\"\u001a\u00020 H\u0002J\b\u0010#\u001a\u00020 H\u0002J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\'H\u0002J\u0010\u0010(\u001a\u00020%2\u0006\u0010&\u001a\u00020\'H\u0002J\u0010\u0010)\u001a\u00020%2\u0006\u0010*\u001a\u00020\'H\u0002J\u0010\u0010+\u001a\u00020%2\u0006\u0010,\u001a\u00020\'H\u0002J\b\u0010-\u001a\u00020\u001aH&J\b\u0010.\u001a\u00020 H\u0016J\u0012\u0010/\u001a\u00020 2\b\u00100\u001a\u0004\u0018\u000101H\u0014J\b\u00102\u001a\u00020 H\u0014J\b\u00103\u001a\u00020 H\u0014J\b\u00104\u001a\u00020 H\u0014J\b\u00105\u001a\u00020 H\u0014J\b\u00106\u001a\u00020 H\u0014J\u0006\u00107\u001a\u00020 J\u0006\u00108\u001a\u00020 R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\t\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00069"}, d2 = {"Lcom/tech/world/activities/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/tech/world/Base;", "()V", "decryptionHelper", "Lcom/tech/world/utils/enc/DecryptionHelper;", "getDecryptionHelper", "()Lcom/tech/world/utils/enc/DecryptionHelper;", "decryptionHelper$delegate", "Lkotlin/Lazy;", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "getDisposables", "()Lio/reactivex/disposables/CompositeDisposable;", "fireManager", "Lcom/tech/world/utils/network/FireManager;", "getFireManager", "()Lcom/tech/world/utils/network/FireManager;", "logoutReceiver", "Landroid/content/BroadcastReceiver;", "messageDecryptor", "Lcom/tech/world/utils/enc/MessageDecryptor;", "getMessageDecryptor", "()Lcom/tech/world/utils/enc/MessageDecryptor;", "messageDecryptor$delegate", "needsUpdate", "", "newMessageHandler", "Lcom/tech/world/utils/NewMessageHandler;", "presenceUtil", "Lcom/tech/world/utils/PresenceUtil;", "attachDeletedMessageListener", "", "attachNewCallsListener", "attachNewGroupListener", "attachNewMessageListener", "deleteDeletedMessage", "Lio/reactivex/Completable;", "messageId", "", "deleteMessage", "deleteNewCall", "callId", "deleteNewGroupEvent", "groupId", "enablePresence", "goingToUpdateActivity", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onPause", "onResume", "onStart", "onStop", "startLoggedOutActivity", "startUpdateActivity", "app_debug"})
public abstract class BaseActivity extends androidx.appcompat.app.AppCompatActivity implements com.tech.world.Base {
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    private com.tech.world.utils.PresenceUtil presenceUtil;
    @org.jetbrains.annotations.NotNull()
    private final com.tech.world.utils.network.FireManager fireManager = null;
    private com.tech.world.utils.NewMessageHandler newMessageHandler;
    private android.content.BroadcastReceiver logoutReceiver;
    private boolean needsUpdate = false;
    private final kotlin.Lazy decryptionHelper$delegate = null;
    private final kotlin.Lazy messageDecryptor$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    public BaseActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.disposables.CompositeDisposable getDisposables() {
        return null;
    }
    
    public abstract boolean enablePresence();
    
    @org.jetbrains.annotations.NotNull()
    public final com.tech.world.utils.network.FireManager getFireManager() {
        return null;
    }
    
    public void goingToUpdateActivity() {
    }
    
    private final com.tech.world.utils.enc.DecryptionHelper getDecryptionHelper() {
        return null;
    }
    
    private final com.tech.world.utils.enc.MessageDecryptor getMessageDecryptor() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    public final void startLoggedOutActivity() {
    }
    
    public final void startUpdateActivity() {
    }
    
    private final void attachNewGroupListener() {
    }
    
    private final void attachDeletedMessageListener() {
    }
    
    private final void attachNewMessageListener() {
    }
    
    private final void attachNewCallsListener() {
    }
    
    private final io.reactivex.Completable deleteMessage(java.lang.String messageId) {
        return null;
    }
    
    private final io.reactivex.Completable deleteDeletedMessage(java.lang.String messageId) {
        return null;
    }
    
    private final io.reactivex.Completable deleteNewGroupEvent(java.lang.String groupId) {
        return null;
    }
    
    private final io.reactivex.Completable deleteNewCall(java.lang.String callId) {
        return null;
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
}