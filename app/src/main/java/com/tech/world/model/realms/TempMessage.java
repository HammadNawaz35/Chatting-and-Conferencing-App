package com.tech.world.model.realms;

import com.tech.world.model.constants.EncryptionType;

import io.realm.RealmObject;
import io.realm.annotations.Ignore;
import io.realm.annotations.Index;

public class TempMessage extends RealmObject {
    @Index
    private String messageId;
    //sender id
    private String fromId;
    //this field is used for groups
    //if a user is not exists in group and he sent a message previously
    //we will show his phone only
    private String fromPhone;
    //receiver id
    private String toId;
    //message type (text,image,video etc..)
    private int type;
    //message content (text content,media item path in database)
    private String content;
    //message timestamp
    private String timestamp;
    @Index
    private String chatId;
    //messageState if it's pending,sent,read or received
    private int messageStat;
    //media path in device storage
    private String localPath;
    //download upload state (loading,cancelled,success,finished)
    private int downloadUploadStat;
    //metadata could be (fileSize,videoSize or fileName)
    private String metadata;
    //is voice message listened by the receiver
    private boolean voiceMessageSeen;
    //media total duration (audio,voice or video length)
    private String mediaDuration;
    //blurred thumb decoded as BASE64
    //this is used when a user sends an image or video to another user
    //and that user did not download the image or video so it can show what content it is before downloading
    private String thumb;
    private boolean isForwarded;
    //video thumb (not blurred) used to show thumb for a video in recyclerView
    //it is also decoded as BASE64
    private String videoThumb;
    //file size for (file,video,audio,image) types
    private String fileSize;
    //when sending or receiving a contact
    private RealmContact contact;
    //when sending or receiving a location
    private RealmLocation location;
    //when sending a broadcast message we will copy
    //the same message to every user that sent the message to him
    //and to keep track of the sent message we will store the unique id of the original message
    //and then update the message state depending on broadcastedMessageId
    private boolean isGroup;
    private boolean isBroadcast;
    //this is used to indicate if the message was seen by the uesr
    //currentFontIndex'ts used to last 7 notification on APIs below API24
    private boolean isSeen;


    private String encryptionType = EncryptionType.NONE;

    @Ignore
    Status status;

    //used when replying to other messages
    private QuotedMessage quotedMessage;


    public TempMessage(String messageId, String fromId, String fromPhone, String toId, int type, String content, String timestamp, String chatId, int messageStat, String localPath, int downloadUploadStat, String metadata, boolean voiceMessageSeen, String mediaDuration, String thumb, boolean isForwarded, String videoThumb, String fileSize, RealmContact contact, RealmLocation location, boolean isGroup, boolean isBroadcast, boolean isSeen, Status status, QuotedMessage quotedMessage, String encryptionType) {
        this.messageId = messageId;
        this.fromId = fromId;
        this.fromPhone = fromPhone;
        this.toId = toId;
        this.type = type;
        this.content = content;
        this.timestamp = timestamp;
        this.chatId = chatId;
        this.messageStat = messageStat;
        this.localPath = localPath;
        this.downloadUploadStat = downloadUploadStat;
        this.metadata = metadata;
        this.voiceMessageSeen = voiceMessageSeen;
        this.mediaDuration = mediaDuration;
        this.thumb = thumb;
        this.isForwarded = isForwarded;
        this.videoThumb = videoThumb;
        this.fileSize = fileSize;
        this.contact = contact;
        this.location = location;
        this.isGroup = isGroup;
        this.isBroadcast = isBroadcast;
        this.isSeen = isSeen;
        this.status = status;
        this.quotedMessage = quotedMessage;
        this.encryptionType = encryptionType;

    }

    public static Message mapTempMessageToMessage(TempMessage tempMessage) {
        return new Message(
                tempMessage.messageId,
                tempMessage.fromId,
                tempMessage.fromPhone,
                tempMessage.toId,
                tempMessage.type,
                tempMessage.content,
                tempMessage.timestamp,
                tempMessage.chatId,
                tempMessage.messageStat,
                tempMessage.localPath,
                tempMessage.downloadUploadStat,
                tempMessage.metadata,
                tempMessage.voiceMessageSeen,
                tempMessage.mediaDuration,
                tempMessage.thumb,
                tempMessage.isForwarded,
                tempMessage.videoThumb,
                tempMessage.fileSize,
                tempMessage.contact,
                tempMessage.location,
                tempMessage.isGroup,
                tempMessage.isBroadcast,
                tempMessage.isSeen,
                tempMessage.status,
                tempMessage.quotedMessage,
                tempMessage.encryptionType
        );
    }


    public static TempMessage mapMessageToTempMessage(Message message) {
        return new TempMessage(
                message.getMessageId(),
                message.getFromId(),
                message.getFromPhone(),
                message.getToId(),
                message.getType(),
                message.getContent(),
                message.getTimestamp(),
                message.getChatId(),
                message.getMessageStat(),
                message.getLocalPath(),
                message.getDownloadUploadStat(),
                message.getMetadata(),
                message.isVoiceMessageSeen(),
                message.getMediaDuration(),
                message.getThumb(),
                message.isForwarded(),
                message.getVideoThumb(),
                message.getFileSize(),
                message.getContact(),
                message.getLocation(),
                message.isGroup(),
                message.isBroadcast(),
                message.isSeen(),
                message.getStatus(),
                message.getQuotedMessage(),
                message.getEncryptionType()
        );
    }


    public String getEncryptionType() {
        return encryptionType;
    }

    public void setEncryptionType(String encryptionType) {
        this.encryptionType = encryptionType;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getFromId() {
        return fromId;
    }

    public void setFromId(String fromId) {
        this.fromId = fromId;
    }

    public String getFromPhone() {
        return fromPhone;
    }

    public void setFromPhone(String fromPhone) {
        this.fromPhone = fromPhone;
    }

    public String getToId() {
        return toId;
    }

    public void setToId(String toId) {
        this.toId = toId;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getChatId() {
        return chatId;
    }

    public void setChatId(String chatId) {
        this.chatId = chatId;
    }

    public int getMessageStat() {
        return messageStat;
    }

    public void setMessageStat(int messageStat) {
        this.messageStat = messageStat;
    }

    public String getLocalPath() {
        return localPath;
    }

    public void setLocalPath(String localPath) {
        this.localPath = localPath;
    }

    public int getDownloadUploadStat() {
        return downloadUploadStat;
    }

    public void setDownloadUploadStat(int downloadUploadStat) {
        this.downloadUploadStat = downloadUploadStat;
    }

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    public boolean isVoiceMessageSeen() {
        return voiceMessageSeen;
    }

    public void setVoiceMessageSeen(boolean voiceMessageSeen) {
        this.voiceMessageSeen = voiceMessageSeen;
    }

    public String getMediaDuration() {
        return mediaDuration;
    }

    public void setMediaDuration(String mediaDuration) {
        this.mediaDuration = mediaDuration;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public boolean isForwarded() {
        return isForwarded;
    }

    public void setForwarded(boolean forwarded) {
        isForwarded = forwarded;
    }

    public String getVideoThumb() {
        return videoThumb;
    }

    public void setVideoThumb(String videoThumb) {
        this.videoThumb = videoThumb;
    }

    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    public RealmContact getContact() {
        return contact;
    }

    public void setContact(RealmContact contact) {
        this.contact = contact;
    }

    public RealmLocation getLocation() {
        return location;
    }

    public void setLocation(RealmLocation location) {
        this.location = location;
    }

    public boolean isGroup() {
        return isGroup;
    }

    public void setGroup(boolean group) {
        isGroup = group;
    }

    public boolean isBroadcast() {
        return isBroadcast;
    }

    public void setBroadcast(boolean broadcast) {
        isBroadcast = broadcast;
    }

    public boolean isSeen() {
        return isSeen;
    }

    public void setSeen(boolean seen) {
        isSeen = seen;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public TempMessage() {
    }

    public QuotedMessage getQuotedMessage() {
        return quotedMessage;
    }

    public void setQuotedMessage(QuotedMessage quotedMessage) {
        this.quotedMessage = quotedMessage;
    }
}
