package com.tech.world.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020!H\u0002J\u0010\u0010\"\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020!H\u0002J\u0010\u0010#\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020!H\u0002J\u0010\u0010%\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020!H\u0002J\u0010\u0010&\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020!H\u0002J\b\u0010\'\u001a\u00020\u001eH\u0016J\u0010\u0010(\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010)\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020+H\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\b\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\b\u001a\u0004\b\u001a\u0010\u001b\u00a8\u0006,"}, d2 = {"Lcom/tech/world/services/MyFCMService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "()V", "decryptionHelper", "Lcom/tech/world/utils/enc/DecryptionHelper;", "getDecryptionHelper", "()Lcom/tech/world/utils/enc/DecryptionHelper;", "decryptionHelper$delegate", "Lkotlin/Lazy;", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "fireManager", "Lcom/tech/world/utils/network/FireManager;", "messageDecryptor", "Lcom/tech/world/utils/enc/MessageDecryptor;", "getMessageDecryptor", "()Lcom/tech/world/utils/enc/MessageDecryptor;", "messageDecryptor$delegate", "newMessageHandler", "Lcom/tech/world/utils/NewMessageHandler;", "parentJob", "Lkotlinx/coroutines/CompletableJob;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "updateChecker", "Lcom/tech/world/utils/update/UpdateChecker;", "getUpdateChecker", "()Lcom/tech/world/utils/update/UpdateChecker;", "updateChecker$delegate", "cancelCoroutineJob", "", "handleDeletedMessage", "remoteMessage", "Lcom/google/firebase/messaging/RemoteMessage;", "handleGroupEvent", "handleNewCall", "map", "handleNewGroup", "handleNewMessage", "onDestroy", "onMessageReceived", "onNewToken", "s", "", "app_debug"})
public final class MyFCMService extends com.google.firebase.messaging.FirebaseMessagingService {
    private com.tech.world.utils.network.FireManager fireManager;
    private io.reactivex.disposables.CompositeDisposable disposables;
    private com.tech.world.utils.NewMessageHandler newMessageHandler;
    private final kotlinx.coroutines.CompletableJob parentJob = null;
    private final kotlinx.coroutines.CoroutineScope scope = null;
    private final kotlin.Lazy updateChecker$delegate = null;
    private final kotlin.Lazy decryptionHelper$delegate = null;
    private final kotlin.Lazy messageDecryptor$delegate = null;
    
    public MyFCMService() {
        super();
    }
    
    private final com.tech.world.utils.update.UpdateChecker getUpdateChecker() {
        return null;
    }
    
    private final com.tech.world.utils.enc.DecryptionHelper getDecryptionHelper() {
        return null;
    }
    
    private final com.tech.world.utils.enc.MessageDecryptor getMessageDecryptor() {
        return null;
    }
    
    @java.lang.Override()
    public void onNewToken(@org.jetbrains.annotations.NotNull()
    java.lang.String s) {
    }
    
    @java.lang.Override()
    public void onMessageReceived(@org.jetbrains.annotations.NotNull()
    com.google.firebase.messaging.RemoteMessage remoteMessage) {
    }
    
    private final void handleNewCall(com.google.firebase.messaging.RemoteMessage map) {
    }
    
    private final void handleNewMessage(com.google.firebase.messaging.RemoteMessage remoteMessage) {
    }
    
    private final void handleDeletedMessage(com.google.firebase.messaging.RemoteMessage remoteMessage) {
    }
    
    private final void handleNewGroup(com.google.firebase.messaging.RemoteMessage remoteMessage) {
    }
    
    private final void handleGroupEvent(com.google.firebase.messaging.RemoteMessage remoteMessage) {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    private final void cancelCoroutineJob() {
    }
}