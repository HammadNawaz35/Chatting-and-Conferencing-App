package com.tech.world.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/tech/world/utils/RecorderSettings;", "", "()V", "freq", "", "getMic", "Lomrecorder/PullableSource;", "getMicFallback", "app_debug"})
public final class RecorderSettings {
    @org.jetbrains.annotations.NotNull()
    public static final com.tech.world.utils.RecorderSettings INSTANCE = null;
    private static final int freq = 12000;
    
    private RecorderSettings() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final omrecorder.PullableSource getMic() {
        return null;
    }
    
    private final omrecorder.PullableSource getMicFallback() {
        return null;
    }
}