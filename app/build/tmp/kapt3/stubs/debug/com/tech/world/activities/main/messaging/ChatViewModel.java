package com.tech.world.activities.main.messaging;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0012\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010\u001f\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u0006J\u0010\u0010!\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0006H\u0002J\u0006\u0010\"\u001a\u00020#J\u0016\u0010$\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\f2\u0006\u0010&\u001a\u00020\nJ\u0016\u0010\'\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00062\u0006\u0010(\u001a\u00020\fJ\u000e\u0010)\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0006J\u0016\u0010*\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00062\u0006\u0010+\u001a\u00020\fJ\u0016\u0010,\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00062\u0006\u0010-\u001a\u00020\fJ\u0016\u0010.\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00062\u0006\u0010/\u001a\u00020#J\"\u00100\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00062\u0006\u0010(\u001a\u00020\f2\n\b\u0002\u00101\u001a\u0004\u0018\u000102R \u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u001a\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u00050\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c\u00a8\u00063"}, d2 = {"Lcom/tech/world/activities/main/messaging/ChatViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_audibleState", "Landroidx/lifecycle/MutableLiveData;", "", "", "Lcom/tech/world/model/AudibleState;", "_itemSelectedLiveData", "", "Lcom/tech/world/model/realms/Message;", "_progressMapLiveData", "", "_selectedItems", "Ljava/util/ArrayList;", "audibleMap", "", "audibleState", "Landroidx/lifecycle/LiveData;", "getAudibleState", "()Landroidx/lifecycle/LiveData;", "itemSelectedLiveData", "getItemSelectedLiveData", "progressMap", "progressMapLiveData", "getProgressMapLiveData", "selectedItems", "getSelectedItems", "()Ljava/util/List;", "clearSelectedItems", "", "getAudibleProgressForId", "messageId", "getRecyclerStateOrNew", "isSelectedItemsContainMedia", "", "itemSelected", "pos", "message", "networkProgressChanged", "progress", "removeNetworkProgress", "setAudibleComplete", "finalProgress", "setAudibleMax", "max", "setAudiblePlayState", "isPlaying", "setAudibleProgress", "waves", "", "app_debug"})
public final class ChatViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.tech.world.model.realms.Message>> _itemSelectedLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.tech.world.model.realms.Message>> itemSelectedLiveData = null;
    private final androidx.lifecycle.MutableLiveData<java.util.Map<java.lang.String, java.lang.Integer>> _progressMapLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.Map<java.lang.String, java.lang.Integer>> progressMapLiveData = null;
    private final androidx.lifecycle.MutableLiveData<java.util.Map<java.lang.String, com.tech.world.model.AudibleState>> _audibleState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.Map<java.lang.String, com.tech.world.model.AudibleState>> audibleState = null;
    private final java.util.ArrayList<com.tech.world.model.realms.Message> _selectedItems = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.tech.world.model.realms.Message> selectedItems = null;
    private final java.util.Map<java.lang.String, java.lang.Integer> progressMap = null;
    private final java.util.Map<java.lang.String, com.tech.world.model.AudibleState> audibleMap = null;
    
    public ChatViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.tech.world.model.realms.Message>> getItemSelectedLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.Map<java.lang.String, java.lang.Integer>> getProgressMapLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.Map<java.lang.String, com.tech.world.model.AudibleState>> getAudibleState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.tech.world.model.realms.Message> getSelectedItems() {
        return null;
    }
    
    public final void itemSelected(int pos, @org.jetbrains.annotations.NotNull()
    com.tech.world.model.realms.Message message) {
    }
    
    public final void networkProgressChanged(@org.jetbrains.annotations.NotNull()
    java.lang.String messageId, int progress) {
    }
    
    public final void removeNetworkProgress(@org.jetbrains.annotations.NotNull()
    java.lang.String messageId) {
    }
    
    public final void setAudibleMax(@org.jetbrains.annotations.NotNull()
    java.lang.String messageId, int max) {
    }
    
    public final void setAudiblePlayState(@org.jetbrains.annotations.NotNull()
    java.lang.String messageId, boolean isPlaying) {
    }
    
    public final void setAudibleComplete(@org.jetbrains.annotations.NotNull()
    java.lang.String messageId, int finalProgress) {
    }
    
    public final void setAudibleProgress(@org.jetbrains.annotations.NotNull()
    java.lang.String messageId, int progress, @org.jetbrains.annotations.Nullable()
    byte[] waves) {
    }
    
    private final com.tech.world.model.AudibleState getRecyclerStateOrNew(java.lang.String messageId) {
        return null;
    }
    
    public final int getAudibleProgressForId(@org.jetbrains.annotations.NotNull()
    java.lang.String messageId) {
        return 0;
    }
    
    public final void clearSelectedItems() {
    }
    
    public final boolean isSelectedItemsContainMedia() {
        return false;
    }
}