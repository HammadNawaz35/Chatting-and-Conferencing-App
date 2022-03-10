package com.tech.world.activities.main.chats;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u00f4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010a\u001a\u00020bH\u0002J\u001a\u0010a\u001a\u00020b2\u0006\u0010c\u001a\u00020d2\b\u0010e\u001a\u0004\u0018\u00010fH\u0002J\b\u0010g\u001a\u00020bH\u0002J\b\u0010h\u001a\u00020bH\u0002J\b\u0010i\u001a\u00020=H\u0002J\b\u0010j\u001a\u00020bH\u0002J\b\u0010k\u001a\u00020bH\u0002J\b\u0010l\u001a\u00020bH\u0002J\u0010\u0010m\u001a\u00020b2\u0006\u0010n\u001a\u00020oH\u0002J\b\u0010p\u001a\u00020=H\u0002J\u0018\u0010q\u001a\u00020b2\u0006\u0010r\u001a\u00020o2\u0006\u0010s\u001a\u00020\u001fH\u0002J\u0018\u0010t\u001a\u00020b2\u0006\u0010r\u001a\u00020o2\u0006\u0010s\u001a\u00020\u001fH\u0002J\b\u0010u\u001a\u00020bH\u0002J\b\u0010v\u001a\u00020bH\u0002J\b\u0010w\u001a\u00020bH\u0002J\b\u0010x\u001a\u00020bH\u0002J\b\u0010y\u001a\u00020bH\u0002J\u0018\u0010z\u001a\u00020=2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010{\u001a\u00020|H\u0016J\u0010\u0010}\u001a\u00020b2\u0006\u0010~\u001a\u00020dH\u0016J\u0012\u0010\u007f\u001a\u00020b2\b\u0010\u0080\u0001\u001a\u00030\u0081\u0001H\u0016J\u001d\u0010\u0082\u0001\u001a\u00020b2\b\u0010\u0083\u0001\u001a\u00030\u0084\u00012\b\u0010s\u001a\u0004\u0018\u00010\u001fH\u0016J\u0019\u0010\u0085\u0001\u001a\u00020b2\u0006\u0010s\u001a\u00020\u001f2\u0006\u0010n\u001a\u00020oH\u0016J\u001a\u0010\u0086\u0001\u001a\u00020=2\u0006\u0010\b\u001a\u00020\t2\u0007\u0010\u0087\u0001\u001a\u00020\u0007H\u0016J-\u0010\u0088\u0001\u001a\u0004\u0018\u00010o2\b\u0010\u0089\u0001\u001a\u00030\u008a\u00012\n\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u008c\u00012\n\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008e\u0001H\u0016J\t\u0010\u008f\u0001\u001a\u00020bH\u0016J\u0011\u0010\u0090\u0001\u001a\u00020b2\u0006\u0010\b\u001a\u00020\tH\u0016J\u0019\u0010\u0091\u0001\u001a\u00020b2\u0006\u0010s\u001a\u00020\u001f2\u0006\u0010n\u001a\u00020oH\u0016J\t\u0010\u0092\u0001\u001a\u00020bH\u0016J\u001a\u0010\u0093\u0001\u001a\u00020=2\u0006\u0010\b\u001a\u00020\t2\u0007\u0010\u0087\u0001\u001a\u00020\u0007H\u0016J\u0014\u0010\u0094\u0001\u001a\u00020b2\t\u0010\u0095\u0001\u001a\u0004\u0018\u00010dH\u0016J\t\u0010\u0096\u0001\u001a\u00020bH\u0016J\t\u0010\u0097\u0001\u001a\u00020bH\u0016J\'\u0010\u0098\u0001\u001a\u00020b2\b\u0010\u0099\u0001\u001a\u00030\u0084\u00012\u0006\u0010~\u001a\u00020d2\n\u0010\u009a\u0001\u001a\u0005\u0018\u00010\u009b\u0001H\u0016J\u001d\u0010\u009c\u0001\u001a\u00020b2\u0006\u0010n\u001a\u00020o2\n\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008e\u0001H\u0016J\u0012\u0010\u009d\u0001\u001a\u00020b2\u0007\u0010\u009e\u0001\u001a\u00020=H\u0002J\t\u0010\u009f\u0001\u001a\u00020bH\u0002J\t\u0010\u00a0\u0001\u001a\u00020=H\u0016J\u0013\u0010\u00a1\u0001\u001a\u00020b2\b\u0010\u00a2\u0001\u001a\u00030\u0084\u0001H\u0002J\t\u0010\u00a3\u0001\u001a\u00020bH\u0002J\u001c\u0010\u00a4\u0001\u001a\u00020b2\b\u0010{\u001a\u0004\u0018\u00010|2\u0007\u0010\u00a5\u0001\u001a\u00020=H\u0002J\u0013\u0010\u00a6\u0001\u001a\u00020b2\b\u0010\u009a\u0001\u001a\u00030\u009b\u0001H\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R(\u0010\u001c\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e\u0018\u00010\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010$\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u0014\u0010)\u001a\u00020*X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u001c\u0010-\u001a\u0004\u0018\u00010.X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u000e\u00103\u001a\u000204X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u00105\u001a\n\u0012\u0004\u0012\u000207\u0018\u000106X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0014\u0010<\u001a\u00020=8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b<\u0010>R\u0014\u0010?\u001a\u00020=8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b?\u0010>R\u001c\u0010@\u001a\u0004\u0018\u00010AX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u001c\u0010F\u001a\u0004\u0018\u00010GX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u001b\u0010L\u001a\u00020M8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bN\u0010OR\u0010\u0010R\u001a\u0004\u0018\u00010SX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010T\u001a\b\u0012\u0004\u0012\u00020\u001f0UX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010V\u001a\u0004\u0018\u00010AX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bW\u0010C\"\u0004\bX\u0010ER\u001b\u0010Y\u001a\u00020Z8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b]\u0010Q\u001a\u0004\b[\u0010\\R\u001c\u0010^\u001a\u0004\u0018\u00010AX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b_\u0010C\"\u0004\b`\u0010E\u00a8\u0006\u00a7\u0001"}, d2 = {"Lcom/tech/world/activities/main/chats/FragmentChats;", "Lcom/tech/world/fragments/BaseFragment;", "Lcom/tech/world/utils/GroupTyping$GroupTypingListener;", "Landroid/view/ActionMode$Callback;", "Lcom/tech/world/activities/main/chats/ChatsAdapter$ChatsAdapterCallback;", "()V", "actionMenu", "Landroid/view/Menu;", "actionMode", "Landroid/view/ActionMode;", "getActionMode", "()Landroid/view/ActionMode;", "setActionMode", "(Landroid/view/ActionMode;)V", "adView", "Lcom/google/android/gms/ads/AdView;", "getAdView", "()Lcom/google/android/gms/ads/AdView;", "setAdView", "(Lcom/google/android/gms/ads/AdView;)V", "adapter", "Lcom/tech/world/activities/main/chats/ChatsAdapter;", "getAdapter", "()Lcom/tech/world/activities/main/chats/ChatsAdapter;", "setAdapter", "(Lcom/tech/world/activities/main/chats/ChatsAdapter;)V", "callback", "Lcom/tech/world/interfaces/FragmentCallback;", "changeListener", "Lio/realm/OrderedRealmCollectionChangeListener;", "Lio/realm/RealmResults;", "Lcom/tech/world/model/realms/Chat;", "getChangeListener", "()Lio/realm/OrderedRealmCollectionChangeListener;", "setChangeListener", "(Lio/realm/OrderedRealmCollectionChangeListener;)V", "chatList", "getChatList", "()Lio/realm/RealmResults;", "setChatList", "(Lio/realm/RealmResults;)V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "getDisposables", "()Lio/reactivex/disposables/CompositeDisposable;", "fireListener", "Lcom/tech/world/utils/FireListener;", "getFireListener", "()Lcom/tech/world/utils/FireListener;", "setFireListener", "(Lcom/tech/world/utils/FireListener;)V", "groupManager", "Lcom/tech/world/utils/network/GroupManager;", "groupTypingList", "", "Lcom/tech/world/utils/GroupTyping;", "getGroupTypingList", "()Ljava/util/List;", "setGroupTypingList", "(Ljava/util/List;)V", "isHasGroupItem", "", "()Z", "isHasMutedItem", "lastMessageStatListener", "Lcom/google/firebase/database/ValueEventListener;", "getLastMessageStatListener", "()Lcom/google/firebase/database/ValueEventListener;", "setLastMessageStatListener", "(Lcom/google/firebase/database/ValueEventListener;)V", "linearLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "getLinearLayoutManager", "()Landroidx/recyclerview/widget/LinearLayoutManager;", "setLinearLayoutManager", "(Landroidx/recyclerview/widget/LinearLayoutManager;)V", "mainViewModel", "Lcom/tech/world/activities/main/MainViewModel;", "getMainViewModel", "()Lcom/tech/world/activities/main/MainViewModel;", "mainViewModel$delegate", "Lkotlin/Lazy;", "rvChats", "Landroidx/recyclerview/widget/RecyclerView;", "selectedChats", "Ljava/util/ArrayList;", "typingEventListener", "getTypingEventListener", "setTypingEventListener", "viewModel", "Lcom/tech/world/activities/main/chats/ChatsFragmentViewModel;", "getViewModel", "()Lcom/tech/world/activities/main/chats/ChatsFragmentViewModel;", "viewModel$delegate", "voiceMessageListener", "getVoiceMessageListener", "setVoiceMessageListener", "addMessageStatListener", "", "chatId", "", "lastMessage", "Lcom/tech/world/model/realms/Message;", "addTypingStatListener", "addVoiceMessageStatListener", "areAllOfChatsGroups", "deleteItemClicked", "exitActionMode", "exitGroupClicked", "init", "view", "Landroid/view/View;", "isInActionMode", "itemAdded", "itemView", "chat", "itemRemoved", "listenForLastMessageStat", "listenForMessagesChanges", "listenForTypingStat", "listenForVoiceMessageStat", "muteItemClicked", "onActionItemClicked", "menuItem", "Landroid/view/MenuItem;", "onAllNotTyping", "groupId", "onAttach", "context", "Landroid/content/Context;", "onBind", "pos", "", "onClick", "onCreateActionMode", "menu", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onDestroyActionMode", "onLongClick", "onPause", "onPrepareActionMode", "onQueryTextChange", "newText", "onResume", "onSearchClose", "onTyping", "state", "user", "Lcom/tech/world/model/realms/User;", "onViewCreated", "setMenuItemVisibility", "b", "setTheAdapter", "showAds", "updateActionMenuItems", "itemsCount", "updateGroupItems", "updateMutedIcon", "isMuted", "userProfileClicked", "app_debug"})
public final class FragmentChats extends com.tech.world.fragments.BaseFragment implements com.tech.world.utils.GroupTyping.GroupTypingListener, android.view.ActionMode.Callback, com.tech.world.activities.main.chats.ChatsAdapter.ChatsAdapterCallback {
    private androidx.recyclerview.widget.RecyclerView rvChats;
    @org.jetbrains.annotations.Nullable()
    private com.tech.world.activities.main.chats.ChatsAdapter adapter;
    @org.jetbrains.annotations.Nullable()
    private androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager;
    @org.jetbrains.annotations.Nullable()
    private io.realm.RealmResults<com.tech.world.model.realms.Chat> chatList;
    @org.jetbrains.annotations.Nullable()
    private io.realm.OrderedRealmCollectionChangeListener<io.realm.RealmResults<com.tech.world.model.realms.Chat>> changeListener;
    @org.jetbrains.annotations.Nullable()
    private com.google.firebase.database.ValueEventListener typingEventListener;
    @org.jetbrains.annotations.Nullable()
    private com.google.firebase.database.ValueEventListener voiceMessageListener;
    @org.jetbrains.annotations.Nullable()
    private com.google.firebase.database.ValueEventListener lastMessageStatListener;
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.tech.world.utils.GroupTyping> groupTypingList;
    @org.jetbrains.annotations.Nullable()
    private com.tech.world.utils.FireListener fireListener;
    @org.jetbrains.annotations.Nullable()
    private com.google.android.gms.ads.AdView adView;
    private com.tech.world.interfaces.FragmentCallback callback;
    private android.view.Menu actionMenu;
    private final kotlin.Lazy mainViewModel$delegate = null;
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private android.view.ActionMode actionMode;
    private java.util.ArrayList<com.tech.world.model.realms.Chat> selectedChats;
    private final com.tech.world.utils.network.GroupManager groupManager = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    private java.util.HashMap _$_findViewCache;
    
    public FragmentChats() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tech.world.activities.main.chats.ChatsAdapter getAdapter() {
        return null;
    }
    
    public final void setAdapter(@org.jetbrains.annotations.Nullable()
    com.tech.world.activities.main.chats.ChatsAdapter p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.recyclerview.widget.LinearLayoutManager getLinearLayoutManager() {
        return null;
    }
    
    public final void setLinearLayoutManager(@org.jetbrains.annotations.Nullable()
    androidx.recyclerview.widget.LinearLayoutManager p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.realm.RealmResults<com.tech.world.model.realms.Chat> getChatList() {
        return null;
    }
    
    public final void setChatList(@org.jetbrains.annotations.Nullable()
    io.realm.RealmResults<com.tech.world.model.realms.Chat> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final io.realm.OrderedRealmCollectionChangeListener<io.realm.RealmResults<com.tech.world.model.realms.Chat>> getChangeListener() {
        return null;
    }
    
    public final void setChangeListener(@org.jetbrains.annotations.Nullable()
    io.realm.OrderedRealmCollectionChangeListener<io.realm.RealmResults<com.tech.world.model.realms.Chat>> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.firebase.database.ValueEventListener getTypingEventListener() {
        return null;
    }
    
    public final void setTypingEventListener(@org.jetbrains.annotations.Nullable()
    com.google.firebase.database.ValueEventListener p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.firebase.database.ValueEventListener getVoiceMessageListener() {
        return null;
    }
    
    public final void setVoiceMessageListener(@org.jetbrains.annotations.Nullable()
    com.google.firebase.database.ValueEventListener p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.firebase.database.ValueEventListener getLastMessageStatListener() {
        return null;
    }
    
    public final void setLastMessageStatListener(@org.jetbrains.annotations.Nullable()
    com.google.firebase.database.ValueEventListener p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.tech.world.utils.GroupTyping> getGroupTypingList() {
        return null;
    }
    
    public final void setGroupTypingList(@org.jetbrains.annotations.Nullable()
    java.util.List<com.tech.world.utils.GroupTyping> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tech.world.utils.FireListener getFireListener() {
        return null;
    }
    
    public final void setFireListener(@org.jetbrains.annotations.Nullable()
    com.tech.world.utils.FireListener p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.google.android.gms.ads.AdView getAdView() {
        return null;
    }
    
    @java.lang.Override()
    public void setAdView(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.ads.AdView p0) {
    }
    
    private final com.tech.world.activities.main.MainViewModel getMainViewModel() {
        return null;
    }
    
    private final com.tech.world.activities.main.chats.ChatsFragmentViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.view.ActionMode getActionMode() {
        return null;
    }
    
    public final void setActionMode(@org.jetbrains.annotations.Nullable()
    android.view.ActionMode p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.disposables.CompositeDisposable getDisposables() {
        return null;
    }
    
    private final boolean isHasMutedItem() {
        return false;
    }
    
    private final boolean isHasGroupItem() {
        return false;
    }
    
    private final void updateMutedIcon(android.view.MenuItem menuItem, boolean isMuted) {
    }
    
    private final void setMenuItemVisibility(boolean b) {
    }
    
    private final void updateGroupItems() {
    }
    
    private final boolean areAllOfChatsGroups() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public boolean showAds() {
        return false;
    }
    
    private final void init(android.view.View view) {
    }
    
    private final void listenForMessagesChanges() {
    }
    
    private final void listenForLastMessageStat() {
    }
    
    private final void addVoiceMessageStatListener() {
    }
    
    private final void addMessageStatListener() {
    }
    
    private final void addMessageStatListener(java.lang.String chatId, com.tech.world.model.realms.Message lastMessage) {
    }
    
    private final void listenForVoiceMessageStat() {
    }
    
    private final void listenForTypingStat() {
    }
    
    private final void addTypingStatListener() {
    }
    
    private final void setTheAdapter() {
    }
    
    @java.lang.Override()
    public void onTyping(int state, @org.jetbrains.annotations.NotNull()
    java.lang.String groupId, @org.jetbrains.annotations.Nullable()
    com.tech.world.model.realms.User user) {
    }
    
    @java.lang.Override()
    public void onAllNotTyping(@org.jetbrains.annotations.NotNull()
    java.lang.String groupId) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onQueryTextChange(@org.jetbrains.annotations.Nullable()
    java.lang.String newText) {
    }
    
    @java.lang.Override()
    public void onSearchClose() {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    com.tech.world.model.realms.Chat chat, @org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    private final boolean isInActionMode() {
        return false;
    }
    
    private final void itemAdded(android.view.View itemView, com.tech.world.model.realms.Chat chat) {
    }
    
    private final void updateActionMenuItems(int itemsCount) {
    }
    
    private final void itemRemoved(android.view.View itemView, com.tech.world.model.realms.Chat chat) {
    }
    
    private final void exitActionMode() {
    }
    
    @java.lang.Override()
    public void onLongClick(@org.jetbrains.annotations.NotNull()
    com.tech.world.model.realms.Chat chat, @org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    @java.lang.Override()
    public void userProfileClicked(@org.jetbrains.annotations.NotNull()
    com.tech.world.model.realms.User user) {
    }
    
    @java.lang.Override()
    public void onBind(int pos, @org.jetbrains.annotations.Nullable()
    com.tech.world.model.realms.Chat chat) {
    }
    
    @java.lang.Override()
    public boolean onCreateActionMode(@org.jetbrains.annotations.NotNull()
    android.view.ActionMode actionMode, @org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onPrepareActionMode(@org.jetbrains.annotations.NotNull()
    android.view.ActionMode actionMode, @org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public void onDestroyActionMode(@org.jetbrains.annotations.NotNull()
    android.view.ActionMode actionMode) {
    }
    
    @java.lang.Override()
    public boolean onActionItemClicked(@org.jetbrains.annotations.NotNull()
    android.view.ActionMode actionMode, @org.jetbrains.annotations.NotNull()
    android.view.MenuItem menuItem) {
        return false;
    }
    
    private final void muteItemClicked() {
    }
    
    private final void exitGroupClicked() {
    }
    
    private final void deleteItemClicked() {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
}