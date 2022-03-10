package io.realm;


public interface com_tech_world_model_realms_ChatRealmProxyInterface {
    public String realmGet$chatId();
    public void realmSet$chatId(String value);
    public com.tech.world.model.realms.Message realmGet$lastMessage();
    public void realmSet$lastMessage(com.tech.world.model.realms.Message value);
    public String realmGet$lastMessageTimestamp();
    public void realmSet$lastMessageTimestamp(String value);
    public com.tech.world.model.realms.User realmGet$user();
    public void realmSet$user(com.tech.world.model.realms.User value);
    public boolean realmGet$isMuted();
    public void realmSet$isMuted(boolean value);
    public int realmGet$unReadCount();
    public void realmSet$unReadCount(int value);
    public String realmGet$firstUnreadMessageId();
    public void realmSet$firstUnreadMessageId(String value);
    public int realmGet$notificationId();
    public void realmSet$notificationId(int value);
    public RealmList<com.tech.world.model.realms.Message> realmGet$unreadMessages();
    public void realmSet$unreadMessages(RealmList<com.tech.world.model.realms.Message> value);
}
