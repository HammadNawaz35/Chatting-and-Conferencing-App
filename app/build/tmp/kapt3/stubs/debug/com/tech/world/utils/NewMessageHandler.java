package com.tech.world.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u001b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u001b\u0010\u0010\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u0014J\u001a\u0010\u0015\u001a\u00020\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u0014J\u000e\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018J\u001a\u0010\u0019\u001a\u00020\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u0014J!\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ!\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020 H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010!J!\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\fH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"J\u0018\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006&"}, d2 = {"Lcom/tech/world/utils/NewMessageHandler;", "", "context", "Landroid/content/Context;", "fireManager", "Lcom/tech/world/utils/network/FireManager;", "messageDecryptor", "Lcom/tech/world/utils/enc/MessageDecryptor;", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "(Landroid/content/Context;Lcom/tech/world/utils/network/FireManager;Lcom/tech/world/utils/enc/MessageDecryptor;Lio/reactivex/disposables/CompositeDisposable;)V", "fetchContentIfNeeded", "", "message", "Lcom/tech/world/model/realms/Message;", "(Lcom/tech/world/model/realms/Message;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchThumbIfNeeded", "handleDeletedMessage", "", "map", "", "handleGroupEvent", "handleNewCall", "fireCall", "Lcom/tech/world/model/realms/FireCall;", "handleNewGroup", "handleNewMessage", "phone", "(Ljava/lang/String;Lcom/tech/world/model/realms/Message;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveMessageAndUpdateCount", "encryptedMessage", "user", "Lcom/tech/world/model/realms/User;", "(Lcom/tech/world/model/realms/Message;Lcom/tech/world/model/realms/User;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lcom/tech/world/model/realms/Message;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setMessageStat", "messageId", "chatId", "app_debug"})
public final class NewMessageHandler {
    private final android.content.Context context = null;
    private final com.tech.world.utils.network.FireManager fireManager = null;
    private final com.tech.world.utils.enc.MessageDecryptor messageDecryptor = null;
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    
    public NewMessageHandler(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.tech.world.utils.network.FireManager fireManager, @org.jetbrains.annotations.NotNull()
    com.tech.world.utils.enc.MessageDecryptor messageDecryptor, @org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable disposables) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object handleNewMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String phone, @org.jetbrains.annotations.NotNull()
    com.tech.world.model.realms.Message message, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object saveMessageAndUpdateCount(com.tech.world.model.realms.Message encryptedMessage, java.lang.String phone, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object saveMessageAndUpdateCount(com.tech.world.model.realms.Message encryptedMessage, com.tech.world.model.realms.User user, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final void setMessageStat(java.lang.String messageId, java.lang.String chatId) {
    }
    
    public final void handleDeletedMessage(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
    }
    
    public final void handleGroupEvent(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
    }
    
    public final void handleNewGroup(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
    }
    
    public final void handleNewCall(@org.jetbrains.annotations.NotNull()
    com.tech.world.model.realms.FireCall fireCall) {
    }
    
    private final java.lang.Object fetchThumbIfNeeded(com.tech.world.model.realms.Message message, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return null;
    }
    
    private final java.lang.Object fetchContentIfNeeded(com.tech.world.model.realms.Message message, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return null;
    }
}