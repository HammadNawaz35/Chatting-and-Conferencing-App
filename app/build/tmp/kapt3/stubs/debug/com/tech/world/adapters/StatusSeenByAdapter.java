package com.tech.world.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u0013B\u001b\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u001c\u0010\u000f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/tech/world/adapters/StatusSeenByAdapter;", "Lio/realm/RealmRecyclerViewAdapter;", "Lcom/tech/world/model/realms/StatusSeenBy;", "Lcom/tech/world/adapters/StatusSeenByAdapter$SeenByHolder;", "seenByList", "Lio/realm/RealmResults;", "callback", "Lcom/tech/world/adapters/StatusSeenByCallback;", "(Lio/realm/RealmResults;Lcom/tech/world/adapters/StatusSeenByCallback;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "SeenByHolder", "app_debug"})
public final class StatusSeenByAdapter extends io.realm.RealmRecyclerViewAdapter<com.tech.world.model.realms.StatusSeenBy, com.tech.world.adapters.StatusSeenByAdapter.SeenByHolder> {
    private final io.realm.RealmResults<com.tech.world.model.realms.StatusSeenBy> seenByList = null;
    
    public StatusSeenByAdapter(@org.jetbrains.annotations.NotNull()
    io.realm.RealmResults<com.tech.world.model.realms.StatusSeenBy> seenByList, @org.jetbrains.annotations.NotNull()
    com.tech.world.adapters.StatusSeenByCallback callback) {
        super(null, false);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.tech.world.adapters.StatusSeenByAdapter.SeenByHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.tech.world.adapters.StatusSeenByAdapter.SeenByHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lcom/tech/world/adapters/StatusSeenByAdapter$SeenByHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/tech/world/adapters/StatusSeenByAdapter;Landroid/view/View;)V", "bind", "", "seenByUser", "Lcom/tech/world/model/realms/StatusSeenBy;", "app_debug"})
    public final class SeenByHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public SeenByHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.tech.world.model.realms.StatusSeenBy seenByUser) {
        }
    }
}