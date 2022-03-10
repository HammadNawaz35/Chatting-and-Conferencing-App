package com.tech.world.placespicker;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0019\u001aB\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u001c\u0010\u0011\u001a\u00020\u00122\n\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0010H\u0016J\u001c\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0010H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/tech/world/placespicker/NearbyPlacesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/tech/world/placespicker/NearbyPlacesAdapter$NearbyPlacesHolder;", "context", "Landroid/content/Context;", "places", "", "Lcom/tech/world/placespicker/Place;", "(Landroid/content/Context;Ljava/util/List;)V", "onClickListener", "Lcom/tech/world/placespicker/NearbyPlacesAdapter$OnClickListener;", "getOnClickListener", "()Lcom/tech/world/placespicker/NearbyPlacesAdapter$OnClickListener;", "setOnClickListener", "(Lcom/tech/world/placespicker/NearbyPlacesAdapter$OnClickListener;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "p1", "NearbyPlacesHolder", "OnClickListener", "app_debug"})
public final class NearbyPlacesAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.tech.world.placespicker.NearbyPlacesAdapter.NearbyPlacesHolder> {
    private final android.content.Context context = null;
    private final java.util.List<com.tech.world.placespicker.Place> places = null;
    @org.jetbrains.annotations.Nullable()
    private com.tech.world.placespicker.NearbyPlacesAdapter.OnClickListener onClickListener;
    
    public NearbyPlacesAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<com.tech.world.placespicker.Place> places) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tech.world.placespicker.NearbyPlacesAdapter.OnClickListener getOnClickListener() {
        return null;
    }
    
    public final void setOnClickListener(@org.jetbrains.annotations.Nullable()
    com.tech.world.placespicker.NearbyPlacesAdapter.OnClickListener p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.tech.world.placespicker.NearbyPlacesAdapter.NearbyPlacesHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int p1) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.tech.world.placespicker.NearbyPlacesAdapter.NearbyPlacesHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lcom/tech/world/placespicker/NearbyPlacesAdapter$NearbyPlacesHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/tech/world/placespicker/NearbyPlacesAdapter;Landroid/view/View;)V", "bind", "", "place", "Lcom/tech/world/placespicker/Place;", "app_debug"})
    public final class NearbyPlacesHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public NearbyPlacesHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.tech.world.placespicker.Place place) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/tech/world/placespicker/NearbyPlacesAdapter$OnClickListener;", "", "onClick", "", "view", "Landroid/view/View;", "place", "Lcom/tech/world/placespicker/Place;", "app_debug"})
    public static abstract interface OnClickListener {
        
        public abstract void onClick(@org.jetbrains.annotations.NotNull()
        android.view.View view, @org.jetbrains.annotations.NotNull()
        com.tech.world.placespicker.Place place);
    }
}