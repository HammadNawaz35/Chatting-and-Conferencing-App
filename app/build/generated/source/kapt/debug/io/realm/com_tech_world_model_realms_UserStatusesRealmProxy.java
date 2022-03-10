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
public class com_tech_world_model_realms_UserStatusesRealmProxy extends com.tech.world.model.realms.UserStatuses
    implements RealmObjectProxy, com_tech_world_model_realms_UserStatusesRealmProxyInterface {

    static final class UserStatusesColumnInfo extends ColumnInfo {
        long userIdColKey;
        long lastStatusTimestampColKey;
        long userColKey;
        long statusesColKey;
        long areAllSeenColKey;

        UserStatusesColumnInfo(OsSchemaInfo schemaInfo) {
            super(5);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("UserStatuses");
            this.userIdColKey = addColumnDetails("userId", "userId", objectSchemaInfo);
            this.lastStatusTimestampColKey = addColumnDetails("lastStatusTimestamp", "lastStatusTimestamp", objectSchemaInfo);
            this.userColKey = addColumnDetails("user", "user", objectSchemaInfo);
            this.statusesColKey = addColumnDetails("statuses", "statuses", objectSchemaInfo);
            this.areAllSeenColKey = addColumnDetails("areAllSeen", "areAllSeen", objectSchemaInfo);
        }

        UserStatusesColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new UserStatusesColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final UserStatusesColumnInfo src = (UserStatusesColumnInfo) rawSrc;
            final UserStatusesColumnInfo dst = (UserStatusesColumnInfo) rawDst;
            dst.userIdColKey = src.userIdColKey;
            dst.lastStatusTimestampColKey = src.lastStatusTimestampColKey;
            dst.userColKey = src.userColKey;
            dst.statusesColKey = src.statusesColKey;
            dst.areAllSeenColKey = src.areAllSeenColKey;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private UserStatusesColumnInfo columnInfo;
    private ProxyState<com.tech.world.model.realms.UserStatuses> proxyState;
    private RealmList<com.tech.world.model.realms.Status> statusesRealmList;

    com_tech_world_model_realms_UserStatusesRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (UserStatusesColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.tech.world.model.realms.UserStatuses>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$userId() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.userIdColKey);
    }

    @Override
    public void realmSet$userId(String value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'userId' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public long realmGet$lastStatusTimestamp() {
        proxyState.getRealm$realm().checkIfValid();
        return (long) proxyState.getRow$realm().getLong(columnInfo.lastStatusTimestampColKey);
    }

    @Override
    public void realmSet$lastStatusTimestamp(long value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.lastStatusTimestampColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.lastStatusTimestampColKey, value);
    }

    @Override
    public com.tech.world.model.realms.User realmGet$user() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNullLink(columnInfo.userColKey)) {
            return null;
        }
        return proxyState.getRealm$realm().get(com.tech.world.model.realms.User.class, proxyState.getRow$realm().getLink(columnInfo.userColKey), false, Collections.<String>emptyList());
    }

    @Override
    public void realmSet$user(com.tech.world.model.realms.User value) {
        Realm realm = (Realm) proxyState.getRealm$realm();
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("user")) {
                return;
            }
            if (value != null && !RealmObject.isManaged(value)) {
                value = realm.copyToRealm(value);
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                // Table#nullifyLink() does not support default value. Just using Row.
                row.nullifyLink(columnInfo.userColKey);
                return;
            }
            proxyState.checkValidObject(value);
            row.getTable().setLink(columnInfo.userColKey, row.getObjectKey(), ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getObjectKey(), true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().nullifyLink(columnInfo.userColKey);
            return;
        }
        proxyState.checkValidObject(value);
        proxyState.getRow$realm().setLink(columnInfo.userColKey, ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getObjectKey());
    }

    @Override
    public RealmList<com.tech.world.model.realms.Status> realmGet$statuses() {
        proxyState.getRealm$realm().checkIfValid();
        // use the cached value if available
        if (statusesRealmList != null) {
            return statusesRealmList;
        } else {
            OsList osList = proxyState.getRow$realm().getModelList(columnInfo.statusesColKey);
            statusesRealmList = new RealmList<com.tech.world.model.realms.Status>(com.tech.world.model.realms.Status.class, osList, proxyState.getRealm$realm());
            return statusesRealmList;
        }
    }

    @Override
    public void realmSet$statuses(RealmList<com.tech.world.model.realms.Status> value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("statuses")) {
                return;
            }
            // if the list contains unmanaged RealmObjects, convert them to managed.
            if (value != null && !value.isManaged()) {
                final Realm realm = (Realm) proxyState.getRealm$realm();
                final RealmList<com.tech.world.model.realms.Status> original = value;
                value = new RealmList<com.tech.world.model.realms.Status>();
                for (com.tech.world.model.realms.Status item : original) {
                    if (item == null || RealmObject.isManaged(item)) {
                        value.add(item);
                    } else {
                        value.add(realm.copyToRealm(item));
                    }
                }
            }
        }

        proxyState.getRealm$realm().checkIfValid();
        OsList osList = proxyState.getRow$realm().getModelList(columnInfo.statusesColKey);
        // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
        if (value != null && value.size() == osList.size()) {
            int objects = value.size();
            for (int i = 0; i < objects; i++) {
                com.tech.world.model.realms.Status linkedObject = value.get(i);
                proxyState.checkValidObject(linkedObject);
                osList.setRow(i, ((RealmObjectProxy) linkedObject).realmGet$proxyState().getRow$realm().getObjectKey());
            }
        } else {
            osList.removeAll();
            if (value == null) {
                return;
            }
            int objects = value.size();
            for (int i = 0; i < objects; i++) {
                com.tech.world.model.realms.Status linkedObject = value.get(i);
                proxyState.checkValidObject(linkedObject);
                osList.addRow(((RealmObjectProxy) linkedObject).realmGet$proxyState().getRow$realm().getObjectKey());
            }
        }
    }

    @Override
    @SuppressWarnings("cast")
    public boolean realmGet$areAllSeen() {
        proxyState.getRealm$realm().checkIfValid();
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.areAllSeenColKey);
    }

    @Override
    public void realmSet$areAllSeen(boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setBoolean(columnInfo.areAllSeenColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setBoolean(columnInfo.areAllSeenColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("UserStatuses", false, 5, 0);
        builder.addPersistedProperty("userId", RealmFieldType.STRING, Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("lastStatusTimestamp", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedLinkProperty("user", RealmFieldType.OBJECT, "User");
        builder.addPersistedLinkProperty("statuses", RealmFieldType.LIST, "Status");
        builder.addPersistedProperty("areAllSeen", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static UserStatusesColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new UserStatusesColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "UserStatuses";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "UserStatuses";
    }

    @SuppressWarnings("cast")
    public static com.tech.world.model.realms.UserStatuses createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(2);
        com.tech.world.model.realms.UserStatuses obj = null;
        if (update) {
            Table table = realm.getTable(com.tech.world.model.realms.UserStatuses.class);
            UserStatusesColumnInfo columnInfo = (UserStatusesColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.UserStatuses.class);
            long pkColumnKey = columnInfo.userIdColKey;
            long objKey = Table.NO_MATCH;
            if (json.isNull("userId")) {
                objKey = table.findFirstNull(pkColumnKey);
            } else {
                objKey = table.findFirstString(pkColumnKey, json.getString("userId"));
            }
            if (objKey != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), realm.getSchema().getColumnInfo(com.tech.world.model.realms.UserStatuses.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_tech_world_model_realms_UserStatusesRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("user")) {
                excludeFields.add("user");
            }
            if (json.has("statuses")) {
                excludeFields.add("statuses");
            }
            if (json.has("userId")) {
                if (json.isNull("userId")) {
                    obj = (io.realm.com_tech_world_model_realms_UserStatusesRealmProxy) realm.createObjectInternal(com.tech.world.model.realms.UserStatuses.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_tech_world_model_realms_UserStatusesRealmProxy) realm.createObjectInternal(com.tech.world.model.realms.UserStatuses.class, json.getString("userId"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'userId'.");
            }
        }

        final com_tech_world_model_realms_UserStatusesRealmProxyInterface objProxy = (com_tech_world_model_realms_UserStatusesRealmProxyInterface) obj;
        if (json.has("lastStatusTimestamp")) {
            if (json.isNull("lastStatusTimestamp")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'lastStatusTimestamp' to null.");
            } else {
                objProxy.realmSet$lastStatusTimestamp((long) json.getLong("lastStatusTimestamp"));
            }
        }
        if (json.has("user")) {
            if (json.isNull("user")) {
                objProxy.realmSet$user(null);
            } else {
                com.tech.world.model.realms.User userObj = com_tech_world_model_realms_UserRealmProxy.createOrUpdateUsingJsonObject(realm, json.getJSONObject("user"), update);
                objProxy.realmSet$user(userObj);
            }
        }
        if (json.has("statuses")) {
            if (json.isNull("statuses")) {
                objProxy.realmSet$statuses(null);
            } else {
                objProxy.realmGet$statuses().clear();
                JSONArray array = json.getJSONArray("statuses");
                for (int i = 0; i < array.length(); i++) {
                    com.tech.world.model.realms.Status item = com_tech_world_model_realms_StatusRealmProxy.createOrUpdateUsingJsonObject(realm, array.getJSONObject(i), update);
                    objProxy.realmGet$statuses().add(item);
                }
            }
        }
        if (json.has("areAllSeen")) {
            if (json.isNull("areAllSeen")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'areAllSeen' to null.");
            } else {
                objProxy.realmSet$areAllSeen((boolean) json.getBoolean("areAllSeen"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.tech.world.model.realms.UserStatuses createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.tech.world.model.realms.UserStatuses obj = new com.tech.world.model.realms.UserStatuses();
        final com_tech_world_model_realms_UserStatusesRealmProxyInterface objProxy = (com_tech_world_model_realms_UserStatusesRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("userId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$userId((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$userId(null);
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("lastStatusTimestamp")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$lastStatusTimestamp((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'lastStatusTimestamp' to null.");
                }
            } else if (name.equals("user")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$user(null);
                } else {
                    com.tech.world.model.realms.User userObj = com_tech_world_model_realms_UserRealmProxy.createUsingJsonStream(realm, reader);
                    objProxy.realmSet$user(userObj);
                }
            } else if (name.equals("statuses")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$statuses(null);
                } else {
                    objProxy.realmSet$statuses(new RealmList<com.tech.world.model.realms.Status>());
                    reader.beginArray();
                    while (reader.hasNext()) {
                        com.tech.world.model.realms.Status item = com_tech_world_model_realms_StatusRealmProxy.createUsingJsonStream(realm, reader);
                        objProxy.realmGet$statuses().add(item);
                    }
                    reader.endArray();
                }
            } else if (name.equals("areAllSeen")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$areAllSeen((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'areAllSeen' to null.");
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'userId'.");
        }
        return realm.copyToRealm(obj);
    }

    static com_tech_world_model_realms_UserStatusesRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.tech.world.model.realms.UserStatuses.class), false, Collections.<String>emptyList());
        io.realm.com_tech_world_model_realms_UserStatusesRealmProxy obj = new io.realm.com_tech_world_model_realms_UserStatusesRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.tech.world.model.realms.UserStatuses copyOrUpdate(Realm realm, UserStatusesColumnInfo columnInfo, com.tech.world.model.realms.UserStatuses object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.tech.world.model.realms.UserStatuses) cachedRealmObject;
        }

        com.tech.world.model.realms.UserStatuses realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.tech.world.model.realms.UserStatuses.class);
            long pkColumnKey = columnInfo.userIdColKey;
            String value = ((com_tech_world_model_realms_UserStatusesRealmProxyInterface) object).realmGet$userId();
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
                    realmObject = new io.realm.com_tech_world_model_realms_UserStatusesRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.tech.world.model.realms.UserStatuses copy(Realm realm, UserStatusesColumnInfo columnInfo, com.tech.world.model.realms.UserStatuses newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.tech.world.model.realms.UserStatuses) cachedRealmObject;
        }

        com_tech_world_model_realms_UserStatusesRealmProxyInterface unmanagedSource = (com_tech_world_model_realms_UserStatusesRealmProxyInterface) newObject;

        Table table = realm.getTable(com.tech.world.model.realms.UserStatuses.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.userIdColKey, unmanagedSource.realmGet$userId());
        builder.addInteger(columnInfo.lastStatusTimestampColKey, unmanagedSource.realmGet$lastStatusTimestamp());
        builder.addBoolean(columnInfo.areAllSeenColKey, unmanagedSource.realmGet$areAllSeen());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_tech_world_model_realms_UserStatusesRealmProxy managedCopy = newProxyInstance(realm, row);
        cache.put(newObject, managedCopy);

        // Finally add all fields that reference other Realm Objects, either directly or through a list
        com.tech.world.model.realms.User userObj = unmanagedSource.realmGet$user();
        if (userObj == null) {
            managedCopy.realmSet$user(null);
        } else {
            com.tech.world.model.realms.User cacheuser = (com.tech.world.model.realms.User) cache.get(userObj);
            if (cacheuser != null) {
                managedCopy.realmSet$user(cacheuser);
            } else {
                managedCopy.realmSet$user(com_tech_world_model_realms_UserRealmProxy.copyOrUpdate(realm, (com_tech_world_model_realms_UserRealmProxy.UserColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.User.class), userObj, update, cache, flags));
            }
        }

        RealmList<com.tech.world.model.realms.Status> statusesUnmanagedList = unmanagedSource.realmGet$statuses();
        if (statusesUnmanagedList != null) {
            RealmList<com.tech.world.model.realms.Status> statusesManagedList = managedCopy.realmGet$statuses();
            statusesManagedList.clear();
            for (int i = 0; i < statusesUnmanagedList.size(); i++) {
                com.tech.world.model.realms.Status statusesUnmanagedItem = statusesUnmanagedList.get(i);
                com.tech.world.model.realms.Status cachestatuses = (com.tech.world.model.realms.Status) cache.get(statusesUnmanagedItem);
                if (cachestatuses != null) {
                    statusesManagedList.add(cachestatuses);
                } else {
                    statusesManagedList.add(com_tech_world_model_realms_StatusRealmProxy.copyOrUpdate(realm, (com_tech_world_model_realms_StatusRealmProxy.StatusColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.Status.class), statusesUnmanagedItem, update, cache, flags));
                }
            }
        }

        return managedCopy;
    }

    public static long insert(Realm realm, com.tech.world.model.realms.UserStatuses object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.tech.world.model.realms.UserStatuses.class);
        long tableNativePtr = table.getNativePtr();
        UserStatusesColumnInfo columnInfo = (UserStatusesColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.UserStatuses.class);
        long pkColumnKey = columnInfo.userIdColKey;
        String primaryKeyValue = ((com_tech_world_model_realms_UserStatusesRealmProxyInterface) object).realmGet$userId();
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
        Table.nativeSetLong(tableNativePtr, columnInfo.lastStatusTimestampColKey, objKey, ((com_tech_world_model_realms_UserStatusesRealmProxyInterface) object).realmGet$lastStatusTimestamp(), false);

        com.tech.world.model.realms.User userObj = ((com_tech_world_model_realms_UserStatusesRealmProxyInterface) object).realmGet$user();
        if (userObj != null) {
            Long cacheuser = cache.get(userObj);
            if (cacheuser == null) {
                cacheuser = com_tech_world_model_realms_UserRealmProxy.insert(realm, userObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.userColKey, objKey, cacheuser, false);
        }

        RealmList<com.tech.world.model.realms.Status> statusesList = ((com_tech_world_model_realms_UserStatusesRealmProxyInterface) object).realmGet$statuses();
        if (statusesList != null) {
            OsList statusesOsList = new OsList(table.getUncheckedRow(objKey), columnInfo.statusesColKey);
            for (com.tech.world.model.realms.Status statusesItem : statusesList) {
                Long cacheItemIndexstatuses = cache.get(statusesItem);
                if (cacheItemIndexstatuses == null) {
                    cacheItemIndexstatuses = com_tech_world_model_realms_StatusRealmProxy.insert(realm, statusesItem, cache);
                }
                statusesOsList.addRow(cacheItemIndexstatuses);
            }
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.areAllSeenColKey, objKey, ((com_tech_world_model_realms_UserStatusesRealmProxyInterface) object).realmGet$areAllSeen(), false);
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.tech.world.model.realms.UserStatuses.class);
        long tableNativePtr = table.getNativePtr();
        UserStatusesColumnInfo columnInfo = (UserStatusesColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.UserStatuses.class);
        long pkColumnKey = columnInfo.userIdColKey;
        com.tech.world.model.realms.UserStatuses object = null;
        while (objects.hasNext()) {
            object = (com.tech.world.model.realms.UserStatuses) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            String primaryKeyValue = ((com_tech_world_model_realms_UserStatusesRealmProxyInterface) object).realmGet$userId();
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
            Table.nativeSetLong(tableNativePtr, columnInfo.lastStatusTimestampColKey, objKey, ((com_tech_world_model_realms_UserStatusesRealmProxyInterface) object).realmGet$lastStatusTimestamp(), false);

            com.tech.world.model.realms.User userObj = ((com_tech_world_model_realms_UserStatusesRealmProxyInterface) object).realmGet$user();
            if (userObj != null) {
                Long cacheuser = cache.get(userObj);
                if (cacheuser == null) {
                    cacheuser = com_tech_world_model_realms_UserRealmProxy.insert(realm, userObj, cache);
                }
                table.setLink(columnInfo.userColKey, objKey, cacheuser, false);
            }

            RealmList<com.tech.world.model.realms.Status> statusesList = ((com_tech_world_model_realms_UserStatusesRealmProxyInterface) object).realmGet$statuses();
            if (statusesList != null) {
                OsList statusesOsList = new OsList(table.getUncheckedRow(objKey), columnInfo.statusesColKey);
                for (com.tech.world.model.realms.Status statusesItem : statusesList) {
                    Long cacheItemIndexstatuses = cache.get(statusesItem);
                    if (cacheItemIndexstatuses == null) {
                        cacheItemIndexstatuses = com_tech_world_model_realms_StatusRealmProxy.insert(realm, statusesItem, cache);
                    }
                    statusesOsList.addRow(cacheItemIndexstatuses);
                }
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.areAllSeenColKey, objKey, ((com_tech_world_model_realms_UserStatusesRealmProxyInterface) object).realmGet$areAllSeen(), false);
        }
    }

    public static long insertOrUpdate(Realm realm, com.tech.world.model.realms.UserStatuses object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.tech.world.model.realms.UserStatuses.class);
        long tableNativePtr = table.getNativePtr();
        UserStatusesColumnInfo columnInfo = (UserStatusesColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.UserStatuses.class);
        long pkColumnKey = columnInfo.userIdColKey;
        String primaryKeyValue = ((com_tech_world_model_realms_UserStatusesRealmProxyInterface) object).realmGet$userId();
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
        Table.nativeSetLong(tableNativePtr, columnInfo.lastStatusTimestampColKey, objKey, ((com_tech_world_model_realms_UserStatusesRealmProxyInterface) object).realmGet$lastStatusTimestamp(), false);

        com.tech.world.model.realms.User userObj = ((com_tech_world_model_realms_UserStatusesRealmProxyInterface) object).realmGet$user();
        if (userObj != null) {
            Long cacheuser = cache.get(userObj);
            if (cacheuser == null) {
                cacheuser = com_tech_world_model_realms_UserRealmProxy.insertOrUpdate(realm, userObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.userColKey, objKey, cacheuser, false);
        } else {
            Table.nativeNullifyLink(tableNativePtr, columnInfo.userColKey, objKey);
        }

        OsList statusesOsList = new OsList(table.getUncheckedRow(objKey), columnInfo.statusesColKey);
        RealmList<com.tech.world.model.realms.Status> statusesList = ((com_tech_world_model_realms_UserStatusesRealmProxyInterface) object).realmGet$statuses();
        if (statusesList != null && statusesList.size() == statusesOsList.size()) {
            // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
            int objects = statusesList.size();
            for (int i = 0; i < objects; i++) {
                com.tech.world.model.realms.Status statusesItem = statusesList.get(i);
                Long cacheItemIndexstatuses = cache.get(statusesItem);
                if (cacheItemIndexstatuses == null) {
                    cacheItemIndexstatuses = com_tech_world_model_realms_StatusRealmProxy.insertOrUpdate(realm, statusesItem, cache);
                }
                statusesOsList.setRow(i, cacheItemIndexstatuses);
            }
        } else {
            statusesOsList.removeAll();
            if (statusesList != null) {
                for (com.tech.world.model.realms.Status statusesItem : statusesList) {
                    Long cacheItemIndexstatuses = cache.get(statusesItem);
                    if (cacheItemIndexstatuses == null) {
                        cacheItemIndexstatuses = com_tech_world_model_realms_StatusRealmProxy.insertOrUpdate(realm, statusesItem, cache);
                    }
                    statusesOsList.addRow(cacheItemIndexstatuses);
                }
            }
        }

        Table.nativeSetBoolean(tableNativePtr, columnInfo.areAllSeenColKey, objKey, ((com_tech_world_model_realms_UserStatusesRealmProxyInterface) object).realmGet$areAllSeen(), false);
        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.tech.world.model.realms.UserStatuses.class);
        long tableNativePtr = table.getNativePtr();
        UserStatusesColumnInfo columnInfo = (UserStatusesColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.UserStatuses.class);
        long pkColumnKey = columnInfo.userIdColKey;
        com.tech.world.model.realms.UserStatuses object = null;
        while (objects.hasNext()) {
            object = (com.tech.world.model.realms.UserStatuses) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            String primaryKeyValue = ((com_tech_world_model_realms_UserStatusesRealmProxyInterface) object).realmGet$userId();
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
            Table.nativeSetLong(tableNativePtr, columnInfo.lastStatusTimestampColKey, objKey, ((com_tech_world_model_realms_UserStatusesRealmProxyInterface) object).realmGet$lastStatusTimestamp(), false);

            com.tech.world.model.realms.User userObj = ((com_tech_world_model_realms_UserStatusesRealmProxyInterface) object).realmGet$user();
            if (userObj != null) {
                Long cacheuser = cache.get(userObj);
                if (cacheuser == null) {
                    cacheuser = com_tech_world_model_realms_UserRealmProxy.insertOrUpdate(realm, userObj, cache);
                }
                Table.nativeSetLink(tableNativePtr, columnInfo.userColKey, objKey, cacheuser, false);
            } else {
                Table.nativeNullifyLink(tableNativePtr, columnInfo.userColKey, objKey);
            }

            OsList statusesOsList = new OsList(table.getUncheckedRow(objKey), columnInfo.statusesColKey);
            RealmList<com.tech.world.model.realms.Status> statusesList = ((com_tech_world_model_realms_UserStatusesRealmProxyInterface) object).realmGet$statuses();
            if (statusesList != null && statusesList.size() == statusesOsList.size()) {
                // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
                int objectCount = statusesList.size();
                for (int i = 0; i < objectCount; i++) {
                    com.tech.world.model.realms.Status statusesItem = statusesList.get(i);
                    Long cacheItemIndexstatuses = cache.get(statusesItem);
                    if (cacheItemIndexstatuses == null) {
                        cacheItemIndexstatuses = com_tech_world_model_realms_StatusRealmProxy.insertOrUpdate(realm, statusesItem, cache);
                    }
                    statusesOsList.setRow(i, cacheItemIndexstatuses);
                }
            } else {
                statusesOsList.removeAll();
                if (statusesList != null) {
                    for (com.tech.world.model.realms.Status statusesItem : statusesList) {
                        Long cacheItemIndexstatuses = cache.get(statusesItem);
                        if (cacheItemIndexstatuses == null) {
                            cacheItemIndexstatuses = com_tech_world_model_realms_StatusRealmProxy.insertOrUpdate(realm, statusesItem, cache);
                        }
                        statusesOsList.addRow(cacheItemIndexstatuses);
                    }
                }
            }

            Table.nativeSetBoolean(tableNativePtr, columnInfo.areAllSeenColKey, objKey, ((com_tech_world_model_realms_UserStatusesRealmProxyInterface) object).realmGet$areAllSeen(), false);
        }
    }

    public static com.tech.world.model.realms.UserStatuses createDetachedCopy(com.tech.world.model.realms.UserStatuses realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.tech.world.model.realms.UserStatuses unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.tech.world.model.realms.UserStatuses();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.tech.world.model.realms.UserStatuses) cachedObject.object;
            }
            unmanagedObject = (com.tech.world.model.realms.UserStatuses) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_tech_world_model_realms_UserStatusesRealmProxyInterface unmanagedCopy = (com_tech_world_model_realms_UserStatusesRealmProxyInterface) unmanagedObject;
        com_tech_world_model_realms_UserStatusesRealmProxyInterface realmSource = (com_tech_world_model_realms_UserStatusesRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$userId(realmSource.realmGet$userId());
        unmanagedCopy.realmSet$lastStatusTimestamp(realmSource.realmGet$lastStatusTimestamp());

        // Deep copy of user
        unmanagedCopy.realmSet$user(com_tech_world_model_realms_UserRealmProxy.createDetachedCopy(realmSource.realmGet$user(), currentDepth + 1, maxDepth, cache));

        // Deep copy of statuses
        if (currentDepth == maxDepth) {
            unmanagedCopy.realmSet$statuses(null);
        } else {
            RealmList<com.tech.world.model.realms.Status> managedstatusesList = realmSource.realmGet$statuses();
            RealmList<com.tech.world.model.realms.Status> unmanagedstatusesList = new RealmList<com.tech.world.model.realms.Status>();
            unmanagedCopy.realmSet$statuses(unmanagedstatusesList);
            int nextDepth = currentDepth + 1;
            int size = managedstatusesList.size();
            for (int i = 0; i < size; i++) {
                com.tech.world.model.realms.Status item = com_tech_world_model_realms_StatusRealmProxy.createDetachedCopy(managedstatusesList.get(i), nextDepth, maxDepth, cache);
                unmanagedstatusesList.add(item);
            }
        }
        unmanagedCopy.realmSet$areAllSeen(realmSource.realmGet$areAllSeen());

        return unmanagedObject;
    }

    static com.tech.world.model.realms.UserStatuses update(Realm realm, UserStatusesColumnInfo columnInfo, com.tech.world.model.realms.UserStatuses realmObject, com.tech.world.model.realms.UserStatuses newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_tech_world_model_realms_UserStatusesRealmProxyInterface realmObjectTarget = (com_tech_world_model_realms_UserStatusesRealmProxyInterface) realmObject;
        com_tech_world_model_realms_UserStatusesRealmProxyInterface realmObjectSource = (com_tech_world_model_realms_UserStatusesRealmProxyInterface) newObject;
        Table table = realm.getTable(com.tech.world.model.realms.UserStatuses.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addString(columnInfo.userIdColKey, realmObjectSource.realmGet$userId());
        builder.addInteger(columnInfo.lastStatusTimestampColKey, realmObjectSource.realmGet$lastStatusTimestamp());

        com.tech.world.model.realms.User userObj = realmObjectSource.realmGet$user();
        if (userObj == null) {
            builder.addNull(columnInfo.userColKey);
        } else {
            com.tech.world.model.realms.User cacheuser = (com.tech.world.model.realms.User) cache.get(userObj);
            if (cacheuser != null) {
                builder.addObject(columnInfo.userColKey, cacheuser);
            } else {
                builder.addObject(columnInfo.userColKey, com_tech_world_model_realms_UserRealmProxy.copyOrUpdate(realm, (com_tech_world_model_realms_UserRealmProxy.UserColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.User.class), userObj, true, cache, flags));
            }
        }

        RealmList<com.tech.world.model.realms.Status> statusesUnmanagedList = realmObjectSource.realmGet$statuses();
        if (statusesUnmanagedList != null) {
            RealmList<com.tech.world.model.realms.Status> statusesManagedCopy = new RealmList<com.tech.world.model.realms.Status>();
            for (int i = 0; i < statusesUnmanagedList.size(); i++) {
                com.tech.world.model.realms.Status statusesItem = statusesUnmanagedList.get(i);
                com.tech.world.model.realms.Status cachestatuses = (com.tech.world.model.realms.Status) cache.get(statusesItem);
                if (cachestatuses != null) {
                    statusesManagedCopy.add(cachestatuses);
                } else {
                    statusesManagedCopy.add(com_tech_world_model_realms_StatusRealmProxy.copyOrUpdate(realm, (com_tech_world_model_realms_StatusRealmProxy.StatusColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.Status.class), statusesItem, true, cache, flags));
                }
            }
            builder.addObjectList(columnInfo.statusesColKey, statusesManagedCopy);
        } else {
            builder.addObjectList(columnInfo.statusesColKey, new RealmList<com.tech.world.model.realms.Status>());
        }
        builder.addBoolean(columnInfo.areAllSeenColKey, realmObjectSource.realmGet$areAllSeen());

        builder.updateExistingTopLevelObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("UserStatuses = proxy[");
        stringBuilder.append("{userId:");
        stringBuilder.append(realmGet$userId() != null ? realmGet$userId() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{lastStatusTimestamp:");
        stringBuilder.append(realmGet$lastStatusTimestamp());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{user:");
        stringBuilder.append(realmGet$user() != null ? "User" : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{statuses:");
        stringBuilder.append("RealmList<Status>[").append(realmGet$statuses().size()).append("]");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{areAllSeen:");
        stringBuilder.append(realmGet$areAllSeen());
        stringBuilder.append("}");
        stringBuilder.append("]");
        return stringBuilder.toString();
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
