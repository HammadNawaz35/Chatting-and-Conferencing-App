package com.tech.world.adapters.messaging;

import java.lang.System;

/**
 * Created by Devlomi on 07/08/2017.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00030\u0004B\u0083\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00130\u0012\u0012\u0018\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00160\u00150\u0012\u0012\u0018\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00180\u00150\u0012\u00a2\u0006\u0002\u0010\u0019J\b\u00100\u001a\u000201H\u0002J\u0010\u00102\u001a\u00020\'2\u0006\u00103\u001a\u00020\u0016H\u0016J\u0018\u00104\u001a\u00020\u00032\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u0016H\u0002J\b\u00108\u001a\u00020\u0016H\u0016J\u0010\u00109\u001a\u00020\u00162\u0006\u00103\u001a\u00020\u0016H\u0016J\u0010\u0010:\u001a\u0002012\u0006\u0010;\u001a\u00020<H\u0002J\u0010\u0010=\u001a\u0002012\u0006\u0010>\u001a\u00020?H\u0002J\u0010\u0010@\u001a\u0002012\u0006\u0010A\u001a\u00020BH\u0002J\u0006\u0010C\u001a\u000201J\u001a\u0010D\u001a\u0002012\b\u0010E\u001a\u0004\u0018\u00010\u00032\u0006\u00103\u001a\u00020\u0016H\u0016J\u0018\u0010F\u001a\u0002012\u0006\u0010G\u001a\u00020\u00032\u0006\u00103\u001a\u00020\u0016H\u0016J\u0012\u0010H\u001a\u0004\u0018\u00010\u00032\u0006\u00105\u001a\u000206H\u0016J\u0018\u0010I\u001a\u00020\u00032\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u0016H\u0016R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00180\u00150\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010 \u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00160\u00150\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00130\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\'0&X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/\u00a8\u0006J"}, d2 = {"Lcom/tech/world/adapters/messaging/MessagingAdapter;", "Lio/realm/RealmRecyclerViewAdapter;", "Lcom/tech/world/model/realms/Message;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lca/barrenechea/widget/recyclerview/decoration/StickyHeaderAdapter;", "messages", "Lio/realm/OrderedRealmCollection;", "autoUpdate", "", "context", "Landroid/content/Context;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "user", "Lcom/tech/world/model/realms/User;", "myThumbImg", "", "selectedItems", "Landroidx/lifecycle/LiveData;", "", "progressMap", "", "", "audibleState", "Lcom/tech/world/model/AudibleState;", "(Lio/realm/OrderedRealmCollection;ZLandroid/content/Context;Landroidx/lifecycle/LifecycleOwner;Lcom/tech/world/model/realms/User;Ljava/lang/String;Landroidx/lifecycle/LiveData;Landroidx/lifecycle/LiveData;Landroidx/lifecycle/LiveData;)V", "audibleHolderInteraction", "Lcom/tech/world/adapters/messaging/AudibleInteraction;", "contactHolderInteraction", "Lcom/tech/world/adapters/messaging/ContactHolderInteraction;", "interaction", "Lcom/tech/world/adapters/messaging/Interaction;", "lastTimestampPos", "getLastTimestampPos", "()I", "setLastTimestampPos", "(I)V", "timestamps", "Ljava/util/HashMap;", "", "getTimestamps", "()Ljava/util/HashMap;", "setTimestamps", "(Ljava/util/HashMap;)V", "getUser", "()Lcom/tech/world/model/realms/User;", "setUser", "(Lcom/tech/world/model/realms/User;)V", "distinctMessagesTimestamps", "", "getHeaderId", "position", "getHolderByType", "parent", "Landroid/view/ViewGroup;", "viewType", "getItemCount", "getItemViewType", "initAudibleHolder", "audibleBase", "Lcom/tech/world/adapters/messaging/AudibleBase;", "initContactHolder", "contactHolderBase", "Lcom/tech/world/adapters/messaging/ContactHolderBase;", "initHolder", "baseHolder", "Lcom/tech/world/adapters/messaging/holders/base/BaseHolder;", "messageInserted", "onBindHeaderViewHolder", "viewholder", "onBindViewHolder", "mHolder", "onCreateHeaderViewHolder", "onCreateViewHolder", "app_debug"})
public final class MessagingAdapter extends io.realm.RealmRecyclerViewAdapter<com.tech.world.model.realms.Message, androidx.recyclerview.widget.RecyclerView.ViewHolder> implements ca.barrenechea.widget.recyclerview.decoration.StickyHeaderAdapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    private final io.realm.OrderedRealmCollection<com.tech.world.model.realms.Message> messages = null;
    private final android.content.Context context = null;
    private final androidx.lifecycle.LifecycleOwner lifecycleOwner = null;
    @org.jetbrains.annotations.NotNull()
    private com.tech.world.model.realms.User user;
    private final java.lang.String myThumbImg = null;
    private final androidx.lifecycle.LiveData<java.util.List<com.tech.world.model.realms.Message>> selectedItems = null;
    private final androidx.lifecycle.LiveData<java.util.Map<java.lang.String, java.lang.Integer>> progressMap = null;
    private final androidx.lifecycle.LiveData<java.util.Map<java.lang.String, com.tech.world.model.AudibleState>> audibleState = null;
    private final com.tech.world.adapters.messaging.Interaction interaction = null;
    private final com.tech.world.adapters.messaging.ContactHolderInteraction contactHolderInteraction = null;
    private final com.tech.world.adapters.messaging.AudibleInteraction audibleHolderInteraction = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.HashMap<java.lang.Integer, java.lang.Long> timestamps;
    private int lastTimestampPos = 0;
    
    public MessagingAdapter(@org.jetbrains.annotations.NotNull()
    io.realm.OrderedRealmCollection<com.tech.world.model.realms.Message> messages, boolean autoUpdate, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner lifecycleOwner, @org.jetbrains.annotations.NotNull()
    com.tech.world.model.realms.User user, @org.jetbrains.annotations.NotNull()
    java.lang.String myThumbImg, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<com.tech.world.model.realms.Message>> selectedItems, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.Map<java.lang.String, java.lang.Integer>> progressMap, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.Map<java.lang.String, com.tech.world.model.AudibleState>> audibleState) {
        super(null, false);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.tech.world.model.realms.User getUser() {
        return null;
    }
    
    public final void setUser(@org.jetbrains.annotations.NotNull()
    com.tech.world.model.realms.User p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.HashMap<java.lang.Integer, java.lang.Long> getTimestamps() {
        return null;
    }
    
    public final void setTimestamps(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.Integer, java.lang.Long> p0) {
    }
    
    public final int getLastTimestampPos() {
        return 0;
    }
    
    public final void setLastTimestampPos(int p0) {
    }
    
    @java.lang.Override()
    public long getHeaderId(int position) {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateHeaderViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindHeaderViewHolder(@org.jetbrains.annotations.Nullable()
    androidx.recyclerview.widget.RecyclerView.ViewHolder viewholder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView.ViewHolder mHolder, int position) {
    }
    
    private final void initHolder(com.tech.world.adapters.messaging.holders.base.BaseHolder baseHolder) {
    }
    
    private final void initAudibleHolder(com.tech.world.adapters.messaging.AudibleBase audibleBase) {
    }
    
    private final void initContactHolder(com.tech.world.adapters.messaging.ContactHolderBase contactHolderBase) {
    }
    
    private final void distinctMessagesTimestamps() {
    }
    
    public final void messageInserted() {
    }
    
    private final androidx.recyclerview.widget.RecyclerView.ViewHolder getHolderByType(android.view.ViewGroup parent, int viewType) {
        return null;
    }
}