package com.tech.world.adapters.messaging.holders.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u0002002\u0006\u0010B\u001a\u00020CH\u0016J\u001a\u0010D\u001a\u00020#2\u0006\u0010E\u001a\u0002002\b\u0010B\u001a\u0004\u0018\u00010CH\u0002J\u0018\u0010F\u001a\u00020@2\u0006\u0010G\u001a\u00020\u00052\u0006\u0010H\u001a\u00020IH\u0002J\u0010\u0010J\u001a\u00020@2\u0006\u0010E\u001a\u000200H\u0002R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR.\u0010 \u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\"\u0018\u00010!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u0010\u0010)\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010-X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010.\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u0002000/\u0018\u00010!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010&\"\u0004\b2\u0010(R\u0010\u00103\u001a\u0004\u0018\u000104X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u00105\u001a\u0004\u0018\u000104X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u00106\u001a\u0004\u0018\u000107X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001c\u0010<\u001a\u0004\u0018\u000107X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u00109\"\u0004\b>\u0010;\u00a8\u0006K"}, d2 = {"Lcom/tech/world/adapters/messaging/holders/base/BaseHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "context", "Landroid/content/Context;", "itemView", "Landroid/view/View;", "(Landroid/content/Context;Landroid/view/View;)V", "container", "getContainer", "()Landroid/view/View;", "setContainer", "(Landroid/view/View;)V", "getContext", "()Landroid/content/Context;", "interaction", "Lcom/tech/world/adapters/messaging/Interaction;", "getInteraction", "()Lcom/tech/world/adapters/messaging/Interaction;", "setInteraction", "(Lcom/tech/world/adapters/messaging/Interaction;)V", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "getLifecycleOwner", "()Landroidx/lifecycle/LifecycleOwner;", "setLifecycleOwner", "(Landroidx/lifecycle/LifecycleOwner;)V", "progressButton", "Lcom/github/abdularis/buttonprogress/DownloadButtonProgress;", "getProgressButton", "()Lcom/github/abdularis/buttonprogress/DownloadButtonProgress;", "setProgressButton", "(Lcom/github/abdularis/buttonprogress/DownloadButtonProgress;)V", "progressMap", "Landroidx/lifecycle/LiveData;", "", "", "", "getProgressMap", "()Landroidx/lifecycle/LiveData;", "setProgressMap", "(Landroidx/lifecycle/LiveData;)V", "quotedColor", "quotedMessageFrame", "Landroid/widget/FrameLayout;", "quotedThumb", "Landroid/widget/ImageView;", "selectedItems", "", "Lcom/tech/world/model/realms/Message;", "getSelectedItems", "setSelectedItems", "tvQuotedName", "Lcom/aghajari/emojiview/view/AXEmojiTextView;", "tvQuotedText", "tvSize", "Landroid/widget/TextView;", "getTvSize", "()Landroid/widget/TextView;", "setTvSize", "(Landroid/widget/TextView;)V", "tvTime", "getTvTime", "setTvTime", "bind", "", "message", "user", "Lcom/tech/world/model/realms/User;", "getQuotedUsername", "quotedMessage", "setBackgroundColor", "view", "isAdded", "", "setQuotedTextDrawable", "app_debug"})
public class BaseHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.Nullable()
    private android.widget.TextView tvTime;
    @org.jetbrains.annotations.Nullable()
    private android.view.View container;
    private final android.widget.FrameLayout quotedMessageFrame = null;
    private final android.view.View quotedColor = null;
    private final com.aghajari.emojiview.view.AXEmojiTextView tvQuotedName = null;
    private final com.aghajari.emojiview.view.AXEmojiTextView tvQuotedText = null;
    private final android.widget.ImageView quotedThumb = null;
    @org.jetbrains.annotations.Nullable()
    private android.widget.TextView tvSize;
    @org.jetbrains.annotations.Nullable()
    private com.github.abdularis.buttonprogress.DownloadButtonProgress progressButton;
    @org.jetbrains.annotations.Nullable()
    private com.tech.world.adapters.messaging.Interaction interaction;
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.LifecycleOwner lifecycleOwner;
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.LiveData<java.util.Map<java.lang.String, java.lang.Integer>> progressMap;
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.LiveData<java.util.List<com.tech.world.model.realms.Message>> selectedItems;
    
    public BaseHolder(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.view.View itemView) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.TextView getTvTime() {
        return null;
    }
    
    public final void setTvTime(@org.jetbrains.annotations.Nullable()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.view.View getContainer() {
        return null;
    }
    
    public final void setContainer(@org.jetbrains.annotations.Nullable()
    android.view.View p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.TextView getTvSize() {
        return null;
    }
    
    public final void setTvSize(@org.jetbrains.annotations.Nullable()
    android.widget.TextView p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.github.abdularis.buttonprogress.DownloadButtonProgress getProgressButton() {
        return null;
    }
    
    public final void setProgressButton(@org.jetbrains.annotations.Nullable()
    com.github.abdularis.buttonprogress.DownloadButtonProgress p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tech.world.adapters.messaging.Interaction getInteraction() {
        return null;
    }
    
    public final void setInteraction(@org.jetbrains.annotations.Nullable()
    com.tech.world.adapters.messaging.Interaction p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.LifecycleOwner getLifecycleOwner() {
        return null;
    }
    
    public final void setLifecycleOwner(@org.jetbrains.annotations.Nullable()
    androidx.lifecycle.LifecycleOwner p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.LiveData<java.util.Map<java.lang.String, java.lang.Integer>> getProgressMap() {
        return null;
    }
    
    public final void setProgressMap(@org.jetbrains.annotations.Nullable()
    androidx.lifecycle.LiveData<java.util.Map<java.lang.String, java.lang.Integer>> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.LiveData<java.util.List<com.tech.world.model.realms.Message>> getSelectedItems() {
        return null;
    }
    
    public final void setSelectedItems(@org.jetbrains.annotations.Nullable()
    androidx.lifecycle.LiveData<java.util.List<com.tech.world.model.realms.Message>> p0) {
    }
    
    public void bind(@org.jetbrains.annotations.NotNull()
    com.tech.world.model.realms.Message message, @org.jetbrains.annotations.NotNull()
    com.tech.world.model.realms.User user) {
    }
    
    private final void setBackgroundColor(android.view.View view, boolean isAdded) {
    }
    
    private final void setQuotedTextDrawable(com.tech.world.model.realms.Message quotedMessage) {
    }
    
    private final java.lang.String getQuotedUsername(com.tech.world.model.realms.Message quotedMessage, com.tech.world.model.realms.User user) {
        return null;
    }
}