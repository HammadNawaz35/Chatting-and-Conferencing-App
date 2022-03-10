package com.tech.world.adapters.messaging.holders;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/tech/world/adapters/messaging/holders/ReceivedContactHolder;", "Lcom/tech/world/adapters/messaging/holders/base/BaseReceivedHolder;", "Lcom/tech/world/adapters/messaging/ContactHolderBase;", "context", "Landroid/content/Context;", "itemView", "Landroid/view/View;", "(Landroid/content/Context;Landroid/view/View;)V", "btnAddContact", "Landroid/widget/Button;", "btnMessageContact", "contactHolderInteraction", "Lcom/tech/world/adapters/messaging/ContactHolderInteraction;", "getContactHolderInteraction", "()Lcom/tech/world/adapters/messaging/ContactHolderInteraction;", "setContactHolderInteraction", "(Lcom/tech/world/adapters/messaging/ContactHolderInteraction;)V", "relativeContactInfo", "Landroid/widget/RelativeLayout;", "tvContactName", "Landroid/widget/TextView;", "bind", "", "message", "Lcom/tech/world/model/realms/Message;", "user", "Lcom/tech/world/model/realms/User;", "app_debug"})
public final class ReceivedContactHolder extends com.tech.world.adapters.messaging.holders.base.BaseReceivedHolder implements com.tech.world.adapters.messaging.ContactHolderBase {
    private final android.widget.RelativeLayout relativeContactInfo = null;
    private final android.widget.TextView tvContactName = null;
    private final android.widget.Button btnMessageContact = null;
    private final android.widget.Button btnAddContact = null;
    @org.jetbrains.annotations.Nullable()
    private com.tech.world.adapters.messaging.ContactHolderInteraction contactHolderInteraction;
    
    public ReceivedContactHolder(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.view.View itemView) {
        super(null, null);
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.tech.world.adapters.messaging.ContactHolderInteraction getContactHolderInteraction() {
        return null;
    }
    
    @java.lang.Override()
    public void setContactHolderInteraction(@org.jetbrains.annotations.Nullable()
    com.tech.world.adapters.messaging.ContactHolderInteraction p0) {
    }
    
    @java.lang.Override()
    public void bind(@org.jetbrains.annotations.NotNull()
    com.tech.world.model.realms.Message message, @org.jetbrains.annotations.NotNull()
    com.tech.world.model.realms.User user) {
    }
}