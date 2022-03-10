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
public class com_tech_world_model_realms_FireCallRealmProxy extends com.tech.world.model.realms.FireCall
    implements RealmObjectProxy, com_tech_world_model_realms_FireCallRealmProxyInterface {

    static final class FireCallColumnInfo extends ColumnInfo {
        long callIdColKey;
        long userColKey;
        long directionColKey;
        long timestampColKey;
        long durationColKey;
        long phoneNumberColKey;
        long isVideoColKey;
        long callTypeColKey;
        long channelColKey;

        FireCallColumnInfo(OsSchemaInfo schemaInfo) {
            super(9);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("FireCall");
            this.callIdColKey = addColumnDetails("callId", "callId", objectSchemaInfo);
            this.userColKey = addColumnDetails("user", "user", objectSchemaInfo);
            this.directionColKey = addColumnDetails("direction", "direction", objectSchemaInfo);
            this.timestampColKey = addColumnDetails("timestamp", "timestamp", objectSchemaInfo);
            this.durationColKey = addColumnDetails("duration", "duration", objectSchemaInfo);
            this.phoneNumberColKey = addColumnDetails("phoneNumber", "phoneNumber", objectSchemaInfo);
            this.isVideoColKey = addColumnDetails("isVideo", "isVideo", objectSchemaInfo);
            this.callTypeColKey = addColumnDetails("callType", "callType", objectSchemaInfo);
            this.channelColKey = addColumnDetails("channel", "channel", objectSchemaInfo);
        }

        FireCallColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new FireCallColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final FireCallColumnInfo src = (FireCallColumnInfo) rawSrc;
            final FireCallColumnInfo dst = (FireCallColumnInfo) rawDst;
            dst.callIdColKey = src.callIdColKey;
            dst.userColKey = src.userColKey;
            dst.directionColKey = src.directionColKey;
            dst.timestampColKey = src.timestampColKey;
            dst.durationColKey = src.durationColKey;
            dst.phoneNumberColKey = src.phoneNumberColKey;
            dst.isVideoColKey = src.isVideoColKey;
            dst.callTypeColKey = src.callTypeColKey;
            dst.channelColKey = src.channelColKey;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private FireCallColumnInfo columnInfo;
    private ProxyState<com.tech.world.model.realms.FireCall> proxyState;

    com_tech_world_model_realms_FireCallRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (FireCallColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.tech.world.model.realms.FireCall>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$callId() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.callIdColKey);
    }

    @Override
    public void realmSet$callId(String value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'callId' cannot be changed after object was created.");
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
    public int realmGet$direction() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.directionColKey);
    }

    @Override
    public void realmSet$direction(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.directionColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.directionColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public long realmGet$timestamp() {
        proxyState.getRealm$realm().checkIfValid();
        return (long) proxyState.getRow$realm().getLong(columnInfo.timestampColKey);
    }

    @Override
    public void realmSet$timestamp(long value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.timestampColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.timestampColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$duration() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.durationColKey);
    }

    @Override
    public void realmSet$duration(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.durationColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.durationColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$phoneNumber() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.phoneNumberColKey);
    }

    @Override
    public void realmSet$phoneNumber(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.phoneNumberColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.phoneNumberColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.phoneNumberColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.phoneNumberColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public boolean realmGet$isVideo() {
        proxyState.getRealm$realm().checkIfValid();
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.isVideoColKey);
    }

    @Override
    public void realmSet$isVideo(boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setBoolean(columnInfo.isVideoColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setBoolean(columnInfo.isVideoColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$callType() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.callTypeColKey);
    }

    @Override
    public void realmSet$callType(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.callTypeColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.callTypeColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$channel() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.channelColKey);
    }

    @Override
    public void realmSet$channel(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.channelColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.channelColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.channelColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.channelColKey, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("FireCall", false, 9, 0);
        builder.addPersistedProperty("callId", RealmFieldType.STRING, Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedLinkProperty("user", RealmFieldType.OBJECT, "User");
        builder.addPersistedProperty("direction", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("timestamp", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("duration", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("phoneNumber", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("isVideo", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("callType", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("channel", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static FireCallColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new FireCallColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "FireCall";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "FireCall";
    }

    @SuppressWarnings("cast")
    public static com.tech.world.model.realms.FireCall createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(1);
        com.tech.world.model.realms.FireCall obj = null;
        if (update) {
            Table table = realm.getTable(com.tech.world.model.realms.FireCall.class);
            FireCallColumnInfo columnInfo = (FireCallColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.FireCall.class);
            long pkColumnKey = columnInfo.callIdColKey;
            long objKey = Table.NO_MATCH;
            if (json.isNull("callId")) {
                objKey = table.findFirstNull(pkColumnKey);
            } else {
                objKey = table.findFirstString(pkColumnKey, json.getString("callId"));
            }
            if (objKey != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), realm.getSchema().getColumnInfo(com.tech.world.model.realms.FireCall.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_tech_world_model_realms_FireCallRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("user")) {
                excludeFields.add("user");
            }
            if (json.has("callId")) {
                if (json.isNull("callId")) {
                    obj = (io.realm.com_tech_world_model_realms_FireCallRealmProxy) realm.createObjectInternal(com.tech.world.model.realms.FireCall.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_tech_world_model_realms_FireCallRealmProxy) realm.createObjectInternal(com.tech.world.model.realms.FireCall.class, json.getString("callId"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'callId'.");
            }
        }

        final com_tech_world_model_realms_FireCallRealmProxyInterface objProxy = (com_tech_world_model_realms_FireCallRealmProxyInterface) obj;
        if (json.has("user")) {
            if (json.isNull("user")) {
                objProxy.realmSet$user(null);
            } else {
                com.tech.world.model.realms.User userObj = com_tech_world_model_realms_UserRealmProxy.createOrUpdateUsingJsonObject(realm, json.getJSONObject("user"), update);
                objProxy.realmSet$user(userObj);
            }
        }
        if (json.has("direction")) {
            if (json.isNull("direction")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'direction' to null.");
            } else {
                objProxy.realmSet$direction((int) json.getInt("direction"));
            }
        }
        if (json.has("timestamp")) {
            if (json.isNull("timestamp")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'timestamp' to null.");
            } else {
                objProxy.realmSet$timestamp((long) json.getLong("timestamp"));
            }
        }
        if (json.has("duration")) {
            if (json.isNull("duration")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'duration' to null.");
            } else {
                objProxy.realmSet$duration((int) json.getInt("duration"));
            }
        }
        if (json.has("phoneNumber")) {
            if (json.isNull("phoneNumber")) {
                objProxy.realmSet$phoneNumber(null);
            } else {
                objProxy.realmSet$phoneNumber((String) json.getString("phoneNumber"));
            }
        }
        if (json.has("isVideo")) {
            if (json.isNull("isVideo")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'isVideo' to null.");
            } else {
                objProxy.realmSet$isVideo((boolean) json.getBoolean("isVideo"));
            }
        }
        if (json.has("callType")) {
            if (json.isNull("callType")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'callType' to null.");
            } else {
                objProxy.realmSet$callType((int) json.getInt("callType"));
            }
        }
        if (json.has("channel")) {
            if (json.isNull("channel")) {
                objProxy.realmSet$channel(null);
            } else {
                objProxy.realmSet$channel((String) json.getString("channel"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.tech.world.model.realms.FireCall createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.tech.world.model.realms.FireCall obj = new com.tech.world.model.realms.FireCall();
        final com_tech_world_model_realms_FireCallRealmProxyInterface objProxy = (com_tech_world_model_realms_FireCallRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("callId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$callId((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$callId(null);
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("user")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$user(null);
                } else {
                    com.tech.world.model.realms.User userObj = com_tech_world_model_realms_UserRealmProxy.createUsingJsonStream(realm, reader);
                    objProxy.realmSet$user(userObj);
                }
            } else if (name.equals("direction")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$direction((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'direction' to null.");
                }
            } else if (name.equals("timestamp")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$timestamp((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'timestamp' to null.");
                }
            } else if (name.equals("duration")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$duration((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'duration' to null.");
                }
            } else if (name.equals("phoneNumber")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$phoneNumber((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$phoneNumber(null);
                }
            } else if (name.equals("isVideo")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$isVideo((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'isVideo' to null.");
                }
            } else if (name.equals("callType")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$callType((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'callType' to null.");
                }
            } else if (name.equals("channel")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$channel((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$channel(null);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'callId'.");
        }
        return realm.copyToRealm(obj);
    }

    static com_tech_world_model_realms_FireCallRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.tech.world.model.realms.FireCall.class), false, Collections.<String>emptyList());
        io.realm.com_tech_world_model_realms_FireCallRealmProxy obj = new io.realm.com_tech_world_model_realms_FireCallRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.tech.world.model.realms.FireCall copyOrUpdate(Realm realm, FireCallColumnInfo columnInfo, com.tech.world.model.realms.FireCall object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.tech.world.model.realms.FireCall) cachedRealmObject;
        }

        com.tech.world.model.realms.FireCall realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.tech.world.model.realms.FireCall.class);
            long pkColumnKey = columnInfo.callIdColKey;
            String value = ((com_tech_world_model_realms_FireCallRealmProxyInterface) object).realmGet$callId();
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
                    realmObject = new io.realm.com_tech_world_model_realms_FireCallRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.tech.world.model.realms.FireCall copy(Realm realm, FireCallColumnInfo columnInfo, com.tech.world.model.realms.FireCall newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.tech.world.model.realms.FireCall) cachedRealmObject;
        }

        com_tech_world_model_realms_FireCallRealmProxyInterface unmanagedSource = (com_tech_world_model_realms_FireCallRealmProxyInterface) newObject;

        Table table = realm.getTable(com.tech.world.model.realms.FireCall.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.callIdColKey, unmanagedSource.realmGet$callId());
        builder.addInteger(columnInfo.directionColKey, unmanagedSource.realmGet$direction());
        builder.addInteger(columnInfo.timestampColKey, unmanagedSource.realmGet$timestamp());
        builder.addInteger(columnInfo.durationColKey, unmanagedSource.realmGet$duration());
        builder.addString(columnInfo.phoneNumberColKey, unmanagedSource.realmGet$phoneNumber());
        builder.addBoolean(columnInfo.isVideoColKey, unmanagedSource.realmGet$isVideo());
        builder.addInteger(columnInfo.callTypeColKey, unmanagedSource.realmGet$callType());
        builder.addString(columnInfo.channelColKey, unmanagedSource.realmGet$channel());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_tech_world_model_realms_FireCallRealmProxy managedCopy = newProxyInstance(realm, row);
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

    public static long insert(Realm realm, com.tech.world.model.realms.FireCall object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.tech.world.model.realms.FireCall.class);
        long tableNativePtr = table.getNativePtr();
        FireCallColumnInfo columnInfo = (FireCallColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.FireCall.class);
        long pkColumnKey = columnInfo.callIdColKey;
        String primaryKeyValue = ((com_tech_world_model_realms_FireCallRealmProxyInterface) object).realmGet$callId();
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

        com.tech.world.model.realms.User userObj = ((com_tech_world_model_realms_FireCallRealmProxyInterface) object).realmGet$user();
        if (userObj != null) {
            Long cacheuser = cache.get(userObj);
            if (cacheuser == null) {
                cacheuser = com_tech_world_model_realms_UserRealmProxy.insert(realm, userObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.userColKey, objKey, cacheuser, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.directionColKey, objKey, ((com_tech_world_model_realms_FireCallRealmProxyInterface) object).realmGet$direction(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.timestampColKey, objKey, ((com_tech_world_model_realms_FireCallRealmProxyInterface) object).realmGet$timestamp(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.durationColKey, objKey, ((com_tech_world_model_realms_FireCallRealmProxyInterface) object).realmGet$duration(), false);
        String realmGet$phoneNumber = ((com_tech_world_model_realms_FireCallRealmProxyInterface) object).realmGet$phoneNumber();
        if (realmGet$phoneNumber != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phoneNumberColKey, objKey, realmGet$phoneNumber, false);
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.isVideoColKey, objKey, ((com_tech_world_model_realms_FireCallRealmProxyInterface) object).realmGet$isVideo(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.callTypeColKey, objKey, ((com_tech_world_model_realms_FireCallRealmProxyInterface) object).realmGet$callType(), false);
        String realmGet$channel = ((com_tech_world_model_realms_FireCallRealmProxyInterface) object).realmGet$channel();
        if (realmGet$channel != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.channelColKey, objKey, realmGet$channel, false);
        }
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.tech.world.model.realms.FireCall.class);
        long tableNativePtr = table.getNativePtr();
        FireCallColumnInfo columnInfo = (FireCallColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.FireCall.class);
        long pkColumnKey = columnInfo.callIdColKey;
        com.tech.world.model.realms.FireCall object = null;
        while (objects.hasNext()) {
            object = (com.tech.world.model.realms.FireCall) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            String primaryKeyValue = ((com_tech_world_model_realms_FireCallRealmProxyInterface) object).realmGet$callId();
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

            com.tech.world.model.realms.User userObj = ((com_tech_world_model_realms_FireCallRealmProxyInterface) object).realmGet$user();
            if (userObj != null) {
                Long cacheuser = cache.get(userObj);
                if (cacheuser == null) {
                    cacheuser = com_tech_world_model_realms_UserRealmProxy.insert(realm, userObj, cache);
                }
                table.setLink(columnInfo.userColKey, objKey, cacheuser, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.directionColKey, objKey, ((com_tech_world_model_realms_FireCallRealmProxyInterface) object).realmGet$direction(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.timestampColKey, objKey, ((com_tech_world_model_realms_FireCallRealmProxyInterface) object).realmGet$timestamp(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.durationColKey, objKey, ((com_tech_world_model_realms_FireCallRealmProxyInterface) object).realmGet$duration(), false);
            String realmGet$phoneNumber = ((com_tech_world_model_realms_FireCallRealmProxyInterface) object).realmGet$phoneNumber();
            if (realmGet$phoneNumber != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.phoneNumberColKey, objKey, realmGet$phoneNumber, false);
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.isVideoColKey, objKey, ((com_tech_world_model_realms_FireCallRealmProxyInterface) object).realmGet$isVideo(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.callTypeColKey, objKey, ((com_tech_world_model_realms_FireCallRealmProxyInterface) object).realmGet$callType(), false);
            String realmGet$channel = ((com_tech_world_model_realms_FireCallRealmProxyInterface) object).realmGet$channel();
            if (realmGet$channel != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.channelColKey, objKey, realmGet$channel, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.tech.world.model.realms.FireCall object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.tech.world.model.realms.FireCall.class);
        long tableNativePtr = table.getNativePtr();
        FireCallColumnInfo columnInfo = (FireCallColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.FireCall.class);
        long pkColumnKey = columnInfo.callIdColKey;
        String primaryKeyValue = ((com_tech_world_model_realms_FireCallRealmProxyInterface) object).realmGet$callId();
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

        com.tech.world.model.realms.User userObj = ((com_tech_world_model_realms_FireCallRealmProxyInterface) object).realmGet$user();
        if (userObj != null) {
            Long cacheuser = cache.get(userObj);
            if (cacheuser == null) {
                cacheuser = com_tech_world_model_realms_UserRealmProxy.insertOrUpdate(realm, userObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.userColKey, objKey, cacheuser, false);
        } else {
            Table.nativeNullifyLink(tableNativePtr, columnInfo.userColKey, objKey);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.directionColKey, objKey, ((com_tech_world_model_realms_FireCallRealmProxyInterface) object).realmGet$direction(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.timestampColKey, objKey, ((com_tech_world_model_realms_FireCallRealmProxyInterface) object).realmGet$timestamp(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.durationColKey, objKey, ((com_tech_world_model_realms_FireCallRealmProxyInterface) object).realmGet$duration(), false);
        String realmGet$phoneNumber = ((com_tech_world_model_realms_FireCallRealmProxyInterface) object).realmGet$phoneNumber();
        if (realmGet$phoneNumber != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.phoneNumberColKey, objKey, realmGet$phoneNumber, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.phoneNumberColKey, objKey, false);
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.isVideoColKey, objKey, ((com_tech_world_model_realms_FireCallRealmProxyInterface) object).realmGet$isVideo(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.callTypeColKey, objKey, ((com_tech_world_model_realms_FireCallRealmProxyInterface) object).realmGet$callType(), false);
        String realmGet$channel = ((com_tech_world_model_realms_FireCallRealmProxyInterface) object).realmGet$channel();
        if (realmGet$channel != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.channelColKey, objKey, realmGet$channel, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.channelColKey, objKey, false);
        }
        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.tech.world.model.realms.FireCall.class);
        long tableNativePtr = table.getNativePtr();
        FireCallColumnInfo columnInfo = (FireCallColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.FireCall.class);
        long pkColumnKey = columnInfo.callIdColKey;
        com.tech.world.model.realms.FireCall object = null;
        while (objects.hasNext()) {
            object = (com.tech.world.model.realms.FireCall) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            String primaryKeyValue = ((com_tech_world_model_realms_FireCallRealmProxyInterface) object).realmGet$callId();
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

            com.tech.world.model.realms.User userObj = ((com_tech_world_model_realms_FireCallRealmProxyInterface) object).realmGet$user();
            if (userObj != null) {
                Long cacheuser = cache.get(userObj);
                if (cacheuser == null) {
                    cacheuser = com_tech_world_model_realms_UserRealmProxy.insertOrUpdate(realm, userObj, cache);
                }
                Table.nativeSetLink(tableNativePtr, columnInfo.userColKey, objKey, cacheuser, false);
            } else {
                Table.nativeNullifyLink(tableNativePtr, columnInfo.userColKey, objKey);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.directionColKey, objKey, ((com_tech_world_model_realms_FireCallRealmProxyInterface) object).realmGet$direction(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.timestampColKey, objKey, ((com_tech_world_model_realms_FireCallRealmProxyInterface) object).realmGet$timestamp(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.durationColKey, objKey, ((com_tech_world_model_realms_FireCallRealmProxyInterface) object).realmGet$duration(), false);
            String realmGet$phoneNumber = ((com_tech_world_model_realms_FireCallRealmProxyInterface) object).realmGet$phoneNumber();
            if (realmGet$phoneNumber != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.phoneNumberColKey, objKey, realmGet$phoneNumber, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.phoneNumberColKey, objKey, false);
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.isVideoColKey, objKey, ((com_tech_world_model_realms_FireCallRealmProxyInterface) object).realmGet$isVideo(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.callTypeColKey, objKey, ((com_tech_world_model_realms_FireCallRealmProxyInterface) object).realmGet$callType(), false);
            String realmGet$channel = ((com_tech_world_model_realms_FireCallRealmProxyInterface) object).realmGet$channel();
            if (realmGet$channel != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.channelColKey, objKey, realmGet$channel, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.channelColKey, objKey, false);
            }
        }
    }

    public static com.tech.world.model.realms.FireCall createDetachedCopy(com.tech.world.model.realms.FireCall realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.tech.world.model.realms.FireCall unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.tech.world.model.realms.FireCall();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.tech.world.model.realms.FireCall) cachedObject.object;
            }
            unmanagedObject = (com.tech.world.model.realms.FireCall) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_tech_world_model_realms_FireCallRealmProxyInterface unmanagedCopy = (com_tech_world_model_realms_FireCallRealmProxyInterface) unmanagedObject;
        com_tech_world_model_realms_FireCallRealmProxyInterface realmSource = (com_tech_world_model_realms_FireCallRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$callId(realmSource.realmGet$callId());

        // Deep copy of user
        unmanagedCopy.realmSet$user(com_tech_world_model_realms_UserRealmProxy.createDetachedCopy(realmSource.realmGet$user(), currentDepth + 1, maxDepth, cache));
        unmanagedCopy.realmSet$direction(realmSource.realmGet$direction());
        unmanagedCopy.realmSet$timestamp(realmSource.realmGet$timestamp());
        unmanagedCopy.realmSet$duration(realmSource.realmGet$duration());
        unmanagedCopy.realmSet$phoneNumber(realmSource.realmGet$phoneNumber());
        unmanagedCopy.realmSet$isVideo(realmSource.realmGet$isVideo());
        unmanagedCopy.realmSet$callType(realmSource.realmGet$callType());
        unmanagedCopy.realmSet$channel(realmSource.realmGet$channel());

        return unmanagedObject;
    }

    static com.tech.world.model.realms.FireCall update(Realm realm, FireCallColumnInfo columnInfo, com.tech.world.model.realms.FireCall realmObject, com.tech.world.model.realms.FireCall newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_tech_world_model_realms_FireCallRealmProxyInterface realmObjectTarget = (com_tech_world_model_realms_FireCallRealmProxyInterface) realmObject;
        com_tech_world_model_realms_FireCallRealmProxyInterface realmObjectSource = (com_tech_world_model_realms_FireCallRealmProxyInterface) newObject;
        Table table = realm.getTable(com.tech.world.model.realms.FireCall.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addString(columnInfo.callIdColKey, realmObjectSource.realmGet$callId());

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
        builder.addInteger(columnInfo.directionColKey, realmObjectSource.realmGet$direction());
        builder.addInteger(columnInfo.timestampColKey, realmObjectSource.realmGet$timestamp());
        builder.addInteger(columnInfo.durationColKey, realmObjectSource.realmGet$duration());
        builder.addString(columnInfo.phoneNumberColKey, realmObjectSource.realmGet$phoneNumber());
        builder.addBoolean(columnInfo.isVideoColKey, realmObjectSource.realmGet$isVideo());
        builder.addInteger(columnInfo.callTypeColKey, realmObjectSource.realmGet$callType());
        builder.addString(columnInfo.channelColKey, realmObjectSource.realmGet$channel());

        builder.updateExistingTopLevelObject();
        return realmObject;
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
        com_tech_world_model_realms_FireCallRealmProxy aFireCall = (com_tech_world_model_realms_FireCallRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aFireCall.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aFireCall.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aFireCall.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
