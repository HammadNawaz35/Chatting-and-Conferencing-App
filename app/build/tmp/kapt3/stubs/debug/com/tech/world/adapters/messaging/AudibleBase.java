package com.tech.world.adapters.messaging;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R,\u0010\b\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u0018\u00010\tX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"Lcom/tech/world/adapters/messaging/AudibleBase;", "", "audibleInteraction", "Lcom/tech/world/adapters/messaging/AudibleInteraction;", "getAudibleInteraction", "()Lcom/tech/world/adapters/messaging/AudibleInteraction;", "setAudibleInteraction", "(Lcom/tech/world/adapters/messaging/AudibleInteraction;)V", "audibleState", "Landroidx/lifecycle/LiveData;", "", "", "Lcom/tech/world/model/AudibleState;", "getAudibleState", "()Landroidx/lifecycle/LiveData;", "setAudibleState", "(Landroidx/lifecycle/LiveData;)V", "app_debug"})
public abstract interface AudibleBase {
    
    @org.jetbrains.annotations.Nullable()
    public abstract androidx.lifecycle.LiveData<java.util.Map<java.lang.String, com.tech.world.model.AudibleState>> getAudibleState();
    
    public abstract void setAudibleState(@org.jetbrains.annotations.Nullable()
    androidx.lifecycle.LiveData<java.util.Map<java.lang.String, com.tech.world.model.AudibleState>> p0);
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.tech.world.adapters.messaging.AudibleInteraction getAudibleInteraction();
    
    public abstract void setAudibleInteraction(@org.jetbrains.annotations.Nullable()
    com.tech.world.adapters.messaging.AudibleInteraction p0);
}