package com.tech.world.adapters.messaging;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/tech/world/adapters/messaging/ContactHolderInteraction;", "", "onAddContactClick", "", "contact", "Lcom/tech/world/model/realms/RealmContact;", "onMessageClick", "app_debug"})
public abstract interface ContactHolderInteraction {
    
    public abstract void onMessageClick(@org.jetbrains.annotations.NotNull()
    com.tech.world.model.realms.RealmContact contact);
    
    public abstract void onAddContactClick(@org.jetbrains.annotations.NotNull()
    com.tech.world.model.realms.RealmContact contact);
}