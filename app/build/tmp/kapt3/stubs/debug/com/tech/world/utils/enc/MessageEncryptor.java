package com.tech.world.utils.enc;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u001b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\t\u001a\u00020\nH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u001b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\t\u001a\u00020\nH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ!\u0010\u0010\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u001b\u0010\u0012\u001a\u0004\u0018\u00010\r2\u0006\u0010\t\u001a\u00020\nH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u001b\u0010\u0013\u001a\u0004\u0018\u00010\r2\u0006\u0010\t\u001a\u00020\nH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/tech/world/utils/enc/MessageEncryptor;", "", "encryptionHelper", "Lcom/tech/world/utils/enc/EncryptionHelper;", "(Lcom/tech/world/utils/enc/EncryptionHelper;)V", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "encryptContact", "Lcom/tech/world/model/realms/RealmContact;", "message", "Lcom/tech/world/model/realms/Message;", "(Lcom/tech/world/model/realms/Message;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "encryptContent", "", "encryptLocation", "Lcom/tech/world/model/realms/RealmLocation;", "encryptMessage", "(Lcom/tech/world/model/realms/Message;Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "encryptPartialText", "encryptThumb", "app_debug"})
public final class MessageEncryptor {
    private final com.tech.world.utils.enc.EncryptionHelper encryptionHelper = null;
    private kotlinx.coroutines.CoroutineScope coroutineScope;
    
    public MessageEncryptor(@org.jetbrains.annotations.NotNull()
    com.tech.world.utils.enc.EncryptionHelper encryptionHelper) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object encryptMessage(@org.jetbrains.annotations.NotNull()
    com.tech.world.model.realms.Message message, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope coroutineScope, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.tech.world.model.realms.Message> continuation) {
        return null;
    }
    
    private final java.lang.Object encryptContent(com.tech.world.model.realms.Message message, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return null;
    }
    
    private final java.lang.Object encryptPartialText(com.tech.world.model.realms.Message message, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return null;
    }
    
    private final java.lang.Object encryptContact(com.tech.world.model.realms.Message message, kotlin.coroutines.Continuation<? super com.tech.world.model.realms.RealmContact> continuation) {
        return null;
    }
    
    private final java.lang.Object encryptThumb(com.tech.world.model.realms.Message message, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return null;
    }
    
    private final java.lang.Object encryptLocation(com.tech.world.model.realms.Message message, kotlin.coroutines.Continuation<? super com.tech.world.model.realms.RealmLocation> continuation) {
        return null;
    }
}