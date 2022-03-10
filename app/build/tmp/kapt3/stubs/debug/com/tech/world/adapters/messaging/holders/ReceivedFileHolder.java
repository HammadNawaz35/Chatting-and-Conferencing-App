package com.tech.world.adapters.messaging.holders;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/tech/world/adapters/messaging/holders/ReceivedFileHolder;", "Lcom/tech/world/adapters/messaging/holders/base/BaseReceivedHolder;", "context", "Landroid/content/Context;", "itemView", "Landroid/view/View;", "(Landroid/content/Context;Landroid/view/View;)V", "fileIcon", "Landroid/widget/ImageView;", "tvFileExtension", "Landroid/widget/TextView;", "tvFileName", "tvFileSize", "bind", "", "message", "Lcom/tech/world/model/realms/Message;", "user", "Lcom/tech/world/model/realms/User;", "app_debug"})
public final class ReceivedFileHolder extends com.tech.world.adapters.messaging.holders.base.BaseReceivedHolder {
    private final android.widget.ImageView fileIcon = null;
    private final android.widget.TextView tvFileName = null;
    private final android.widget.TextView tvFileExtension = null;
    private final android.widget.TextView tvFileSize = null;
    
    public ReceivedFileHolder(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.view.View itemView) {
        super(null, null);
    }
    
    @java.lang.Override()
    public void bind(@org.jetbrains.annotations.NotNull()
    com.tech.world.model.realms.Message message, @org.jetbrains.annotations.NotNull()
    com.tech.world.model.realms.User user) {
    }
}