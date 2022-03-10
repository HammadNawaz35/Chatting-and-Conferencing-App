package com.tech.world.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\u0018\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u001aR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001d"}, d2 = {"Lcom/tech/world/utils/PerformCall;", "", "context", "Landroid/app/Activity;", "fireManager", "Lcom/tech/world/utils/network/FireManager;", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "(Landroid/app/Activity;Lcom/tech/world/utils/network/FireManager;Lio/reactivex/disposables/CompositeDisposable;)V", "getContext", "()Landroid/app/Activity;", "setContext", "(Landroid/app/Activity;)V", "getDisposables", "()Lio/reactivex/disposables/CompositeDisposable;", "setDisposables", "(Lio/reactivex/disposables/CompositeDisposable;)V", "getFireManager", "()Lcom/tech/world/utils/network/FireManager;", "setFireManager", "(Lcom/tech/world/utils/network/FireManager;)V", "performCall", "", "isVideo", "", "uid", "", "performConferenceCall", "groupId", "app_debug"})
public final class PerformCall {
    @org.jetbrains.annotations.NotNull()
    private android.app.Activity context;
    @org.jetbrains.annotations.NotNull()
    private com.tech.world.utils.network.FireManager fireManager;
    @org.jetbrains.annotations.NotNull()
    private io.reactivex.disposables.CompositeDisposable disposables;
    
    public PerformCall(@org.jetbrains.annotations.NotNull()
    android.app.Activity context, @org.jetbrains.annotations.NotNull()
    com.tech.world.utils.network.FireManager fireManager, @org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable disposables) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Activity getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull()
    android.app.Activity p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tech.world.utils.network.FireManager getFireManager() {
        return null;
    }
    
    public final void setFireManager(@org.jetbrains.annotations.NotNull()
    com.tech.world.utils.network.FireManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.disposables.CompositeDisposable getDisposables() {
        return null;
    }
    
    public final void setDisposables(@org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable p0) {
    }
    
    public final void performCall(boolean isVideo, @org.jetbrains.annotations.Nullable()
    java.lang.String uid) {
    }
    
    public final void performConferenceCall(boolean isVideo, @org.jetbrains.annotations.Nullable()
    java.lang.String groupId) {
    }
}