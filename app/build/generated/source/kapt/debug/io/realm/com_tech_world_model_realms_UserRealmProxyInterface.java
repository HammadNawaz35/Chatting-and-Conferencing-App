package io.realm;


public interface com_tech_world_model_realms_UserRealmProxyInterface {
    public String realmGet$uid();
    public void realmSet$uid(String value);
    public String realmGet$photo();
    public void realmSet$photo(String value);
    public String realmGet$status();
    public void realmSet$status(String value);
    public String realmGet$phone();
    public void realmSet$phone(String value);
    public String realmGet$userLocalPhoto();
    public void realmSet$userLocalPhoto(String value);
    public String realmGet$userName();
    public void realmSet$userName(String value);
    public boolean realmGet$isBlocked();
    public void realmSet$isBlocked(boolean value);
    public String realmGet$appVer();
    public void realmSet$appVer(String value);
    public String realmGet$thumbImg();
    public void realmSet$thumbImg(String value);
    public boolean realmGet$isGroupBool();
    public void realmSet$isGroupBool(boolean value);
    public com.tech.world.model.realms.Group realmGet$group();
    public void realmSet$group(com.tech.world.model.realms.Group value);
    public com.tech.world.model.realms.Broadcast realmGet$broadcast();
    public void realmSet$broadcast(com.tech.world.model.realms.Broadcast value);
    public boolean realmGet$isBroadcastBool();
    public void realmSet$isBroadcastBool(boolean value);
    public boolean realmGet$isStoredInContacts();
    public void realmSet$isStoredInContacts(boolean value);
    public long realmGet$lastTimeFetchedImage();
    public void realmSet$lastTimeFetchedImage(long value);
}
