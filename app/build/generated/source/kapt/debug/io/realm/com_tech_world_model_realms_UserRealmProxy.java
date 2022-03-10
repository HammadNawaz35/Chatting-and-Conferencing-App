package io.realm;


import android.annotation.TargetApi;
import android.os.Build;
import android.util.JsonReader;
import android.util.JsonToken;
import io.realm.ImportFlag;
import io.realm.ProxyUtils;
import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsList;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Property;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.android.JsonUtils;
import io.realm.internal.objectstore.OsObjectBuilder;
import io.realm.log.RealmLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressWarnings("all")
public class com_tech_world_model_realms_UserRealmProxy extends com.tech.world.model.realms.User
    implements RealmObjectProxy, com_tech_world_model_realms_UserRealmProxyInterface {

    static final class UserColumnInfo extends ColumnInfo {
        long uidColKey;
        long photoColKey;
        long statusColKey;
        long phoneColKey;
        long userLocalPhotoColKey;
        long userNameColKey;
        long isBlockedColKey;
        long appVerColKey;
        long thumbImgColKey;
        long isGroupBoolColKey;
        long groupColKey;
        long broadcastColKey;
        long isBroadcastBoolColKey;
        long isStoredInContactsColKey;
        long lastTimeFetchedImageColKey;

        UserColumnInfo(OsSchemaInfo schemaInfo) {
            super(15);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("User");
            this.uidColKey = addColumnDetails("uid", "uid", objectSchemaInfo);
            this.photoColKey = addColumnDetails("photo", "photo", objectSchemaInfo);
            this.statusColKey = addColumnDetails("status", "status", objectSchemaInfo);
            this.phoneColKey = addColumnDetails("phone", "phone", objectSchemaInfo);
            this.userLocalPhotoColKey = addColumnDetails("userLocalPhoto", "userLocalPhoto", objectSchemaInfo);
            this.userNameColKey = addColumnDetails("userName", "userName", objectSchemaInfo);
            this.isBlockedColKey = addColumnDetails("isBlocked", "isBlocked", objectSchemaInfo);
            this.appVerColKey = addColumnDetails("appVer", "appVer", objectSchemaInfo);
            this.thumbImgColKey = addColumnDetails("thumbImg", "thumbImg", objectSchemaInfo);
            this.isGroupBoolColKey = addColumnDetails("isGroupBool", "isGroupBool", objectSchemaInfo);
            this.groupColKey = addColumnDetails("group", "group", objectSchemaInfo);
            this.broadcastColKey = addColumnDetails("broadcast", "broadcast", objectSchemaInfo);
            this.isBroadcastBoolColKey = addColumnDetails("isBroadcastBool", "isBroadcastBool", objectSchemaInfo);
            this.isStoredInContactsColKey = addColumnDetails("isStoredInContacts", "isStoredInContacts", objectSchemaInfo);
            this.lastTimeFetchedImageColKey = addColumnDetails("lastTimeFetchedImage", "lastTimeFetchedImage", objectSchemaInfo);
        }

        UserColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new UserColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final UserColumnInfo src = (UserColumnInfo) rawSrc;
            final UserColumnInfo dst = (UserColumnInfo) rawDst;
            dst.uidColKey = src.uidColKey;
            dst.photoColKey = src.photoColKey;
            dst.statusColKey = src.statusColKey;
            dst.phoneColKey = src.phoneColKey;
            dst.userLocalPhotoColKey = src.userLocalPhotoColKey;
            dst.userNameColKey = src.userNameColKey;
            dst.isBlockedColKey = src.isBlockedColKey;
            dst.appVerColKey = src.appVerColKey;
            dst.thumbImgColKey = src.thumbImgColKey;
            dst.isGroupBoolColKey = src.isGroupBoolColKey;
            dst.groupColKey = src.groupColKey;
            dst.broadcastColKey = src.broadcastColKey;
            dst.isBroadcastBoolColKey = src.isBroadcastBoolColKey;
            dst.isStoredInContactsColKey = src.isStoredInContactsColKey;
            dst.lastTimeFetchedImageColKey = src.lastTimeFetchedImageColKey;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private UserColumnInfo columnInfo;
    private ProxyState<com.tech.world.model.realms.User> proxyState;

    com_tech_world_model_realms_UserRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (UserColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.tech.world.model.realms.User>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$uid() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.uidColKey);
    }

    @Override
    public void realmSet$uid(String value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'uid' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$photo() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.photoColKey);
    }

    @Override
    public void realmSet$photo(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.photoColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.photoColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.photoColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.photoColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$status() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.statusColKey);
    }

    @Override
    public void realmSet$status(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.statusColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.statusColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.statusColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.statusColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$phone() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phoneColKey);
    }

    @Override
    public void realmSet$phone(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.phoneColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.phoneColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phoneColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phoneColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$userLocalPhoto() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.userLocalPhotoColKey);
    }

    @Override
    public void realmSet$userLocalPhoto(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.userLocalPhotoColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.userLocalPhotoColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.userLocalPhotoColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.userLocalPhotoColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$userName() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.userNameColKey);
    }

    @Override
    public void realmSet$userName(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.userNameColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.userNameColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.userNameColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.userNameColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public boolean realmGet$isBlocked() {
        proxyState.getRealm$realm().checkIfValid();
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.isBlockedColKey);
    }

    @Override
    public void realmSet$isBlocked(boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setBoolean(columnInfo.isBlockedColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setBoolean(columnInfo.isBlockedColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$appVer() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.appVerColKey);
    }

    @Override
    public void realmSet$appVer(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.appVerColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.appVerColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.appVerColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.appVerColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$thumbImg() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.thumbImgColKey);
    }

    @Override
    public void realmSet$thumbImg(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.thumbImgColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.thumbImgColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.thumbImgColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.thumbImgColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public boolean realmGet$isGroupBool() {
        proxyState.getRealm$realm().checkIfValid();
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.isGroupBoolColKey);
    }

    @Override
    public void realmSet$isGroupBool(boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setBoolean(columnInfo.isGroupBoolColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setBoolean(columnInfo.isGroupBoolColKey, value);
    }

    @Override
    public com.tech.world.model.realms.Group realmGet$group() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNullLink(columnInfo.groupColKey)) {
            return null;
        }
        return proxyState.getRealm$realm().get(com.tech.world.model.realms.Group.class, proxyState.getRow$realm().getLink(columnInfo.groupColKey), false, Collections.<String>emptyList());
    }

    @Override
    public void realmSet$group(com.tech.world.model.realms.Group value) {
        Realm realm = (Realm) proxyState.getRealm$realm();
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("group")) {
                return;
            }
            if (value != null && !RealmObject.isManaged(value)) {
                value = realm.copyToRealm(value);
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                // Table#nullifyLink() does not support default value. Just using Row.
                row.nullifyLink(columnInfo.groupColKey);
                return;
            }
            proxyState.checkValidObject(value);
            row.getTable().setLink(columnInfo.groupColKey, row.getObjectKey(), ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getObjectKey(), true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().nullifyLink(columnInfo.groupColKey);
            return;
        }
        proxyState.checkValidObject(value);
        proxyState.getRow$realm().setLink(columnInfo.groupColKey, ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getObjectKey());
    }

    @Override
    public com.tech.world.model.realms.Broadcast realmGet$broadcast() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNullLink(columnInfo.broadcastColKey)) {
            return null;
        }
        return proxyState.getRealm$realm().get(com.tech.world.model.realms.Broadcast.class, proxyState.getRow$realm().getLink(columnInfo.broadcastColKey), false, Collections.<String>emptyList());
    }

    @Override
    public void realmSet$broadcast(com.tech.world.model.realms.Broadcast value) {
        Realm realm = (Realm) proxyState.getRealm$realm();
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("broadcast")) {
                return;
            }
            if (value != null && !RealmObject.isManaged(value)) {
                value = realm.copyToRealm(value);
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                // Table#nullifyLink() does not support default value. Just using Row.
                row.nullifyLink(columnInfo.broadcastColKey);
                return;
            }
            proxyState.checkValidObject(value);
            row.getTable().setLink(columnInfo.broadcastColKey, row.getObjectKey(), ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getObjectKey(), true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().nullifyLink(columnInfo.broadcastColKey);
            return;
        }
        proxyState.checkValidObject(value);
        proxyState.getRow$realm().setLink(columnInfo.broadcastColKey, ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getObjectKey());
    }

    @Override
    @SuppressWarnings("cast")
    public boolean realmGet$isBroadcastBool() {
        proxyState.getRealm$realm().checkIfValid();
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.isBroadcastBoolColKey);
    }

    @Override
    public void realmSet$isBroadcastBool(boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setBoolean(columnInfo.isBroadcastBoolColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setBoolean(columnInfo.isBroadcastBoolColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public boolean realmGet$isStoredInContacts() {
        proxyState.getRealm$realm().checkIfValid();
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.isStoredInContactsColKey);
    }

    @Override
    public void realmSet$isStoredInContacts(boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setBoolean(columnInfo.isStoredInContactsColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setBoolean(columnInfo.isStoredInContactsColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public long realmGet$lastTimeFetchedImage() {
        proxyState.getRealm$realm().checkIfValid();
        return (long) proxyState.getRow$realm().getLong(columnInfo.lastTimeFetchedImageColKey);
    }

    @Override
    public void realmSet$lastTimeFetchedImage(long value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.lastTimeFetchedImageColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.lastTimeFetchedImageColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("User", false, 15, 0);
        builder.addPersistedProperty("uid", RealmFieldType.STRING, Property.PRIMARY_KEY, Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("photo", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("status", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("phone", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("userLocalPhoto", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("userName", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("isBlocked", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("appVer", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("thumbImg", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("isGroupBool", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedLinkProperty("group", RealmFieldType.OBJECT, "Group");
        builder.addPersistedLinkProperty("broadcast", RealmFieldType.OBJECT, "Broadcast");
        builder.addPersistedProperty("isBroadcastBool", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("isStoredInContacts", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("lastTimeFetchedImage", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static UserColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new UserColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "User";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "User";
    }

    @SuppressWarnings("cast")
    public static com.tech.world.model.realms.User createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(2);
        com.tech.world.model.realms.User obj = null;
        if (update) {
            Table table = realm.getTable(com.tech.world.model.realms.User.class);
            UserColumnInfo columnInfo = (UserColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.User.class);
            long pkColumnKey = columnInfo.uidColKey;
            long objKey = Table.NO_MATCH;
            if (json.isNull("uid")) {
                objKey = table.findFirstNull(pkColumnKey);
            } else {
                objKey = table.findFirstString(pkColumnKey, json.getString("uid"));
            }
            if (objKey != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), realm.getSchema().getColumnInfo(com.tech.world.model.realms.User.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_tech_world_model_realms_UserRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("group")) {
                excludeFields.add("group");
            }
            if (json.has("broadcast")) {
                excludeFields.add("broadcast");
            }
            if (json.has("uid")) {
                if (json.isNull("uid")) {
                    obj = (io.realm.com_tech_world_model_realms_UserRealmProxy) realm.createObjectInternal(com.tech.world.model.realms.User.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_tech_world_model_realms_UserRealmProxy) realm.createObjectInternal(com.tech.world.model.realms.User.class, json.getString("uid"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'uid'.");
            }
        }

        final com_tech_world_model_realms_UserRealmProxyInterface objProxy = (com_tech_world_model_realms_UserRealmProxyInterface) obj;
        if (json.has("photo")) {
            if (json.isNull("photo")) {
                objProxy.realmSet$photo(null);
            } else {
                objProxy.realmSet$photo((String) json.getString("photo"));
            }
        }
        if (json.has("status")) {
            if (json.isNull("status")) {
                objProxy.realmSet$status(null);
            } else {
                objProxy.realmSet$status((String) json.getString("status"));
            }
        }
        if (json.has("phone")) {
            if (json.isNull("phone")) {
                objProxy.realmSet$phone(null);
            } else {
                objProxy.realmSet$phone((String) json.getString("phone"));
            }
        }
        if (json.has("userLocalPhoto")) {
            if (json.isNull("userLocalPhoto")) {
                objProxy.realmSet$userLocalPhoto(null);
            } else {
                objProxy.realmSet$userLocalPhoto((String) json.getString("userLocalPhoto"));
            }
        }
        if (json.has("userName")) {
            if (json.isNull("userName")) {
                objProxy.realmSet$userName(null);
            } else {
                objProxy.realmSet$userName((String) json.getString("userName"));
            }
        }
        if (json.has("isBlocked")) {
            if (json.isNull("isBlocked")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'isBlocked' to null.");
            } else {
                objProxy.realmSet$isBlocked((boolean) json.getBoolean("isBlocked"));
            }
        }
        if (json.has("appVer")) {
            if (json.isNull("appVer")) {
                objProxy.realmSet$appVer(null);
            } else {
                objProxy.realmSet$appVer((String) json.getString("appVer"));
            }
        }
        if (json.has("thumbImg")) {
            if (json.isNull("thumbImg")) {
                objProxy.realmSet$thumbImg(null);
            } else {
                objProxy.realmSet$thumbImg((String) json.getString("thumbImg"));
            }
        }
        if (json.has("isGroupBool")) {
            if (json.isNull("isGroupBool")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'isGroupBool' to null.");
            } else {
                objProxy.realmSet$isGroupBool((boolean) json.getBoolean("isGroupBool"));
            }
        }
        if (json.has("group")) {
            if (json.isNull("group")) {
                objProxy.realmSet$group(null);
            } else {
                com.tech.world.model.realms.Group groupObj = com_tech_world_model_realms_GroupRealmProxy.createOrUpdateUsingJsonObject(realm, json.getJSONObject("group"), update);
                objProxy.realmSet$group(groupObj);
            }
        }
        if (json.has("broadcast")) {
            if (json.isNull("broadcast")) {
                objProxy.realmSet$broadcast(null);
            } else {
                com.tech.world.model.realms.Broadcast broadcastObj = com_tech_world_model_realms_BroadcastRealmProxy.createOrUpdateUsingJsonObject(realm, json.getJSONObject("broadcast"), update);
                objProxy.realmSet$broadcast(broadcastObj);
            }
        }
        if (json.has("isBroadcastBool")) {
            if (json.isNull("isBroadcastBool")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'isBroadcastBool' to null.");
            } else {
                objProxy.realmSet$isBroadcastBool((boolean) json.getBoolean("isBroadcastBool"));
            }
        }
        if (json.has("isStoredInContacts")) {
            if (json.isNull("isStoredInContacts")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'isStoredInContacts' to null.");
            } else {
                objProxy.realmSet$isStoredInContacts((boolean) json.getBoolean("isStoredInContacts"));
            }
        }
        if (json.has("lastTimeFetchedImage")) {
            if (json.isNull("lastTimeFetchedImage")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'lastTimeFetchedImage' to null.");
            } else {
                objProxy.realmSet$lastTimeFetchedImage((long) json.getLong("lastTimeFetchedImage"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.tech.world.model.realms.User createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.tech.world.model.realms.User obj = new com.tech.world.model.realms.User();
        final com_tech_world_model_realms_UserRealmProxyInterface objProxy = (com_tech_world_model_realms_UserRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("uid")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$uid((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$uid(null);
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("photo")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$photo((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$photo(null);
                }
            } else if (name.equals("status")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$status((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$status(null);
                }
            } else if (name.equals("phone")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$phone((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$phone(null);
                }
            } else if (name.equals("userLocalPhoto")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$userLocalPhoto((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$userLocalPhoto(null);
                }
            } else if (name.equals("userName")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$userName((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$userName(null);
                }
            } else if (name.equals("isBlocked")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$isBlocked((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'isBlocked' to null.");
                }
            } else if (name.equals("appVer")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$appVer((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$appVer(null);
                }
            } else if (name.equals("thumbImg")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$thumbImg((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$thumbImg(null);
                }
            } else if (name.equals("isGroupBool")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$isGroupBool((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'isGroupBool' to null.");
                }
            } else if (name.equals("group")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$group(null);
                } else {
                    com.tech.world.model.realms.Group groupObj = com_tech_world_model_realms_GroupRealmProxy.createUsingJsonStream(realm, reader);
                    objProxy.realmSet$group(groupObj);
                }
            } else if (name.equals("broadcast")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$broadcast(null);
                } else {
                    com.tech.world.model.realms.Broadcast broadcastObj = com_tech_world_model_realms_BroadcastRealmProxy.createUsingJsonStream(realm, reader);
                    objProxy.realmSet$broadcast(broadcastObj);
                }
            } else if (name.equals("isBroadcastBool")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$isBroadcastBool((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'isBroadcastBool' to null.");
                }
            } else if (name.equals("isStoredInContacts")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$isStoredInContacts((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'isStoredInContacts' to null.");
                }
            } else if (name.equals("lastTimeFetchedImage")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$lastTimeFetchedImage((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'lastTimeFetchedImage' to null.");
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'uid'.");
        }
        return realm.copyToRealm(obj);
    }

    static com_tech_world_model_realms_UserRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.tech.world.model.realms.User.class), false, Collections.<String>emptyList());
        io.realm.com_tech_world_model_realms_UserRealmProxy obj = new io.realm.com_tech_world_model_realms_UserRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.tech.world.model.realms.User copyOrUpdate(Realm realm, UserColumnInfo columnInfo, com.tech.world.model.realms.User object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null) {
            final BaseRealm otherRealm = ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm();
            if (otherRealm.threadId != realm.threadId) {
                throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
            }
            if (otherRealm.getPath().equals(realm.getPath())) {
                return object;
            }
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (com.tech.world.model.realms.User) cachedRealmObject;
        }

        com.tech.world.model.realms.User realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.tech.world.model.realms.User.class);
            long pkColumnKey = columnInfo.uidColKey;
            String value = ((com_tech_world_model_realms_UserRealmProxyInterface) object).realmGet$uid();
            long objKey = Table.NO_MATCH;
            if (value == null) {
                objKey = table.findFirstNull(pkColumnKey);
            } else {
                objKey = table.findFirstString(pkColumnKey, value);
            }
            if (objKey == Table.NO_MATCH) {
                canUpdate = false;
            } else {
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), columnInfo, false, Collections.<String> emptyList());
                    realmObject = new io.realm.com_tech_world_model_realms_UserRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.tech.world.model.realms.User copy(Realm realm, UserColumnInfo columnInfo, com.tech.world.model.realms.User newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.tech.world.model.realms.User) cachedRealmObject;
        }

        com_tech_world_model_realms_UserRealmProxyInterface unmanagedSource = (com_tech_world_model_realms_UserRealmProxyInterface) newObject;

        Table table = realm.getTable(com.tech.world.model.realms.User.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.uidColKey, unmanagedSource.realmGet$uid());
        builder.addString(columnInfo.photoColKey, unmanagedSource.realmGet$photo());
        builder.addString(columnInfo.statusColKey, unmanagedSource.realmGet$status());
        builder.addString(columnInfo.phoneColKey, unmanagedSource.realmGet$phone());
        builder.addString(columnInfo.userLocalPhotoColKey, unmanagedSource.realmGet$userLocalPhoto());
        builder.addString(columnInfo.userNameColKey, unmanagedSource.realmGet$userName());
        builder.addBoolean(columnInfo.isBlockedColKey, unmanagedSource.realmGet$isBlocked());
        builder.addString(columnInfo.appVerColKey, unmanagedSource.realmGet$appVer());
        builder.addString(columnInfo.thumbImgColKey, unmanagedSource.realmGet$thumbImg());
        builder.addBoolean(columnInfo.isGroupBoolColKey, unmanagedSource.realmGet$isGroupBool());
        builder.addBoolean(columnInfo.isBroadcastBoolColKey, unmanagedSource.realmGet$isBroadcastBool());
        builder.addBoolean(columnInfo.isStoredInContactsColKey, unmanagedSource.realmGet$isStoredInContacts());
        builder.addInteger(columnInfo.lastTimeFetchedImageColKey, unmanagedSource.realmGet$lastTimeFetchedImage());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_tech_world_model_realms_UserRealmProxy managedCopy = newProxyInstance(realm, row);
        cache.put(newObject, managedCopy);

        // Finally add all fields that reference other Realm Objects, either directly or through a list
        com.tech.world.model.realms.Group groupObj = unmanagedSource.realmGet$group();
        if (groupObj == null) {
            managedCopy.realmSet$group(null);
        } else {
            com.tech.world.model.realms.Group cachegroup = (com.tech.world.model.realms.Group) cache.get(groupObj);
            if (cachegroup != null) {
                managedCopy.realmSet$group(cachegroup);
            } else {
                managedCopy.realmSet$group(com_tech_world_model_realms_GroupRealmProxy.copyOrUpdate(realm, (com_tech_world_model_realms_GroupRealmProxy.GroupColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.Group.class), groupObj, update, cache, flags));
            }
        }

        com.tech.world.model.realms.Broadcast broadcastObj = unmanagedSource.realmGet$broadcast();
        if (broadcastObj == null) {
            managedCopy.realmSet$broadcast(null);
        } else {
            com.tech.world.model.realms.Broadcast cachebroadcast = (com.tech.world.model.realms.Broadcast) cache.get(broadcastObj);
            if (cachebroadcast != null) {
                managedCopy.realmSet$broadcast(cachebroadcast);
            } else {
                managedCopy.realmSet$broadcast(com_tech_world_model_realms_BroadcastRealmProxy.copyOrUpdate(realm, (com_tech_world_model_realms_BroadcastRealmProxy.BroadcastColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.Broadcast.class), broadcastObj, update, cache, flags));
            }
        }

        return managedCopy;
    }

    public static long insert(Realm realm, com.tech.world.model.realms.User object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.tech.world.model.realms.User.class);
        long tableNativePtr = table.getNativePtr();
        UserColumnInfo columnInfo = (UserColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.User.class);
        long pkColumnKey = columnInfo.uidColKey;
        String primaryKeyValue = ((com_tech_world_model_realms_UserRealmProxyInterface) object).realmGet$uid();
        long objKey = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            objKey = Table.nativeFindFirstNull(tableNativePtr, pkColumnKey);
        } else {
            objKey = Table.nativeFindFirstString(tableNativePtr, pkColumnKey, primaryKeyValue);
        }
        if (objKey == Table.NO_MATCH) {
            objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, primaryKeyValue);
        } else {
            Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
        }
        cache.put(object, objKey);
        String realmGet$photo = ((com_tech_world_model_realms_UserRealmProxyInterface) object).realmGet$photo();
        if (realmGet$photo != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.photoColKey, objKey, realmGet$photo, false);
        }
        String realmGet$status = ((com_tech_world_model_realms_UserRealmProxyInterface) object).realmGet$status();
        if (realmGet$status != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.statusColKey, objKey, realmGet$status, false);
        }
        String realmGet$phone = ((com_tech_world_model_realms_UserRealmProxyInterface) object).realmGet$phone();
        if (realmGet$phone != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phoneColKey, objKey, realmGet$phone, false);
        }
        String realmGet$userLocalPhoto = ((com_tech_world_model_realms_UserRealmProxyInterface) object).realmGet$userLocalPhoto();
        if (realmGet$userLocalPhoto != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.userLocalPhotoColKey, objKey, realmGet$userLocalPhoto, false);
        }
        String realmGet$userName = ((com_tech_world_model_realms_UserRealmProxyInterface) object).realmGet$userName();
        if (realmGet$userName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.userNameColKey, objKey, realmGet$userName, false);
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.isBlockedColKey, objKey, ((com_tech_world_model_realms_UserRealmProxyInterface) object).realmGet$isBlocked(), false);
        String realmGet$appVer = ((com_tech_world_model_realms_UserRealmProxyInterface) object).realmGet$appVer();
        if (realmGet$appVer != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.appVerColKey, objKey, realmGet$appVer, false);
        }
        String realmGet$thumbImg = ((com_tech_world_model_realms_UserRealmProxyInterface) object).realmGet$thumbImg();
        if (realmGet$thumbImg != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.thumbImgColKey, objKey, realmGet$thumbImg, false);
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.isGroupBoolColKey, objKey, ((com_tech_world_model_realms_UserRealmProxyInterface) object).realmGet$isGroupBool(), false);

        com.tech.world.model.realms.Group groupObj = ((com_tech_world_model_realms_UserRealmProxyInterface) object).realmGet$group();
        if (groupObj != null) {
            Long cachegroup = cache.get(groupObj);
            if (cachegroup == null) {
                cachegroup = com_tech_world_model_realms_GroupRealmProxy.insert(realm, groupObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.groupColKey, objKey, cachegroup, false);
        }

        com.tech.world.model.realms.Broadcast broadcastObj = ((com_tech_world_model_realms_UserRealmProxyInterface) object).realmGet$broadcast();
        if (broadcastObj != null) {
            Long cachebroadcast = cache.get(broadcastObj);
            if (cachebroadcast == null) {
                cachebroadcast = com_tech_world_model_realms_BroadcastRealmProxy.insert(realm, broadcastObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.broadcastColKey, objKey, cachebroadcast, false);
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.isBroadcastBoolColKey, objKey, ((com_tech_world_model_realms_UserRealmProxyInterface) object).realmGet$isBroadcastBool(), false);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.isStoredInContactsColKey, objKey, ((com_tech_world_model_realms_UserRealmProxyInterface) object).realmGet$isStoredInContacts(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.lastTimeFetchedImageColKey, objKey, ((com_tech_world_model_realms_UserRealmProxyInterface) object).realmGet$lastTimeFetchedImage(), false);
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.tech.world.model.realms.User.class);
        long tableNativePtr = table.getNativePtr();
        UserColumnInfo columnInfo = (UserColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.User.class);
        long pkColumnKey = columnInfo.uidColKey;
        com.tech.world.model.realms.User object = null;
        while (objects.hasNext()) {
            object = (com.tech.world.model.realms.User) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            String primaryKeyValue = ((com_tech_world_model_realms_UserRealmProxyInterface) object).realmGet$uid();
            long objKey = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                objKey = Table.nativeFindFirstNull(tableNativePtr, pkColumnKey);
            } else {
                objKey = Table.nativeFindFirstString(tableNativePtr, pkColumnKey, primaryKeyValue);
            }
            if (objKey == Table.NO_MATCH) {
                objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, primaryKeyValue);
            } else {
                Table.throwDuplicatePrimaryKeyException(primaryKeyValue);
            }
            cache.put(object, objKey);
            String realmGet$photo = ((com_tech_world_model_realms_UserRealmProxyInterface) object).realmGet$photo();
            if (realmGet$photo != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.photoColKey, objKey, realmGet$photo, false);
            }
            String realmGet$status = ((com_tech_world_model_realms_UserRealmProxyInterface) object).realmGet$status();
            if (realmGet$status != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.statusColKey, objKey, realmGet$status, false);
            }
            String realmGet$phone = ((com_tech_world_model_realms_UserRealmProxyInterface) object).realmGet$phone();
            if (realmGet$phone != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.phoneColKey, objKey, realmGet$phone, false);
            }
            String realmGet$userLocalPhoto = ((com_tech_world_model_realms_UserRealmProxyInterface) object).realmGet$userLocalPhoto();
            if (realmGet$userLocalPhoto != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.userLocalPhotoColKey, objKey, realmGet$userLocalPhoto, false);
            }
            String realmGet$userName = ((com_tech_world_model_realms_UserRealmProxyInterface) object).realmGet$userName();
            if (realmGet$userName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.userNameColKey, objKey, realmGet$userName, false);
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.isBlockedColKey, objKey, ((com_tech_world_model_realms_UserRealmProxyInterface) object).realmGet$isBlocked(), false);
            String realmGet$appVer = ((com_tech_world_model_realms_UserRealmProxyInterface) object).realmGet$appVer();
            if (realmGet$appVer != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.appVerColKey, objKey, realmGet$appVer, false);
            }
            String realmGet$thumbImg = ((com_tech_world_model_realms_UserRealmProxyInterface) object).realmGet$thumbImg();
            if (realmGet$thumbImg != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.thumbImgColKey, objKey, realmGet$thumbImg, false);
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.isGroupBoolColKey, objKey, ((com_tech_world_model_realms_UserRealmProxyInterface) object).realmGet$isGroupBool(), false);

            com.tech.world.model.realms.Group groupObj = ((com_tech_world_model_realms_UserRealmProxyInterface) object).realmGet$group();
            if (groupObj != null) {
                Long cachegroup = cache.get(groupObj);
                if (cachegroup == null) {
                    cachegroup = com_tech_world_model_realms_GroupRealmProxy.insert(realm, groupObj, cache);
                }
                table.setLink(columnInfo.groupColKey, objKey, cachegroup, false);
            }

            com.tech.world.model.realms.Broadcast broadcastObj = ((com_tech_world_model_realms_UserRealmProxyInterface) object).realmGet$broadcast();
            if (broadcastObj != null) {
                Long cachebroadcast = cache.get(broadcastObj);
                if (cachebroadcast == null) {
                    cachebroadcast = com_tech_world_model_realms_BroadcastRealmProxy.insert(realm, broadcastObj, cache);
                }
                table.setLink(columnInfo.broadcastColKey, objKey, cachebroadcast, false);
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.isBroadcastBoolColKey, objKey, ((com_tech_world_model_realms_UserRealmProxyInterface) object).realmGet$isBroadcastBool(), false);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.isStoredInContactsColKey, objKey, ((com_tech_world_model_realms_UserRealmProxyInterface) object).realmGet$isStoredInContacts(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.lastTimeFetchedImageColKey, objKey, ((com_tech_world_model_realms_UserRealmProxyInterface) object).realmGet$lastTimeFetchedImage(), false);
        }
    }

    public static long insertOrUpdate(Realm realm, com.tech.world.model.realms.User object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.tech.world.model.realms.User.class);
        long tableNativePtr = table.getNativePtr();
        UserColumnInfo columnInfo = (UserColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.User.class);
        long pkColumnKey = columnInfo.uidColKey;
        String primaryKeyValue = ((com_tech_world_model_realms_UserRealmProxyInterface) object).realmGet$uid();
        long objKey = Table.NO_MATCH;
        if (primaryKeyValue == null) {
            objKey = Table.nativeFindFirstNull(tableNativePtr, pkColumnKey);
        } else {
            objKey = Table.nativeFindFirstString(tableNativePtr, pkColumnKey, primaryKeyValue);
        }
        if (objKey == Table.NO_MATCH) {
            objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, primaryKeyValue);
        }
        cache.put(object, objKey);
        String realmGet$photo = ((com_tech_world_model_realms_UserRealmProxyInterface) object).realmGet$photo();
        if (realmGet$photo != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.photoColKey, objKey, realmGet$photo, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.photoColKey, objKey, false);
        }
        String realmGet$status = ((com_tech_world_model_realms_UserRealmProxyInterface) object).realmGet$status();
        if (realmGet$status != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.statusColKey, objKey, realmGet$status, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.statusColKey, objKey, false);
        }
        String realmGet$phone = ((com_tech_world_model_realms_UserRealmProxyInterface) object).realmGet$phone();
        if (realmGet$phone != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phoneColKey, objKey, realmGet$phone, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phoneColKey, objKey, false);
        }
        String realmGet$userLocalPhoto = ((com_tech_world_model_realms_UserRealmProxyInterface) object).realmGet$userLocalPhoto();
        if (realmGet$userLocalPhoto != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.userLocalPhotoColKey, objKey, realmGet$userLocalPhoto, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.userLocalPhotoColKey, objKey, false);
        }
        String realmGet$userName = ((com_tech_world_model_realms_UserRealmProxyInterface) object).realmGet$userName();
        if (realmGet$userName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.userNameColKey, objKey, realmGet$userName, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.userNameColKey, objKey, false);
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.isBlockedColKey, objKey, ((com_tech_world_model_realms_UserRealmProxyInterface) object).realmGet$isBlocked(), false);
        String realmGet$appVer = ((com_tech_world_model_realms_UserRealmProxyInterface) object).realmGet$appVer();
        if (realmGet$appVer != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.appVerColKey, objKey, realmGet$appVer, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.appVerColKey, objKey, false);
        }
        String realmGet$thumbImg = ((com_tech_world_model_realms_UserRealmProxyInterface) object).realmGet$thumbImg();
        if (realmGet$thumbImg != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.thumbImgColKey, objKey, realmGet$thumbImg, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.thumbImgColKey, objKey, false);
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.isGroupBoolColKey, objKey, ((com_tech_world_model_realms_UserRealmProxyInterface) object).realmGet$isGroupBool(), false);

        com.tech.world.model.realms.Group groupObj = ((com_tech_world_model_realms_UserRealmProxyInterface) object).realmGet$group();
        if (groupObj != null) {
            Long cachegroup = cache.get(groupObj);
            if (cachegroup == null) {
                cachegroup = com_tech_world_model_realms_GroupRealmProxy.insertOrUpdate(realm, groupObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.groupColKey, objKey, cachegroup, false);
        } else {
            Table.nativeNullifyLink(tableNativePtr, columnInfo.groupColKey, objKey);
        }

        com.tech.world.model.realms.Broadcast broadcastObj = ((com_tech_world_model_realms_UserRealmProxyInterface) object).realmGet$broadcast();
        if (broadcastObj != null) {
            Long cachebroadcast = cache.get(broadcastObj);
            if (cachebroadcast == null) {
                cachebroadcast = com_tech_world_model_realms_BroadcastRealmProxy.insertOrUpdate(realm, broadcastObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.broadcastColKey, objKey, cachebroadcast, false);
        } else {
            Table.nativeNullifyLink(tableNativePtr, columnInfo.broadcastColKey, objKey);
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.isBroadcastBoolColKey, objKey, ((com_tech_world_model_realms_UserRealmProxyInterface) object).realmGet$isBroadcastBool(), false);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.isStoredInContactsColKey, objKey, ((com_tech_world_model_realms_UserRealmProxyInterface) object).realmGet$isStoredInContacts(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.lastTimeFetchedImageColKey, objKey, ((com_tech_world_model_realms_UserRealmProxyInterface) object).realmGet$lastTimeFetchedImage(), false);
        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.tech.world.model.realms.User.class);
        long tableNativePtr = table.getNativePtr();
        UserColumnInfo columnInfo = (UserColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.User.class);
        long pkColumnKey = columnInfo.uidColKey;
        com.tech.world.model.realms.User object = null;
        while (objects.hasNext()) {
            object = (com.tech.world.model.realms.User) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            String primaryKeyValue = ((com_tech_world_model_realms_UserRealmProxyInterface) object).realmGet$uid();
            long objKey = Table.NO_MATCH;
            if (primaryKeyValue == null) {
                objKey = Table.nativeFindFirstNull(tableNativePtr, pkColumnKey);
            } else {
                objKey = Table.nativeFindFirstString(tableNativePtr, pkColumnKey, primaryKeyValue);
            }
            if (objKey == Table.NO_MATCH) {
                objKey = OsObject.createRowWithPrimaryKey(table, pkColumnKey, primaryKeyValue);
            }
            cache.put(object, objKey);
            String realmGet$photo = ((com_tech_world_model_realms_UserRealmProxyInterface) object).realmGet$photo();
            if (realmGet$photo != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.photoColKey, objKey, realmGet$photo, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.photoColKey, objKey, false);
            }
            String realmGet$status = ((com_tech_world_model_realms_UserRealmProxyInterface) object).realmGet$status();
            if (realmGet$status != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.statusColKey, objKey, realmGet$status, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.statusColKey, objKey, false);
            }
            String realmGet$phone = ((com_tech_world_model_realms_UserRealmProxyInterface) object).realmGet$phone();
            if (realmGet$phone != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.phoneColKey, objKey, realmGet$phone, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.phoneColKey, objKey, false);
            }
            String realmGet$userLocalPhoto = ((com_tech_world_model_realms_UserRealmProxyInterface) object).realmGet$userLocalPhoto();
            if (realmGet$userLocalPhoto != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.userLocalPhotoColKey, objKey, realmGet$userLocalPhoto, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.userLocalPhotoColKey, objKey, false);
            }
            String realmGet$userName = ((com_tech_world_model_realms_UserRealmProxyInterface) object).realmGet$userName();
            if (realmGet$userName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.userNameColKey, objKey, realmGet$userName, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.userNameColKey, objKey, false);
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.isBlockedColKey, objKey, ((com_tech_world_model_realms_UserRealmProxyInterface) object).realmGet$isBlocked(), false);
            String realmGet$appVer = ((com_tech_world_model_realms_UserRealmProxyInterface) object).realmGet$appVer();
            if (realmGet$appVer != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.appVerColKey, objKey, realmGet$appVer, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.appVerColKey, objKey, false);
            }
            String realmGet$thumbImg = ((com_tech_world_model_realms_UserRealmProxyInterface) object).realmGet$thumbImg();
            if (realmGet$thumbImg != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.thumbImgColKey, objKey, realmGet$thumbImg, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.thumbImgColKey, objKey, false);
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.isGroupBoolColKey, objKey, ((com_tech_world_model_realms_UserRealmProxyInterface) object).realmGet$isGroupBool(), false);

            com.tech.world.model.realms.Group groupObj = ((com_tech_world_model_realms_UserRealmProxyInterface) object).realmGet$group();
            if (groupObj != null) {
                Long cachegroup = cache.get(groupObj);
                if (cachegroup == null) {
                    cachegroup = com_tech_world_model_realms_GroupRealmProxy.insertOrUpdate(realm, groupObj, cache);
                }
                Table.nativeSetLink(tableNativePtr, columnInfo.groupColKey, objKey, cachegroup, false);
            } else {
                Table.nativeNullifyLink(tableNativePtr, columnInfo.groupColKey, objKey);
            }

            com.tech.world.model.realms.Broadcast broadcastObj = ((com_tech_world_model_realms_UserRealmProxyInterface) object).realmGet$broadcast();
            if (broadcastObj != null) {
                Long cachebroadcast = cache.get(broadcastObj);
                if (cachebroadcast == null) {
                    cachebroadcast = com_tech_world_model_realms_BroadcastRealmProxy.insertOrUpdate(realm, broadcastObj, cache);
                }
                Table.nativeSetLink(tableNativePtr, columnInfo.broadcastColKey, objKey, cachebroadcast, false);
            } else {
                Table.nativeNullifyLink(tableNativePtr, columnInfo.broadcastColKey, objKey);
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.isBroadcastBoolColKey, objKey, ((com_tech_world_model_realms_UserRealmProxyInterface) object).realmGet$isBroadcastBool(), false);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.isStoredInContactsColKey, objKey, ((com_tech_world_model_realms_UserRealmProxyInterface) object).realmGet$isStoredInContacts(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.lastTimeFetchedImageColKey, objKey, ((com_tech_world_model_realms_UserRealmProxyInterface) object).realmGet$lastTimeFetchedImage(), false);
        }
    }

    public static com.tech.world.model.realms.User createDetachedCopy(com.tech.world.model.realms.User realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.tech.world.model.realms.User unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.tech.world.model.realms.User();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.tech.world.model.realms.User) cachedObject.object;
            }
            unmanagedObject = (com.tech.world.model.realms.User) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_tech_world_model_realms_UserRealmProxyInterface unmanagedCopy = (com_tech_world_model_realms_UserRealmProxyInterface) unmanagedObject;
        com_tech_world_model_realms_UserRealmProxyInterface realmSource = (com_tech_world_model_realms_UserRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$uid(realmSource.realmGet$uid());
        unmanagedCopy.realmSet$photo(realmSource.realmGet$photo());
        unmanagedCopy.realmSet$status(realmSource.realmGet$status());
        unmanagedCopy.realmSet$phone(realmSource.realmGet$phone());
        unmanagedCopy.realmSet$userLocalPhoto(realmSource.realmGet$userLocalPhoto());
        unmanagedCopy.realmSet$userName(realmSource.realmGet$userName());
        unmanagedCopy.realmSet$isBlocked(realmSource.realmGet$isBlocked());
        unmanagedCopy.realmSet$appVer(realmSource.realmGet$appVer());
        unmanagedCopy.realmSet$thumbImg(realmSource.realmGet$thumbImg());
        unmanagedCopy.realmSet$isGroupBool(realmSource.realmGet$isGroupBool());

        // Deep copy of group
        unmanagedCopy.realmSet$group(com_tech_world_model_realms_GroupRealmProxy.createDetachedCopy(realmSource.realmGet$group(), currentDepth + 1, maxDepth, cache));

        // Deep copy of broadcast
        unmanagedCopy.realmSet$broadcast(com_tech_world_model_realms_BroadcastRealmProxy.createDetachedCopy(realmSource.realmGet$broadcast(), currentDepth + 1, maxDepth, cache));
        unmanagedCopy.realmSet$isBroadcastBool(realmSource.realmGet$isBroadcastBool());
        unmanagedCopy.realmSet$isStoredInContacts(realmSource.realmGet$isStoredInContacts());
        unmanagedCopy.realmSet$lastTimeFetchedImage(realmSource.realmGet$lastTimeFetchedImage());

        return unmanagedObject;
    }

    static com.tech.world.model.realms.User update(Realm realm, UserColumnInfo columnInfo, com.tech.world.model.realms.User realmObject, com.tech.world.model.realms.User newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_tech_world_model_realms_UserRealmProxyInterface realmObjectTarget = (com_tech_world_model_realms_UserRealmProxyInterface) realmObject;
        com_tech_world_model_realms_UserRealmProxyInterface realmObjectSource = (com_tech_world_model_realms_UserRealmProxyInterface) newObject;
        Table table = realm.getTable(com.tech.world.model.realms.User.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addString(columnInfo.uidColKey, realmObjectSource.realmGet$uid());
        builder.addString(columnInfo.photoColKey, realmObjectSource.realmGet$photo());
        builder.addString(columnInfo.statusColKey, realmObjectSource.realmGet$status());
        builder.addString(columnInfo.phoneColKey, realmObjectSource.realmGet$phone());
        builder.addString(columnInfo.userLocalPhotoColKey, realmObjectSource.realmGet$userLocalPhoto());
        builder.addString(columnInfo.userNameColKey, realmObjectSource.realmGet$userName());
        builder.addBoolean(columnInfo.isBlockedColKey, realmObjectSource.realmGet$isBlocked());
        builder.addString(columnInfo.appVerColKey, realmObjectSource.realmGet$appVer());
        builder.addString(columnInfo.thumbImgColKey, realmObjectSource.realmGet$thumbImg());
        builder.addBoolean(columnInfo.isGroupBoolColKey, realmObjectSource.realmGet$isGroupBool());

        com.tech.world.model.realms.Group groupObj = realmObjectSource.realmGet$group();
        if (groupObj == null) {
            builder.addNull(columnInfo.groupColKey);
        } else {
            com.tech.world.model.realms.Group cachegroup = (com.tech.world.model.realms.Group) cache.get(groupObj);
            if (cachegroup != null) {
                builder.addObject(columnInfo.groupColKey, cachegroup);
            } else {
                builder.addObject(columnInfo.groupColKey, com_tech_world_model_realms_GroupRealmProxy.copyOrUpdate(realm, (com_tech_world_model_realms_GroupRealmProxy.GroupColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.Group.class), groupObj, true, cache, flags));
            }
        }

        com.tech.world.model.realms.Broadcast broadcastObj = realmObjectSource.realmGet$broadcast();
        if (broadcastObj == null) {
            builder.addNull(columnInfo.broadcastColKey);
        } else {
            com.tech.world.model.realms.Broadcast cachebroadcast = (com.tech.world.model.realms.Broadcast) cache.get(broadcastObj);
            if (cachebroadcast != null) {
                builder.addObject(columnInfo.broadcastColKey, cachebroadcast);
            } else {
                builder.addObject(columnInfo.broadcastColKey, com_tech_world_model_realms_BroadcastRealmProxy.copyOrUpdate(realm, (com_tech_world_model_realms_BroadcastRealmProxy.BroadcastColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.Broadcast.class), broadcastObj, true, cache, flags));
            }
        }
        builder.addBoolean(columnInfo.isBroadcastBoolColKey, realmObjectSource.realmGet$isBroadcastBool());
        builder.addBoolean(columnInfo.isStoredInContactsColKey, realmObjectSource.realmGet$isStoredInContacts());
        builder.addInteger(columnInfo.lastTimeFetchedImageColKey, realmObjectSource.realmGet$lastTimeFetchedImage());

        builder.updateExistingTopLevelObject();
        return realmObject;
    }

    @Override
    public ProxyState<?> realmGet$proxyState() {
        return proxyState;
    }

    @Override
    public int hashCode() {
        String realmName = proxyState.getRealm$realm().getPath();
        String tableName = proxyState.getRow$realm().getTable().getName();
        long objKey = proxyState.getRow$realm().getObjectKey();

        int result = 17;
        result = 31 * result + ((realmName != null) ? realmName.hashCode() : 0);
        result = 31 * result + ((tableName != null) ? tableName.hashCode() : 0);
        result = 31 * result + (int) (objKey ^ (objKey >>> 32));
        return result;
    }

}
