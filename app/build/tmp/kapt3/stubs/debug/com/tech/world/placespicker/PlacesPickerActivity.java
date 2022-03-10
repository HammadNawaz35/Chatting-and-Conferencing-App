package com.tech.world.placespicker;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0002J\"\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J\u0018\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0015H\u0016J\u0012\u0010$\u001a\u00020\u00192\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u0012\u0010\'\u001a\u00020\u00192\b\u0010(\u001a\u0004\u0018\u00010\u000eH\u0016J+\u0010)\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00062\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010+\u001a\u00020,H\u0016\u00a2\u0006\u0002\u0010-J\b\u0010.\u001a\u00020\u0019H\u0002J\u0014\u0010/\u001a\u00020\u00192\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0015H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00060"}, d2 = {"Lcom/tech/world/placespicker/PlacesPickerActivity;", "Lcom/tech/world/placespicker/ScopedActivity;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "Lcom/tech/world/placespicker/NearbyPlacesAdapter$OnClickListener;", "()V", "REQUEST_CODE_ASK_PERMISSIONS", "", "REQUIRED_SDK_PERMISSIONS", "", "", "[Ljava/lang/String;", "mAdapter", "Lcom/tech/world/placespicker/NearbyPlacesAdapter;", "mMap", "Lcom/google/android/gms/maps/GoogleMap;", "mMarker", "Lcom/google/android/gms/maps/model/Marker;", "markerOptions", "Lcom/google/android/gms/maps/model/MarkerOptions;", "places", "", "Lcom/tech/world/placespicker/Place;", "viewModel", "Lcom/tech/world/placespicker/PlacesPickerViewModel;", "checkPermissions", "", "enableGps", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onClick", "view", "Landroid/view/View;", "place", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onMapReady", "map", "onRequestPermissionsResult", "permissions", "grantResults", "", "(I[Ljava/lang/String;[I)V", "setupAdapter", "showDialog", "app_debug"})
public final class PlacesPickerActivity extends com.tech.world.placespicker.ScopedActivity implements com.google.android.gms.maps.OnMapReadyCallback, com.tech.world.placespicker.NearbyPlacesAdapter.OnClickListener {
    private com.tech.world.placespicker.PlacesPickerViewModel viewModel;
    private com.google.android.gms.maps.GoogleMap mMap;
    private com.google.android.gms.maps.model.MarkerOptions markerOptions;
    private com.google.android.gms.maps.model.Marker mMarker;
    private final java.util.List<com.tech.world.placespicker.Place> places = null;
    private com.tech.world.placespicker.NearbyPlacesAdapter mAdapter;
    private final int REQUEST_CODE_ASK_PERMISSIONS = 1;
    private final java.lang.String[] REQUIRED_SDK_PERMISSIONS = {"android.permission.ACCESS_FINE_LOCATION"};
    private java.util.HashMap _$_findViewCache;
    
    public PlacesPickerActivity() {
        super();
    }
    
    @java.lang.Override()
    public void onMapReady(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.maps.GoogleMap map) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void enableGps() {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    com.tech.world.placespicker.Place place) {
    }
    
    private final void setupAdapter() {
    }
    
    private final void checkPermissions() {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    private final void showDialog(com.tech.world.placespicker.Place place) {
    }
}