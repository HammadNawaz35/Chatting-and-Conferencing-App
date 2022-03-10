package com.tech.world.activities.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 82\u00020\u0001:\u00018B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bJ\u0006\u0010\u001d\u001a\u00020\u001eJ-\u0010\u001f\u001a\u00020\u001e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00070$H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010%J\u0014\u0010&\u001a\u00020\u001e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!J-\u0010\'\u001a\u00020\u001e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00070$H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010%J\u001e\u0010(\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020*2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00070$H\u0002J\b\u0010+\u001a\u00020\u001cH\u0002J \u0010,\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020.2\b\u00100\u001a\u0004\u0018\u000101J\u000e\u00102\u001a\u00020\u001e2\u0006\u00103\u001a\u00020\u0007J\u0006\u00104\u001a\u00020\u001eJ\u0006\u00105\u001a\u00020\u001eJ\u0006\u00106\u001a\u00020\u001eJ\b\u00107\u001a\u00020\u001eH\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\n \u0017*\u0004\u0018\u00010\u00160\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00069"}, d2 = {"Lcom/tech/world/activities/main/MainViewModel;", "Lcom/tech/world/common/DisposableAndroidViewModel;", "context", "Landroid/app/Application;", "(Landroid/app/Application;)V", "_queryTextChange", "Landroidx/lifecycle/MutableLiveData;", "", "_statusLiveData", "Lcom/tech/world/activities/main/status/StatusFragmentEvent;", "encryptionType", "lastSyncTime", "", "getLastSyncTime", "()J", "setLastSyncTime", "(J)V", "queryTextChange", "Landroidx/lifecycle/LiveData;", "getQueryTextChange", "()Landroidx/lifecycle/LiveData;", "realmHelper", "Lcom/tech/world/utils/RealmHelper;", "kotlin.jvm.PlatformType", "statusLiveData", "getStatusLiveData", "checkForUpdate", "Lio/reactivex/Maybe;", "", "deleteOldMessagesIfNeeded", "", "fetchImageAndVideosStatuses", "users", "", "Lcom/tech/world/model/realms/User;", "statusesIds", "", "(Ljava/util/List;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchStatuses", "fetchTextStatuses", "handleStatus", "dataSnapshot", "Lcom/google/firebase/database/DataSnapshot;", "isE2E", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onQueryTextChange", "text", "saveAppVersion", "saveDeviceId", "setupE2eIfNeeded", "updateUi", "Companion", "app_debug"})
public final class MainViewModel extends com.tech.world.common.DisposableAndroidViewModel {
    private final android.app.Application context = null;
    private final com.tech.world.utils.RealmHelper realmHelper = null;
    private long lastSyncTime = 0L;
    private final androidx.lifecycle.MutableLiveData<com.tech.world.activities.main.status.StatusFragmentEvent> _statusLiveData = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _queryTextChange = null;
    private final java.lang.String encryptionType = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.tech.world.activities.main.MainViewModel.Companion Companion = null;
    public static final int WAIT_TIME = 15000;
    
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application context) {
        super(null);
    }
    
    public final long getLastSyncTime() {
        return 0L;
    }
    
    public final void setLastSyncTime(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.tech.world.activities.main.status.StatusFragmentEvent> getStatusLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getQueryTextChange() {
        return null;
    }
    
    public final void onQueryTextChange(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    public final void fetchStatuses(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.tech.world.model.realms.User> users) {
    }
    
    private final void updateUi() {
    }
    
    private final void handleStatus(com.google.firebase.database.DataSnapshot dataSnapshot, java.util.List<java.lang.String> statusesIds) {
    }
    
    private final java.lang.Object fetchImageAndVideosStatuses(java.util.List<? extends com.tech.world.model.realms.User> users, java.util.List<java.lang.String> statusesIds, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object fetchTextStatuses(java.util.List<? extends com.tech.world.model.realms.User> users, java.util.List<java.lang.String> statusesIds, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    public final void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    public final void deleteOldMessagesIfNeeded() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Maybe<java.lang.Boolean> checkForUpdate() {
        return null;
    }
    
    public final void saveDeviceId() {
    }
    
    private final boolean isE2E() {
        return false;
    }
    
    public final void setupE2eIfNeeded() {
    }
    
    public final void saveAppVersion() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/tech/world/activities/main/MainViewModel$Companion;", "", "()V", "WAIT_TIME", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}