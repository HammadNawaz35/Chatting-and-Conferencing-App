package com.tech.world.utils;

import java.lang.System;

/**
 * Created by Devlomi on 06/01/2018.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 )2\u00020\u0001:\u0002)*B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ \u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0018\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0018\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u000fH\u0002J\u0010\u0010\u0019\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J+\u0010\u001a\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ+\u0010\u001e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dJ\u0018\u0010\u001f\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0018\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020#2\u0006\u0010\t\u001a\u00020\nH\u0002J\u001a\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020&2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002J\u0018\u0010\'\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J+\u0010(\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006+"}, d2 = {"Lcom/tech/world/utils/DownloadManager;", "", "()V", "encryptionHelper", "Lcom/tech/world/utils/enc/EncryptionHelper;", "messageEncryptor", "Lcom/tech/world/utils/enc/MessageEncryptor;", "download", "", "message", "Lcom/tech/world/model/realms/Message;", "onComplete", "Lcom/tech/world/utils/DownloadManager$OnComplete;", "fillProgressHashmap", "messageId", "", "receiverId", "progress", "", "fillTaskHashmap", "downloadTask", "Lcom/google/firebase/storage/FileDownloadTask;", "uploadTask", "Lcom/google/firebase/storage/UploadTask;", "id", "removeTaskFromHashmap", "request", "scope", "Lkotlinx/coroutines/CoroutineScope;", "(Lcom/tech/world/model/realms/Message;Lkotlinx/coroutines/CoroutineScope;Lcom/tech/world/utils/DownloadManager$OnComplete;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendMessage", "setMessageContent", "filePath", "setMessageUri", "uri", "Landroid/net/Uri;", "updateJobCallback", "isSuccess", "", "updateProgress", "upload", "Companion", "OnComplete", "app_debug"})
public final class DownloadManager {
    @org.jetbrains.annotations.NotNull()
    public static final com.tech.world.utils.DownloadManager.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static java.util.HashMap<java.lang.String, com.google.firebase.storage.FileDownloadTask> downloadTaskHashmap;
    @org.jetbrains.annotations.NotNull()
    private static java.util.HashMap<java.lang.String, com.google.firebase.storage.UploadTask> uploadTaskHashMap;
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmField()
    public static java.util.HashMap<java.lang.String, com.tech.world.model.ProgressData> progressDataHashMap;
    private final com.tech.world.utils.enc.EncryptionHelper encryptionHelper = null;
    private final com.tech.world.utils.enc.MessageEncryptor messageEncryptor = null;
    
    public DownloadManager() {
        super();
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void cancelDownload(@org.jetbrains.annotations.NotNull()
    com.tech.world.model.realms.Message message) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void cancelDownload(@org.jetbrains.annotations.NotNull()
    java.lang.String messageId) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void cancelUpload(@org.jetbrains.annotations.NotNull()
    com.tech.world.model.realms.Message message) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void cancelUpload(@org.jetbrains.annotations.NotNull()
    java.lang.String messageId) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void cancelAllTasks() {
    }
    
    public final void download(@org.jetbrains.annotations.NotNull()
    com.tech.world.model.realms.Message message, @org.jetbrains.annotations.Nullable()
    com.tech.world.utils.DownloadManager.OnComplete onComplete) {
    }
    
    private final void updateJobCallback(boolean isSuccess, com.tech.world.utils.DownloadManager.OnComplete onComplete) {
    }
    
    private final void fillProgressHashmap(java.lang.String messageId, java.lang.String receiverId, int progress) {
    }
    
    private final void fillTaskHashmap(java.lang.String messageId, com.google.firebase.storage.FileDownloadTask downloadTask) {
    }
    
    private final void fillTaskHashmap(java.lang.String messageId, com.google.firebase.storage.UploadTask uploadTask) {
    }
    
    private final void removeTaskFromHashmap(java.lang.String messageId) {
    }
    
    private final void updateProgress(java.lang.String id, int progress) {
    }
    
    private final void onComplete(java.lang.String id) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object sendMessage(@org.jetbrains.annotations.NotNull()
    com.tech.world.model.realms.Message message, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope scope, @org.jetbrains.annotations.Nullable()
    com.tech.world.utils.DownloadManager.OnComplete onComplete, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object upload(com.tech.world.model.realms.Message message, kotlinx.coroutines.CoroutineScope scope, com.tech.world.utils.DownloadManager.OnComplete onComplete, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final void setMessageContent(java.lang.String filePath, com.tech.world.model.realms.Message message) {
    }
    
    private final void setMessageUri(android.net.Uri uri, com.tech.world.model.realms.Message message) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object request(@org.jetbrains.annotations.NotNull()
    com.tech.world.model.realms.Message message, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope scope, @org.jetbrains.annotations.Nullable()
    com.tech.world.utils.DownloadManager.OnComplete onComplete, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/tech/world/utils/DownloadManager$OnComplete;", "", "onComplete", "", "isSuccess", "", "app_debug"})
    public static abstract interface OnComplete {
        
        public abstract void onComplete(boolean isSuccess);
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0007J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0005H\u0007J\u0010\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0010\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0005H\u0007J\u0010\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0005H\u0002R&\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R&\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\n\u00a8\u0006\u0019"}, d2 = {"Lcom/tech/world/utils/DownloadManager$Companion;", "", "()V", "downloadTaskHashmap", "Ljava/util/HashMap;", "", "Lcom/google/firebase/storage/FileDownloadTask;", "getDownloadTaskHashmap", "()Ljava/util/HashMap;", "setDownloadTaskHashmap", "(Ljava/util/HashMap;)V", "progressDataHashMap", "Lcom/tech/world/model/ProgressData;", "uploadTaskHashMap", "Lcom/google/firebase/storage/UploadTask;", "getUploadTaskHashMap", "setUploadTaskHashMap", "cancelAllTasks", "", "cancelDownload", "message", "Lcom/tech/world/model/realms/Message;", "messageId", "cancelUpload", "removeProgressFromHashmap", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.HashMap<java.lang.String, com.google.firebase.storage.FileDownloadTask> getDownloadTaskHashmap() {
            return null;
        }
        
        public final void setDownloadTaskHashmap(@org.jetbrains.annotations.NotNull()
        java.util.HashMap<java.lang.String, com.google.firebase.storage.FileDownloadTask> p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.HashMap<java.lang.String, com.google.firebase.storage.UploadTask> getUploadTaskHashMap() {
            return null;
        }
        
        public final void setUploadTaskHashMap(@org.jetbrains.annotations.NotNull()
        java.util.HashMap<java.lang.String, com.google.firebase.storage.UploadTask> p0) {
        }
        
        @kotlin.jvm.JvmStatic()
        public final void cancelDownload(@org.jetbrains.annotations.NotNull()
        com.tech.world.model.realms.Message message) {
        }
        
        @kotlin.jvm.JvmStatic()
        public final void cancelDownload(@org.jetbrains.annotations.NotNull()
        java.lang.String messageId) {
        }
        
        @kotlin.jvm.JvmStatic()
        public final void cancelUpload(@org.jetbrains.annotations.NotNull()
        com.tech.world.model.realms.Message message) {
        }
        
        @kotlin.jvm.JvmStatic()
        public final void cancelUpload(@org.jetbrains.annotations.NotNull()
        java.lang.String messageId) {
        }
        
        @kotlin.jvm.JvmStatic()
        public final void cancelAllTasks() {
        }
        
        private final void removeProgressFromHashmap(java.lang.String messageId) {
        }
    }
}