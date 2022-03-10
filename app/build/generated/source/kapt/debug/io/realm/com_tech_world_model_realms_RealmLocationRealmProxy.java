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
public class com_tech_world_model_realms_RealmLocationRealmProxy extends com.tech.world.model.realms.RealmLocation
    implements RealmObjectProxy, com_tech_world_model_realms_RealmLocationRealmProxyInterface {

    static final class RealmLocationColumnInfo extends ColumnInfo {
        long latColKey;
        long lngColKey;
        long addressColKey;
        long nameColKey;
        long latStrColKey;
        long lngStrColKey;

        RealmLocationColumnInfo(OsSchemaInfo schemaInfo) {
            super(6);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("RealmLocation");
            this.latColKey = addColumnDetails("lat", "lat", objectSchemaInfo);
            this.lngColKey = addColumnDetails("lng", "lng", objectSchemaInfo);
            this.addressColKey = addColumnDetails("address", "address", objectSchemaInfo);
            this.nameColKey = addColumnDetails("name", "name", objectSchemaInfo);
            this.latStrColKey = addColumnDetails("latStr", "latStr", objectSchemaInfo);
            this.lngStrColKey = addColumnDetails("lngStr", "lngStr", objectSchemaInfo);
        }

        RealmLocationColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new RealmLocationColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final RealmLocationColumnInfo src = (RealmLocationColumnInfo) rawSrc;
            final RealmLocationColumnInfo dst = (RealmLocationColumnInfo) rawDst;
            dst.latColKey = src.latColKey;
            dst.lngColKey = src.lngColKey;
            dst.addressColKey = src.addressColKey;
            dst.nameColKey = src.nameColKey;
            dst.latStrColKey = src.latStrColKey;
            dst.lngStrColKey = src.lngStrColKey;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private RealmLocationColumnInfo columnInfo;
    private ProxyState<com.tech.world.model.realms.RealmLocation> proxyState;

    com_tech_world_model_realms_RealmLocationRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (RealmLocationColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.tech.world.model.realms.RealmLocation>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public double realmGet$lat() {
        proxyState.getRealm$realm().checkIfValid();
        return (double) proxyState.getRow$realm().getDouble(columnInfo.latColKey);
    }

    @Override
    public void realmSet$lat(double value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setDouble(columnInfo.latColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setDouble(columnInfo.latColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public double realmGet$lng() {
        proxyState.getRealm$realm().checkIfValid();
        return (double) proxyState.getRow$realm().getDouble(columnInfo.lngColKey);
    }

    @Override
    public void realmSet$lng(double value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setDouble(columnInfo.lngColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setDouble(columnInfo.lngColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$address() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.addressColKey);
    }

    @Override
    public void realmSet$address(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.addressColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.addressColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.addressColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.addressColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$name() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.nameColKey);
    }

    @Override
    public void realmSet$name(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.nameColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.nameColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.nameColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.nameColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$latStr() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.latStrColKey);
    }

    @Override
    public void realmSet$latStr(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.latStrColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.latStrColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.latStrColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.latStrColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$lngStr() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.lngStrColKey);
    }

    @Override
    public void realmSet$lngStr(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.lngStrColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.lngStrColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.lngStrColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.lngStrColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("RealmLocation", false, 6, 0);
        builder.addPersistedProperty("lat", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("lng", RealmFieldType.DOUBLE, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("address", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("name", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("latStr", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("lngStr", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static RealmLocationColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new RealmLocationColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "RealmLocation";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "RealmLocation";
    }

    @SuppressWarnings("cast")
    public static com.tech.world.model.realms.RealmLocation createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.tech.world.model.realms.RealmLocation obj = realm.createObjectInternal(com.tech.world.model.realms.RealmLocation.class, true, excludeFields);

        final com_tech_world_model_realms_RealmLocationRealmProxyInterface objProxy = (com_tech_world_model_realms_RealmLocationRealmProxyInterface) obj;
        if (json.has("lat")) {
            if (json.isNull("lat")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'lat' to null.");
            } else {
                objProxy.realmSet$lat((double) json.getDouble("lat"));
            }
        }
        if (json.has("lng")) {
            if (json.isNull("lng")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'lng' to null.");
            } else {
                objProxy.realmSet$lng((double) json.getDouble("lng"));
            }
        }
        if (json.has("address")) {
            if (json.isNull("address")) {
                objProxy.realmSet$address(null);
            } else {
                objProxy.realmSet$address((String) json.getString("address"));
            }
        }
        if (json.has("name")) {
            if (json.isNull("name")) {
                objProxy.realmSet$name(null);
            } else {
                objProxy.realmSet$name((String) json.getString("name"));
            }
        }
        if (json.has("latStr")) {
            if (json.isNull("latStr")) {
                objProxy.realmSet$latStr(null);
            } else {
                objProxy.realmSet$latStr((String) json.getString("latStr"));
            }
        }
        if (json.has("lngStr")) {
            if (json.isNull("lngStr")) {
                objProxy.realmSet$lngStr(null);
            } else {
                objProxy.realmSet$lngStr((String) json.getString("lngStr"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.tech.world.model.realms.RealmLocation createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final com.tech.world.model.realms.RealmLocation obj = new com.tech.world.model.realms.RealmLocation();
        final com_tech_world_model_realms_RealmLocationRealmProxyInterface objProxy = (com_tech_world_model_realms_RealmLocationRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("lat")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$lat((double) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'lat' to null.");
                }
            } else if (name.equals("lng")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$lng((double) reader.nextDouble());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'lng' to null.");
                }
            } else if (name.equals("address")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$address((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$address(null);
                }
            } else if (name.equals("name")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$name((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$name(null);
                }
            } else if (name.equals("latStr")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$latStr((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$latStr(null);
                }
            } else if (name.equals("lngStr")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$lngStr((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$lngStr(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    static com_tech_world_model_realms_RealmLocationRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.tech.world.model.realms.RealmLocation.class), false, Collections.<String>emptyList());
        io.realm.com_tech_world_model_realms_RealmLocationRealmProxy obj = new io.realm.com_tech_world_model_realms_RealmLocationRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.tech.world.model.realms.RealmLocation copyOrUpdate(Realm realm, RealmLocationColumnInfo columnInfo, com.tech.world.model.realms.RealmLocation object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.tech.world.model.realms.RealmLocation) cachedRealmObject;
        }

        return copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.tech.world.model.realms.RealmLocation copy(Realm realm, RealmLocationColumnInfo columnInfo, com.tech.world.model.realms.RealmLocation newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.tech.world.model.realms.RealmLocation) cachedRealmObject;
        }

        com_tech_world_model_realms_RealmLocationRealmProxyInterface unmanagedSource = (com_tech_world_model_realms_RealmLocationRealmProxyInterface) newObject;

        Table table = realm.getTable(com.tech.world.model.realms.RealmLocation.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addDouble(columnInfo.latColKey, unmanagedSource.realmGet$lat());
        builder.addDouble(columnInfo.lngColKey, unmanagedSource.realmGet$lng());
        builder.addString(columnInfo.addressColKey, unmanagedSource.realmGet$address());
        builder.addString(columnInfo.nameColKey, unmanagedSource.realmGet$name());
        builder.addString(columnInfo.latStrColKey, unmanagedSource.realmGet$latStr());
        builder.addString(columnInfo.lngStrColKey, unmanagedSource.realmGet$lngStr());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_tech_world_model_realms_RealmLocationRealmProxy managedCopy = newProxyInstance(realm, row);
        cache.put(newObject, managedCopy);

        return managedCopy;
    }

    public static long insert(Realm realm, com.tech.world.model.realms.RealmLocation object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.tech.world.model.realms.RealmLocation.class);
        long tableNativePtr = table.getNativePtr();
        RealmLocationColumnInfo columnInfo = (RealmLocationColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.RealmLocation.class);
        long objKey = OsObject.createRow(table);
        cache.put(object, objKey);
        Table.nativeSetDouble(tableNativePtr, columnInfo.latColKey, objKey, ((com_tech_world_model_realms_RealmLocationRealmProxyInterface) object).realmGet$lat(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.lngColKey, objKey, ((com_tech_world_model_realms_RealmLocationRealmProxyInterface) object).realmGet$lng(), false);
        String realmGet$address = ((com_tech_world_model_realms_RealmLocationRealmProxyInterface) object).realmGet$address();
        if (realmGet$address != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.addressColKey, objKey, realmGet$address, false);
        }
        String realmGet$name = ((com_tech_world_model_realms_RealmLocationRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, objKey, realmGet$name, false);
        }
        String realmGet$latStr = ((com_tech_world_model_realms_RealmLocationRealmProxyInterface) object).realmGet$latStr();
        if (realmGet$latStr != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.latStrColKey, objKey, realmGet$latStr, false);
        }
        String realmGet$lngStr = ((com_tech_world_model_realms_RealmLocationRealmProxyInterface) object).realmGet$lngStr();
        if (realmGet$lngStr != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.lngStrColKey, objKey, realmGet$lngStr, false);
        }
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.tech.world.model.realms.RealmLocation.class);
        long tableNativePtr = table.getNativePtr();
        RealmLocationColumnInfo columnInfo = (RealmLocationColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.RealmLocation.class);
        com.tech.world.model.realms.RealmLocation object = null;
        while (objects.hasNext()) {
            object = (com.tech.world.model.realms.RealmLocation) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = OsObject.createRow(table);
            cache.put(object, objKey);
            Table.nativeSetDouble(tableNativePtr, columnInfo.latColKey, objKey, ((com_tech_world_model_realms_RealmLocationRealmProxyInterface) object).realmGet$lat(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.lngColKey, objKey, ((com_tech_world_model_realms_RealmLocationRealmProxyInterface) object).realmGet$lng(), false);
            String realmGet$address = ((com_tech_world_model_realms_RealmLocationRealmProxyInterface) object).realmGet$address();
            if (realmGet$address != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.addressColKey, objKey, realmGet$address, false);
            }
            String realmGet$name = ((com_tech_world_model_realms_RealmLocationRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, objKey, realmGet$name, false);
            }
            String realmGet$latStr = ((com_tech_world_model_realms_RealmLocationRealmProxyInterface) object).realmGet$latStr();
            if (realmGet$latStr != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.latStrColKey, objKey, realmGet$latStr, false);
            }
            String realmGet$lngStr = ((com_tech_world_model_realms_RealmLocationRealmProxyInterface) object).realmGet$lngStr();
            if (realmGet$lngStr != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.lngStrColKey, objKey, realmGet$lngStr, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.tech.world.model.realms.RealmLocation object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.tech.world.model.realms.RealmLocation.class);
        long tableNativePtr = table.getNativePtr();
        RealmLocationColumnInfo columnInfo = (RealmLocationColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.RealmLocation.class);
        long objKey = OsObject.createRow(table);
        cache.put(object, objKey);
        Table.nativeSetDouble(tableNativePtr, columnInfo.latColKey, objKey, ((com_tech_world_model_realms_RealmLocationRealmProxyInterface) object).realmGet$lat(), false);
        Table.nativeSetDouble(tableNativePtr, columnInfo.lngColKey, objKey, ((com_tech_world_model_realms_RealmLocationRealmProxyInterface) object).realmGet$lng(), false);
        String realmGet$address = ((com_tech_world_model_realms_RealmLocationRealmProxyInterface) object).realmGet$address();
        if (realmGet$address != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.addressColKey, objKey, realmGet$address, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.addressColKey, objKey, false);
        }
        String realmGet$name = ((com_tech_world_model_realms_RealmLocationRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, objKey, realmGet$name, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nameColKey, objKey, false);
        }
        String realmGet$latStr = ((com_tech_world_model_realms_RealmLocationRealmProxyInterface) object).realmGet$latStr();
        if (realmGet$latStr != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.latStrColKey, objKey, realmGet$latStr, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.latStrColKey, objKey, false);
        }
        String realmGet$lngStr = ((com_tech_world_model_realms_RealmLocationRealmProxyInterface) object).realmGet$lngStr();
        if (realmGet$lngStr != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.lngStrColKey, objKey, realmGet$lngStr, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.lngStrColKey, objKey, false);
        }
        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.tech.world.model.realms.RealmLocation.class);
        long tableNativePtr = table.getNativePtr();
        RealmLocationColumnInfo columnInfo = (RealmLocationColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.RealmLocation.class);
        com.tech.world.model.realms.RealmLocation object = null;
        while (objects.hasNext()) {
            object = (com.tech.world.model.realms.RealmLocation) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = OsObject.createRow(table);
            cache.put(object, objKey);
            Table.nativeSetDouble(tableNativePtr, columnInfo.latColKey, objKey, ((com_tech_world_model_realms_RealmLocationRealmProxyInterface) object).realmGet$lat(), false);
            Table.nativeSetDouble(tableNativePtr, columnInfo.lngColKey, objKey, ((com_tech_world_model_realms_RealmLocationRealmProxyInterface) object).realmGet$lng(), false);
            String realmGet$address = ((com_tech_world_model_realms_RealmLocationRealmProxyInterface) object).realmGet$address();
            if (realmGet$address != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.addressColKey, objKey, realmGet$address, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.addressColKey, objKey, false);
            }
            String realmGet$name = ((com_tech_world_model_realms_RealmLocationRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, objKey, realmGet$name, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nameColKey, objKey, false);
            }
            String realmGet$latStr = ((com_tech_world_model_realms_RealmLocationRealmProxyInterface) object).realmGet$latStr();
            if (realmGet$latStr != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.latStrColKey, objKey, realmGet$latStr, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.latStrColKey, objKey, false);
            }
            String realmGet$lngStr = ((com_tech_world_model_realms_RealmLocationRealmProxyInterface) object).realmGet$lngStr();
            if (realmGet$lngStr != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.lngStrColKey, objKey, realmGet$lngStr, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.lngStrColKey, objKey, false);
            }
        }
    }

    public static com.tech.world.model.realms.RealmLocation createDetachedCopy(com.tech.world.model.realms.RealmLocation realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.tech.world.model.realms.RealmLocation unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.tech.world.model.realms.RealmLocation();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.tech.world.model.realms.RealmLocation) cachedObject.object;
            }
            unmanagedObject = (com.tech.world.model.realms.RealmLocation) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_tech_world_model_realms_RealmLocationRealmProxyInterface unmanagedCopy = (com_tech_world_model_realms_RealmLocationRealmProxyInterface) unmanagedObject;
        com_tech_world_model_realms_RealmLocationRealmProxyInterface realmSource = (com_tech_world_model_realms_RealmLocationRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$lat(realmSource.realmGet$lat());
        unmanagedCopy.realmSet$lng(realmSource.realmGet$lng());
        unmanagedCopy.realmSet$address(realmSource.realmGet$address());
        unmanagedCopy.realmSet$name(realmSource.realmGet$name());
        unmanagedCopy.realmSet$latStr(realmSource.realmGet$latStr());
        unmanagedCopy.realmSet$lngStr(realmSource.realmGet$lngStr());

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("RealmLocation = proxy[");
        stringBuilder.append("{lat:");
        stringBuilder.append(realmGet$lat());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{lng:");
        stringBuilder.append(realmGet$lng());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{address:");
        stringBuilder.append(realmGet$address() != null ? realmGet$address() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{name:");
        stringBuilder.append(realmGet$name() != null ? realmGet$name() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{latStr:");
        stringBuilder.append(realmGet$latStr() != null ? realmGet$latStr() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{lngStr:");
        stringBuilder.append(realmGet$lngStr() != null ? realmGet$lngStr() : "null");
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
        com_tech_world_model_realms_RealmLocationRealmProxy aRealmLocation = (com_tech_world_model_realms_RealmLocationRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aRealmLocation.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aRealmLocation.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aRealmLocation.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
