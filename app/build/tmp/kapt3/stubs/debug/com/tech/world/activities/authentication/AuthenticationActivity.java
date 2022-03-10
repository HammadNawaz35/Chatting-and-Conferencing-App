package com.tech.world.activities.authentication;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0012\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\b\u0010\u0019\u001a\u00020\u0015H\u0014J\u0010\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u0015H\u0002J\b\u0010\u001d\u001a\u00020\u0015H\u0002J\u0010\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0018\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020 2\u0006\u0010#\u001a\u00020 H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006$"}, d2 = {"Lcom/tech/world/activities/authentication/AuthenticationActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/tech/world/activities/authentication/AuthCallbacks;", "()V", "authManager", "Lcom/tech/world/utils/network/AuthManager;", "navHostFragment", "Landroidx/navigation/fragment/NavHostFragment;", "getNavHostFragment", "()Landroidx/navigation/fragment/NavHostFragment;", "setNavHostFragment", "(Landroidx/navigation/fragment/NavHostFragment;)V", "navigation", "Landroidx/navigation/NavController;", "viewModel", "Lcom/tech/world/activities/authentication/AuthenticationViewModel;", "getViewModel", "()Lcom/tech/world/activities/authentication/AuthenticationViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "cancelVerificationRequest", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "setLoading", "", "startSplashActivity", "subscribeObservers", "verifyCode", "code", "", "verifyPhoneNumber", "phoneNumber", "countryCode", "app_debug"})
public final class AuthenticationActivity extends androidx.appcompat.app.AppCompatActivity implements com.tech.world.activities.authentication.AuthCallbacks {
    private final com.tech.world.utils.network.AuthManager authManager = null;
    private final kotlin.Lazy viewModel$delegate = null;
    private androidx.navigation.NavController navigation;
    public androidx.navigation.fragment.NavHostFragment navHostFragment;
    private java.util.HashMap _$_findViewCache;
    
    public AuthenticationActivity() {
        super();
    }
    
    private final com.tech.world.activities.authentication.AuthenticationViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.navigation.fragment.NavHostFragment getNavHostFragment() {
        return null;
    }
    
    public final void setNavHostFragment(@org.jetbrains.annotations.NotNull()
    androidx.navigation.fragment.NavHostFragment p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void subscribeObservers() {
    }
    
    @java.lang.Override()
    public void verifyPhoneNumber(@org.jetbrains.annotations.NotNull()
    java.lang.String phoneNumber, @org.jetbrains.annotations.NotNull()
    java.lang.String countryCode) {
    }
    
    @java.lang.Override()
    public void verifyCode(@org.jetbrains.annotations.NotNull()
    java.lang.String code) {
    }
    
    @java.lang.Override()
    public void cancelVerificationRequest() {
    }
    
    private final void setLoading(boolean setLoading) {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    private final void startSplashActivity() {
    }
}