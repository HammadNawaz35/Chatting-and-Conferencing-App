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
public class com_tech_world_model_realms_PendingGroupJobRealmProxy extends com.tech.world.model.realms.PendingGroupJob
    implements RealmObjectProxy, com_tech_world_model_realms_PendingGroupJobRealmProxyInterface {

    static final class PendingGroupJobColumnInfo extends ColumnInfo {
        long groupIdColKey;
        long typeColKey;
        long groupEventColKey;

        PendingGroupJobColumnInfo(OsSchemaInfo schemaInfo) {
            super(3);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("PendingGroupJob");
            this.groupIdColKey = addColumnDetails("groupId", "groupId", objectSchemaInfo);
            this.typeColKey = addColumnDetails("type", "type", objectSchemaInfo);
            this.groupEventColKey = addColumnDetails("groupEvent", "groupEvent", objectSchemaInfo);
        }

        PendingGroupJobColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new PendingGroupJobColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final PendingGroupJobColumnInfo src = (PendingGroupJobColumnInfo) rawSrc;
            final PendingGroupJobColumnInfo dst = (PendingGroupJobColumnInfo) rawDst;
            dst.groupIdColKey = src.groupIdColKey;
            dst.typeColKey = src.typeColKey;
            dst.groupEventColKey = src.groupEventColKey;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private PendingGroupJobColumnInfo columnInfo;
    private ProxyState<com.tech.world.model.realms.PendingGroupJob> proxyState;

    com_tech_world_model_realms_PendingGroupJobRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (PendingGroupJobColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.tech.world.model.realms.PendingGroupJob>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$groupId() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.groupIdColKey);
    }

    @Override
    public void realmSet$groupId(String value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'groupId' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$type() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.typeColKey);
    }

    @Override
    public void realmSet$type(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.typeColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.typeColKey, value);
    }

    @Override
    public com.tech.world.model.realms.GroupEvent realmGet$groupEvent() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNullLink(columnInfo.groupEventColKey)) {
            return null;
        }
        return proxyState.getRealm$realm().get(com.tech.world.model.realms.GroupEvent.class, proxyState.getRow$realm().getLink(columnInfo.groupEventColKey), false, Collections.<String>emptyList());
    }

    @Override
    public void realmSet$groupEvent(com.tech.world.model.realms.GroupEvent value) {
        Realm realm = (Realm) proxyState.getRealm$realm();
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("groupEvent")) {
                return;
            }
            if (value != null && !RealmObject.isManaged(value)) {
                value = realm.copyToRealm(value);
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                // Table#nullifyLink() does not support default value. Just using Row.
                row.nullifyLink(columnInfo.groupEventColKey);
                return;
            }
            proxyState.checkValidObject(value);
            row.getTable().setLink(columnInfo.groupEventColKey, row.getObjectKey(), ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getObjectKey(), true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().nullifyLink(columnInfo.groupEventColKey);
            return;
        }
        proxyState.checkValidObject(value);
        proxyState.getRow$realm().setLink(columnInfo.groupEventColKey, ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getObjectKey());
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("PendingGroupJob", false, 3, 0);
        builder.addPersistedProperty("groupId", RealmFieldType.STRING, Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("type", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedLinkProperty("groupEvent", RealmFieldType.OBJECT, "GroupEvent");
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static PendingGroupJobColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new PendingGroupJobColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "PendingGroupJob";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "PendingGroupJob";
    }

    @SuppressWarnings("cast")
    public static com.tech.world.model.realms.PendingGroupJob createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(1);
        com.tech.world.model.realms.PendingGroupJob obj = null;
        if (update) {
            Table table = realm.getTable(com.tech.world.model.realms.PendingGroupJob.class);
            PendingGroupJobColumnInfo columnInfo = (PendingGroupJobColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.PendingGroupJob.class);
            long pkColumnKey = columnInfo.groupIdColKey;
            long objKey = Table.NO_MATCH;
            if (json.isNull("groupId")) {
                objKey = table.findFirstNull(pkColumnKey);
            } else {
                objKey = table.findFirstString(pkColumnKey, json.getString("groupId"));
            }
            if (objKey != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), realm.getSchema().getColumnInfo(com.tech.world.model.realms.PendingGroupJob.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_tech_world_model_realms_PendingGroupJobRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("groupEvent")) {
                excludeFields.add("groupEvent");
            }
            if (json.has("groupId")) {
                if (json.isNull("groupId")) {
                    obj = (io.realm.com_tech_world_model_realms_PendingGroupJobRealmProxy) realm.createObjectInternal(com.tech.world.model.realms.PendingGroupJob.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_tech_world_model_realms_PendingGroupJobRealmProxy) realm.createObjectInternal(com.tech.world.model.realms.PendingGroupJob.class, json.getString("groupId"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'groupId'.");
            }
        }

        final com_tech_world_model_realms_PendingGroupJobRealmProxyInterface objProxy = (com_tech_world_model_realms_PendingGroupJobRealmProxyInterface) obj;
        if (json.has("type")) {
            if (json.isNull("type")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'type' to null.");
            } else {
                objProxy.realmSet$type((int) json.getInt("type"));
            }
        }
        if (json.has("groupEvent")) {
            if (json.isNull("groupEvent")) {
                objProxy.realmSet$groupEvent(null);
            } else {
                com.tech.world.model.realms.GroupEvent groupEventObj = com_tech_world_model_realms_GroupEventRealmProxy.createOrUpdateUsingJsonObject(realm, json.getJSONObject("groupEvent"), update);
                objProxy.realmSet$groupEvent(groupEventObj);
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.tech.world.model.realms.PendingGroupJob createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.tech.world.model.realms.PendingGroupJob obj = new com.tech.world.model.realms.PendingGroupJob();
        final com_tech_world_model_realms_PendingGroupJobRealmProxyInterface objProxy = (com_tech_world_model_realms_PendingGroupJobRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("groupId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$groupId((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$groupId(null);
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("type")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$type((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'type' to null.");
                }
            } else if (name.equals("groupEvent")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$groupEvent(null);
                } else {
                    com.tech.world.model.realms.GroupEvent groupEventObj = com_tech_world_model_realms_GroupEventRealmProxy.createUsingJsonStream(realm, reader);
                    objProxy.realmSet$groupEvent(groupEventObj);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'groupId'.");
        }
        return realm.copyToRealm(obj);
    }

    static com_tech_world_model_realms_PendingGroupJobRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.tech.world.model.realms.PendingGroupJob.class), false, Collections.<String>emptyList());
        io.realm.com_tech_world_model_realms_PendingGroupJobRealmProxy obj = new io.realm.com_tech_world_model_realms_PendingGroupJobRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.tech.world.model.realms.PendingGroupJob copyOrUpdate(Realm realm, PendingGroupJobColumnInfo columnInfo, com.tech.world.model.realms.PendingGroupJob object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.tech.world.model.realms.PendingGroupJob) cachedRealmObject;
        }

        com.tech.world.model.realms.PendingGroupJob realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.tech.world.model.realms.PendingGroupJob.class);
            long pkColumnKey = columnInfo.groupIdColKey;
            String value = ((com_tech_world_model_realms_PendingGroupJobRealmProxyInterface) object).realmGet$groupId();
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
                    realmObject = new io.realm.com_tech_world_model_realms_PendingGroupJobRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.tech.world.model.realms.PendingGroupJob copy(Realm realm, PendingGroupJobColumnInfo columnInfo, com.tech.world.model.realms.PendingGroupJob newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.tech.world.model.realms.PendingGroupJob) cachedRealmObject;
        }

        com_tech_world_model_realms_PendingGroupJobRealmProxyInterface unmanagedSource = (com_tech_world_model_realms_PendingGroupJobRealmProxyInterface) newObject;

        Table table = realm.getTable(com.tech.world.model.realms.PendingGroupJob.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.groupIdColKey, unmanagedSource.realmGet$groupId());
        builder.addInteger(columnInfo.typeColKey, unmanagedSource.realmGet$type());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_tech_world_model_realms_PendingGroupJobRealmProxy managedCopy = newProxyInstance(realm, row);
        cache.put(newObject, managedCopy);

        // Finally add all fields that reference other Realm Objects, either directly or through a list
        com.tech.world.model.realms.GroupEvent groupEventObj = unmanagedSource.realmGet$groupEvent();
        if (groupEventObj == null) {
            managedCopy.realmSet$groupEvent(null);
        } else {
            com.tech.world.model.realms.GroupEvent cachegroupEvent = (com.tech.world.model.realms.GroupEvent) cache.get(groupEventObj);
            if (cachegroupEvent != null) {
                managedCopy.realmSet$groupEvent(cachegroupEvent);
            } else {
                managedCopy.realmSet$groupEvent(com_tech_world_model_realms_GroupEventRealmProxy.copyOrUpdate(realm, (com_tech_world_model_realms_GroupEventRealmProxy.GroupEventColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.GroupEvent.class), groupEventObj, update, cache, flags));
            }
        }

        return managedCopy;
    }

    public static long insert(Realm realm, com.tech.world.model.realms.PendingGroupJob object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.tech.world.model.realms.PendingGroupJob.class);
        long tableNativePtr = table.getNativePtr();
        PendingGroupJobColumnInfo columnInfo = (PendingGroupJobColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.PendingGroupJob.class);
        long pkColumnKey = columnInfo.groupIdColKey;
        String primaryKeyValue = ((com_tech_world_model_realms_PendingGroupJobRealmProxyInterface) object).realmGet$groupId();
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
        Table.nativeSetLong(tableNativePtr, columnInfo.typeColKey, objKey, ((com_tech_world_model_realms_PendingGroupJobRealmProxyInterface) object).realmGet$type(), false);

        com.tech.world.model.realms.GroupEvent groupEventObj = ((com_tech_world_model_realms_PendingGroupJobRealmProxyInterface) object).realmGet$groupEvent();
        if (groupEventObj != null) {
            Long cachegroupEvent = cache.get(groupEventObj);
            if (cachegroupEvent == null) {
                cachegroupEvent = com_tech_world_model_realms_GroupEventRealmProxy.insert(realm, groupEventObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.groupEventColKey, objKey, cachegroupEvent, false);
        }
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.tech.world.model.realms.PendingGroupJob.class);
        long tableNativePtr = table.getNativePtr();
        PendingGroupJobColumnInfo columnInfo = (PendingGroupJobColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.PendingGroupJob.class);
        long pkColumnKey = columnInfo.groupIdColKey;
        com.tech.world.model.realms.PendingGroupJob object = null;
        while (objects.hasNext()) {
            object = (com.tech.world.model.realms.PendingGroupJob) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            String primaryKeyValue = ((com_tech_world_model_realms_PendingGroupJobRealmProxyInterface) object).realmGet$groupId();
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
            Table.nativeSetLong(tableNativePtr, columnInfo.typeColKey, objKey, ((com_tech_world_model_realms_PendingGroupJobRealmProxyInterface) object).realmGet$type(), false);

            com.tech.world.model.realms.GroupEvent groupEventObj = ((com_tech_world_model_realms_PendingGroupJobRealmProxyInterface) object).realmGet$groupEvent();
            if (groupEventObj != null) {
                Long cachegroupEvent = cache.get(groupEventObj);
                if (cachegroupEvent == null) {
                    cachegroupEvent = com_tech_world_model_realms_GroupEventRealmProxy.insert(realm, groupEventObj, cache);
                }
                table.setLink(columnInfo.groupEventColKey, objKey, cachegroupEvent, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.tech.world.model.realms.PendingGroupJob object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.tech.world.model.realms.PendingGroupJob.class);
        long tableNativePtr = table.getNativePtr();
        PendingGroupJobColumnInfo columnInfo = (PendingGroupJobColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.PendingGroupJob.class);
        long pkColumnKey = columnInfo.groupIdColKey;
        String primaryKeyValue = ((com_tech_world_model_realms_PendingGroupJobRealmProxyInterface) object).realmGet$groupId();
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
        Table.nativeSetLong(tableNativePtr, columnInfo.typeColKey, objKey, ((com_tech_world_model_realms_PendingGroupJobRealmProxyInterface) object).realmGet$type(), false);

        com.tech.world.model.realms.GroupEvent groupEventObj = ((com_tech_world_model_realms_PendingGroupJobRealmProxyInterface) object).realmGet$groupEvent();
        if (groupEventObj != null) {
            Long cachegroupEvent = cache.get(groupEventObj);
            if (cachegroupEvent == null) {
                cachegroupEvent = com_tech_world_model_realms_GroupEventRealmProxy.insertOrUpdate(realm, groupEventObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.groupEventColKey, objKey, cachegroupEvent, false);
        } else {
            Table.nativeNullifyLink(tableNativePtr, columnInfo.groupEventColKey, objKey);
        }
        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.tech.world.model.realms.PendingGroupJob.class);
        long tableNativePtr = table.getNativePtr();
        PendingGroupJobColumnInfo columnInfo = (PendingGroupJobColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.PendingGroupJob.class);
        long pkColumnKey = columnInfo.groupIdColKey;
        com.tech.world.model.realms.PendingGroupJob object = null;
        while (objects.hasNext()) {
            object = (com.tech.world.model.realms.PendingGroupJob) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            String primaryKeyValue = ((com_tech_world_model_realms_PendingGroupJobRealmProxyInterface) object).realmGet$groupId();
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
            Table.nativeSetLong(tableNativePtr, columnInfo.typeColKey, objKey, ((com_tech_world_model_realms_PendingGroupJobRealmProxyInterface) object).realmGet$type(), false);

            com.tech.world.model.realms.GroupEvent groupEventObj = ((com_tech_world_model_realms_PendingGroupJobRealmProxyInterface) object).realmGet$groupEvent();
            if (groupEventObj != null) {
                Long cachegroupEvent = cache.get(groupEventObj);
                if (cachegroupEvent == null) {
                    cachegroupEvent = com_tech_world_model_realms_GroupEventRealmProxy.insertOrUpdate(realm, groupEventObj, cache);
                }
                Table.nativeSetLink(tableNativePtr, columnInfo.groupEventColKey, objKey, cachegroupEvent, false);
            } else {
                Table.nativeNullifyLink(tableNativePtr, columnInfo.groupEventColKey, objKey);
            }
        }
    }

    public static com.tech.world.model.realms.PendingGroupJob createDetachedCopy(com.tech.world.model.realms.PendingGroupJob realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.tech.world.model.realms.PendingGroupJob unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.tech.world.model.realms.PendingGroupJob();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.tech.world.model.realms.PendingGroupJob) cachedObject.object;
            }
            unmanagedObject = (com.tech.world.model.realms.PendingGroupJob) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_tech_world_model_realms_PendingGroupJobRealmProxyInterface unmanagedCopy = (com_tech_world_model_realms_PendingGroupJobRealmProxyInterface) unmanagedObject;
        com_tech_world_model_realms_PendingGroupJobRealmProxyInterface realmSource = (com_tech_world_model_realms_PendingGroupJobRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$groupId(realmSource.realmGet$groupId());
        unmanagedCopy.realmSet$type(realmSource.realmGet$type());

        // Deep copy of groupEvent
        unmanagedCopy.realmSet$groupEvent(com_tech_world_model_realms_GroupEventRealmProxy.createDetachedCopy(realmSource.realmGet$groupEvent(), currentDepth + 1, maxDepth, cache));

        return unmanagedObject;
    }

    static com.tech.world.model.realms.PendingGroupJob update(Realm realm, PendingGroupJobColumnInfo columnInfo, com.tech.world.model.realms.PendingGroupJob realmObject, com.tech.world.model.realms.PendingGroupJob newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_tech_world_model_realms_PendingGroupJobRealmProxyInterface realmObjectTarget = (com_tech_world_model_realms_PendingGroupJobRealmProxyInterface) realmObject;
        com_tech_world_model_realms_PendingGroupJobRealmProxyInterface realmObjectSource = (com_tech_world_model_realms_PendingGroupJobRealmProxyInterface) newObject;
        Table table = realm.getTable(com.tech.world.model.realms.PendingGroupJob.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addString(columnInfo.groupIdColKey, realmObjectSource.realmGet$groupId());
        builder.addInteger(columnInfo.typeColKey, realmObjectSource.realmGet$type());

        com.tech.world.model.realms.GroupEvent groupEventObj = realmObjectSource.realmGet$groupEvent();
        if (groupEventObj == null) {
            builder.addNull(columnInfo.groupEventColKey);
        } else {
            com.tech.world.model.realms.GroupEvent cachegroupEvent = (com.tech.world.model.realms.GroupEvent) cache.get(groupEventObj);
            if (cachegroupEvent != null) {
                builder.addObject(columnInfo.groupEventColKey, cachegroupEvent);
            } else {
                builder.addObject(columnInfo.groupEventColKey, com_tech_world_model_realms_GroupEventRealmProxy.copyOrUpdate(realm, (com_tech_world_model_realms_GroupEventRealmProxy.GroupEventColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.GroupEvent.class), groupEventObj, true, cache, flags));
            }
        }

        builder.updateExistingTopLevelObject();
        return realmObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("PendingGroupJob = proxy[");
        stringBuilder.append("{groupId:");
        stringBuilder.append(realmGet$groupId() != null ? realmGet$groupId() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{type:");
        stringBuilder.append(realmGet$type());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{groupEvent:");
        stringBuilder.append(realmGet$groupEvent() != null ? "GroupEvent" : "null");
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
        com_tech_world_model_realms_PendingGroupJobRealmProxy aPendingGroupJob = (com_tech_world_model_realms_PendingGroupJobRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aPendingGroupJob.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aPendingGroupJob.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aPendingGroupJob.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
