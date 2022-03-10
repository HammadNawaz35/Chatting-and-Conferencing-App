package com.tech.world.utils.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005\u00a2\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u0007J\u0016\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0007J\u001e\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007J\u001e\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007\u00a8\u0006\u0016"}, d2 = {"Lcom/tech/world/utils/network/CallsManager;", "", "()V", "listenForEndingCall", "Lio/reactivex/Flowable;", "Lcom/google/firebase/database/DataSnapshot;", "callId", "", "otherUid", "isIncoming", "", "saveOutgoingCallOnFirebase", "Lio/reactivex/Completable;", "fireCall", "Lcom/tech/world/model/realms/FireCall;", "saveOutgoingGroupCallOnFirebase", "groupId", "setCallAnswered", "setCallAnsweredForGroup", "setCallEnded", "setCallRejectedForGroup", "Companion", "app_debug"})
public final class CallsManager {
    @org.jetbrains.annotations.NotNull()
    public static final com.tech.world.utils.network.CallsManager.Companion Companion = null;
    public static final int CALL_TIEMOUT_SECONDS = 40;
    
    public CallsManager() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable saveOutgoingCallOnFirebase(@org.jetbrains.annotations.NotNull()
    com.tech.world.model.realms.FireCall fireCall, @org.jetbrains.annotations.NotNull()
    java.lang.String otherUid) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable saveOutgoingGroupCallOnFirebase(@org.jetbrains.annotations.NotNull()
    com.tech.world.model.realms.FireCall fireCall, @org.jetbrains.annotations.NotNull()
    java.lang.String groupId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable setCallEnded(@org.jetbrains.annotations.NotNull()
    java.lang.String callId, @org.jetbrains.annotations.NotNull()
    java.lang.String otherUid, boolean isIncoming) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable setCallAnsweredForGroup(@org.jetbrains.annotations.NotNull()
    java.lang.String callId, @org.jetbrains.annotations.NotNull()
    java.lang.String groupId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable setCallRejectedForGroup(@org.jetbrains.annotations.NotNull()
    java.lang.String callId, @org.jetbrains.annotations.NotNull()
    java.lang.String groupId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable setCallAnswered(@org.jetbrains.annotations.NotNull()
    java.lang.String callId, @org.jetbrains.annotations.NotNull()
    java.lang.String otherUid, boolean isIncoming) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Flowable<com.google.firebase.database.DataSnapshot> listenForEndingCall(@org.jetbrains.annotations.NotNull()
    java.lang.String callId, @org.jetbrains.annotations.NotNull()
    java.lang.String otherUid, boolean isIncoming) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/tech/world/utils/network/CallsManager$Companion;", "", "()V", "CALL_TIEMOUT_SECONDS", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}