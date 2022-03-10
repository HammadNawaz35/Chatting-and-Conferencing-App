package com.tech.world.adapters.messaging.holders.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u0013"}, d2 = {"Lcom/tech/world/adapters/messaging/holders/base/BaseSentHolder;", "Lcom/tech/world/adapters/messaging/holders/base/BaseHolder;", "context", "Landroid/content/Context;", "itemView", "Landroid/view/View;", "(Landroid/content/Context;Landroid/view/View;)V", "messageStatImg", "Landroid/widget/ImageView;", "getMessageStatImg", "()Landroid/widget/ImageView;", "setMessageStatImg", "(Landroid/widget/ImageView;)V", "bind", "", "message", "Lcom/tech/world/model/realms/Message;", "user", "Lcom/tech/world/model/realms/User;", "app_debug"})
public class BaseSentHolder extends com.tech.world.adapters.messaging.holders.base.BaseHolder {
    @org.jetbrains.annotations.Nullable()
    private android.widget.ImageView messageStatImg;
    
    public BaseSentHolder(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.view.View itemView) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.widget.ImageView getMessageStatImg() {
        return null;
    }
    
    public final void setMessageStatImg(@org.jetbrains.annotations.Nullable()
    android.widget.ImageView p0) {
    }
    
    @java.lang.Override()
    public void bind(@org.jetbrains.annotations.NotNull()
    com.tech.world.model.realms.Message message, @org.jetbrains.annotations.NotNull()
    com.tech.world.model.realms.User user) {
    }
}