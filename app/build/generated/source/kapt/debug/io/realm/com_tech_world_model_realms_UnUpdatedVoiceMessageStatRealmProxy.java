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
public class com_tech_world_model_realms_UnUpdatedVoiceMessageStatRealmProxy extends com.tech.world.model.realms.UnUpdatedVoiceMessageStat
    implements RealmObjectProxy, com_tech_world_model_realms_UnUpdatedVoiceMessageStatRealmProxyInterface {

    static final class UnUpdatedVoiceMessageStatColumnInfo extends ColumnInfo {
        long messageIdColKey;
        long myUidColKey;
        long isVoiceMessageSeenColKey;

        UnUpdatedVoiceMessageStatColumnInfo(OsSchemaInfo schemaInfo) {
            super(3);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("UnUpdatedVoiceMessageStat");
            this.messageIdColKey = addColumnDetails("messageId", "messageId", objectSchemaInfo);
            this.myUidColKey = addColumnDetails("myUid", "myUid", objectSchemaInfo);
            this.isVoiceMessageSeenColKey = addColumnDetails("isVoiceMessageSeen", "isVoiceMessageSeen", objectSchemaInfo);
        }

        UnUpdatedVoiceMessageStatColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new UnUpdatedVoiceMessageStatColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final UnUpdatedVoiceMessageStatColumnInfo src = (UnUpdatedVoiceMessageStatColumnInfo) rawSrc;
            final UnUpdatedVoiceMessageStatColumnInfo dst = (UnUpdatedVoiceMessageStatColumnInfo) rawDst;
            dst.messageIdColKey = src.messageIdColKey;
            dst.myUidColKey = src.myUidColKey;
            dst.isVoiceMessageSeenColKey = src.isVoiceMessageSeenColKey;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private UnUpdatedVoiceMessageStatColumnInfo columnInfo;
    private ProxyState<com.tech.world.model.realms.UnUpdatedVoiceMessageStat> proxyState;

    com_tech_world_model_realms_UnUpdatedVoiceMessageStatRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (UnUpdatedVoiceMessageStatColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.tech.world.model.realms.UnUpdatedVoiceMessageStat>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$messageId() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.messageIdColKey);
    }

    @Override
    public void realmSet$messageId(String value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'messageId' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$myUid() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.myUidColKey);
    }

    @Override
    public void realmSet$myUid(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.myUidColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.myUidColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.myUidColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.myUidColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public boolean realmGet$isVoiceMessageSeen() {
        proxyState.getRealm$realm().checkIfValid();
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.isVoiceMessageSeenColKey);
    }

    @Override
    public void realmSet$isVoiceMessageSeen(boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setBoolean(columnInfo.isVoiceMessageSeenColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setBoolean(columnInfo.isVoiceMessageSeenColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("UnUpdatedVoiceMessageStat", false, 3, 0);
        builder.addPersistedProperty("messageId", RealmFieldType.STRING, Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("myUid", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("isVoiceMessageSeen", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static UnUpdatedVoiceMessageStatColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new UnUpdatedVoiceMessageStatColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "UnUpdatedVoiceMessageStat";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "UnUpdatedVoiceMessageStat";
    }

    @SuppressWarnings("cast")
    public static com.tech.world.model.realms.UnUpdatedVoiceMessageStat createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.tech.world.model.realms.UnUpdatedVoiceMessageStat obj = null;
        if (update) {
            Table table = realm.getTable(com.tech.world.model.realms.UnUpdatedVoiceMessageStat.class);
            UnUpdatedVoiceMessageStatColumnInfo columnInfo = (UnUpdatedVoiceMessageStatColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.UnUpdatedVoiceMessageStat.class);
            long pkColumnKey = columnInfo.messageIdColKey;
            long objKey = Table.NO_MATCH;
            if (json.isNull("messageId")) {
                objKey = table.findFirstNull(pkColumnKey);
            } else {
                objKey = table.findFirstString(pkColumnKey, json.getString("messageId"));
            }
            if (objKey != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), realm.getSchema().getColumnInfo(com.tech.world.model.realms.UnUpdatedVoiceMessageStat.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_tech_world_model_realms_UnUpdatedVoiceMessageStatRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("messageId")) {
                if (json.isNull("messageId")) {
                    obj = (io.realm.com_tech_world_model_realms_UnUpdatedVoiceMessageStatRealmProxy) realm.createObjectInternal(com.tech.world.model.realms.UnUpdatedVoiceMessageStat.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_tech_world_model_realms_UnUpdatedVoiceMessageStatRealmProxy) realm.createObjectInternal(com.tech.world.model.realms.UnUpdatedVoiceMessageStat.class, json.getString("messageId"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'messageId'.");
            }
        }

        final com_tech_world_model_realms_UnUpdatedVoiceMessageStatRealmProxyInterface objProxy = (com_tech_world_model_realms_UnUpdatedVoiceMessageStatRealmProxyInterface) obj;
        if (json.has("myUid")) {
            if (json.isNull("myUid")) {
                objProxy.realmSet$myUid(null);
            } else {
                objProxy.realmSet$myUid((String) json.getString("myUid"));
            }
        }
        if (json.has("isVoiceMessageSeen")) {
            if (json.isNull("isVoiceMessageSeen")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'isVoiceMessageSeen' to null.");
            } else {
                objProxy.realmSet$isVoiceMessageSeen((boolean) json.getBoolean("isVoiceMessageSeen"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.tech.world.model.realms.UnUpdatedVoiceMessageStat createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.tech.world.model.realms.UnUpdatedVoiceMessageStat obj = new com.tech.world.model.realms.UnUpdatedVoiceMessageStat();
        final com_tech_world_model_realms_UnUpdatedVoiceMessageStatRealmProxyInterface objProxy = (com_tech_world_model_realms_UnUpdatedVoiceMessageStatRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("messageId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$messageId((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$messageId(null);
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("myUid")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$myUid((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$myUid(null);
                }
            } else if (name.equals("isVoiceMessageSeen")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$isVoiceMessageSeen((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'isVoiceMessageSeen' to null.");
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'messageId'.");
        }
        return realm.copyToRealm(obj);
    }

    static com_tech_world_model_realms_UnUpdatedVoiceMessageStatRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.tech.world.model.realms.UnUpdatedVoiceMessageStat.class), false, Collections.<String>emptyList());
        io.realm.com_tech_world_model_realms_UnUpdatedVoiceMessageStatRealmProxy obj = new io.realm.com_tech_world_model_realms_UnUpdatedVoiceMessageStatRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.tech.world.model.realms.UnUpdatedVoiceMessageStat copyOrUpdate(Realm realm, UnUpdatedVoiceMessageStatColumnInfo columnInfo, com.tech.world.model.realms.UnUpdatedVoiceMessageStat object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.tech.world.model.realms.UnUpdatedVoiceMessageStat) cachedRealmObject;
        }

        com.tech.world.model.realms.UnUpdatedVoiceMessageStat realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.tech.world.model.realms.UnUpdatedVoiceMessageStat.class);
            long pkColumnKey = columnInfo.messageIdColKey;
            String value = ((com_tech_world_model_realms_UnUpdatedVoiceMessageStatRealmProxyInterface) object).realmGet$messageId();
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
                    realmObject = new io.realm.com_tech_world_model_realms_UnUpdatedVoiceMessageStatRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.tech.world.model.realms.UnUpdatedVoiceMessageStat copy(Realm realm, UnUpdatedVoiceMessageStatColumnInfo columnInfo, com.tech.world.model.realms.UnUpdatedVoiceMessageStat newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.tech.world.model.realms.UnUpdatedVoiceMessageStat) cachedRealmObject;
        }

        com_tech_world_model_realms_UnUpdatedVoiceMessageStatRealmProxyInterface unmanagedSource = (com_tech_world_model_realms_UnUpdatedVoiceMessageStatRealmProxyInterface) newObject;

        Table table = realm.getTable(com.tech.world.model.realms.UnUpdatedVoiceMessageStat.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.messageIdColKey, unmanagedSource.realmGet$messageId());
        builder.addString(columnInfo.myUidColKey, unmanagedSource.realmGet$myUid());
        builder.addBoolean(columnInfo.isVoiceMessageSeenColKey, unmanagedSource.realmGet$isVoiceMessageSeen());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_tech_world_model_realms_UnUpdatedVoiceMessageStatRealmProxy managedCopy = newProxyInstance(realm, row);
        cache.put(newObject, managedCopy);

        return managedCopy;
    }

    public static long insert(Realm realm, com.tech.world.model.realms.UnUpdatedVoiceMessageStat object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.tech.world.model.realms.UnUpdatedVoiceMessageStat.class);
        long tableNativePtr = table.getNativePtr();
        UnUpdatedVoiceMessageStatColumnInfo columnInfo = (UnUpdatedVoiceMessageStatColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.UnUpdatedVoiceMessageStat.class);
        long pkColumnKey = columnInfo.messageIdColKey;
        String primaryKeyValue = ((com_tech_world_model_realms_UnUpdatedVoiceMessageStatRealmProxyInterface) object).realmGet$messageId();
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
        String realmGet$myUid = ((com_tech_world_model_realms_UnUpdatedVoiceMessageStatRealmProxyInterface) object).realmGet$myUid();
        if (realmGet$myUid != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.myUidColKey, objKey, realmGet$myUid, false);
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.isVoiceMessageSeenColKey, objKey, ((com_tech_world_model_realms_UnUpdatedVoiceMessageStatRealmProxyInterface) object).realmGet$isVoiceMessageSeen(), false);
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.tech.world.model.realms.UnUpdatedVoiceMessageStat.class);
        long tableNativePtr = table.getNativePtr();
        UnUpdatedVoiceMessageStatColumnInfo columnInfo = (UnUpdatedVoiceMessageStatColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.UnUpdatedVoiceMessageStat.class);
        long pkColumnKey = columnInfo.messageIdColKey;
        com.tech.world.model.realms.UnUpdatedVoiceMessageStat object = null;
        while (objects.hasNext()) {
            object = (com.tech.world.model.realms.UnUpdatedVoiceMessageStat) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            String primaryKeyValue = ((com_tech_world_model_realms_UnUpdatedVoiceMessageStatRealmProxyInterface) object).realmGet$messageId();
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
            String realmGet$myUid = ((com_tech_world_model_realms_UnUpdatedVoiceMessageStatRealmProxyInterface) object).realmGet$myUid();
            if (realmGet$myUid != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.myUidColKey, objKey, realmGet$myUid, false);
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.isVoiceMessageSeenColKey, objKey, ((com_tech_world_model_realms_UnUpdatedVoiceMessageStatRealmProxyInterface) object).realmGet$isVoiceMessageSeen(), false);
        }
    }

    public static long insertOrUpdate(Realm realm, com.tech.world.model.realms.UnUpdatedVoiceMessageStat object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.tech.world.model.realms.UnUpdatedVoiceMessageStat.class);
        long tableNativePtr = table.getNativePtr();
        UnUpdatedVoiceMessageStatColumnInfo columnInfo = (UnUpdatedVoiceMessageStatColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.UnUpdatedVoiceMessageStat.class);
        long pkColumnKey = columnInfo.messageIdColKey;
        String primaryKeyValue = ((com_tech_world_model_realms_UnUpdatedVoiceMessageStatRealmProxyInterface) object).realmGet$messageId();
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
        String realmGet$myUid = ((com_tech_world_model_realms_UnUpdatedVoiceMessageStatRealmProxyInterface) object).realmGet$myUid();
        if (realmGet$myUid != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.myUidColKey, objKey, realmGet$myUid, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.myUidColKey, objKey, false);
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.isVoiceMessageSeenColKey, objKey, ((com_tech_world_model_realms_UnUpdatedVoiceMessageStatRealmProxyInterface) object).realmGet$isVoiceMessageSeen(), false);
        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.tech.world.model.realms.UnUpdatedVoiceMessageStat.class);
        long tableNativePtr = table.getNativePtr();
        UnUpdatedVoiceMessageStatColumnInfo columnInfo = (UnUpdatedVoiceMessageStatColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.UnUpdatedVoiceMessageStat.class);
        long pkColumnKey = columnInfo.messageIdColKey;
        com.tech.world.model.realms.UnUpdatedVoiceMessageStat object = null;
        while (objects.hasNext()) {
            object = (com.tech.world.model.realms.UnUpdatedVoiceMessageStat) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            String primaryKeyValue = ((com_tech_world_model_realms_UnUpdatedVoiceMessageStatRealmProxyInterface) object).realmGet$messageId();
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
            String realmGet$myUid = ((com_tech_world_model_realms_UnUpdatedVoiceMessageStatRealmProxyInterface) object).realmGet$myUid();
            if (realmGet$myUid != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.myUidColKey, objKey, realmGet$myUid, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.myUidColKey, objKey, false);
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.isVoiceMessageSeenColKey, objKey, ((com_tech_world_model_realms_UnUpdatedVoiceMessageStatRealmProxyInterface) object).realmGet$isVoiceMessageSeen(), false);
        }
    }

    public static com.tech.world.model.realms.UnUpdatedVoiceMessageStat createDetachedCopy(com.tech.world.model.realms.UnUpdatedVoiceMessageStat realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.tech.world.model.realms.UnUpdatedVoiceMessageStat unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.tech.world.model.realms.UnUpdatedVoiceMessageStat();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.tech.world.model.realms.UnUpdatedVoiceMessageStat) cachedObject.object;
            }
            unmanagedObject = (com.tech.world.model.realms.UnUpdatedVoiceMessageStat) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_tech_world_model_realms_UnUpdatedVoiceMessageStatRealmProxyInterface unmanagedCopy = (com_tech_world_model_realms_UnUpdatedVoiceMessageStatRealmProxyInterface) unmanagedObject;
        com_tech_world_model_realms_UnUpdatedVoiceMessageStatRealmProxyInterface realmSource = (com_tech_world_model_realms_UnUpdatedVoiceMessageStatRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$messageId(realmSource.realmGet$messageId());
        unmanagedCopy.realmSet$myUid(realmSource.realmGet$myUid());
        unmanagedCopy.realmSet$isVoiceMessageSeen(realmSource.realmGet$isVoiceMessageSeen());

        return unmanagedObject;
    }

    static com.tech.world.model.realms.UnUpdatedVoiceMessageStat update(Realm realm, UnUpdatedVoiceMessageStatColumnInfo columnInfo, com.tech.world.model.realms.UnUpdatedVoiceMessageStat realmObject, com.tech.world.model.realms.UnUpdatedVoiceMessageStat newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_tech_world_model_realms_UnUpdatedVoiceMessageStatRealmProxyInterface realmObjectTarget = (com_tech_world_model_realms_UnUpdatedVoiceMessageStatRealmProxyInterface) realmObject;
        com_tech_world_model_realms_UnUpdatedVoiceMessageStatRealmProxyInterface realmObjectSource = (com_tech_world_model_realms_UnUpdatedVoiceMessageStatRealmProxyInterface) newObject;
        Table table = realm.getTable(com.tech.world.model.realms.UnUpdatedVoiceMessageStat.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addString(columnInfo.messageIdColKey, realmObjectSource.realmGet$messageId());
        builder.addString(columnInfo.myUidColKey, realmObjectSource.realmGet$myUid());
        builder.addBoolean(columnInfo.isVoiceMessageSeenColKey, realmObjectSource.realmGet$isVoiceMessageSeen());

        builder.updateExistingTopLevelObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("UnUpdatedVoiceMessageStat = proxy[");
        stringBuilder.append("{messageId:");
        stringBuilder.append(realmGet$messageId() != null ? realmGet$messageId() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{myUid:");
        stringBuilder.append(realmGet$myUid() != null ? realmGet$myUid() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{isVoiceMessageSeen:");
        stringBuilder.append(realmGet$isVoiceMessageSeen());
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        com_tech_world_model_realms_UnUpdatedVoiceMessageStatRealmProxy aUnUpdatedVoiceMessageStat = (com_tech_world_model_realms_UnUpdatedVoiceMessageStatRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aUnUpdatedVoiceMessageStat.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aUnUpdatedVoiceMessageStat.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aUnUpdatedVoiceMessageStat.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
