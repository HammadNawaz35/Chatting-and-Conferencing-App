package com.tech.world.utils.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0016\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006J\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u000f2\u0006\u0010\r\u001a\u00020\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u0011J\u0016\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006J\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u00152\u0006\u0010\u0005\u001a\u00020\u0006J \u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00180\u00170\u00152\u0006\u0010\u0005\u001a\u00020\u0006J\u0012\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00110\u0015J\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u00152\u0006\u0010\u001b\u001a\u00020\u0006J\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u0006J\u000e\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010 \u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0006Jd\u0010\"\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u00112\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060\u00112\u0006\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020\u001dH\u0002J$\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0,0\u00152\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010-\u001a\u0004\u0018\u00010.\u00a8\u0006/"}, d2 = {"Lcom/tech/world/utils/network/GroupManager;", "", "()V", "addParticipant", "Lio/reactivex/Completable;", "groupId", "", "selectedUsers", "Ljava/util/ArrayList;", "Lcom/tech/world/model/realms/User;", "changeGroupImage", "imagePath", "changeGroupName", "groupTitle", "createNewGroup", "Lio/reactivex/Single;", "users", "", "exitGroup", "uid", "fetchAndCreateGroup", "Lio/reactivex/Observable;", "fetchGroupPartialInfo", "Lkotlin/Pair;", "", "fetchUserGroups", "getGroupIdByGroupLink", "groupLink", "isUserBannedFromGroup", "", "userId", "joinViaGroupLink", "removeGroupMember", "uidOfUserToRemove", "saveAndCreateNewGroup", "thumbImg", "photoUrl", "adminUids", "timestamp", "", "createdBy", "onlyAdminsCanPost", "isCreatedByThisUser", "updateGroup", "", "groupEvent", "Lcom/tech/world/model/realms/GroupEvent;", "app_debug"})
public final class GroupManager {
    
    public GroupManager() {
        super();
    }
    
    private final com.tech.world.model.realms.User saveAndCreateNewGroup(java.lang.String groupId, java.lang.String groupTitle, java.lang.String thumbImg, java.lang.String photoUrl, java.util.List<? extends com.tech.world.model.realms.User> users, java.util.List<java.lang.String> adminUids, long timestamp, java.lang.String createdBy, boolean onlyAdminsCanPost, boolean isCreatedByThisUser) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<kotlin.Pair<com.tech.world.model.realms.User, java.lang.Integer>> fetchGroupPartialInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String groupId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<com.tech.world.model.realms.User> fetchAndCreateGroup(@org.jetbrains.annotations.NotNull()
    java.lang.String groupId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<com.tech.world.model.realms.User> createNewGroup(@org.jetbrains.annotations.NotNull()
    java.lang.String groupTitle, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.tech.world.model.realms.User> users) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable joinViaGroupLink(@org.jetbrains.annotations.NotNull()
    java.lang.String groupId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.lang.String> getGroupIdByGroupLink(@org.jetbrains.annotations.NotNull()
    java.lang.String groupLink) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable removeGroupMember(@org.jetbrains.annotations.NotNull()
    java.lang.String groupId, @org.jetbrains.annotations.NotNull()
    java.lang.String uidOfUserToRemove) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable addParticipant(@org.jetbrains.annotations.NotNull()
    java.lang.String groupId, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.tech.world.model.realms.User> selectedUsers) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable changeGroupName(@org.jetbrains.annotations.NotNull()
    java.lang.String groupTitle, @org.jetbrains.annotations.NotNull()
    java.lang.String groupId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable changeGroupImage(@org.jetbrains.annotations.NotNull()
    java.lang.String imagePath, @org.jetbrains.annotations.NotNull()
    java.lang.String groupId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable exitGroup(@org.jetbrains.annotations.NotNull()
    java.lang.String groupId, @org.jetbrains.annotations.NotNull()
    java.lang.String uid) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.util.List<com.tech.world.model.realms.User>> updateGroup(@org.jetbrains.annotations.NotNull()
    java.lang.String groupId, @org.jetbrains.annotations.Nullable()
    com.tech.world.model.realms.GroupEvent groupEvent) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.util.List<com.tech.world.model.realms.User>> fetchUserGroups() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<java.lang.Boolean> isUserBannedFromGroup(@org.jetbrains.annotations.NotNull()
    java.lang.String groupId, @org.jetbrains.annotations.NotNull()
    java.lang.String userId) {
        return null;
    }
}