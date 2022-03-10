package com.tech.world.activities.calling.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r\u00a8\u0006\u000f"}, d2 = {"Lcom/tech/world/activities/calling/model/CallType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "isGroupCall", "", "isVideo", "VOICE", "VIDEO", "CONFERENCE_VOICE", "CONFERENCE_VIDEO", "Companion", "app_debug"})
public enum CallType {
    /*public static final*/ VOICE /* = new VOICE(0) */,
    /*public static final*/ VIDEO /* = new VIDEO(0) */,
    /*public static final*/ CONFERENCE_VOICE /* = new CONFERENCE_VOICE(0) */,
    /*public static final*/ CONFERENCE_VIDEO /* = new CONFERENCE_VIDEO(0) */;
    private final int value = 0;
    @org.jetbrains.annotations.NotNull()
    public static final com.tech.world.activities.calling.model.CallType.Companion Companion = null;
    
    CallType(int value) {
    }
    
    public final int getValue() {
        return 0;
    }
    
    public final boolean isVideo() {
        return false;
    }
    
    public final boolean isGroupCall() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/tech/world/activities/calling/model/CallType$Companion;", "", "()V", "fromInt", "Lcom/tech/world/activities/calling/model/CallType;", "value", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.tech.world.activities.calling.model.CallType fromInt(int value) {
            return null;
        }
    }
}