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
public class com_tech_world_model_realms_DeletedMessageRealmProxy extends com.tech.world.model.realms.DeletedMessage
    implements RealmObjectProxy, com_tech_world_model_realms_DeletedMessageRealmProxyInterface {

    static final class DeletedMessageColumnInfo extends ColumnInfo {
        long messageIdColKey;

        DeletedMessageColumnInfo(OsSchemaInfo schemaInfo) {
            super(1);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("DeletedMessage");
            this.messageIdColKey = addColumnDetails("messageId", "messageId", objectSchemaInfo);
        }

        DeletedMessageColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new DeletedMessageColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final DeletedMessageColumnInfo src = (DeletedMessageColumnInfo) rawSrc;
            final DeletedMessageColumnInfo dst = (DeletedMessageColumnInfo) rawDst;
            dst.messageIdColKey = src.messageIdColKey;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private DeletedMessageColumnInfo columnInfo;
    private ProxyState<com.tech.world.model.realms.DeletedMessage> proxyState;

    com_tech_world_model_realms_DeletedMessageRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (DeletedMessageColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.tech.world.model.realms.DeletedMessage>(this);
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

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("DeletedMessage", false, 1, 0);
        builder.addPersistedProperty("messageId", RealmFieldType.STRING, Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static DeletedMessageColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new DeletedMessageColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "DeletedMessage";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "DeletedMessage";
    }

    @SuppressWarnings("cast")
    public static com.tech.world.model.realms.DeletedMessage createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.tech.world.model.realms.DeletedMessage obj = null;
        if (update) {
            Table table = realm.getTable(com.tech.world.model.realms.DeletedMessage.class);
            DeletedMessageColumnInfo columnInfo = (DeletedMessageColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.DeletedMessage.class);
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
                    objectContext.set(realm, table.getUncheckedRow(objKey), realm.getSchema().getColumnInfo(com.tech.world.model.realms.DeletedMessage.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_tech_world_model_realms_DeletedMessageRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("messageId")) {
                if (json.isNull("messageId")) {
                    obj = (io.realm.com_tech_world_model_realms_DeletedMessageRealmProxy) realm.createObjectInternal(com.tech.world.model.realms.DeletedMessage.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_tech_world_model_realms_DeletedMessageRealmProxy) realm.createObjectInternal(com.tech.world.model.realms.DeletedMessage.class, json.getString("messageId"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'messageId'.");
            }
        }

        final com_tech_world_model_realms_DeletedMessageRealmProxyInterface objProxy = (com_tech_world_model_realms_DeletedMessageRealmProxyInterface) obj;
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.tech.world.model.realms.DeletedMessage createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.tech.world.model.realms.DeletedMessage obj = new com.tech.world.model.realms.DeletedMessage();
        final com_tech_world_model_realms_DeletedMessageRealmProxyInterface objProxy = (com_tech_world_model_realms_DeletedMessageRealmProxyInterface) obj;
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

    static com_tech_world_model_realms_DeletedMessageRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.tech.world.model.realms.DeletedMessage.class), false, Collections.<String>emptyList());
        io.realm.com_tech_world_model_realms_DeletedMessageRealmProxy obj = new io.realm.com_tech_world_model_realms_DeletedMessageRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.tech.world.model.realms.DeletedMessage copyOrUpdate(Realm realm, DeletedMessageColumnInfo columnInfo, com.tech.world.model.realms.DeletedMessage object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.tech.world.model.realms.DeletedMessage) cachedRealmObject;
        }

        com.tech.world.model.realms.DeletedMessage realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.tech.world.model.realms.DeletedMessage.class);
            long pkColumnKey = columnInfo.messageIdColKey;
            String value = ((com_tech_world_model_realms_DeletedMessageRealmProxyInterface) object).realmGet$messageId();
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
                    realmObject = new io.realm.com_tech_world_model_realms_DeletedMessageRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.tech.world.model.realms.DeletedMessage copy(Realm realm, DeletedMessageColumnInfo columnInfo, com.tech.world.model.realms.DeletedMessage newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.tech.world.model.realms.DeletedMessage) cachedRealmObject;
        }

        com_tech_world_model_realms_DeletedMessageRealmProxyInterface unmanagedSource = (com_tech_world_model_realms_DeletedMessageRealmProxyInterface) newObject;

        Table table = realm.getTable(com.tech.world.model.realms.DeletedMessage.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.messageIdColKey, unmanagedSource.realmGet$messageId());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_tech_world_model_realms_DeletedMessageRealmProxy managedCopy = newProxyInstance(realm, row);
        cache.put(newObject, managedCopy);

        return managedCopy;
    }

    public static long insert(Realm realm, com.tech.world.model.realms.DeletedMessage object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.tech.world.model.realms.DeletedMessage.class);
        long tableNativePtr = table.getNativePtr();
        DeletedMessageColumnInfo columnInfo = (DeletedMessageColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.DeletedMessage.class);
        long pkColumnKey = columnInfo.messageIdColKey;
        String primaryKeyValue = ((com_tech_world_model_realms_DeletedMessageRealmProxyInterface) object).realmGet$messageId();
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
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.tech.world.model.realms.DeletedMessage.class);
        long tableNativePtr = table.getNativePtr();
        DeletedMessageColumnInfo columnInfo = (DeletedMessageColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.DeletedMessage.class);
        long pkColumnKey = columnInfo.messageIdColKey;
        com.tech.world.model.realms.DeletedMessage object = null;
        while (objects.hasNext()) {
            object = (com.tech.world.model.realms.DeletedMessage) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            String primaryKeyValue = ((com_tech_world_model_realms_DeletedMessageRealmProxyInterface) object).realmGet$messageId();
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
        }
    }

    public static long insertOrUpdate(Realm realm, com.tech.world.model.realms.DeletedMessage object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.tech.world.model.realms.DeletedMessage.class);
        long tableNativePtr = table.getNativePtr();
        DeletedMessageColumnInfo columnInfo = (DeletedMessageColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.DeletedMessage.class);
        long pkColumnKey = columnInfo.messageIdColKey;
        String primaryKeyValue = ((com_tech_world_model_realms_DeletedMessageRealmProxyInterface) object).realmGet$messageId();
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
        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.tech.world.model.realms.DeletedMessage.class);
        long tableNativePtr = table.getNativePtr();
        DeletedMessageColumnInfo columnInfo = (DeletedMessageColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.DeletedMessage.class);
        long pkColumnKey = columnInfo.messageIdColKey;
        com.tech.world.model.realms.DeletedMessage object = null;
        while (objects.hasNext()) {
            object = (com.tech.world.model.realms.DeletedMessage) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            String primaryKeyValue = ((com_tech_world_model_realms_DeletedMessageRealmProxyInterface) object).realmGet$messageId();
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
        }
    }

    public static com.tech.world.model.realms.DeletedMessage createDetachedCopy(com.tech.world.model.realms.DeletedMessage realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.tech.world.model.realms.DeletedMessage unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.tech.world.model.realms.DeletedMessage();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.tech.world.model.realms.DeletedMessage) cachedObject.object;
            }
            unmanagedObject = (com.tech.world.model.realms.DeletedMessage) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_tech_world_model_realms_DeletedMessageRealmProxyInterface unmanagedCopy = (com_tech_world_model_realms_DeletedMessageRealmProxyInterface) unmanagedObject;
        com_tech_world_model_realms_DeletedMessageRealmProxyInterface realmSource = (com_tech_world_model_realms_DeletedMessageRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$messageId(realmSource.realmGet$messageId());

        return unmanagedObject;
    }

    static com.tech.world.model.realms.DeletedMessage update(Realm realm, DeletedMessageColumnInfo columnInfo, com.tech.world.model.realms.DeletedMessage realmObject, com.tech.world.model.realms.DeletedMessage newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_tech_world_model_realms_DeletedMessageRealmProxyInterface realmObjectTarget = (com_tech_world_model_realms_DeletedMessageRealmProxyInterface) realmObject;
        com_tech_world_model_realms_DeletedMessageRealmProxyInterface realmObjectSource = (com_tech_world_model_realms_DeletedMessageRealmProxyInterface) newObject;
        Table table = realm.getTable(com.tech.world.model.realms.DeletedMessage.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addString(columnInfo.messageIdColKey, realmObjectSource.realmGet$messageId());

        builder.updateExistingTopLevelObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("DeletedMessage = proxy[");
        stringBuilder.append("{messageId:");
        stringBuilder.append(realmGet$messageId() != null ? realmGet$messageId() : "null");
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
        com_tech_world_model_realms_DeletedMessageRealmProxy aDeletedMessage = (com_tech_world_model_realms_DeletedMessageRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aDeletedMessage.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aDeletedMessage.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aDeletedMessage.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
