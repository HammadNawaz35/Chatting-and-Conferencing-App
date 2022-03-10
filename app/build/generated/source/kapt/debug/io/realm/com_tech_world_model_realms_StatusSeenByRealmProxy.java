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
public class com_tech_world_model_realms_StatusSeenByRealmProxy extends com.tech.world.model.realms.StatusSeenBy
    implements RealmObjectProxy, com_tech_world_model_realms_StatusSeenByRealmProxyInterface {

    static final class StatusSeenByColumnInfo extends ColumnInfo {
        long userColKey;
        long seenAtColKey;

        StatusSeenByColumnInfo(OsSchemaInfo schemaInfo) {
            super(2);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("StatusSeenBy");
            this.userColKey = addColumnDetails("user", "user", objectSchemaInfo);
            this.seenAtColKey = addColumnDetails("seenAt", "seenAt", objectSchemaInfo);
        }

        StatusSeenByColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new StatusSeenByColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final StatusSeenByColumnInfo src = (StatusSeenByColumnInfo) rawSrc;
            final StatusSeenByColumnInfo dst = (StatusSeenByColumnInfo) rawDst;
            dst.userColKey = src.userColKey;
            dst.seenAtColKey = src.seenAtColKey;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private StatusSeenByColumnInfo columnInfo;
    private ProxyState<com.tech.world.model.realms.StatusSeenBy> proxyState;

    com_tech_world_model_realms_StatusSeenByRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (StatusSeenByColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.tech.world.model.realms.StatusSeenBy>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
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
    @SuppressWarnings("cast")
    public long realmGet$seenAt() {
        proxyState.getRealm$realm().checkIfValid();
        return (long) proxyState.getRow$realm().getLong(columnInfo.seenAtColKey);
    }

    @Override
    public void realmSet$seenAt(long value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.seenAtColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.seenAtColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("StatusSeenBy", false, 2, 0);
        builder.addPersistedLinkProperty("user", RealmFieldType.OBJECT, "User");
        builder.addPersistedProperty("seenAt", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static StatusSeenByColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new StatusSeenByColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "StatusSeenBy";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "StatusSeenBy";
    }

    @SuppressWarnings("cast")
    public static com.tech.world.model.realms.StatusSeenBy createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(1);
        if (json.has("user")) {
            excludeFields.add("user");
        }
        com.tech.world.model.realms.StatusSeenBy obj = realm.createObjectInternal(com.tech.world.model.realms.StatusSeenBy.class, true, excludeFields);

        final com_tech_world_model_realms_StatusSeenByRealmProxyInterface objProxy = (com_tech_world_model_realms_StatusSeenByRealmProxyInterface) obj;
        if (json.has("user")) {
            if (json.isNull("user")) {
                objProxy.realmSet$user(null);
            } else {
                com.tech.world.model.realms.User userObj = com_tech_world_model_realms_UserRealmProxy.createOrUpdateUsingJsonObject(realm, json.getJSONObject("user"), update);
                objProxy.realmSet$user(userObj);
            }
        }
        if (json.has("seenAt")) {
            if (json.isNull("seenAt")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'seenAt' to null.");
            } else {
                objProxy.realmSet$seenAt((long) json.getLong("seenAt"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.tech.world.model.realms.StatusSeenBy createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final com.tech.world.model.realms.StatusSeenBy obj = new com.tech.world.model.realms.StatusSeenBy();
        final com_tech_world_model_realms_StatusSeenByRealmProxyInterface objProxy = (com_tech_world_model_realms_StatusSeenByRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("user")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$user(null);
                } else {
                    com.tech.world.model.realms.User userObj = com_tech_world_model_realms_UserRealmProxy.createUsingJsonStream(realm, reader);
                    objProxy.realmSet$user(userObj);
                }
            } else if (name.equals("seenAt")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$seenAt((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'seenAt' to null.");
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    static com_tech_world_model_realms_StatusSeenByRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.tech.world.model.realms.StatusSeenBy.class), false, Collections.<String>emptyList());
        io.realm.com_tech_world_model_realms_StatusSeenByRealmProxy obj = new io.realm.com_tech_world_model_realms_StatusSeenByRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.tech.world.model.realms.StatusSeenBy copyOrUpdate(Realm realm, StatusSeenByColumnInfo columnInfo, com.tech.world.model.realms.StatusSeenBy object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.tech.world.model.realms.StatusSeenBy) cachedRealmObject;
        }

        return copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.tech.world.model.realms.StatusSeenBy copy(Realm realm, StatusSeenByColumnInfo columnInfo, com.tech.world.model.realms.StatusSeenBy newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.tech.world.model.realms.StatusSeenBy) cachedRealmObject;
        }

        com_tech_world_model_realms_StatusSeenByRealmProxyInterface unmanagedSource = (com_tech_world_model_realms_StatusSeenByRealmProxyInterface) newObject;

        Table table = realm.getTable(com.tech.world.model.realms.StatusSeenBy.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addInteger(columnInfo.seenAtColKey, unmanagedSource.realmGet$seenAt());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_tech_world_model_realms_StatusSeenByRealmProxy managedCopy = newProxyInstance(realm, row);
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

        return managedCopy;
    }

    public static long insert(Realm realm, com.tech.world.model.realms.StatusSeenBy object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.tech.world.model.realms.StatusSeenBy.class);
        long tableNativePtr = table.getNativePtr();
        StatusSeenByColumnInfo columnInfo = (StatusSeenByColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.StatusSeenBy.class);
        long objKey = OsObject.createRow(table);
        cache.put(object, objKey);

        com.tech.world.model.realms.User userObj = ((com_tech_world_model_realms_StatusSeenByRealmProxyInterface) object).realmGet$user();
        if (userObj != null) {
            Long cacheuser = cache.get(userObj);
            if (cacheuser == null) {
                cacheuser = com_tech_world_model_realms_UserRealmProxy.insert(realm, userObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.userColKey, objKey, cacheuser, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.seenAtColKey, objKey, ((com_tech_world_model_realms_StatusSeenByRealmProxyInterface) object).realmGet$seenAt(), false);
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.tech.world.model.realms.StatusSeenBy.class);
        long tableNativePtr = table.getNativePtr();
        StatusSeenByColumnInfo columnInfo = (StatusSeenByColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.StatusSeenBy.class);
        com.tech.world.model.realms.StatusSeenBy object = null;
        while (objects.hasNext()) {
            object = (com.tech.world.model.realms.StatusSeenBy) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = OsObject.createRow(table);
            cache.put(object, objKey);

            com.tech.world.model.realms.User userObj = ((com_tech_world_model_realms_StatusSeenByRealmProxyInterface) object).realmGet$user();
            if (userObj != null) {
                Long cacheuser = cache.get(userObj);
                if (cacheuser == null) {
                    cacheuser = com_tech_world_model_realms_UserRealmProxy.insert(realm, userObj, cache);
                }
                table.setLink(columnInfo.userColKey, objKey, cacheuser, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.seenAtColKey, objKey, ((com_tech_world_model_realms_StatusSeenByRealmProxyInterface) object).realmGet$seenAt(), false);
        }
    }

    public static long insertOrUpdate(Realm realm, com.tech.world.model.realms.StatusSeenBy object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.tech.world.model.realms.StatusSeenBy.class);
        long tableNativePtr = table.getNativePtr();
        StatusSeenByColumnInfo columnInfo = (StatusSeenByColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.StatusSeenBy.class);
        long objKey = OsObject.createRow(table);
        cache.put(object, objKey);

        com.tech.world.model.realms.User userObj = ((com_tech_world_model_realms_StatusSeenByRealmProxyInterface) object).realmGet$user();
        if (userObj != null) {
            Long cacheuser = cache.get(userObj);
            if (cacheuser == null) {
                cacheuser = com_tech_world_model_realms_UserRealmProxy.insertOrUpdate(realm, userObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.userColKey, objKey, cacheuser, false);
        } else {
            Table.nativeNullifyLink(tableNativePtr, columnInfo.userColKey, objKey);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.seenAtColKey, objKey, ((com_tech_world_model_realms_StatusSeenByRealmProxyInterface) object).realmGet$seenAt(), false);
        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.tech.world.model.realms.StatusSeenBy.class);
        long tableNativePtr = table.getNativePtr();
        StatusSeenByColumnInfo columnInfo = (StatusSeenByColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.StatusSeenBy.class);
        com.tech.world.model.realms.StatusSeenBy object = null;
        while (objects.hasNext()) {
            object = (com.tech.world.model.realms.StatusSeenBy) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = OsObject.createRow(table);
            cache.put(object, objKey);

            com.tech.world.model.realms.User userObj = ((com_tech_world_model_realms_StatusSeenByRealmProxyInterface) object).realmGet$user();
            if (userObj != null) {
                Long cacheuser = cache.get(userObj);
                if (cacheuser == null) {
                    cacheuser = com_tech_world_model_realms_UserRealmProxy.insertOrUpdate(realm, userObj, cache);
                }
                Table.nativeSetLink(tableNativePtr, columnInfo.userColKey, objKey, cacheuser, false);
            } else {
                Table.nativeNullifyLink(tableNativePtr, columnInfo.userColKey, objKey);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.seenAtColKey, objKey, ((com_tech_world_model_realms_StatusSeenByRealmProxyInterface) object).realmGet$seenAt(), false);
        }
    }

    public static com.tech.world.model.realms.StatusSeenBy createDetachedCopy(com.tech.world.model.realms.StatusSeenBy realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.tech.world.model.realms.StatusSeenBy unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.tech.world.model.realms.StatusSeenBy();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.tech.world.model.realms.StatusSeenBy) cachedObject.object;
            }
            unmanagedObject = (com.tech.world.model.realms.StatusSeenBy) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_tech_world_model_realms_StatusSeenByRealmProxyInterface unmanagedCopy = (com_tech_world_model_realms_StatusSeenByRealmProxyInterface) unmanagedObject;
        com_tech_world_model_realms_StatusSeenByRealmProxyInterface realmSource = (com_tech_world_model_realms_StatusSeenByRealmProxyInterface) realmObject;

        // Deep copy of user
        unmanagedCopy.realmSet$user(com_tech_world_model_realms_UserRealmProxy.createDetachedCopy(realmSource.realmGet$user(), currentDepth + 1, maxDepth, cache));
        unmanagedCopy.realmSet$seenAt(realmSource.realmGet$seenAt());

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("StatusSeenBy = proxy[");
        stringBuilder.append("{user:");
        stringBuilder.append(realmGet$user() != null ? "User" : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{seenAt:");
        stringBuilder.append(realmGet$seenAt());
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
