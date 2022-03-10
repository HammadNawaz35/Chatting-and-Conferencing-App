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
public class com_tech_world_model_realms_JobIdRealmProxy extends com.tech.world.model.realms.JobId
    implements RealmObjectProxy, com_tech_world_model_realms_JobIdRealmProxyInterface {

    static final class JobIdColumnInfo extends ColumnInfo {
        long idColKey;
        long jobIdColKey;
        long isVoiceMessageColKey;

        JobIdColumnInfo(OsSchemaInfo schemaInfo) {
            super(3);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("JobId");
            this.idColKey = addColumnDetails("id", "id", objectSchemaInfo);
            this.jobIdColKey = addColumnDetails("jobId", "jobId", objectSchemaInfo);
            this.isVoiceMessageColKey = addColumnDetails("isVoiceMessage", "isVoiceMessage", objectSchemaInfo);
        }

        JobIdColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new JobIdColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final JobIdColumnInfo src = (JobIdColumnInfo) rawSrc;
            final JobIdColumnInfo dst = (JobIdColumnInfo) rawDst;
            dst.idColKey = src.idColKey;
            dst.jobIdColKey = src.jobIdColKey;
            dst.isVoiceMessageColKey = src.isVoiceMessageColKey;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private JobIdColumnInfo columnInfo;
    private ProxyState<com.tech.world.model.realms.JobId> proxyState;

    com_tech_world_model_realms_JobIdRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (JobIdColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.tech.world.model.realms.JobId>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$id() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.idColKey);
    }

    @Override
    public void realmSet$id(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.idColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.idColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.idColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.idColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$jobId() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.jobIdColKey);
    }

    @Override
    public void realmSet$jobId(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.jobIdColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.jobIdColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public boolean realmGet$isVoiceMessage() {
        proxyState.getRealm$realm().checkIfValid();
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.isVoiceMessageColKey);
    }

    @Override
    public void realmSet$isVoiceMessage(boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setBoolean(columnInfo.isVoiceMessageColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setBoolean(columnInfo.isVoiceMessageColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("JobId", false, 3, 0);
        builder.addPersistedProperty("id", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("jobId", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("isVoiceMessage", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static JobIdColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new JobIdColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "JobId";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "JobId";
    }

    @SuppressWarnings("cast")
    public static com.tech.world.model.realms.JobId createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.tech.world.model.realms.JobId obj = realm.createObjectInternal(com.tech.world.model.realms.JobId.class, true, excludeFields);

        final com_tech_world_model_realms_JobIdRealmProxyInterface objProxy = (com_tech_world_model_realms_JobIdRealmProxyInterface) obj;
        if (json.has("id")) {
            if (json.isNull("id")) {
                objProxy.realmSet$id(null);
            } else {
                objProxy.realmSet$id((String) json.getString("id"));
            }
        }
        if (json.has("jobId")) {
            if (json.isNull("jobId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'jobId' to null.");
            } else {
                objProxy.realmSet$jobId((int) json.getInt("jobId"));
            }
        }
        if (json.has("isVoiceMessage")) {
            if (json.isNull("isVoiceMessage")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'isVoiceMessage' to null.");
            } else {
                objProxy.realmSet$isVoiceMessage((boolean) json.getBoolean("isVoiceMessage"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.tech.world.model.realms.JobId createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final com.tech.world.model.realms.JobId obj = new com.tech.world.model.realms.JobId();
        final com_tech_world_model_realms_JobIdRealmProxyInterface objProxy = (com_tech_world_model_realms_JobIdRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("id")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$id((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$id(null);
                }
            } else if (name.equals("jobId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$jobId((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'jobId' to null.");
                }
            } else if (name.equals("isVoiceMessage")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$isVoiceMessage((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'isVoiceMessage' to null.");
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    static com_tech_world_model_realms_JobIdRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.tech.world.model.realms.JobId.class), false, Collections.<String>emptyList());
        io.realm.com_tech_world_model_realms_JobIdRealmProxy obj = new io.realm.com_tech_world_model_realms_JobIdRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.tech.world.model.realms.JobId copyOrUpdate(Realm realm, JobIdColumnInfo columnInfo, com.tech.world.model.realms.JobId object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.tech.world.model.realms.JobId) cachedRealmObject;
        }

        return copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.tech.world.model.realms.JobId copy(Realm realm, JobIdColumnInfo columnInfo, com.tech.world.model.realms.JobId newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.tech.world.model.realms.JobId) cachedRealmObject;
        }

        com_tech_world_model_realms_JobIdRealmProxyInterface unmanagedSource = (com_tech_world_model_realms_JobIdRealmProxyInterface) newObject;

        Table table = realm.getTable(com.tech.world.model.realms.JobId.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.idColKey, unmanagedSource.realmGet$id());
        builder.addInteger(columnInfo.jobIdColKey, unmanagedSource.realmGet$jobId());
        builder.addBoolean(columnInfo.isVoiceMessageColKey, unmanagedSource.realmGet$isVoiceMessage());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_tech_world_model_realms_JobIdRealmProxy managedCopy = newProxyInstance(realm, row);
        cache.put(newObject, managedCopy);

        return managedCopy;
    }

    public static long insert(Realm realm, com.tech.world.model.realms.JobId object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.tech.world.model.realms.JobId.class);
        long tableNativePtr = table.getNativePtr();
        JobIdColumnInfo columnInfo = (JobIdColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.JobId.class);
        long objKey = OsObject.createRow(table);
        cache.put(object, objKey);
        String realmGet$id = ((com_tech_world_model_realms_JobIdRealmProxyInterface) object).realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.idColKey, objKey, realmGet$id, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.jobIdColKey, objKey, ((com_tech_world_model_realms_JobIdRealmProxyInterface) object).realmGet$jobId(), false);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.isVoiceMessageColKey, objKey, ((com_tech_world_model_realms_JobIdRealmProxyInterface) object).realmGet$isVoiceMessage(), false);
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.tech.world.model.realms.JobId.class);
        long tableNativePtr = table.getNativePtr();
        JobIdColumnInfo columnInfo = (JobIdColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.JobId.class);
        com.tech.world.model.realms.JobId object = null;
        while (objects.hasNext()) {
            object = (com.tech.world.model.realms.JobId) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = OsObject.createRow(table);
            cache.put(object, objKey);
            String realmGet$id = ((com_tech_world_model_realms_JobIdRealmProxyInterface) object).realmGet$id();
            if (realmGet$id != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.idColKey, objKey, realmGet$id, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.jobIdColKey, objKey, ((com_tech_world_model_realms_JobIdRealmProxyInterface) object).realmGet$jobId(), false);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.isVoiceMessageColKey, objKey, ((com_tech_world_model_realms_JobIdRealmProxyInterface) object).realmGet$isVoiceMessage(), false);
        }
    }

    public static long insertOrUpdate(Realm realm, com.tech.world.model.realms.JobId object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.tech.world.model.realms.JobId.class);
        long tableNativePtr = table.getNativePtr();
        JobIdColumnInfo columnInfo = (JobIdColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.JobId.class);
        long objKey = OsObject.createRow(table);
        cache.put(object, objKey);
        String realmGet$id = ((com_tech_world_model_realms_JobIdRealmProxyInterface) object).realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.idColKey, objKey, realmGet$id, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.idColKey, objKey, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.jobIdColKey, objKey, ((com_tech_world_model_realms_JobIdRealmProxyInterface) object).realmGet$jobId(), false);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.isVoiceMessageColKey, objKey, ((com_tech_world_model_realms_JobIdRealmProxyInterface) object).realmGet$isVoiceMessage(), false);
        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.tech.world.model.realms.JobId.class);
        long tableNativePtr = table.getNativePtr();
        JobIdColumnInfo columnInfo = (JobIdColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.JobId.class);
        com.tech.world.model.realms.JobId object = null;
        while (objects.hasNext()) {
            object = (com.tech.world.model.realms.JobId) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = OsObject.createRow(table);
            cache.put(object, objKey);
            String realmGet$id = ((com_tech_world_model_realms_JobIdRealmProxyInterface) object).realmGet$id();
            if (realmGet$id != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.idColKey, objKey, realmGet$id, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.idColKey, objKey, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.jobIdColKey, objKey, ((com_tech_world_model_realms_JobIdRealmProxyInterface) object).realmGet$jobId(), false);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.isVoiceMessageColKey, objKey, ((com_tech_world_model_realms_JobIdRealmProxyInterface) object).realmGet$isVoiceMessage(), false);
        }
    }

    public static com.tech.world.model.realms.JobId createDetachedCopy(com.tech.world.model.realms.JobId realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.tech.world.model.realms.JobId unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.tech.world.model.realms.JobId();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.tech.world.model.realms.JobId) cachedObject.object;
            }
            unmanagedObject = (com.tech.world.model.realms.JobId) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_tech_world_model_realms_JobIdRealmProxyInterface unmanagedCopy = (com_tech_world_model_realms_JobIdRealmProxyInterface) unmanagedObject;
        com_tech_world_model_realms_JobIdRealmProxyInterface realmSource = (com_tech_world_model_realms_JobIdRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$jobId(realmSource.realmGet$jobId());
        unmanagedCopy.realmSet$isVoiceMessage(realmSource.realmGet$isVoiceMessage());

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("JobId = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id() != null ? realmGet$id() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{jobId:");
        stringBuilder.append(realmGet$jobId());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{isVoiceMessage:");
        stringBuilder.append(realmGet$isVoiceMessage());
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
        com_tech_world_model_realms_JobIdRealmProxy aJobId = (com_tech_world_model_realms_JobIdRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aJobId.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aJobId.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aJobId.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
