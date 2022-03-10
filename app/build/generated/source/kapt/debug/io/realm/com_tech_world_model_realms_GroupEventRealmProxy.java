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
public class com_tech_world_model_realms_GroupEventRealmProxy extends com.tech.world.model.realms.GroupEvent
    implements RealmObjectProxy, com_tech_world_model_realms_GroupEventRealmProxyInterface {

    static final class GroupEventColumnInfo extends ColumnInfo {
        long contextStartColKey;
        long eventTypeColKey;
        long contextEndColKey;
        long timestampColKey;
        long eventIdColKey;

        GroupEventColumnInfo(OsSchemaInfo schemaInfo) {
            super(5);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("GroupEvent");
            this.contextStartColKey = addColumnDetails("contextStart", "contextStart", objectSchemaInfo);
            this.eventTypeColKey = addColumnDetails("eventType", "eventType", objectSchemaInfo);
            this.contextEndColKey = addColumnDetails("contextEnd", "contextEnd", objectSchemaInfo);
            this.timestampColKey = addColumnDetails("timestamp", "timestamp", objectSchemaInfo);
            this.eventIdColKey = addColumnDetails("eventId", "eventId", objectSchemaInfo);
        }

        GroupEventColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new GroupEventColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final GroupEventColumnInfo src = (GroupEventColumnInfo) rawSrc;
            final GroupEventColumnInfo dst = (GroupEventColumnInfo) rawDst;
            dst.contextStartColKey = src.contextStartColKey;
            dst.eventTypeColKey = src.eventTypeColKey;
            dst.contextEndColKey = src.contextEndColKey;
            dst.timestampColKey = src.timestampColKey;
            dst.eventIdColKey = src.eventIdColKey;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private GroupEventColumnInfo columnInfo;
    private ProxyState<com.tech.world.model.realms.GroupEvent> proxyState;

    com_tech_world_model_realms_GroupEventRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (GroupEventColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.tech.world.model.realms.GroupEvent>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$contextStart() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.contextStartColKey);
    }

    @Override
    public void realmSet$contextStart(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.contextStartColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.contextStartColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.contextStartColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.contextStartColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$eventType() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.eventTypeColKey);
    }

    @Override
    public void realmSet$eventType(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.eventTypeColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.eventTypeColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$contextEnd() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.contextEndColKey);
    }

    @Override
    public void realmSet$contextEnd(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.contextEndColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.contextEndColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.contextEndColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.contextEndColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$timestamp() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.timestampColKey);
    }

    @Override
    public void realmSet$timestamp(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.timestampColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.timestampColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.timestampColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.timestampColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$eventId() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.eventIdColKey);
    }

    @Override
    public void realmSet$eventId(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.eventIdColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.eventIdColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.eventIdColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.eventIdColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("GroupEvent", false, 5, 0);
        builder.addPersistedProperty("contextStart", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("eventType", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("contextEnd", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("timestamp", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("eventId", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static GroupEventColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new GroupEventColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "GroupEvent";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "GroupEvent";
    }

    @SuppressWarnings("cast")
    public static com.tech.world.model.realms.GroupEvent createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.tech.world.model.realms.GroupEvent obj = realm.createObjectInternal(com.tech.world.model.realms.GroupEvent.class, true, excludeFields);

        final com_tech_world_model_realms_GroupEventRealmProxyInterface objProxy = (com_tech_world_model_realms_GroupEventRealmProxyInterface) obj;
        if (json.has("contextStart")) {
            if (json.isNull("contextStart")) {
                objProxy.realmSet$contextStart(null);
            } else {
                objProxy.realmSet$contextStart((String) json.getString("contextStart"));
            }
        }
        if (json.has("eventType")) {
            if (json.isNull("eventType")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'eventType' to null.");
            } else {
                objProxy.realmSet$eventType((int) json.getInt("eventType"));
            }
        }
        if (json.has("contextEnd")) {
            if (json.isNull("contextEnd")) {
                objProxy.realmSet$contextEnd(null);
            } else {
                objProxy.realmSet$contextEnd((String) json.getString("contextEnd"));
            }
        }
        if (json.has("timestamp")) {
            if (json.isNull("timestamp")) {
                objProxy.realmSet$timestamp(null);
            } else {
                objProxy.realmSet$timestamp((String) json.getString("timestamp"));
            }
        }
        if (json.has("eventId")) {
            if (json.isNull("eventId")) {
                objProxy.realmSet$eventId(null);
            } else {
                objProxy.realmSet$eventId((String) json.getString("eventId"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.tech.world.model.realms.GroupEvent createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final com.tech.world.model.realms.GroupEvent obj = new com.tech.world.model.realms.GroupEvent();
        final com_tech_world_model_realms_GroupEventRealmProxyInterface objProxy = (com_tech_world_model_realms_GroupEventRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("contextStart")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$contextStart((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$contextStart(null);
                }
            } else if (name.equals("eventType")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$eventType((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'eventType' to null.");
                }
            } else if (name.equals("contextEnd")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$contextEnd((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$contextEnd(null);
                }
            } else if (name.equals("timestamp")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$timestamp((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$timestamp(null);
                }
            } else if (name.equals("eventId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$eventId((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$eventId(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    static com_tech_world_model_realms_GroupEventRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.tech.world.model.realms.GroupEvent.class), false, Collections.<String>emptyList());
        io.realm.com_tech_world_model_realms_GroupEventRealmProxy obj = new io.realm.com_tech_world_model_realms_GroupEventRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.tech.world.model.realms.GroupEvent copyOrUpdate(Realm realm, GroupEventColumnInfo columnInfo, com.tech.world.model.realms.GroupEvent object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.tech.world.model.realms.GroupEvent) cachedRealmObject;
        }

        return copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.tech.world.model.realms.GroupEvent copy(Realm realm, GroupEventColumnInfo columnInfo, com.tech.world.model.realms.GroupEvent newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.tech.world.model.realms.GroupEvent) cachedRealmObject;
        }

        com_tech_world_model_realms_GroupEventRealmProxyInterface unmanagedSource = (com_tech_world_model_realms_GroupEventRealmProxyInterface) newObject;

        Table table = realm.getTable(com.tech.world.model.realms.GroupEvent.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.contextStartColKey, unmanagedSource.realmGet$contextStart());
        builder.addInteger(columnInfo.eventTypeColKey, unmanagedSource.realmGet$eventType());
        builder.addString(columnInfo.contextEndColKey, unmanagedSource.realmGet$contextEnd());
        builder.addString(columnInfo.timestampColKey, unmanagedSource.realmGet$timestamp());
        builder.addString(columnInfo.eventIdColKey, unmanagedSource.realmGet$eventId());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_tech_world_model_realms_GroupEventRealmProxy managedCopy = newProxyInstance(realm, row);
        cache.put(newObject, managedCopy);

        return managedCopy;
    }

    public static long insert(Realm realm, com.tech.world.model.realms.GroupEvent object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.tech.world.model.realms.GroupEvent.class);
        long tableNativePtr = table.getNativePtr();
        GroupEventColumnInfo columnInfo = (GroupEventColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.GroupEvent.class);
        long objKey = OsObject.createRow(table);
        cache.put(object, objKey);
        String realmGet$contextStart = ((com_tech_world_model_realms_GroupEventRealmProxyInterface) object).realmGet$contextStart();
        if (realmGet$contextStart != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.contextStartColKey, objKey, realmGet$contextStart, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.eventTypeColKey, objKey, ((com_tech_world_model_realms_GroupEventRealmProxyInterface) object).realmGet$eventType(), false);
        String realmGet$contextEnd = ((com_tech_world_model_realms_GroupEventRealmProxyInterface) object).realmGet$contextEnd();
        if (realmGet$contextEnd != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.contextEndColKey, objKey, realmGet$contextEnd, false);
        }
        String realmGet$timestamp = ((com_tech_world_model_realms_GroupEventRealmProxyInterface) object).realmGet$timestamp();
        if (realmGet$timestamp != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.timestampColKey, objKey, realmGet$timestamp, false);
        }
        String realmGet$eventId = ((com_tech_world_model_realms_GroupEventRealmProxyInterface) object).realmGet$eventId();
        if (realmGet$eventId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.eventIdColKey, objKey, realmGet$eventId, false);
        }
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.tech.world.model.realms.GroupEvent.class);
        long tableNativePtr = table.getNativePtr();
        GroupEventColumnInfo columnInfo = (GroupEventColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.GroupEvent.class);
        com.tech.world.model.realms.GroupEvent object = null;
        while (objects.hasNext()) {
            object = (com.tech.world.model.realms.GroupEvent) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = OsObject.createRow(table);
            cache.put(object, objKey);
            String realmGet$contextStart = ((com_tech_world_model_realms_GroupEventRealmProxyInterface) object).realmGet$contextStart();
            if (realmGet$contextStart != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.contextStartColKey, objKey, realmGet$contextStart, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.eventTypeColKey, objKey, ((com_tech_world_model_realms_GroupEventRealmProxyInterface) object).realmGet$eventType(), false);
            String realmGet$contextEnd = ((com_tech_world_model_realms_GroupEventRealmProxyInterface) object).realmGet$contextEnd();
            if (realmGet$contextEnd != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.contextEndColKey, objKey, realmGet$contextEnd, false);
            }
            String realmGet$timestamp = ((com_tech_world_model_realms_GroupEventRealmProxyInterface) object).realmGet$timestamp();
            if (realmGet$timestamp != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.timestampColKey, objKey, realmGet$timestamp, false);
            }
            String realmGet$eventId = ((com_tech_world_model_realms_GroupEventRealmProxyInterface) object).realmGet$eventId();
            if (realmGet$eventId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.eventIdColKey, objKey, realmGet$eventId, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.tech.world.model.realms.GroupEvent object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.tech.world.model.realms.GroupEvent.class);
        long tableNativePtr = table.getNativePtr();
        GroupEventColumnInfo columnInfo = (GroupEventColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.GroupEvent.class);
        long objKey = OsObject.createRow(table);
        cache.put(object, objKey);
        String realmGet$contextStart = ((com_tech_world_model_realms_GroupEventRealmProxyInterface) object).realmGet$contextStart();
        if (realmGet$contextStart != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.contextStartColKey, objKey, realmGet$contextStart, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.contextStartColKey, objKey, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.eventTypeColKey, objKey, ((com_tech_world_model_realms_GroupEventRealmProxyInterface) object).realmGet$eventType(), false);
        String realmGet$contextEnd = ((com_tech_world_model_realms_GroupEventRealmProxyInterface) object).realmGet$contextEnd();
        if (realmGet$contextEnd != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.contextEndColKey, objKey, realmGet$contextEnd, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.contextEndColKey, objKey, false);
        }
        String realmGet$timestamp = ((com_tech_world_model_realms_GroupEventRealmProxyInterface) object).realmGet$timestamp();
        if (realmGet$timestamp != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.timestampColKey, objKey, realmGet$timestamp, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.timestampColKey, objKey, false);
        }
        String realmGet$eventId = ((com_tech_world_model_realms_GroupEventRealmProxyInterface) object).realmGet$eventId();
        if (realmGet$eventId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.eventIdColKey, objKey, realmGet$eventId, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.eventIdColKey, objKey, false);
        }
        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.tech.world.model.realms.GroupEvent.class);
        long tableNativePtr = table.getNativePtr();
        GroupEventColumnInfo columnInfo = (GroupEventColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.GroupEvent.class);
        com.tech.world.model.realms.GroupEvent object = null;
        while (objects.hasNext()) {
            object = (com.tech.world.model.realms.GroupEvent) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = OsObject.createRow(table);
            cache.put(object, objKey);
            String realmGet$contextStart = ((com_tech_world_model_realms_GroupEventRealmProxyInterface) object).realmGet$contextStart();
            if (realmGet$contextStart != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.contextStartColKey, objKey, realmGet$contextStart, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.contextStartColKey, objKey, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.eventTypeColKey, objKey, ((com_tech_world_model_realms_GroupEventRealmProxyInterface) object).realmGet$eventType(), false);
            String realmGet$contextEnd = ((com_tech_world_model_realms_GroupEventRealmProxyInterface) object).realmGet$contextEnd();
            if (realmGet$contextEnd != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.contextEndColKey, objKey, realmGet$contextEnd, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.contextEndColKey, objKey, false);
            }
            String realmGet$timestamp = ((com_tech_world_model_realms_GroupEventRealmProxyInterface) object).realmGet$timestamp();
            if (realmGet$timestamp != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.timestampColKey, objKey, realmGet$timestamp, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.timestampColKey, objKey, false);
            }
            String realmGet$eventId = ((com_tech_world_model_realms_GroupEventRealmProxyInterface) object).realmGet$eventId();
            if (realmGet$eventId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.eventIdColKey, objKey, realmGet$eventId, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.eventIdColKey, objKey, false);
            }
        }
    }

    public static com.tech.world.model.realms.GroupEvent createDetachedCopy(com.tech.world.model.realms.GroupEvent realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.tech.world.model.realms.GroupEvent unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.tech.world.model.realms.GroupEvent();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.tech.world.model.realms.GroupEvent) cachedObject.object;
            }
            unmanagedObject = (com.tech.world.model.realms.GroupEvent) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_tech_world_model_realms_GroupEventRealmProxyInterface unmanagedCopy = (com_tech_world_model_realms_GroupEventRealmProxyInterface) unmanagedObject;
        com_tech_world_model_realms_GroupEventRealmProxyInterface realmSource = (com_tech_world_model_realms_GroupEventRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$contextStart(realmSource.realmGet$contextStart());
        unmanagedCopy.realmSet$eventType(realmSource.realmGet$eventType());
        unmanagedCopy.realmSet$contextEnd(realmSource.realmGet$contextEnd());
        unmanagedCopy.realmSet$timestamp(realmSource.realmGet$timestamp());
        unmanagedCopy.realmSet$eventId(realmSource.realmGet$eventId());

        return unmanagedObject;
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
        com_tech_world_model_realms_GroupEventRealmProxy aGroupEvent = (com_tech_world_model_realms_GroupEventRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aGroupEvent.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aGroupEvent.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aGroupEvent.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
