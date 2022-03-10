package com.tech.world.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005J\u0012\u0010\u0016\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0012\u0010\u001c\u001a\u00020\u00142\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0014H\u0016J\u001a\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\"2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\b\u0010#\u001a\u00020\u0011H&R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0010\u001a\u00020\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0012\u00a8\u0006$"}, d2 = {"Lcom/tech/world/fragments/BaseFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/tech/world/Base;", "()V", "adView", "Lcom/google/android/gms/ads/AdView;", "getAdView", "()Lcom/google/android/gms/ads/AdView;", "setAdView", "(Lcom/google/android/gms/ads/AdView;)V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "getDisposables", "()Lio/reactivex/disposables/CompositeDisposable;", "fragmentCallback", "Lcom/tech/world/interfaces/FragmentCallback;", "isAdShowing", "", "()Z", "adViewInitialized", "", "mAdView", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onAttach", "context", "Landroid/content/Context;", "onQueryTextChange", "newText", "", "onSearchClose", "onViewCreated", "view", "Landroid/view/View;", "showAds", "app_debug"})
public abstract class BaseFragment extends androidx.fragment.app.Fragment implements com.tech.world.Base {
    @org.jetbrains.annotations.Nullable()
    @kotlin.jvm.JvmField()
    public com.tech.world.interfaces.FragmentCallback fragmentCallback;
    @org.jetbrains.annotations.Nullable()
    private com.google.android.gms.ads.AdView adView;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    private java.util.HashMap _$_findViewCache;
    
    public BaseFragment() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public com.google.android.gms.ads.AdView getAdView() {
        return null;
    }
    
    public void setAdView(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.ads.AdView p0) {
    }
    
    public abstract boolean showAds();
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.disposables.CompositeDisposable getDisposables() {
        return null;
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void adViewInitialized(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.ads.AdView mAdView) {
    }
    
    public final boolean isAdShowing() {
        return false;
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public void onQueryTextChange(@org.jetbrains.annotations.Nullable()
    java.lang.String newText) {
    }
    
    public void onSearchClose() {
    }
}