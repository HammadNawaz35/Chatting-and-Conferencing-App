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
public class com_tech_world_model_realms_StatusRealmProxy extends com.tech.world.model.realms.Status
    implements RealmObjectProxy, com_tech_world_model_realms_StatusRealmProxyInterface {

    static final class StatusColumnInfo extends ColumnInfo {
        long statusIdColKey;
        long userIdColKey;
        long timestampColKey;
        long thumbImgColKey;
        long contentColKey;
        long localPathColKey;
        long textStatusColKey;
        long typeColKey;
        long durationColKey;
        long seenCountColKey;
        long seenCountSentColKey;
        long isSeenColKey;
        long seenByColKey;

        StatusColumnInfo(OsSchemaInfo schemaInfo) {
            super(13);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("Status");
            this.statusIdColKey = addColumnDetails("statusId", "statusId", objectSchemaInfo);
            this.userIdColKey = addColumnDetails("userId", "userId", objectSchemaInfo);
            this.timestampColKey = addColumnDetails("timestamp", "timestamp", objectSchemaInfo);
            this.thumbImgColKey = addColumnDetails("thumbImg", "thumbImg", objectSchemaInfo);
            this.contentColKey = addColumnDetails("content", "content", objectSchemaInfo);
            this.localPathColKey = addColumnDetails("localPath", "localPath", objectSchemaInfo);
            this.textStatusColKey = addColumnDetails("textStatus", "textStatus", objectSchemaInfo);
            this.typeColKey = addColumnDetails("type", "type", objectSchemaInfo);
            this.durationColKey = addColumnDetails("duration", "duration", objectSchemaInfo);
            this.seenCountColKey = addColumnDetails("seenCount", "seenCount", objectSchemaInfo);
            this.seenCountSentColKey = addColumnDetails("seenCountSent", "seenCountSent", objectSchemaInfo);
            this.isSeenColKey = addColumnDetails("isSeen", "isSeen", objectSchemaInfo);
            this.seenByColKey = addColumnDetails("seenBy", "seenBy", objectSchemaInfo);
        }

        StatusColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new StatusColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final StatusColumnInfo src = (StatusColumnInfo) rawSrc;
            final StatusColumnInfo dst = (StatusColumnInfo) rawDst;
            dst.statusIdColKey = src.statusIdColKey;
            dst.userIdColKey = src.userIdColKey;
            dst.timestampColKey = src.timestampColKey;
            dst.thumbImgColKey = src.thumbImgColKey;
            dst.contentColKey = src.contentColKey;
            dst.localPathColKey = src.localPathColKey;
            dst.textStatusColKey = src.textStatusColKey;
            dst.typeColKey = src.typeColKey;
            dst.durationColKey = src.durationColKey;
            dst.seenCountColKey = src.seenCountColKey;
            dst.seenCountSentColKey = src.seenCountSentColKey;
            dst.isSeenColKey = src.isSeenColKey;
            dst.seenByColKey = src.seenByColKey;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private StatusColumnInfo columnInfo;
    private ProxyState<com.tech.world.model.realms.Status> proxyState;
    private RealmList<com.tech.world.model.realms.StatusSeenBy> seenByRealmList;

    com_tech_world_model_realms_StatusRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (StatusColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.tech.world.model.realms.Status>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$statusId() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.statusIdColKey);
    }

    @Override
    public void realmSet$statusId(String value) {
        if (proxyState.isUnderConstruction()) {
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'statusId' cannot be changed after object was created.");
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$userId() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.userIdColKey);
    }

    @Override
    public void realmSet$userId(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.userIdColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.userIdColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.userIdColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.userIdColKey, value);
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
    public String realmGet$thumbImg() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.thumbImgColKey);
    }

    @Override
    public void realmSet$thumbImg(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.thumbImgColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.thumbImgColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.thumbImgColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.thumbImgColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$content() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.contentColKey);
    }

    @Override
    public void realmSet$content(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.contentColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.contentColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.contentColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.contentColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$localPath() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.localPathColKey);
    }

    @Override
    public void realmSet$localPath(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.localPathColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.localPathColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.localPathColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.localPathColKey, value);
    }

    @Override
    public com.tech.world.model.realms.TextStatus realmGet$textStatus() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNullLink(columnInfo.textStatusColKey)) {
            return null;
        }
        return proxyState.getRealm$realm().get(com.tech.world.model.realms.TextStatus.class, proxyState.getRow$realm().getLink(columnInfo.textStatusColKey), false, Collections.<String>emptyList());
    }

    @Override
    public void realmSet$textStatus(com.tech.world.model.realms.TextStatus value) {
        Realm realm = (Realm) proxyState.getRealm$realm();
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("textStatus")) {
                return;
            }
            if (value != null && !RealmObject.isManaged(value)) {
                value = realm.copyToRealm(value);
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                // Table#nullifyLink() does not support default value. Just using Row.
                row.nullifyLink(columnInfo.textStatusColKey);
                return;
            }
            proxyState.checkValidObject(value);
            row.getTable().setLink(columnInfo.textStatusColKey, row.getObjectKey(), ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getObjectKey(), true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().nullifyLink(columnInfo.textStatusColKey);
            return;
        }
        proxyState.checkValidObject(value);
        proxyState.getRow$realm().setLink(columnInfo.textStatusColKey, ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getObjectKey());
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
    @SuppressWarnings("cast")
    public long realmGet$duration() {
        proxyState.getRealm$realm().checkIfValid();
        return (long) proxyState.getRow$realm().getLong(columnInfo.durationColKey);
    }

    @Override
    public void realmSet$duration(long value) {
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
    public int realmGet$seenCount() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.seenCountColKey);
    }

    @Override
    public void realmSet$seenCount(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.seenCountColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.seenCountColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public boolean realmGet$seenCountSent() {
        proxyState.getRealm$realm().checkIfValid();
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.seenCountSentColKey);
    }

    @Override
    public void realmSet$seenCountSent(boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setBoolean(columnInfo.seenCountSentColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setBoolean(columnInfo.seenCountSentColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public boolean realmGet$isSeen() {
        proxyState.getRealm$realm().checkIfValid();
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.isSeenColKey);
    }

    @Override
    public void realmSet$isSeen(boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setBoolean(columnInfo.isSeenColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setBoolean(columnInfo.isSeenColKey, value);
    }

    @Override
    public RealmList<com.tech.world.model.realms.StatusSeenBy> realmGet$seenBy() {
        proxyState.getRealm$realm().checkIfValid();
        // use the cached value if available
        if (seenByRealmList != null) {
            return seenByRealmList;
        } else {
            OsList osList = proxyState.getRow$realm().getModelList(columnInfo.seenByColKey);
            seenByRealmList = new RealmList<com.tech.world.model.realms.StatusSeenBy>(com.tech.world.model.realms.StatusSeenBy.class, osList, proxyState.getRealm$realm());
            return seenByRealmList;
        }
    }

    @Override
    public void realmSet$seenBy(RealmList<com.tech.world.model.realms.StatusSeenBy> value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("seenBy")) {
                return;
            }
            // if the list contains unmanaged RealmObjects, convert them to managed.
            if (value != null && !value.isManaged()) {
                final Realm realm = (Realm) proxyState.getRealm$realm();
                final RealmList<com.tech.world.model.realms.StatusSeenBy> original = value;
                value = new RealmList<com.tech.world.model.realms.StatusSeenBy>();
                for (com.tech.world.model.realms.StatusSeenBy item : original) {
                    if (item == null || RealmObject.isManaged(item)) {
                        value.add(item);
                    } else {
                        value.add(realm.copyToRealm(item));
                    }
                }
            }
        }

        proxyState.getRealm$realm().checkIfValid();
        OsList osList = proxyState.getRow$realm().getModelList(columnInfo.seenByColKey);
        // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
        if (value != null && value.size() == osList.size()) {
            int objects = value.size();
            for (int i = 0; i < objects; i++) {
                com.tech.world.model.realms.StatusSeenBy linkedObject = value.get(i);
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
                com.tech.world.model.realms.StatusSeenBy linkedObject = value.get(i);
                proxyState.checkValidObject(linkedObject);
                osList.addRow(((RealmObjectProxy) linkedObject).realmGet$proxyState().getRow$realm().getObjectKey());
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Status", false, 13, 0);
        builder.addPersistedProperty("statusId", RealmFieldType.STRING, Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("userId", RealmFieldType.STRING, !Property.PRIMARY_KEY, Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("timestamp", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("thumbImg", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("content", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("localPath", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedLinkProperty("textStatus", RealmFieldType.OBJECT, "TextStatus");
        builder.addPersistedProperty("type", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("duration", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("seenCount", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("seenCountSent", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("isSeen", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedLinkProperty("seenBy", RealmFieldType.LIST, "StatusSeenBy");
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static StatusColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new StatusColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "Status";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Status";
    }

    @SuppressWarnings("cast")
    public static com.tech.world.model.realms.Status createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(2);
        com.tech.world.model.realms.Status obj = null;
        if (update) {
            Table table = realm.getTable(com.tech.world.model.realms.Status.class);
            StatusColumnInfo columnInfo = (StatusColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.Status.class);
            long pkColumnKey = columnInfo.statusIdColKey;
            long objKey = Table.NO_MATCH;
            if (json.isNull("statusId")) {
                objKey = table.findFirstNull(pkColumnKey);
            } else {
                objKey = table.findFirstString(pkColumnKey, json.getString("statusId"));
            }
            if (objKey != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), realm.getSchema().getColumnInfo(com.tech.world.model.realms.Status.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_tech_world_model_realms_StatusRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("textStatus")) {
                excludeFields.add("textStatus");
            }
            if (json.has("seenBy")) {
                excludeFields.add("seenBy");
            }
            if (json.has("statusId")) {
                if (json.isNull("statusId")) {
                    obj = (io.realm.com_tech_world_model_realms_StatusRealmProxy) realm.createObjectInternal(com.tech.world.model.realms.Status.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_tech_world_model_realms_StatusRealmProxy) realm.createObjectInternal(com.tech.world.model.realms.Status.class, json.getString("statusId"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'statusId'.");
            }
        }

        final com_tech_world_model_realms_StatusRealmProxyInterface objProxy = (com_tech_world_model_realms_StatusRealmProxyInterface) obj;
        if (json.has("userId")) {
            if (json.isNull("userId")) {
                objProxy.realmSet$userId(null);
            } else {
                objProxy.realmSet$userId((String) json.getString("userId"));
            }
        }
        if (json.has("timestamp")) {
            if (json.isNull("timestamp")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'timestamp' to null.");
            } else {
                objProxy.realmSet$timestamp((long) json.getLong("timestamp"));
            }
        }
        if (json.has("thumbImg")) {
            if (json.isNull("thumbImg")) {
                objProxy.realmSet$thumbImg(null);
            } else {
                objProxy.realmSet$thumbImg((String) json.getString("thumbImg"));
            }
        }
        if (json.has("content")) {
            if (json.isNull("content")) {
                objProxy.realmSet$content(null);
            } else {
                objProxy.realmSet$content((String) json.getString("content"));
            }
        }
        if (json.has("localPath")) {
            if (json.isNull("localPath")) {
                objProxy.realmSet$localPath(null);
            } else {
                objProxy.realmSet$localPath((String) json.getString("localPath"));
            }
        }
        if (json.has("textStatus")) {
            if (json.isNull("textStatus")) {
                objProxy.realmSet$textStatus(null);
            } else {
                com.tech.world.model.realms.TextStatus textStatusObj = com_tech_world_model_realms_TextStatusRealmProxy.createOrUpdateUsingJsonObject(realm, json.getJSONObject("textStatus"), update);
                objProxy.realmSet$textStatus(textStatusObj);
            }
        }
        if (json.has("type")) {
            if (json.isNull("type")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'type' to null.");
            } else {
                objProxy.realmSet$type((int) json.getInt("type"));
            }
        }
        if (json.has("duration")) {
            if (json.isNull("duration")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'duration' to null.");
            } else {
                objProxy.realmSet$duration((long) json.getLong("duration"));
            }
        }
        if (json.has("seenCount")) {
            if (json.isNull("seenCount")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'seenCount' to null.");
            } else {
                objProxy.realmSet$seenCount((int) json.getInt("seenCount"));
            }
        }
        if (json.has("seenCountSent")) {
            if (json.isNull("seenCountSent")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'seenCountSent' to null.");
            } else {
                objProxy.realmSet$seenCountSent((boolean) json.getBoolean("seenCountSent"));
            }
        }
        if (json.has("isSeen")) {
            if (json.isNull("isSeen")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'isSeen' to null.");
            } else {
                objProxy.realmSet$isSeen((boolean) json.getBoolean("isSeen"));
            }
        }
        if (json.has("seenBy")) {
            if (json.isNull("seenBy")) {
                objProxy.realmSet$seenBy(null);
            } else {
                objProxy.realmGet$seenBy().clear();
                JSONArray array = json.getJSONArray("seenBy");
                for (int i = 0; i < array.length(); i++) {
                    com.tech.world.model.realms.StatusSeenBy item = com_tech_world_model_realms_StatusSeenByRealmProxy.createOrUpdateUsingJsonObject(realm, array.getJSONObject(i), update);
                    objProxy.realmGet$seenBy().add(item);
                }
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.tech.world.model.realms.Status createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.tech.world.model.realms.Status obj = new com.tech.world.model.realms.Status();
        final com_tech_world_model_realms_StatusRealmProxyInterface objProxy = (com_tech_world_model_realms_StatusRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("statusId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$statusId((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$statusId(null);
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("userId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$userId((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$userId(null);
                }
            } else if (name.equals("timestamp")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$timestamp((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'timestamp' to null.");
                }
            } else if (name.equals("thumbImg")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$thumbImg((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$thumbImg(null);
                }
            } else if (name.equals("content")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$content((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$content(null);
                }
            } else if (name.equals("localPath")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$localPath((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$localPath(null);
                }
            } else if (name.equals("textStatus")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$textStatus(null);
                } else {
                    com.tech.world.model.realms.TextStatus textStatusObj = com_tech_world_model_realms_TextStatusRealmProxy.createUsingJsonStream(realm, reader);
                    objProxy.realmSet$textStatus(textStatusObj);
                }
            } else if (name.equals("type")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$type((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'type' to null.");
                }
            } else if (name.equals("duration")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$duration((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'duration' to null.");
                }
            } else if (name.equals("seenCount")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$seenCount((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'seenCount' to null.");
                }
            } else if (name.equals("seenCountSent")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$seenCountSent((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'seenCountSent' to null.");
                }
            } else if (name.equals("isSeen")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$isSeen((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'isSeen' to null.");
                }
            } else if (name.equals("seenBy")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$seenBy(null);
                } else {
                    objProxy.realmSet$seenBy(new RealmList<com.tech.world.model.realms.StatusSeenBy>());
                    reader.beginArray();
                    while (reader.hasNext()) {
                        com.tech.world.model.realms.StatusSeenBy item = com_tech_world_model_realms_StatusSeenByRealmProxy.createUsingJsonStream(realm, reader);
                        objProxy.realmGet$seenBy().add(item);
                    }
                    reader.endArray();
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'statusId'.");
        }
        return realm.copyToRealm(obj);
    }

    static com_tech_world_model_realms_StatusRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.tech.world.model.realms.Status.class), false, Collections.<String>emptyList());
        io.realm.com_tech_world_model_realms_StatusRealmProxy obj = new io.realm.com_tech_world_model_realms_StatusRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.tech.world.model.realms.Status copyOrUpdate(Realm realm, StatusColumnInfo columnInfo, com.tech.world.model.realms.Status object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.tech.world.model.realms.Status) cachedRealmObject;
        }

        com.tech.world.model.realms.Status realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.tech.world.model.realms.Status.class);
            long pkColumnKey = columnInfo.statusIdColKey;
            String value = ((com_tech_world_model_realms_StatusRealmProxyInterface) object).realmGet$statusId();
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
                    realmObject = new io.realm.com_tech_world_model_realms_StatusRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.tech.world.model.realms.Status copy(Realm realm, StatusColumnInfo columnInfo, com.tech.world.model.realms.Status newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.tech.world.model.realms.Status) cachedRealmObject;
        }

        com_tech_world_model_realms_StatusRealmProxyInterface unmanagedSource = (com_tech_world_model_realms_StatusRealmProxyInterface) newObject;

        Table table = realm.getTable(com.tech.world.model.realms.Status.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.statusIdColKey, unmanagedSource.realmGet$statusId());
        builder.addString(columnInfo.userIdColKey, unmanagedSource.realmGet$userId());
        builder.addInteger(columnInfo.timestampColKey, unmanagedSource.realmGet$timestamp());
        builder.addString(columnInfo.thumbImgColKey, unmanagedSource.realmGet$thumbImg());
        builder.addString(columnInfo.contentColKey, unmanagedSource.realmGet$content());
        builder.addString(columnInfo.localPathColKey, unmanagedSource.realmGet$localPath());
        builder.addInteger(columnInfo.typeColKey, unmanagedSource.realmGet$type());
        builder.addInteger(columnInfo.durationColKey, unmanagedSource.realmGet$duration());
        builder.addInteger(columnInfo.seenCountColKey, unmanagedSource.realmGet$seenCount());
        builder.addBoolean(columnInfo.seenCountSentColKey, unmanagedSource.realmGet$seenCountSent());
        builder.addBoolean(columnInfo.isSeenColKey, unmanagedSource.realmGet$isSeen());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_tech_world_model_realms_StatusRealmProxy managedCopy = newProxyInstance(realm, row);
        cache.put(newObject, managedCopy);

        // Finally add all fields that reference other Realm Objects, either directly or through a list
        com.tech.world.model.realms.TextStatus textStatusObj = unmanagedSource.realmGet$textStatus();
        if (textStatusObj == null) {
            managedCopy.realmSet$textStatus(null);
        } else {
            com.tech.world.model.realms.TextStatus cachetextStatus = (com.tech.world.model.realms.TextStatus) cache.get(textStatusObj);
            if (cachetextStatus != null) {
                managedCopy.realmSet$textStatus(cachetextStatus);
            } else {
                managedCopy.realmSet$textStatus(com_tech_world_model_realms_TextStatusRealmProxy.copyOrUpdate(realm, (com_tech_world_model_realms_TextStatusRealmProxy.TextStatusColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.TextStatus.class), textStatusObj, update, cache, flags));
            }
        }

        RealmList<com.tech.world.model.realms.StatusSeenBy> seenByUnmanagedList = unmanagedSource.realmGet$seenBy();
        if (seenByUnmanagedList != null) {
            RealmList<com.tech.world.model.realms.StatusSeenBy> seenByManagedList = managedCopy.realmGet$seenBy();
            seenByManagedList.clear();
            for (int i = 0; i < seenByUnmanagedList.size(); i++) {
                com.tech.world.model.realms.StatusSeenBy seenByUnmanagedItem = seenByUnmanagedList.get(i);
                com.tech.world.model.realms.StatusSeenBy cacheseenBy = (com.tech.world.model.realms.StatusSeenBy) cache.get(seenByUnmanagedItem);
                if (cacheseenBy != null) {
                    seenByManagedList.add(cacheseenBy);
                } else {
                    seenByManagedList.add(com_tech_world_model_realms_StatusSeenByRealmProxy.copyOrUpdate(realm, (com_tech_world_model_realms_StatusSeenByRealmProxy.StatusSeenByColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.StatusSeenBy.class), seenByUnmanagedItem, update, cache, flags));
                }
            }
        }

        return managedCopy;
    }

    public static long insert(Realm realm, com.tech.world.model.realms.Status object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.tech.world.model.realms.Status.class);
        long tableNativePtr = table.getNativePtr();
        StatusColumnInfo columnInfo = (StatusColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.Status.class);
        long pkColumnKey = columnInfo.statusIdColKey;
        String primaryKeyValue = ((com_tech_world_model_realms_StatusRealmProxyInterface) object).realmGet$statusId();
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
        String realmGet$userId = ((com_tech_world_model_realms_StatusRealmProxyInterface) object).realmGet$userId();
        if (realmGet$userId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.userIdColKey, objKey, realmGet$userId, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.timestampColKey, objKey, ((com_tech_world_model_realms_StatusRealmProxyInterface) object).realmGet$timestamp(), false);
        String realmGet$thumbImg = ((com_tech_world_model_realms_StatusRealmProxyInterface) object).realmGet$thumbImg();
        if (realmGet$thumbImg != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.thumbImgColKey, objKey, realmGet$thumbImg, false);
        }
        String realmGet$content = ((com_tech_world_model_realms_StatusRealmProxyInterface) object).realmGet$content();
        if (realmGet$content != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.contentColKey, objKey, realmGet$content, false);
        }
        String realmGet$localPath = ((com_tech_world_model_realms_StatusRealmProxyInterface) object).realmGet$localPath();
        if (realmGet$localPath != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.localPathColKey, objKey, realmGet$localPath, false);
        }

        com.tech.world.model.realms.TextStatus textStatusObj = ((com_tech_world_model_realms_StatusRealmProxyInterface) object).realmGet$textStatus();
        if (textStatusObj != null) {
            Long cachetextStatus = cache.get(textStatusObj);
            if (cachetextStatus == null) {
                cachetextStatus = com_tech_world_model_realms_TextStatusRealmProxy.insert(realm, textStatusObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.textStatusColKey, objKey, cachetextStatus, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.typeColKey, objKey, ((com_tech_world_model_realms_StatusRealmProxyInterface) object).realmGet$type(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.durationColKey, objKey, ((com_tech_world_model_realms_StatusRealmProxyInterface) object).realmGet$duration(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.seenCountColKey, objKey, ((com_tech_world_model_realms_StatusRealmProxyInterface) object).realmGet$seenCount(), false);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.seenCountSentColKey, objKey, ((com_tech_world_model_realms_StatusRealmProxyInterface) object).realmGet$seenCountSent(), false);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.isSeenColKey, objKey, ((com_tech_world_model_realms_StatusRealmProxyInterface) object).realmGet$isSeen(), false);

        RealmList<com.tech.world.model.realms.StatusSeenBy> seenByList = ((com_tech_world_model_realms_StatusRealmProxyInterface) object).realmGet$seenBy();
        if (seenByList != null) {
            OsList seenByOsList = new OsList(table.getUncheckedRow(objKey), columnInfo.seenByColKey);
            for (com.tech.world.model.realms.StatusSeenBy seenByItem : seenByList) {
                Long cacheItemIndexseenBy = cache.get(seenByItem);
                if (cacheItemIndexseenBy == null) {
                    cacheItemIndexseenBy = com_tech_world_model_realms_StatusSeenByRealmProxy.insert(realm, seenByItem, cache);
                }
                seenByOsList.addRow(cacheItemIndexseenBy);
            }
        }
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.tech.world.model.realms.Status.class);
        long tableNativePtr = table.getNativePtr();
        StatusColumnInfo columnInfo = (StatusColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.Status.class);
        long pkColumnKey = columnInfo.statusIdColKey;
        com.tech.world.model.realms.Status object = null;
        while (objects.hasNext()) {
            object = (com.tech.world.model.realms.Status) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            String primaryKeyValue = ((com_tech_world_model_realms_StatusRealmProxyInterface) object).realmGet$statusId();
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
            String realmGet$userId = ((com_tech_world_model_realms_StatusRealmProxyInterface) object).realmGet$userId();
            if (realmGet$userId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.userIdColKey, objKey, realmGet$userId, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.timestampColKey, objKey, ((com_tech_world_model_realms_StatusRealmProxyInterface) object).realmGet$timestamp(), false);
            String realmGet$thumbImg = ((com_tech_world_model_realms_StatusRealmProxyInterface) object).realmGet$thumbImg();
            if (realmGet$thumbImg != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.thumbImgColKey, objKey, realmGet$thumbImg, false);
            }
            String realmGet$content = ((com_tech_world_model_realms_StatusRealmProxyInterface) object).realmGet$content();
            if (realmGet$content != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.contentColKey, objKey, realmGet$content, false);
            }
            String realmGet$localPath = ((com_tech_world_model_realms_StatusRealmProxyInterface) object).realmGet$localPath();
            if (realmGet$localPath != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.localPathColKey, objKey, realmGet$localPath, false);
            }

            com.tech.world.model.realms.TextStatus textStatusObj = ((com_tech_world_model_realms_StatusRealmProxyInterface) object).realmGet$textStatus();
            if (textStatusObj != null) {
                Long cachetextStatus = cache.get(textStatusObj);
                if (cachetextStatus == null) {
                    cachetextStatus = com_tech_world_model_realms_TextStatusRealmProxy.insert(realm, textStatusObj, cache);
                }
                table.setLink(columnInfo.textStatusColKey, objKey, cachetextStatus, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.typeColKey, objKey, ((com_tech_world_model_realms_StatusRealmProxyInterface) object).realmGet$type(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.durationColKey, objKey, ((com_tech_world_model_realms_StatusRealmProxyInterface) object).realmGet$duration(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.seenCountColKey, objKey, ((com_tech_world_model_realms_StatusRealmProxyInterface) object).realmGet$seenCount(), false);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.seenCountSentColKey, objKey, ((com_tech_world_model_realms_StatusRealmProxyInterface) object).realmGet$seenCountSent(), false);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.isSeenColKey, objKey, ((com_tech_world_model_realms_StatusRealmProxyInterface) object).realmGet$isSeen(), false);

            RealmList<com.tech.world.model.realms.StatusSeenBy> seenByList = ((com_tech_world_model_realms_StatusRealmProxyInterface) object).realmGet$seenBy();
            if (seenByList != null) {
                OsList seenByOsList = new OsList(table.getUncheckedRow(objKey), columnInfo.seenByColKey);
                for (com.tech.world.model.realms.StatusSeenBy seenByItem : seenByList) {
                    Long cacheItemIndexseenBy = cache.get(seenByItem);
                    if (cacheItemIndexseenBy == null) {
                        cacheItemIndexseenBy = com_tech_world_model_realms_StatusSeenByRealmProxy.insert(realm, seenByItem, cache);
                    }
                    seenByOsList.addRow(cacheItemIndexseenBy);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.tech.world.model.realms.Status object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.tech.world.model.realms.Status.class);
        long tableNativePtr = table.getNativePtr();
        StatusColumnInfo columnInfo = (StatusColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.Status.class);
        long pkColumnKey = columnInfo.statusIdColKey;
        String primaryKeyValue = ((com_tech_world_model_realms_StatusRealmProxyInterface) object).realmGet$statusId();
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
        String realmGet$userId = ((com_tech_world_model_realms_StatusRealmProxyInterface) object).realmGet$userId();
        if (realmGet$userId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.userIdColKey, objKey, realmGet$userId, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.userIdColKey, objKey, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.timestampColKey, objKey, ((com_tech_world_model_realms_StatusRealmProxyInterface) object).realmGet$timestamp(), false);
        String realmGet$thumbImg = ((com_tech_world_model_realms_StatusRealmProxyInterface) object).realmGet$thumbImg();
        if (realmGet$thumbImg != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.thumbImgColKey, objKey, realmGet$thumbImg, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.thumbImgColKey, objKey, false);
        }
        String realmGet$content = ((com_tech_world_model_realms_StatusRealmProxyInterface) object).realmGet$content();
        if (realmGet$content != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.contentColKey, objKey, realmGet$content, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.contentColKey, objKey, false);
        }
        String realmGet$localPath = ((com_tech_world_model_realms_StatusRealmProxyInterface) object).realmGet$localPath();
        if (realmGet$localPath != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.localPathColKey, objKey, realmGet$localPath, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.localPathColKey, objKey, false);
        }

        com.tech.world.model.realms.TextStatus textStatusObj = ((com_tech_world_model_realms_StatusRealmProxyInterface) object).realmGet$textStatus();
        if (textStatusObj != null) {
            Long cachetextStatus = cache.get(textStatusObj);
            if (cachetextStatus == null) {
                cachetextStatus = com_tech_world_model_realms_TextStatusRealmProxy.insertOrUpdate(realm, textStatusObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.textStatusColKey, objKey, cachetextStatus, false);
        } else {
            Table.nativeNullifyLink(tableNativePtr, columnInfo.textStatusColKey, objKey);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.typeColKey, objKey, ((com_tech_world_model_realms_StatusRealmProxyInterface) object).realmGet$type(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.durationColKey, objKey, ((com_tech_world_model_realms_StatusRealmProxyInterface) object).realmGet$duration(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.seenCountColKey, objKey, ((com_tech_world_model_realms_StatusRealmProxyInterface) object).realmGet$seenCount(), false);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.seenCountSentColKey, objKey, ((com_tech_world_model_realms_StatusRealmProxyInterface) object).realmGet$seenCountSent(), false);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.isSeenColKey, objKey, ((com_tech_world_model_realms_StatusRealmProxyInterface) object).realmGet$isSeen(), false);

        OsList seenByOsList = new OsList(table.getUncheckedRow(objKey), columnInfo.seenByColKey);
        RealmList<com.tech.world.model.realms.StatusSeenBy> seenByList = ((com_tech_world_model_realms_StatusRealmProxyInterface) object).realmGet$seenBy();
        if (seenByList != null && seenByList.size() == seenByOsList.size()) {
            // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
            int objects = seenByList.size();
            for (int i = 0; i < objects; i++) {
                com.tech.world.model.realms.StatusSeenBy seenByItem = seenByList.get(i);
                Long cacheItemIndexseenBy = cache.get(seenByItem);
                if (cacheItemIndexseenBy == null) {
                    cacheItemIndexseenBy = com_tech_world_model_realms_StatusSeenByRealmProxy.insertOrUpdate(realm, seenByItem, cache);
                }
                seenByOsList.setRow(i, cacheItemIndexseenBy);
            }
        } else {
            seenByOsList.removeAll();
            if (seenByList != null) {
                for (com.tech.world.model.realms.StatusSeenBy seenByItem : seenByList) {
                    Long cacheItemIndexseenBy = cache.get(seenByItem);
                    if (cacheItemIndexseenBy == null) {
                        cacheItemIndexseenBy = com_tech_world_model_realms_StatusSeenByRealmProxy.insertOrUpdate(realm, seenByItem, cache);
                    }
                    seenByOsList.addRow(cacheItemIndexseenBy);
                }
            }
        }

        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.tech.world.model.realms.Status.class);
        long tableNativePtr = table.getNativePtr();
        StatusColumnInfo columnInfo = (StatusColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.Status.class);
        long pkColumnKey = columnInfo.statusIdColKey;
        com.tech.world.model.realms.Status object = null;
        while (objects.hasNext()) {
            object = (com.tech.world.model.realms.Status) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            String primaryKeyValue = ((com_tech_world_model_realms_StatusRealmProxyInterface) object).realmGet$statusId();
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
            String realmGet$userId = ((com_tech_world_model_realms_StatusRealmProxyInterface) object).realmGet$userId();
            if (realmGet$userId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.userIdColKey, objKey, realmGet$userId, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.userIdColKey, objKey, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.timestampColKey, objKey, ((com_tech_world_model_realms_StatusRealmProxyInterface) object).realmGet$timestamp(), false);
            String realmGet$thumbImg = ((com_tech_world_model_realms_StatusRealmProxyInterface) object).realmGet$thumbImg();
            if (realmGet$thumbImg != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.thumbImgColKey, objKey, realmGet$thumbImg, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.thumbImgColKey, objKey, false);
            }
            String realmGet$content = ((com_tech_world_model_realms_StatusRealmProxyInterface) object).realmGet$content();
            if (realmGet$content != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.contentColKey, objKey, realmGet$content, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.contentColKey, objKey, false);
            }
            String realmGet$localPath = ((com_tech_world_model_realms_StatusRealmProxyInterface) object).realmGet$localPath();
            if (realmGet$localPath != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.localPathColKey, objKey, realmGet$localPath, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.localPathColKey, objKey, false);
            }

            com.tech.world.model.realms.TextStatus textStatusObj = ((com_tech_world_model_realms_StatusRealmProxyInterface) object).realmGet$textStatus();
            if (textStatusObj != null) {
                Long cachetextStatus = cache.get(textStatusObj);
                if (cachetextStatus == null) {
                    cachetextStatus = com_tech_world_model_realms_TextStatusRealmProxy.insertOrUpdate(realm, textStatusObj, cache);
                }
                Table.nativeSetLink(tableNativePtr, columnInfo.textStatusColKey, objKey, cachetextStatus, false);
            } else {
                Table.nativeNullifyLink(tableNativePtr, columnInfo.textStatusColKey, objKey);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.typeColKey, objKey, ((com_tech_world_model_realms_StatusRealmProxyInterface) object).realmGet$type(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.durationColKey, objKey, ((com_tech_world_model_realms_StatusRealmProxyInterface) object).realmGet$duration(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.seenCountColKey, objKey, ((com_tech_world_model_realms_StatusRealmProxyInterface) object).realmGet$seenCount(), false);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.seenCountSentColKey, objKey, ((com_tech_world_model_realms_StatusRealmProxyInterface) object).realmGet$seenCountSent(), false);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.isSeenColKey, objKey, ((com_tech_world_model_realms_StatusRealmProxyInterface) object).realmGet$isSeen(), false);

            OsList seenByOsList = new OsList(table.getUncheckedRow(objKey), columnInfo.seenByColKey);
            RealmList<com.tech.world.model.realms.StatusSeenBy> seenByList = ((com_tech_world_model_realms_StatusRealmProxyInterface) object).realmGet$seenBy();
            if (seenByList != null && seenByList.size() == seenByOsList.size()) {
                // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
                int objectCount = seenByList.size();
                for (int i = 0; i < objectCount; i++) {
                    com.tech.world.model.realms.StatusSeenBy seenByItem = seenByList.get(i);
                    Long cacheItemIndexseenBy = cache.get(seenByItem);
                    if (cacheItemIndexseenBy == null) {
                        cacheItemIndexseenBy = com_tech_world_model_realms_StatusSeenByRealmProxy.insertOrUpdate(realm, seenByItem, cache);
                    }
                    seenByOsList.setRow(i, cacheItemIndexseenBy);
                }
            } else {
                seenByOsList.removeAll();
                if (seenByList != null) {
                    for (com.tech.world.model.realms.StatusSeenBy seenByItem : seenByList) {
                        Long cacheItemIndexseenBy = cache.get(seenByItem);
                        if (cacheItemIndexseenBy == null) {
                            cacheItemIndexseenBy = com_tech_world_model_realms_StatusSeenByRealmProxy.insertOrUpdate(realm, seenByItem, cache);
                        }
                        seenByOsList.addRow(cacheItemIndexseenBy);
                    }
                }
            }

        }
    }

    public static com.tech.world.model.realms.Status createDetachedCopy(com.tech.world.model.realms.Status realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.tech.world.model.realms.Status unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.tech.world.model.realms.Status();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.tech.world.model.realms.Status) cachedObject.object;
            }
            unmanagedObject = (com.tech.world.model.realms.Status) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_tech_world_model_realms_StatusRealmProxyInterface unmanagedCopy = (com_tech_world_model_realms_StatusRealmProxyInterface) unmanagedObject;
        com_tech_world_model_realms_StatusRealmProxyInterface realmSource = (com_tech_world_model_realms_StatusRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$statusId(realmSource.realmGet$statusId());
        unmanagedCopy.realmSet$userId(realmSource.realmGet$userId());
        unmanagedCopy.realmSet$timestamp(realmSource.realmGet$timestamp());
        unmanagedCopy.realmSet$thumbImg(realmSource.realmGet$thumbImg());
        unmanagedCopy.realmSet$content(realmSource.realmGet$content());
        unmanagedCopy.realmSet$localPath(realmSource.realmGet$localPath());

        // Deep copy of textStatus
        unmanagedCopy.realmSet$textStatus(com_tech_world_model_realms_TextStatusRealmProxy.createDetachedCopy(realmSource.realmGet$textStatus(), currentDepth + 1, maxDepth, cache));
        unmanagedCopy.realmSet$type(realmSource.realmGet$type());
        unmanagedCopy.realmSet$duration(realmSource.realmGet$duration());
        unmanagedCopy.realmSet$seenCount(realmSource.realmGet$seenCount());
        unmanagedCopy.realmSet$seenCountSent(realmSource.realmGet$seenCountSent());
        unmanagedCopy.realmSet$isSeen(realmSource.realmGet$isSeen());

        // Deep copy of seenBy
        if (currentDepth == maxDepth) {
            unmanagedCopy.realmSet$seenBy(null);
        } else {
            RealmList<com.tech.world.model.realms.StatusSeenBy> managedseenByList = realmSource.realmGet$seenBy();
            RealmList<com.tech.world.model.realms.StatusSeenBy> unmanagedseenByList = new RealmList<com.tech.world.model.realms.StatusSeenBy>();
            unmanagedCopy.realmSet$seenBy(unmanagedseenByList);
            int nextDepth = currentDepth + 1;
            int size = managedseenByList.size();
            for (int i = 0; i < size; i++) {
                com.tech.world.model.realms.StatusSeenBy item = com_tech_world_model_realms_StatusSeenByRealmProxy.createDetachedCopy(managedseenByList.get(i), nextDepth, maxDepth, cache);
                unmanagedseenByList.add(item);
            }
        }

        return unmanagedObject;
    }

    static com.tech.world.model.realms.Status update(Realm realm, StatusColumnInfo columnInfo, com.tech.world.model.realms.Status realmObject, com.tech.world.model.realms.Status newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_tech_world_model_realms_StatusRealmProxyInterface realmObjectTarget = (com_tech_world_model_realms_StatusRealmProxyInterface) realmObject;
        com_tech_world_model_realms_StatusRealmProxyInterface realmObjectSource = (com_tech_world_model_realms_StatusRealmProxyInterface) newObject;
        Table table = realm.getTable(com.tech.world.model.realms.Status.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addString(columnInfo.statusIdColKey, realmObjectSource.realmGet$statusId());
        builder.addString(columnInfo.userIdColKey, realmObjectSource.realmGet$userId());
        builder.addInteger(columnInfo.timestampColKey, realmObjectSource.realmGet$timestamp());
        builder.addString(columnInfo.thumbImgColKey, realmObjectSource.realmGet$thumbImg());
        builder.addString(columnInfo.contentColKey, realmObjectSource.realmGet$content());
        builder.addString(columnInfo.localPathColKey, realmObjectSource.realmGet$localPath());

        com.tech.world.model.realms.TextStatus textStatusObj = realmObjectSource.realmGet$textStatus();
        if (textStatusObj == null) {
            builder.addNull(columnInfo.textStatusColKey);
        } else {
            com.tech.world.model.realms.TextStatus cachetextStatus = (com.tech.world.model.realms.TextStatus) cache.get(textStatusObj);
            if (cachetextStatus != null) {
                builder.addObject(columnInfo.textStatusColKey, cachetextStatus);
            } else {
                builder.addObject(columnInfo.textStatusColKey, com_tech_world_model_realms_TextStatusRealmProxy.copyOrUpdate(realm, (com_tech_world_model_realms_TextStatusRealmProxy.TextStatusColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.TextStatus.class), textStatusObj, true, cache, flags));
            }
        }
        builder.addInteger(columnInfo.typeColKey, realmObjectSource.realmGet$type());
        builder.addInteger(columnInfo.durationColKey, realmObjectSource.realmGet$duration());
        builder.addInteger(columnInfo.seenCountColKey, realmObjectSource.realmGet$seenCount());
        builder.addBoolean(columnInfo.seenCountSentColKey, realmObjectSource.realmGet$seenCountSent());
        builder.addBoolean(columnInfo.isSeenColKey, realmObjectSource.realmGet$isSeen());

        RealmList<com.tech.world.model.realms.StatusSeenBy> seenByUnmanagedList = realmObjectSource.realmGet$seenBy();
        if (seenByUnmanagedList != null) {
            RealmList<com.tech.world.model.realms.StatusSeenBy> seenByManagedCopy = new RealmList<com.tech.world.model.realms.StatusSeenBy>();
            for (int i = 0; i < seenByUnmanagedList.size(); i++) {
                com.tech.world.model.realms.StatusSeenBy seenByItem = seenByUnmanagedList.get(i);
                com.tech.world.model.realms.StatusSeenBy cacheseenBy = (com.tech.world.model.realms.StatusSeenBy) cache.get(seenByItem);
                if (cacheseenBy != null) {
                    seenByManagedCopy.add(cacheseenBy);
                } else {
                    seenByManagedCopy.add(com_tech_world_model_realms_StatusSeenByRealmProxy.copyOrUpdate(realm, (com_tech_world_model_realms_StatusSeenByRealmProxy.StatusSeenByColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.StatusSeenBy.class), seenByItem, true, cache, flags));
                }
            }
            builder.addObjectList(columnInfo.seenByColKey, seenByManagedCopy);
        } else {
            builder.addObjectList(columnInfo.seenByColKey, new RealmList<com.tech.world.model.realms.StatusSeenBy>());
        }

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

}
