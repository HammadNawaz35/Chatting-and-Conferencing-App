package com.tech.world.utils.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0016\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006J.\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\"\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u00122\u0006\u0010\r\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\u000eJ\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u00152\u0006\u0010\u0005\u001a\u00020\u0006J\u001a\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\u00152\u0006\u0010\u0017\u001a\u00020\u0006J\u0018\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000e2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0016\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0006\u00a8\u0006\u001d"}, d2 = {"Lcom/tech/world/utils/network/BroadcastManager;", "", "()V", "addParticipant", "Lio/reactivex/Completable;", "broadcastId", "", "selectedUsers", "Ljava/util/ArrayList;", "Lcom/tech/world/model/realms/User;", "changeBroadcastName", "newTitle", "createBroadcastLocally", "broadcastName", "", "timestamp", "", "createNewBroadcast", "Lio/reactivex/Single;", "deleteBroadcast", "fetchBroadcast", "Lio/reactivex/Observable;", "fetchBroadcasts", "uid", "getBroadcastUsersIds", "usersSnapshot", "Lcom/google/firebase/database/DataSnapshot;", "removeBroadcastMember", "userToDeleteUid", "app_debug"})
public final class BroadcastManager {
    
    public BroadcastManager() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<com.tech.world.model.realms.User> createNewBroadcast(@org.jetbrains.annotations.NotNull()
    java.lang.String broadcastName, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.tech.world.model.realms.User> selectedUsers) {
        return null;
    }
    
    private final com.tech.world.model.realms.User createBroadcastLocally(java.lang.String broadcastName, java.util.List<? extends com.tech.world.model.realms.User> selectedUsers, java.lang.String broadcastId, long timestamp) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable deleteBroadcast(@org.jetbrains.annotations.NotNull()
    java.lang.String broadcastId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable removeBroadcastMember(@org.jetbrains.annotations.NotNull()
    java.lang.String broadcastId, @org.jetbrains.annotations.NotNull()
    java.lang.String userToDeleteUid) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable addParticipant(@org.jetbrains.annotations.NotNull()
    java.lang.String broadcastId, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.tech.world.model.realms.User> selectedUsers) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable changeBroadcastName(@org.jetbrains.annotations.NotNull()
    java.lang.String broadcastId, @org.jetbrains.annotations.NotNull()
    java.lang.String newTitle) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<com.tech.world.model.realms.User> fetchBroadcast(@org.jetbrains.annotations.NotNull()
    java.lang.String broadcastId) {
        return null;
    }
    
    private final java.util.List<java.lang.String> getBroadcastUsersIds(com.google.firebase.database.DataSnapshot usersSnapshot) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.util.List<com.tech.world.model.realms.User>> fetchBroadcasts(@org.jetbrains.annotations.NotNull()
    java.lang.String uid) {
        return null;
    }
}