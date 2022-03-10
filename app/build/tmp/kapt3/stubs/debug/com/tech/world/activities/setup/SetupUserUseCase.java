package com.tech.world.activities.setup;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001c\u001a\u00020\u000fJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00010\u001e2\u0006\u0010\u001c\u001a\u00020\u000fH\u0002J\u001e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00010\u001e2\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u000fH\u0002J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00010\u001e2\u0006\u0010\u001c\u001a\u00020\u000fH\u0002J \u0010!\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\"0\u001eH\u0002J:\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010$2\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u000f2\b\u0010&\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\'\u001a\u0004\u0018\u00010\u000fH\u0002J\u0006\u0010(\u001a\u00020\u001aJ\b\u0010)\u001a\u00020\u001aH\u0002J\"\u0010*\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u000f2\b\u0010%\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001c\u001a\u00020\u000fH\u0002R\"\u0010\u0003\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R%\u0010\n\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00050\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lcom/tech/world/activities/setup/SetupUserUseCase;", "", "()V", "_completeSetupLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lkotlin/Pair;", "", "", "broadcastManager", "Lcom/tech/world/utils/network/BroadcastManager;", "completeSetupLiveData", "Landroidx/lifecycle/LiveData;", "getCompleteSetupLiveData", "()Landroidx/lifecycle/LiveData;", "currentUserPhotoThumb", "", "currentUserPhotoUrl", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "fetchUserImageDisposable", "Lio/reactivex/disposables/Disposable;", "fireManager", "Lcom/tech/world/utils/network/FireManager;", "groupManager", "Lcom/tech/world/utils/network/GroupManager;", "completeSetup", "", "imagePath", "userName", "completeSetupWithNoRemotePhoto", "Lio/reactivex/Observable;", "completeSetupWithPickedImage", "completeSetupWithRemotePhotoExists", "getDefaultUserProfilePhoto", "Lkotlin/Triple;", "getUserInfoHashmap", "Ljava/util/HashMap;", "thumbImg", "photoUrl", "filePath", "onDestroy", "saveCountryCode", "saveUserInfo", "photoFile", "app_debug"})
public final class SetupUserUseCase {
    private java.lang.String currentUserPhotoUrl = "";
    private java.lang.String currentUserPhotoThumb = "";
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    private final com.tech.world.utils.network.FireManager fireManager = null;
    private final com.tech.world.utils.network.GroupManager groupManager = null;
    private final com.tech.world.utils.network.BroadcastManager broadcastManager = null;
    private final androidx.lifecycle.MutableLiveData<kotlin.Pair<java.lang.Boolean, java.lang.Throwable>> _completeSetupLiveData = null;
    private io.reactivex.disposables.Disposable fetchUserImageDisposable;
    
    public SetupUserUseCase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<kotlin.Pair<java.lang.Boolean, java.lang.Throwable>> getCompleteSetupLiveData() {
        return null;
    }
    
    private final java.util.HashMap<java.lang.String, java.lang.Object> getUserInfoHashmap(java.lang.String userName, java.lang.String thumbImg, java.lang.String photoUrl, java.lang.String filePath) {
        return null;
    }
    
    private final void saveUserInfo(java.lang.String photoFile, java.lang.String thumbImg, java.lang.String userName) {
    }
    
    private final void saveCountryCode() {
    }
    
    public final void completeSetup(@org.jetbrains.annotations.Nullable()
    java.lang.String imagePath, @org.jetbrains.annotations.NotNull()
    java.lang.String userName) {
    }
    
    private final io.reactivex.Observable<java.lang.Object> completeSetupWithNoRemotePhoto(java.lang.String userName) {
        return null;
    }
    
    private final io.reactivex.Observable<java.lang.Object> completeSetupWithRemotePhotoExists(java.lang.String userName) {
        return null;
    }
    
    private final io.reactivex.Observable<java.lang.Object> completeSetupWithPickedImage(java.lang.String imagePath, java.lang.String userName) {
        return null;
    }
    
    private final io.reactivex.Observable<kotlin.Triple<java.lang.String, java.lang.String, java.lang.String>> getDefaultUserProfilePhoto() {
        return null;
    }
    
    public final void onDestroy() {
    }
}