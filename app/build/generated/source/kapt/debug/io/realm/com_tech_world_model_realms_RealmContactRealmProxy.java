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
public class com_tech_world_model_realms_RealmContactRealmProxy extends com.tech.world.model.realms.RealmContact
    implements RealmObjectProxy, com_tech_world_model_realms_RealmContactRealmProxyInterface {

    static final class RealmContactColumnInfo extends ColumnInfo {
        long nameColKey;
        long realmListColKey;
        long jsonStringColKey;

        RealmContactColumnInfo(OsSchemaInfo schemaInfo) {
            super(3);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("RealmContact");
            this.nameColKey = addColumnDetails("name", "name", objectSchemaInfo);
            this.realmListColKey = addColumnDetails("realmList", "realmList", objectSchemaInfo);
            this.jsonStringColKey = addColumnDetails("jsonString", "jsonString", objectSchemaInfo);
        }

        RealmContactColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new RealmContactColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final RealmContactColumnInfo src = (RealmContactColumnInfo) rawSrc;
            final RealmContactColumnInfo dst = (RealmContactColumnInfo) rawDst;
            dst.nameColKey = src.nameColKey;
            dst.realmListColKey = src.realmListColKey;
            dst.jsonStringColKey = src.jsonStringColKey;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private RealmContactColumnInfo columnInfo;
    private ProxyState<com.tech.world.model.realms.RealmContact> proxyState;
    private RealmList<com.tech.world.model.realms.PhoneNumber> realmListRealmList;

    com_tech_world_model_realms_RealmContactRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (RealmContactColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.tech.world.model.realms.RealmContact>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
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
    public RealmList<com.tech.world.model.realms.PhoneNumber> realmGet$realmList() {
        proxyState.getRealm$realm().checkIfValid();
        // use the cached value if available
        if (realmListRealmList != null) {
            return realmListRealmList;
        } else {
            OsList osList = proxyState.getRow$realm().getModelList(columnInfo.realmListColKey);
            realmListRealmList = new RealmList<com.tech.world.model.realms.PhoneNumber>(com.tech.world.model.realms.PhoneNumber.class, osList, proxyState.getRealm$realm());
            return realmListRealmList;
        }
    }

    @Override
    public void realmSet$realmList(RealmList<com.tech.world.model.realms.PhoneNumber> value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("realmList")) {
                return;
            }
            // if the list contains unmanaged RealmObjects, convert them to managed.
            if (value != null && !value.isManaged()) {
                final Realm realm = (Realm) proxyState.getRealm$realm();
                final RealmList<com.tech.world.model.realms.PhoneNumber> original = value;
                value = new RealmList<com.tech.world.model.realms.PhoneNumber>();
                for (com.tech.world.model.realms.PhoneNumber item : original) {
                    if (item == null || RealmObject.isManaged(item)) {
                        value.add(item);
                    } else {
                        value.add(realm.copyToRealm(item));
                    }
                }
            }
        }

        proxyState.getRealm$realm().checkIfValid();
        OsList osList = proxyState.getRow$realm().getModelList(columnInfo.realmListColKey);
        // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
        if (value != null && value.size() == osList.size()) {
            int objects = value.size();
            for (int i = 0; i < objects; i++) {
                com.tech.world.model.realms.PhoneNumber linkedObject = value.get(i);
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
                com.tech.world.model.realms.PhoneNumber linkedObject = value.get(i);
                proxyState.checkValidObject(linkedObject);
                osList.addRow(((RealmObjectProxy) linkedObject).realmGet$proxyState().getRow$realm().getObjectKey());
            }
        }
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$jsonString() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.jsonStringColKey);
    }

    @Override
    public void realmSet$jsonString(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.jsonStringColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.jsonStringColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.jsonStringColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.jsonStringColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("RealmContact", false, 3, 0);
        builder.addPersistedProperty("name", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedLinkProperty("realmList", RealmFieldType.LIST, "PhoneNumber");
        builder.addPersistedProperty("jsonString", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static RealmContactColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new RealmContactColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "RealmContact";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "RealmContact";
    }

    @SuppressWarnings("cast")
    public static com.tech.world.model.realms.RealmContact createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(1);
        if (json.has("realmList")) {
            excludeFields.add("realmList");
        }
        com.tech.world.model.realms.RealmContact obj = realm.createObjectInternal(com.tech.world.model.realms.RealmContact.class, true, excludeFields);

        final com_tech_world_model_realms_RealmContactRealmProxyInterface objProxy = (com_tech_world_model_realms_RealmContactRealmProxyInterface) obj;
        if (json.has("name")) {
            if (json.isNull("name")) {
                objProxy.realmSet$name(null);
            } else {
                objProxy.realmSet$name((String) json.getString("name"));
            }
        }
        if (json.has("realmList")) {
            if (json.isNull("realmList")) {
                objProxy.realmSet$realmList(null);
            } else {
                objProxy.realmGet$realmList().clear();
                JSONArray array = json.getJSONArray("realmList");
                for (int i = 0; i < array.length(); i++) {
                    com.tech.world.model.realms.PhoneNumber item = com_tech_world_model_realms_PhoneNumberRealmProxy.createOrUpdateUsingJsonObject(realm, array.getJSONObject(i), update);
                    objProxy.realmGet$realmList().add(item);
                }
            }
        }
        if (json.has("jsonString")) {
            if (json.isNull("jsonString")) {
                objProxy.realmSet$jsonString(null);
            } else {
                objProxy.realmSet$jsonString((String) json.getString("jsonString"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.tech.world.model.realms.RealmContact createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final com.tech.world.model.realms.RealmContact obj = new com.tech.world.model.realms.RealmContact();
        final com_tech_world_model_realms_RealmContactRealmProxyInterface objProxy = (com_tech_world_model_realms_RealmContactRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("name")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$name((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$name(null);
                }
            } else if (name.equals("realmList")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$realmList(null);
                } else {
                    objProxy.realmSet$realmList(new RealmList<com.tech.world.model.realms.PhoneNumber>());
                    reader.beginArray();
                    while (reader.hasNext()) {
                        com.tech.world.model.realms.PhoneNumber item = com_tech_world_model_realms_PhoneNumberRealmProxy.createUsingJsonStream(realm, reader);
                        objProxy.realmGet$realmList().add(item);
                    }
                    reader.endArray();
                }
            } else if (name.equals("jsonString")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$jsonString((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$jsonString(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    static com_tech_world_model_realms_RealmContactRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.tech.world.model.realms.RealmContact.class), false, Collections.<String>emptyList());
        io.realm.com_tech_world_model_realms_RealmContactRealmProxy obj = new io.realm.com_tech_world_model_realms_RealmContactRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.tech.world.model.realms.RealmContact copyOrUpdate(Realm realm, RealmContactColumnInfo columnInfo, com.tech.world.model.realms.RealmContact object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.tech.world.model.realms.RealmContact) cachedRealmObject;
        }

        return copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.tech.world.model.realms.RealmContact copy(Realm realm, RealmContactColumnInfo columnInfo, com.tech.world.model.realms.RealmContact newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.tech.world.model.realms.RealmContact) cachedRealmObject;
        }

        com_tech_world_model_realms_RealmContactRealmProxyInterface unmanagedSource = (com_tech_world_model_realms_RealmContactRealmProxyInterface) newObject;

        Table table = realm.getTable(com.tech.world.model.realms.RealmContact.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.nameColKey, unmanagedSource.realmGet$name());
        builder.addString(columnInfo.jsonStringColKey, unmanagedSource.realmGet$jsonString());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_tech_world_model_realms_RealmContactRealmProxy managedCopy = newProxyInstance(realm, row);
        cache.put(newObject, managedCopy);

        // Finally add all fields that reference other Realm Objects, either directly or through a list
        RealmList<com.tech.world.model.realms.PhoneNumber> realmListUnmanagedList = unmanagedSource.realmGet$realmList();
        if (realmListUnmanagedList != null) {
            RealmList<com.tech.world.model.realms.PhoneNumber> realmListManagedList = managedCopy.realmGet$realmList();
            realmListManagedList.clear();
            for (int i = 0; i < realmListUnmanagedList.size(); i++) {
                com.tech.world.model.realms.PhoneNumber realmListUnmanagedItem = realmListUnmanagedList.get(i);
                com.tech.world.model.realms.PhoneNumber cacherealmList = (com.tech.world.model.realms.PhoneNumber) cache.get(realmListUnmanagedItem);
                if (cacherealmList != null) {
                    realmListManagedList.add(cacherealmList);
                } else {
                    realmListManagedList.add(com_tech_world_model_realms_PhoneNumberRealmProxy.copyOrUpdate(realm, (com_tech_world_model_realms_PhoneNumberRealmProxy.PhoneNumberColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.PhoneNumber.class), realmListUnmanagedItem, update, cache, flags));
                }
            }
        }

        return managedCopy;
    }

    public static long insert(Realm realm, com.tech.world.model.realms.RealmContact object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.tech.world.model.realms.RealmContact.class);
        long tableNativePtr = table.getNativePtr();
        RealmContactColumnInfo columnInfo = (RealmContactColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.RealmContact.class);
        long objKey = OsObject.createRow(table);
        cache.put(object, objKey);
        String realmGet$name = ((com_tech_world_model_realms_RealmContactRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, objKey, realmGet$name, false);
        }

        RealmList<com.tech.world.model.realms.PhoneNumber> realmListList = ((com_tech_world_model_realms_RealmContactRealmProxyInterface) object).realmGet$realmList();
        if (realmListList != null) {
            OsList realmListOsList = new OsList(table.getUncheckedRow(objKey), columnInfo.realmListColKey);
            for (com.tech.world.model.realms.PhoneNumber realmListItem : realmListList) {
                Long cacheItemIndexrealmList = cache.get(realmListItem);
                if (cacheItemIndexrealmList == null) {
                    cacheItemIndexrealmList = com_tech_world_model_realms_PhoneNumberRealmProxy.insert(realm, realmListItem, cache);
                }
                realmListOsList.addRow(cacheItemIndexrealmList);
            }
        }
        String realmGet$jsonString = ((com_tech_world_model_realms_RealmContactRealmProxyInterface) object).realmGet$jsonString();
        if (realmGet$jsonString != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.jsonStringColKey, objKey, realmGet$jsonString, false);
        }
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.tech.world.model.realms.RealmContact.class);
        long tableNativePtr = table.getNativePtr();
        RealmContactColumnInfo columnInfo = (RealmContactColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.RealmContact.class);
        com.tech.world.model.realms.RealmContact object = null;
        while (objects.hasNext()) {
            object = (com.tech.world.model.realms.RealmContact) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = OsObject.createRow(table);
            cache.put(object, objKey);
            String realmGet$name = ((com_tech_world_model_realms_RealmContactRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, objKey, realmGet$name, false);
            }

            RealmList<com.tech.world.model.realms.PhoneNumber> realmListList = ((com_tech_world_model_realms_RealmContactRealmProxyInterface) object).realmGet$realmList();
            if (realmListList != null) {
                OsList realmListOsList = new OsList(table.getUncheckedRow(objKey), columnInfo.realmListColKey);
                for (com.tech.world.model.realms.PhoneNumber realmListItem : realmListList) {
                    Long cacheItemIndexrealmList = cache.get(realmListItem);
                    if (cacheItemIndexrealmList == null) {
                        cacheItemIndexrealmList = com_tech_world_model_realms_PhoneNumberRealmProxy.insert(realm, realmListItem, cache);
                    }
                    realmListOsList.addRow(cacheItemIndexrealmList);
                }
            }
            String realmGet$jsonString = ((com_tech_world_model_realms_RealmContactRealmProxyInterface) object).realmGet$jsonString();
            if (realmGet$jsonString != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.jsonStringColKey, objKey, realmGet$jsonString, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.tech.world.model.realms.RealmContact object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.tech.world.model.realms.RealmContact.class);
        long tableNativePtr = table.getNativePtr();
        RealmContactColumnInfo columnInfo = (RealmContactColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.RealmContact.class);
        long objKey = OsObject.createRow(table);
        cache.put(object, objKey);
        String realmGet$name = ((com_tech_world_model_realms_RealmContactRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, objKey, realmGet$name, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nameColKey, objKey, false);
        }

        OsList realmListOsList = new OsList(table.getUncheckedRow(objKey), columnInfo.realmListColKey);
        RealmList<com.tech.world.model.realms.PhoneNumber> realmListList = ((com_tech_world_model_realms_RealmContactRealmProxyInterface) object).realmGet$realmList();
        if (realmListList != null && realmListList.size() == realmListOsList.size()) {
            // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
            int objects = realmListList.size();
            for (int i = 0; i < objects; i++) {
                com.tech.world.model.realms.PhoneNumber realmListItem = realmListList.get(i);
                Long cacheItemIndexrealmList = cache.get(realmListItem);
                if (cacheItemIndexrealmList == null) {
                    cacheItemIndexrealmList = com_tech_world_model_realms_PhoneNumberRealmProxy.insertOrUpdate(realm, realmListItem, cache);
                }
                realmListOsList.setRow(i, cacheItemIndexrealmList);
            }
        } else {
            realmListOsList.removeAll();
            if (realmListList != null) {
                for (com.tech.world.model.realms.PhoneNumber realmListItem : realmListList) {
                    Long cacheItemIndexrealmList = cache.get(realmListItem);
                    if (cacheItemIndexrealmList == null) {
                        cacheItemIndexrealmList = com_tech_world_model_realms_PhoneNumberRealmProxy.insertOrUpdate(realm, realmListItem, cache);
                    }
                    realmListOsList.addRow(cacheItemIndexrealmList);
                }
            }
        }

        String realmGet$jsonString = ((com_tech_world_model_realms_RealmContactRealmProxyInterface) object).realmGet$jsonString();
        if (realmGet$jsonString != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.jsonStringColKey, objKey, realmGet$jsonString, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.jsonStringColKey, objKey, false);
        }
        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.tech.world.model.realms.RealmContact.class);
        long tableNativePtr = table.getNativePtr();
        RealmContactColumnInfo columnInfo = (RealmContactColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.RealmContact.class);
        com.tech.world.model.realms.RealmContact object = null;
        while (objects.hasNext()) {
            object = (com.tech.world.model.realms.RealmContact) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = OsObject.createRow(table);
            cache.put(object, objKey);
            String realmGet$name = ((com_tech_world_model_realms_RealmContactRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameColKey, objKey, realmGet$name, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nameColKey, objKey, false);
            }

            OsList realmListOsList = new OsList(table.getUncheckedRow(objKey), columnInfo.realmListColKey);
            RealmList<com.tech.world.model.realms.PhoneNumber> realmListList = ((com_tech_world_model_realms_RealmContactRealmProxyInterface) object).realmGet$realmList();
            if (realmListList != null && realmListList.size() == realmListOsList.size()) {
                // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
                int objectCount = realmListList.size();
                for (int i = 0; i < objectCount; i++) {
                    com.tech.world.model.realms.PhoneNumber realmListItem = realmListList.get(i);
                    Long cacheItemIndexrealmList = cache.get(realmListItem);
                    if (cacheItemIndexrealmList == null) {
                        cacheItemIndexrealmList = com_tech_world_model_realms_PhoneNumberRealmProxy.insertOrUpdate(realm, realmListItem, cache);
                    }
                    realmListOsList.setRow(i, cacheItemIndexrealmList);
                }
            } else {
                realmListOsList.removeAll();
                if (realmListList != null) {
                    for (com.tech.world.model.realms.PhoneNumber realmListItem : realmListList) {
                        Long cacheItemIndexrealmList = cache.get(realmListItem);
                        if (cacheItemIndexrealmList == null) {
                            cacheItemIndexrealmList = com_tech_world_model_realms_PhoneNumberRealmProxy.insertOrUpdate(realm, realmListItem, cache);
                        }
                        realmListOsList.addRow(cacheItemIndexrealmList);
                    }
                }
            }

            String realmGet$jsonString = ((com_tech_world_model_realms_RealmContactRealmProxyInterface) object).realmGet$jsonString();
            if (realmGet$jsonString != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.jsonStringColKey, objKey, realmGet$jsonString, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.jsonStringColKey, objKey, false);
            }
        }
    }

    public static com.tech.world.model.realms.RealmContact createDetachedCopy(com.tech.world.model.realms.RealmContact realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.tech.world.model.realms.RealmContact unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.tech.world.model.realms.RealmContact();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.tech.world.model.realms.RealmContact) cachedObject.object;
            }
            unmanagedObject = (com.tech.world.model.realms.RealmContact) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_tech_world_model_realms_RealmContactRealmProxyInterface unmanagedCopy = (com_tech_world_model_realms_RealmContactRealmProxyInterface) unmanagedObject;
        com_tech_world_model_realms_RealmContactRealmProxyInterface realmSource = (com_tech_world_model_realms_RealmContactRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$name(realmSource.realmGet$name());

        // Deep copy of realmList
        if (currentDepth == maxDepth) {
            unmanagedCopy.realmSet$realmList(null);
        } else {
            RealmList<com.tech.world.model.realms.PhoneNumber> managedrealmListList = realmSource.realmGet$realmList();
            RealmList<com.tech.world.model.realms.PhoneNumber> unmanagedrealmListList = new RealmList<com.tech.world.model.realms.PhoneNumber>();
            unmanagedCopy.realmSet$realmList(unmanagedrealmListList);
            int nextDepth = currentDepth + 1;
            int size = managedrealmListList.size();
            for (int i = 0; i < size; i++) {
                com.tech.world.model.realms.PhoneNumber item = com_tech_world_model_realms_PhoneNumberRealmProxy.createDetachedCopy(managedrealmListList.get(i), nextDepth, maxDepth, cache);
                unmanagedrealmListList.add(item);
            }
        }
        unmanagedCopy.realmSet$jsonString(realmSource.realmGet$jsonString());

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("RealmContact = proxy[");
        stringBuilder.append("{name:");
        stringBuilder.append(realmGet$name() != null ? realmGet$name() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{realmList:");
        stringBuilder.append("RealmList<PhoneNumber>[").append(realmGet$realmList().size()).append("]");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{jsonString:");
        stringBuilder.append(realmGet$jsonString() != null ? realmGet$jsonString() : "null");
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
        com_tech_world_model_realms_RealmContactRealmProxy aRealmContact = (com_tech_world_model_realms_RealmContactRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aRealmContact.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aRealmContact.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aRealmContact.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
