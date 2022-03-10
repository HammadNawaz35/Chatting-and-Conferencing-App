package io.realm;


public interface com_tech_world_model_realms_GroupRealmProxyInterface {
    public String realmGet$groupId();
    public void realmSet$groupId(String value);
    public boolean realmGet$isActive();
    public void realmSet$isActive(boolean value);
    public String realmGet$createdByNumber();
    public void realmSet$createdByNumber(String value);
    public long realmGet$timestamp();
    public void realmSet$timestamp(long value);
    public RealmList<com.tech.world.model.realms.User> realmGet$users();
    public void realmSet$users(RealmList<com.tech.world.model.realms.User> value);
    public RealmList<String> realmGet$adminsUids();
    public void realmSet$adminsUids(RealmList<String> value);
    public boolean realmGet$onlyAdminsCanPost();
    public void realmSet$onlyAdminsCanPost(boolean value);
    public String realmGet$currentGroupLink();
    public void realmSet$currentGroupLink(String value);
}
