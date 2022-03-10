package com.tech.world.utils.network;

import java.lang.System;

/**
 * Created by Devlomi on 01/08/2017.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 82\u00020\u0001:\u00018B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0005J&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u0005J\u0016\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\r2\u0006\u0010\b\u001a\u00020\u0005J\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004J\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0005J\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\u0006\u0010\u0017\u001a\u00020\u0005J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u0005H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0005J\u0006\u0010\u001d\u001a\u00020\u001cJ\u0016\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0005J\u0006\u0010\"\u001a\u00020\u001cJ&\u0010#\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020\u00052\u0006\u0010%\u001a\u00020&2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\'\u001a\u00020\u000bJ\u001e\u0010(\u001a\u00020\u001c2\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u000bJ \u0010*\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\u00052\u0006\u0010%\u001a\u00020&H\u0002J&\u0010-\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\u00052\u0006\u0010.\u001a\u00020&2\u0006\u0010/\u001a\u00020\u000bJ&\u00100\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005010\r2\u0006\u00102\u001a\u00020\u0005J\u000e\u00103\u001a\u00020\u001c2\u0006\u00104\u001a\u00020\u0005J\u000e\u00105\u001a\u00020\u001c2\u0006\u00106\u001a\u00020\u0005J\u0016\u00107\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\u0005\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00069"}, d2 = {"Lcom/tech/world/utils/network/FireManager;", "", "()V", "downloadCurrentUserPhoto", "Lio/reactivex/Single;", "", "photoUrl", "downloadUserPhoto", "uid", "oldLocalPath", "isGroup", "", "fetchAndSaveUserByPhone", "Lio/reactivex/Maybe;", "Lcom/tech/world/model/realms/User;", "phone", "fetchUserStatus", "getServerTime", "", "isCallCancelled", "userId", "callId", "isUserBlocked", "otherUserUid", "saveDeviceId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setCallCancelled", "Lio/reactivex/Completable;", "setLastSeen", "setMessagesAsRead", "context", "Landroid/content/Context;", "chatId", "setOnlineStatus", "setTypingStat", "receiverUid", "stat", "", "isBroadcast", "setUserBlocked", "setBlocked", "updateMessageStat", "myUid", "messageId", "updateMessagesState", "state", "isVoiceMessage", "updateMyPhoto", "Lkotlin/Triple;", "imagePath", "updateMyStatus", "status", "updateMyUserName", "username", "updateVoiceMessageStat", "Companion", "app_debug"})
public final class FireManager {
    @org.jetbrains.annotations.NotNull()
    public static final com.tech.world.utils.network.FireManager.Companion Companion = null;
    private static final java.lang.String[] deniedFirebaseStrings = {".", "#", "$", "[", "]"};
    public static final int STATUS_TYPE = 8888;
    private static final java.util.List<java.lang.String> imageDownloadProcessIds = null;
    
    public FireManager() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Maybe<com.tech.world.model.realms.User> fetchAndSaveUserByPhone(@org.jetbrains.annotations.NotNull()
    java.lang.String phone) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable setOnlineStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<java.lang.String> downloadCurrentUserPhoto(@org.jetbrains.annotations.NotNull()
    java.lang.String photoUrl) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable updateMyStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String status) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Maybe<java.lang.String> fetchUserStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String uid) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable updateMyUserName(@org.jetbrains.annotations.NotNull()
    java.lang.String username) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Maybe<kotlin.Triple<java.lang.String, java.lang.String, java.lang.String>> updateMyPhoto(@org.jetbrains.annotations.NotNull()
    java.lang.String imagePath) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable setUserBlocked(@org.jetbrains.annotations.NotNull()
    java.lang.String uid, @org.jetbrains.annotations.NotNull()
    java.lang.String receiverUid, boolean setBlocked) {
        return null;
    }
    
    public final void setMessagesAsRead(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String chatId) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable setLastSeen() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable setTypingStat(@org.jetbrains.annotations.NotNull()
    java.lang.String receiverUid, int stat, boolean isGroup, boolean isBroadcast) {
        return null;
    }
    
    private final io.reactivex.Completable updateMessageStat(java.lang.String myUid, java.lang.String messageId, int stat) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable updateMessagesState(@org.jetbrains.annotations.NotNull()
    java.lang.String myUid, @org.jetbrains.annotations.NotNull()
    java.lang.String messageId, int state, boolean isVoiceMessage) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable updateVoiceMessageStat(@org.jetbrains.annotations.NotNull()
    java.lang.String myUid, @org.jetbrains.annotations.NotNull()
    java.lang.String messageId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<java.lang.Boolean> isCallCancelled(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    java.lang.String callId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable setCallCancelled(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    java.lang.String callId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<java.lang.Long> getServerTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<java.lang.Boolean> isUserBlocked(@org.jetbrains.annotations.NotNull()
    java.lang.String otherUserUid) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<java.lang.String> downloadUserPhoto(@org.jetbrains.annotations.NotNull()
    java.lang.String uid, @org.jetbrains.annotations.Nullable()
    java.lang.String oldLocalPath, boolean isGroup) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object saveDeviceId(@org.jetbrains.annotations.NotNull()
    java.lang.String uid, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final boolean isLoggedIn() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getUid() {
        return null;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final boolean isAdmin(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> adminUids) {
        return false;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final boolean isAdmin(@org.jetbrains.annotations.Nullable()
    java.lang.String adminUid, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> adminUids) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getPhoneNumber() {
        return null;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final boolean isHasDeniedFirebaseStrings(@org.jetbrains.annotations.NotNull()
    java.lang.String deniedString) {
        return false;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void logout() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final com.google.firebase.storage.StorageReference getRef(int type, @org.jetbrains.annotations.Nullable()
    java.lang.String fileName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final io.reactivex.Maybe<com.tech.world.model.realms.User> fetchUserByUid(@org.jetbrains.annotations.NotNull()
    java.lang.String uid) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final io.reactivex.Observable<com.tech.world.model.ImageItem> checkAndDownloadUserPhoto(@org.jetbrains.annotations.Nullable()
    com.tech.world.model.realms.User user) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final io.reactivex.Maybe<java.lang.String> checkAndDownloadUserThumbImg(@org.jetbrains.annotations.Nullable()
    com.tech.world.model.realms.User user) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final io.reactivex.Single<java.lang.String> downloadUserPhoto(@org.jetbrains.annotations.Nullable()
    java.lang.String photo, @org.jetbrains.annotations.NotNull()
    java.lang.String uid, @org.jetbrains.annotations.Nullable()
    java.lang.String oldLocalPath) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String generateKey() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0007J\u001a\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00182\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0007J*\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000f\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u0007H\u0007J\u0018\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00182\u0006\u0010\u000f\u001a\u00020\u0007H\u0007J\b\u0010\u001e\u001a\u00020\u0007H\u0007J\u001a\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010\u0007H\u0007J\"\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u00072\u000e\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\'H\u0007J\u0018\u0010#\u001a\u00020$2\u000e\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\'H\u0007J\u0010\u0010(\u001a\u00020$2\u0006\u0010)\u001a\u00020\u0007H\u0007J\b\u0010*\u001a\u00020$H\u0007J\b\u0010+\u001a\u00020,H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\bR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\u00078FX\u0087\u0004\u00a2\u0006\f\u0012\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u00078FX\u0087\u0004\u00a2\u0006\f\u0012\u0004\b\u0010\u0010\u0002\u001a\u0004\b\u0011\u0010\u000e\u00a8\u0006-"}, d2 = {"Lcom/tech/world/utils/network/FireManager$Companion;", "", "()V", "STATUS_TYPE", "", "deniedFirebaseStrings", "", "", "[Ljava/lang/String;", "imageDownloadProcessIds", "", "phoneNumber", "getPhoneNumber$annotations", "getPhoneNumber", "()Ljava/lang/String;", "uid", "getUid$annotations", "getUid", "checkAndDownloadUserPhoto", "Lio/reactivex/Observable;", "Lcom/tech/world/model/ImageItem;", "user", "Lcom/tech/world/model/realms/User;", "checkAndDownloadUserThumbImg", "Lio/reactivex/Maybe;", "downloadUserPhoto", "Lio/reactivex/Single;", "photo", "oldLocalPath", "fetchUserByUid", "generateKey", "getRef", "Lcom/google/firebase/storage/StorageReference;", "type", "fileName", "isAdmin", "", "adminUid", "adminUids", "", "isHasDeniedFirebaseStrings", "deniedString", "isLoggedIn", "logout", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @kotlin.jvm.JvmStatic()
        public final boolean isLoggedIn() {
            return false;
        }
        
        @kotlin.jvm.JvmStatic()
        @java.lang.Deprecated()
        public static void getUid$annotations() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUid() {
            return null;
        }
        
        @kotlin.jvm.JvmStatic()
        public final boolean isAdmin(@org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> adminUids) {
            return false;
        }
        
        @kotlin.jvm.JvmStatic()
        public final boolean isAdmin(@org.jetbrains.annotations.Nullable()
        java.lang.String adminUid, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> adminUids) {
            return false;
        }
        
        @kotlin.jvm.JvmStatic()
        @java.lang.Deprecated()
        public static void getPhoneNumber$annotations() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPhoneNumber() {
            return null;
        }
        
        @kotlin.jvm.JvmStatic()
        public final boolean isHasDeniedFirebaseStrings(@org.jetbrains.annotations.NotNull()
        java.lang.String deniedString) {
            return false;
        }
        
        @kotlin.jvm.JvmStatic()
        public final void logout() {
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final com.google.firebase.storage.StorageReference getRef(int type, @org.jetbrains.annotations.Nullable()
        java.lang.String fileName) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final io.reactivex.Maybe<com.tech.world.model.realms.User> fetchUserByUid(@org.jetbrains.annotations.NotNull()
        java.lang.String uid) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final io.reactivex.Observable<com.tech.world.model.ImageItem> checkAndDownloadUserPhoto(@org.jetbrains.annotations.Nullable()
        com.tech.world.model.realms.User user) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final io.reactivex.Maybe<java.lang.String> checkAndDownloadUserThumbImg(@org.jetbrains.annotations.Nullable()
        com.tech.world.model.realms.User user) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final io.reactivex.Single<java.lang.String> downloadUserPhoto(@org.jetbrains.annotations.Nullable()
        java.lang.String photo, @org.jetbrains.annotations.NotNull()
        java.lang.String uid, @org.jetbrains.annotations.Nullable()
        java.lang.String oldLocalPath) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final java.lang.String generateKey() {
            return null;
        }
    }
}