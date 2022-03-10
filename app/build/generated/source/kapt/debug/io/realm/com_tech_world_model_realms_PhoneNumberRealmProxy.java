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
public class com_tech_world_model_realms_PhoneNumberRealmProxy extends com.tech.world.model.realms.PhoneNumber
    implements RealmObjectProxy, com_tech_world_model_realms_PhoneNumberRealmProxyInterface {

    static final class PhoneNumberColumnInfo extends ColumnInfo {
        long numberColKey;

        PhoneNumberColumnInfo(OsSchemaInfo schemaInfo) {
            super(1);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("PhoneNumber");
            this.numberColKey = addColumnDetails("number", "number", objectSchemaInfo);
        }

        PhoneNumberColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new PhoneNumberColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final PhoneNumberColumnInfo src = (PhoneNumberColumnInfo) rawSrc;
            final PhoneNumberColumnInfo dst = (PhoneNumberColumnInfo) rawDst;
            dst.numberColKey = src.numberColKey;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private PhoneNumberColumnInfo columnInfo;
    private ProxyState<com.tech.world.model.realms.PhoneNumber> proxyState;

    com_tech_world_model_realms_PhoneNumberRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (PhoneNumberColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.tech.world.model.realms.PhoneNumber>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$number() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.numberColKey);
    }

    @Override
    public void realmSet$number(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.numberColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.numberColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.numberColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.numberColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("PhoneNumber", false, 1, 0);
        builder.addPersistedProperty("number", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static PhoneNumberColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new PhoneNumberColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "PhoneNumber";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "PhoneNumber";
    }

    @SuppressWarnings("cast")
    public static com.tech.world.model.realms.PhoneNumber createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.tech.world.model.realms.PhoneNumber obj = realm.createObjectInternal(com.tech.world.model.realms.PhoneNumber.class, true, excludeFields);

        final com_tech_world_model_realms_PhoneNumberRealmProxyInterface objProxy = (com_tech_world_model_realms_PhoneNumberRealmProxyInterface) obj;
        if (json.has("number")) {
            if (json.isNull("number")) {
                objProxy.realmSet$number(null);
            } else {
                objProxy.realmSet$number((String) json.getString("number"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.tech.world.model.realms.PhoneNumber createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final com.tech.world.model.realms.PhoneNumber obj = new com.tech.world.model.realms.PhoneNumber();
        final com_tech_world_model_realms_PhoneNumberRealmProxyInterface objProxy = (com_tech_world_model_realms_PhoneNumberRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("number")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$number((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$number(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    static com_tech_world_model_realms_PhoneNumberRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.tech.world.model.realms.PhoneNumber.class), false, Collections.<String>emptyList());
        io.realm.com_tech_world_model_realms_PhoneNumberRealmProxy obj = new io.realm.com_tech_world_model_realms_PhoneNumberRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.tech.world.model.realms.PhoneNumber copyOrUpdate(Realm realm, PhoneNumberColumnInfo columnInfo, com.tech.world.model.realms.PhoneNumber object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.tech.world.model.realms.PhoneNumber) cachedRealmObject;
        }

        return copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.tech.world.model.realms.PhoneNumber copy(Realm realm, PhoneNumberColumnInfo columnInfo, com.tech.world.model.realms.PhoneNumber newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.tech.world.model.realms.PhoneNumber) cachedRealmObject;
        }

        com_tech_world_model_realms_PhoneNumberRealmProxyInterface unmanagedSource = (com_tech_world_model_realms_PhoneNumberRealmProxyInterface) newObject;

        Table table = realm.getTable(com.tech.world.model.realms.PhoneNumber.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.numberColKey, unmanagedSource.realmGet$number());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_tech_world_model_realms_PhoneNumberRealmProxy managedCopy = newProxyInstance(realm, row);
        cache.put(newObject, managedCopy);

        return managedCopy;
    }

    public static long insert(Realm realm, com.tech.world.model.realms.PhoneNumber object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.tech.world.model.realms.PhoneNumber.class);
        long tableNativePtr = table.getNativePtr();
        PhoneNumberColumnInfo columnInfo = (PhoneNumberColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.PhoneNumber.class);
        long objKey = OsObject.createRow(table);
        cache.put(object, objKey);
        String realmGet$number = ((com_tech_world_model_realms_PhoneNumberRealmProxyInterface) object).realmGet$number();
        if (realmGet$number != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.numberColKey, objKey, realmGet$number, false);
        }
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.tech.world.model.realms.PhoneNumber.class);
        long tableNativePtr = table.getNativePtr();
        PhoneNumberColumnInfo columnInfo = (PhoneNumberColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.PhoneNumber.class);
        com.tech.world.model.realms.PhoneNumber object = null;
        while (objects.hasNext()) {
            object = (com.tech.world.model.realms.PhoneNumber) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = OsObject.createRow(table);
            cache.put(object, objKey);
            String realmGet$number = ((com_tech_world_model_realms_PhoneNumberRealmProxyInterface) object).realmGet$number();
            if (realmGet$number != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.numberColKey, objKey, realmGet$number, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.tech.world.model.realms.PhoneNumber object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.tech.world.model.realms.PhoneNumber.class);
        long tableNativePtr = table.getNativePtr();
        PhoneNumberColumnInfo columnInfo = (PhoneNumberColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.PhoneNumber.class);
        long objKey = OsObject.createRow(table);
        cache.put(object, objKey);
        String realmGet$number = ((com_tech_world_model_realms_PhoneNumberRealmProxyInterface) object).realmGet$number();
        if (realmGet$number != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.numberColKey, objKey, realmGet$number, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.numberColKey, objKey, false);
        }
        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.tech.world.model.realms.PhoneNumber.class);
        long tableNativePtr = table.getNativePtr();
        PhoneNumberColumnInfo columnInfo = (PhoneNumberColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.PhoneNumber.class);
        com.tech.world.model.realms.PhoneNumber object = null;
        while (objects.hasNext()) {
            object = (com.tech.world.model.realms.PhoneNumber) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = OsObject.createRow(table);
            cache.put(object, objKey);
            String realmGet$number = ((com_tech_world_model_realms_PhoneNumberRealmProxyInterface) object).realmGet$number();
            if (realmGet$number != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.numberColKey, objKey, realmGet$number, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.numberColKey, objKey, false);
            }
        }
    }

    public static com.tech.world.model.realms.PhoneNumber createDetachedCopy(com.tech.world.model.realms.PhoneNumber realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.tech.world.model.realms.PhoneNumber unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.tech.world.model.realms.PhoneNumber();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.tech.world.model.realms.PhoneNumber) cachedObject.object;
            }
            unmanagedObject = (com.tech.world.model.realms.PhoneNumber) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_tech_world_model_realms_PhoneNumberRealmProxyInterface unmanagedCopy = (com_tech_world_model_realms_PhoneNumberRealmProxyInterface) unmanagedObject;
        com_tech_world_model_realms_PhoneNumberRealmProxyInterface realmSource = (com_tech_world_model_realms_PhoneNumberRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$number(realmSource.realmGet$number());

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("PhoneNumber = proxy[");
        stringBuilder.append("{number:");
        stringBuilder.append(realmGet$number() != null ? realmGet$number() : "null");
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
