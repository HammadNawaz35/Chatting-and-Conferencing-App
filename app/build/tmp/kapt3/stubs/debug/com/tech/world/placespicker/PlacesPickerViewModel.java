package com.tech.world.placespicker;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010(\u001a\u00020&H\u0007J\u0010\u0010)\u001a\u00020&2\u0006\u0010*\u001a\u00020\u000fH\u0003J\b\u0010+\u001a\u00020&H\u0002J\b\u0010,\u001a\u00020-H\u0002J\u000e\u0010.\u001a\u00020&2\u0006\u0010*\u001a\u00020\u000fJ\b\u0010/\u001a\u00020&H\u0003J\b\u00100\u001a\u00020&H\u0003J\b\u00101\u001a\u00020&H\u0003J\b\u00102\u001a\u00020&H\u0003J\b\u00103\u001a\u00020&H\u0002R\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0011R\u001c\u0010 \u001a\u0010\u0012\f\u0012\n \"*\u0004\u0018\u00010\u000f0\u000f0!X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u0011\u00a8\u00064"}, d2 = {"Lcom/tech/world/placespicker/PlacesPickerViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/LifecycleObserver;", "Lkotlinx/coroutines/CoroutineScope;", "context", "Landroid/content/Context;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "(Landroid/content/Context;Landroidx/lifecycle/LifecycleOwner;)V", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "currentLocationLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/google/android/gms/maps/model/LatLng;", "getCurrentLocationLiveData", "()Landroidx/lifecycle/MutableLiveData;", "job", "Lkotlinx/coroutines/Job;", "locationCallback", "Lcom/google/android/gms/location/LocationCallback;", "locationManager", "Landroid/location/LocationManager;", "locationRequest", "Lcom/google/android/gms/location/LocationRequest;", "mFusedLocationClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "nearbyPlacesLiveData", "", "Lcom/tech/world/placespicker/Place;", "getNearbyPlacesLiveData", "onLocationChangedBehavior", "Lio/reactivex/subjects/BehaviorSubject;", "kotlin.jvm.PlatformType", "placesWebService", "Lcom/tech/world/placespicker/PlacesWebService;", "showLocationDialogLiveData", "", "getShowLocationDialogLiveData", "getCurrentLocation", "getCurrentPlace", "latLng", "initLocationRequest", "isLocationEnabled", "", "markerMoved", "onCreate", "onDestroy", "onStart", "onStop", "requestLocationDialog", "app_debug"})
public final class PlacesPickerViewModel extends androidx.lifecycle.ViewModel implements androidx.lifecycle.LifecycleObserver, kotlinx.coroutines.CoroutineScope {
    private final android.location.LocationManager locationManager = null;
    private com.google.android.gms.location.LocationRequest locationRequest;
    private final com.google.android.gms.location.FusedLocationProviderClient mFusedLocationClient = null;
    private com.google.android.gms.location.LocationCallback locationCallback;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<kotlin.Unit> showLocationDialogLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.google.android.gms.maps.model.LatLng> currentLocationLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.tech.world.placespicker.Place>> nearbyPlacesLiveData = null;
    private final io.reactivex.subjects.BehaviorSubject<com.google.android.gms.maps.model.LatLng> onLocationChangedBehavior = null;
    private com.tech.world.placespicker.PlacesWebService placesWebService;
    private kotlinx.coroutines.Job job;
    
    public PlacesPickerViewModel(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<kotlin.Unit> getShowLocationDialogLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.google.android.gms.maps.model.LatLng> getCurrentLocationLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.tech.world.placespicker.Place>> getNearbyPlacesLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return null;
    }
    
    @androidx.lifecycle.OnLifecycleEvent(value = androidx.lifecycle.Lifecycle.Event.ON_CREATE)
    private final void onCreate() {
    }
    
    public final void markerMoved(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.model.LatLng latLng) {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    public final void getCurrentLocation() {
    }
    
    private final void requestLocationDialog() {
    }
    
    private final boolean isLocationEnabled() {
        return false;
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    private final void getCurrentPlace(com.google.android.gms.maps.model.LatLng latLng) {
    }
    
    @androidx.lifecycle.OnLifecycleEvent(value = androidx.lifecycle.Lifecycle.Event.ON_DESTROY)
    private final void onDestroy() {
    }
    
    @androidx.lifecycle.OnLifecycleEvent(value = androidx.lifecycle.Lifecycle.Event.ON_START)
    private final void onStart() {
    }
    
    @androidx.lifecycle.OnLifecycleEvent(value = androidx.lifecycle.Lifecycle.Event.ON_STOP)
    private final void onStop() {
    }
    
    private final void initLocationRequest() {
    }
}