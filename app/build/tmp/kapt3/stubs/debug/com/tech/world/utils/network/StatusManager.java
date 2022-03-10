package com.tech.world.utils.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nJ\u0014\u0010\u000b\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ$\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00102\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0014J&\u0010\u0015\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00040\u00170\u00162\u0006\u0010\b\u001a\u00020\u0005J\u0016\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005J$\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00102\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020!R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/tech/world/utils/network/StatusManager;", "", "()V", "currentDownloadStatusOperations", "", "", "deleteStatus", "Lio/reactivex/Completable;", "statusId", "statusType", "", "deleteStatuses", "statuses", "", "Lcom/tech/world/model/realms/Status;", "downloadVideoStatus", "Lio/reactivex/Single;", "id", "url", "file", "Ljava/io/File;", "getStatusSeenByList", "Lio/reactivex/Observable;", "Lkotlin/Pair;", "Lcom/tech/world/model/realms/StatusSeenBy;", "setStatusSeen", "uid", "uploadStatus", "filePath", "isVideo", "", "uploadTextStatus", "textStatus", "Lcom/tech/world/model/realms/TextStatus;", "app_debug"})
public final class StatusManager {
    private final java.util.List<java.lang.String> currentDownloadStatusOperations = null;
    
    public StatusManager() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<java.lang.String> downloadVideoStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    java.io.File file) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable setStatusSeen(@org.jetbrains.annotations.NotNull()
    java.lang.String uid, @org.jetbrains.annotations.NotNull()
    java.lang.String statusId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable deleteStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String statusId, int statusType) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable deleteStatuses(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.tech.world.model.realms.Status> statuses) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<com.tech.world.model.realms.Status> uploadStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String filePath, int statusType, boolean isVideo) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Completable uploadTextStatus(@org.jetbrains.annotations.NotNull()
    com.tech.world.model.realms.TextStatus textStatus) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<kotlin.Pair<java.lang.String, java.util.List<com.tech.world.model.realms.StatusSeenBy>>> getStatusSeenByList(@org.jetbrains.annotations.NotNull()
    java.lang.String statusId) {
        return null;
    }
}