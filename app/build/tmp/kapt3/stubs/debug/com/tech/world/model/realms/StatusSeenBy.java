package com.tech.world.model.realms;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0013"}, d2 = {"Lcom/tech/world/model/realms/StatusSeenBy;", "Lio/realm/RealmObject;", "user", "Lcom/tech/world/model/realms/User;", "seenAt", "", "(Lcom/tech/world/model/realms/User;J)V", "getSeenAt", "()J", "setSeenAt", "(J)V", "getUser", "()Lcom/tech/world/model/realms/User;", "setUser", "(Lcom/tech/world/model/realms/User;)V", "equals", "", "other", "", "app_debug"})
public class StatusSeenBy extends io.realm.RealmObject {
    @org.jetbrains.annotations.Nullable()
    private com.tech.world.model.realms.User user;
    private long seenAt;
    
    public StatusSeenBy() {
        super();
    }
    
    public StatusSeenBy(@org.jetbrains.annotations.Nullable()
    com.tech.world.model.realms.User user, long seenAt) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.tech.world.model.realms.User getUser() {
        return null;
    }
    
    public final void setUser(@org.jetbrains.annotations.Nullable()
    com.tech.world.model.realms.User p0) {
    }
    
    public final long getSeenAt() {
        return 0L;
    }
    
    public final void setSeenAt(long p0) {
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
}