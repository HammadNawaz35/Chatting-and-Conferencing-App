package com.tech.world.activities.calling;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/tech/world/activities/calling/AgoraConfig;", "", "()V", "videoDimension", "Lio/agora/rtc/video/VideoEncoderConfiguration$VideoDimensions;", "kotlin.jvm.PlatformType", "getVideoDimension", "()Lio/agora/rtc/video/VideoEncoderConfiguration$VideoDimensions;", "videoFps", "Lio/agora/rtc/video/VideoEncoderConfiguration$FRAME_RATE;", "getVideoFps", "()Lio/agora/rtc/video/VideoEncoderConfiguration$FRAME_RATE;", "app_debug"})
public final class AgoraConfig {
    @org.jetbrains.annotations.NotNull()
    public static final com.tech.world.activities.calling.AgoraConfig INSTANCE = null;
    private static final io.agora.rtc.video.VideoEncoderConfiguration.VideoDimensions videoDimension = null;
    @org.jetbrains.annotations.NotNull()
    private static final io.agora.rtc.video.VideoEncoderConfiguration.FRAME_RATE videoFps = io.agora.rtc.video.VideoEncoderConfiguration.FRAME_RATE.FRAME_RATE_FPS_30;
    
    private AgoraConfig() {
        super();
    }
    
    public final io.agora.rtc.video.VideoEncoderConfiguration.VideoDimensions getVideoDimension() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.agora.rtc.video.VideoEncoderConfiguration.FRAME_RATE getVideoFps() {
        return null;
    }
}