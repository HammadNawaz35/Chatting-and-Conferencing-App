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
public class com_tech_world_model_realms_QuotedMessageRealmProxy extends com.tech.world.model.realms.QuotedMessage
    implements RealmObjectProxy, com_tech_world_model_realms_QuotedMessageRealmProxyInterface {

    static final class QuotedMessageColumnInfo extends ColumnInfo {
        long messageIdColKey;
        long fromIdColKey;
        long fromPhoneColKey;
        long toIdColKey;
        long typeColKey;
        long contentColKey;
        long metadataColKey;
        long mediaDurationColKey;
        long thumbColKey;
        long fileSizeColKey;
        long contactColKey;
        long locationColKey;
        long isBroadcastColKey;
        long encryptionTypeColKey;
        long statusColKey;

        QuotedMessageColumnInfo(OsSchemaInfo schemaInfo) {
            super(15);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("QuotedMessage");
            this.messageIdColKey = addColumnDetails("messageId", "messageId", objectSchemaInfo);
            this.fromIdColKey = addColumnDetails("fromId", "fromId", objectSchemaInfo);
            this.fromPhoneColKey = addColumnDetails("fromPhone", "fromPhone", objectSchemaInfo);
            this.toIdColKey = addColumnDetails("toId", "toId", objectSchemaInfo);
            this.typeColKey = addColumnDetails("type", "type", objectSchemaInfo);
            this.contentColKey = addColumnDetails("content", "content", objectSchemaInfo);
            this.metadataColKey = addColumnDetails("metadata", "metadata", objectSchemaInfo);
            this.mediaDurationColKey = addColumnDetails("mediaDuration", "mediaDuration", objectSchemaInfo);
            this.thumbColKey = addColumnDetails("thumb", "thumb", objectSchemaInfo);
            this.fileSizeColKey = addColumnDetails("fileSize", "fileSize", objectSchemaInfo);
            this.contactColKey = addColumnDetails("contact", "contact", objectSchemaInfo);
            this.locationColKey = addColumnDetails("location", "location", objectSchemaInfo);
            this.isBroadcastColKey = addColumnDetails("isBroadcast", "isBroadcast", objectSchemaInfo);
            this.encryptionTypeColKey = addColumnDetails("encryptionType", "encryptionType", objectSchemaInfo);
            this.statusColKey = addColumnDetails("status", "status", objectSchemaInfo);
        }

        QuotedMessageColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new QuotedMessageColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final QuotedMessageColumnInfo src = (QuotedMessageColumnInfo) rawSrc;
            final QuotedMessageColumnInfo dst = (QuotedMessageColumnInfo) rawDst;
            dst.messageIdColKey = src.messageIdColKey;
            dst.fromIdColKey = src.fromIdColKey;
            dst.fromPhoneColKey = src.fromPhoneColKey;
            dst.toIdColKey = src.toIdColKey;
            dst.typeColKey = src.typeColKey;
            dst.contentColKey = src.contentColKey;
            dst.metadataColKey = src.metadataColKey;
            dst.mediaDurationColKey = src.mediaDurationColKey;
            dst.thumbColKey = src.thumbColKey;
            dst.fileSizeColKey = src.fileSizeColKey;
            dst.contactColKey = src.contactColKey;
            dst.locationColKey = src.locationColKey;
            dst.isBroadcastColKey = src.isBroadcastColKey;
            dst.encryptionTypeColKey = src.encryptionTypeColKey;
            dst.statusColKey = src.statusColKey;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private QuotedMessageColumnInfo columnInfo;
    private ProxyState<com.tech.world.model.realms.QuotedMessage> proxyState;

    com_tech_world_model_realms_QuotedMessageRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (QuotedMessageColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.tech.world.model.realms.QuotedMessage>(this);
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
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.messageIdColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.messageIdColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.messageIdColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.messageIdColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$fromId() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.fromIdColKey);
    }

    @Override
    public void realmSet$fromId(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.fromIdColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.fromIdColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.fromIdColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.fromIdColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$fromPhone() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.fromPhoneColKey);
    }

    @Override
    public void realmSet$fromPhone(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.fromPhoneColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.fromPhoneColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.fromPhoneColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.fromPhoneColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$toId() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.toIdColKey);
    }

    @Override
    public void realmSet$toId(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.toIdColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.toIdColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.toIdColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.toIdColKey, value);
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
    public String realmGet$metadata() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.metadataColKey);
    }

    @Override
    public void realmSet$metadata(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.metadataColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.metadataColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.metadataColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.metadataColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$mediaDuration() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.mediaDurationColKey);
    }

    @Override
    public void realmSet$mediaDuration(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.mediaDurationColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.mediaDurationColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.mediaDurationColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.mediaDurationColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$thumb() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.thumbColKey);
    }

    @Override
    public void realmSet$thumb(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.thumbColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.thumbColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.thumbColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.thumbColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$fileSize() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.fileSizeColKey);
    }

    @Override
    public void realmSet$fileSize(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.fileSizeColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.fileSizeColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.fileSizeColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.fileSizeColKey, value);
    }

    @Override
    public com.tech.world.model.realms.RealmContact realmGet$contact() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNullLink(columnInfo.contactColKey)) {
            return null;
        }
        return proxyState.getRealm$realm().get(com.tech.world.model.realms.RealmContact.class, proxyState.getRow$realm().getLink(columnInfo.contactColKey), false, Collections.<String>emptyList());
    }

    @Override
    public void realmSet$contact(com.tech.world.model.realms.RealmContact value) {
        Realm realm = (Realm) proxyState.getRealm$realm();
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("contact")) {
                return;
            }
            if (value != null && !RealmObject.isManaged(value)) {
                value = realm.copyToRealm(value);
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                // Table#nullifyLink() does not support default value. Just using Row.
                row.nullifyLink(columnInfo.contactColKey);
                return;
            }
            proxyState.checkValidObject(value);
            row.getTable().setLink(columnInfo.contactColKey, row.getObjectKey(), ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getObjectKey(), true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().nullifyLink(columnInfo.contactColKey);
            return;
        }
        proxyState.checkValidObject(value);
        proxyState.getRow$realm().setLink(columnInfo.contactColKey, ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getObjectKey());
    }

    @Override
    public com.tech.world.model.realms.RealmLocation realmGet$location() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNullLink(columnInfo.locationColKey)) {
            return null;
        }
        return proxyState.getRealm$realm().get(com.tech.world.model.realms.RealmLocation.class, proxyState.getRow$realm().getLink(columnInfo.locationColKey), false, Collections.<String>emptyList());
    }

    @Override
    public void realmSet$location(com.tech.world.model.realms.RealmLocation value) {
        Realm realm = (Realm) proxyState.getRealm$realm();
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("location")) {
                return;
            }
            if (value != null && !RealmObject.isManaged(value)) {
                value = realm.copyToRealm(value);
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                // Table#nullifyLink() does not support default value. Just using Row.
                row.nullifyLink(columnInfo.locationColKey);
                return;
            }
            proxyState.checkValidObject(value);
            row.getTable().setLink(columnInfo.locationColKey, row.getObjectKey(), ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getObjectKey(), true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().nullifyLink(columnInfo.locationColKey);
            return;
        }
        proxyState.checkValidObject(value);
        proxyState.getRow$realm().setLink(columnInfo.locationColKey, ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getObjectKey());
    }

    @Override
    @SuppressWarnings("cast")
    public boolean realmGet$isBroadcast() {
        proxyState.getRealm$realm().checkIfValid();
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.isBroadcastColKey);
    }

    @Override
    public void realmSet$isBroadcast(boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setBoolean(columnInfo.isBroadcastColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setBoolean(columnInfo.isBroadcastColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$encryptionType() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.encryptionTypeColKey);
    }

    @Override
    public void realmSet$encryptionType(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.encryptionTypeColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.encryptionTypeColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.encryptionTypeColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.encryptionTypeColKey, value);
    }

    @Override
    public com.tech.world.model.realms.Status realmGet$status() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNullLink(columnInfo.statusColKey)) {
            return null;
        }
        return proxyState.getRealm$realm().get(com.tech.world.model.realms.Status.class, proxyState.getRow$realm().getLink(columnInfo.statusColKey), false, Collections.<String>emptyList());
    }

    @Override
    public void realmSet$status(com.tech.world.model.realms.Status value) {
        Realm realm = (Realm) proxyState.getRealm$realm();
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("status")) {
                return;
            }
            if (value != null && !RealmObject.isManaged(value)) {
                value = realm.copyToRealm(value);
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                // Table#nullifyLink() does not support default value. Just using Row.
                row.nullifyLink(columnInfo.statusColKey);
                return;
            }
            proxyState.checkValidObject(value);
            row.getTable().setLink(columnInfo.statusColKey, row.getObjectKey(), ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getObjectKey(), true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().nullifyLink(columnInfo.statusColKey);
            return;
        }
        proxyState.checkValidObject(value);
        proxyState.getRow$realm().setLink(columnInfo.statusColKey, ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getObjectKey());
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("QuotedMessage", false, 15, 0);
        builder.addPersistedProperty("messageId", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("fromId", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("fromPhone", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("toId", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("type", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("content", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("metadata", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("mediaDuration", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("thumb", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("fileSize", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedLinkProperty("contact", RealmFieldType.OBJECT, "RealmContact");
        builder.addPersistedLinkProperty("location", RealmFieldType.OBJECT, "RealmLocation");
        builder.addPersistedProperty("isBroadcast", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("encryptionType", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedLinkProperty("status", RealmFieldType.OBJECT, "Status");
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static QuotedMessageColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new QuotedMessageColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "QuotedMessage";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "QuotedMessage";
    }

    @SuppressWarnings("cast")
    public static com.tech.world.model.realms.QuotedMessage createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(3);
        if (json.has("contact")) {
            excludeFields.add("contact");
        }
        if (json.has("location")) {
            excludeFields.add("location");
        }
        if (json.has("status")) {
            excludeFields.add("status");
        }
        com.tech.world.model.realms.QuotedMessage obj = realm.createObjectInternal(com.tech.world.model.realms.QuotedMessage.class, true, excludeFields);

        final com_tech_world_model_realms_QuotedMessageRealmProxyInterface objProxy = (com_tech_world_model_realms_QuotedMessageRealmProxyInterface) obj;
        if (json.has("messageId")) {
            if (json.isNull("messageId")) {
                objProxy.realmSet$messageId(null);
            } else {
                objProxy.realmSet$messageId((String) json.getString("messageId"));
            }
        }
        if (json.has("fromId")) {
            if (json.isNull("fromId")) {
                objProxy.realmSet$fromId(null);
            } else {
                objProxy.realmSet$fromId((String) json.getString("fromId"));
            }
        }
        if (json.has("fromPhone")) {
            if (json.isNull("fromPhone")) {
                objProxy.realmSet$fromPhone(null);
            } else {
                objProxy.realmSet$fromPhone((String) json.getString("fromPhone"));
            }
        }
        if (json.has("toId")) {
            if (json.isNull("toId")) {
                objProxy.realmSet$toId(null);
            } else {
                objProxy.realmSet$toId((String) json.getString("toId"));
            }
        }
        if (json.has("type")) {
            if (json.isNull("type")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'type' to null.");
            } else {
                objProxy.realmSet$type((int) json.getInt("type"));
            }
        }
        if (json.has("content")) {
            if (json.isNull("content")) {
                objProxy.realmSet$content(null);
            } else {
                objProxy.realmSet$content((String) json.getString("content"));
            }
        }
        if (json.has("metadata")) {
            if (json.isNull("metadata")) {
                objProxy.realmSet$metadata(null);
            } else {
                objProxy.realmSet$metadata((String) json.getString("metadata"));
            }
        }
        if (json.has("mediaDuration")) {
            if (json.isNull("mediaDuration")) {
                objProxy.realmSet$mediaDuration(null);
            } else {
                objProxy.realmSet$mediaDuration((String) json.getString("mediaDuration"));
            }
        }
        if (json.has("thumb")) {
            if (json.isNull("thumb")) {
                objProxy.realmSet$thumb(null);
            } else {
                objProxy.realmSet$thumb((String) json.getString("thumb"));
            }
        }
        if (json.has("fileSize")) {
            if (json.isNull("fileSize")) {
                objProxy.realmSet$fileSize(null);
            } else {
                objProxy.realmSet$fileSize((String) json.getString("fileSize"));
            }
        }
        if (json.has("contact")) {
            if (json.isNull("contact")) {
                objProxy.realmSet$contact(null);
            } else {
                com.tech.world.model.realms.RealmContact contactObj = com_tech_world_model_realms_RealmContactRealmProxy.createOrUpdateUsingJsonObject(realm, json.getJSONObject("contact"), update);
                objProxy.realmSet$contact(contactObj);
            }
        }
        if (json.has("location")) {
            if (json.isNull("location")) {
                objProxy.realmSet$location(null);
            } else {
                com.tech.world.model.realms.RealmLocation locationObj = com_tech_world_model_realms_RealmLocationRealmProxy.createOrUpdateUsingJsonObject(realm, json.getJSONObject("location"), update);
                objProxy.realmSet$location(locationObj);
            }
        }
        if (json.has("isBroadcast")) {
            if (json.isNull("isBroadcast")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'isBroadcast' to null.");
            } else {
                objProxy.realmSet$isBroadcast((boolean) json.getBoolean("isBroadcast"));
            }
        }
        if (json.has("encryptionType")) {
            if (json.isNull("encryptionType")) {
                objProxy.realmSet$encryptionType(null);
            } else {
                objProxy.realmSet$encryptionType((String) json.getString("encryptionType"));
            }
        }
        if (json.has("status")) {
            if (json.isNull("status")) {
                objProxy.realmSet$status(null);
            } else {
                com.tech.world.model.realms.Status statusObj = com_tech_world_model_realms_StatusRealmProxy.createOrUpdateUsingJsonObject(realm, json.getJSONObject("status"), update);
                objProxy.realmSet$status(statusObj);
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.tech.world.model.realms.QuotedMessage createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final com.tech.world.model.realms.QuotedMessage obj = new com.tech.world.model.realms.QuotedMessage();
        final com_tech_world_model_realms_QuotedMessageRealmProxyInterface objProxy = (com_tech_world_model_realms_QuotedMessageRealmProxyInterface) obj;
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
            } else if (name.equals("fromId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$fromId((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$fromId(null);
                }
            } else if (name.equals("fromPhone")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$fromPhone((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$fromPhone(null);
                }
            } else if (name.equals("toId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$toId((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$toId(null);
                }
            } else if (name.equals("type")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$type((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'type' to null.");
                }
            } else if (name.equals("content")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$content((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$content(null);
                }
            } else if (name.equals("metadata")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$metadata((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$metadata(null);
                }
            } else if (name.equals("mediaDuration")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$mediaDuration((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$mediaDuration(null);
                }
            } else if (name.equals("thumb")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$thumb((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$thumb(null);
                }
            } else if (name.equals("fileSize")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$fileSize((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$fileSize(null);
                }
            } else if (name.equals("contact")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$contact(null);
                } else {
                    com.tech.world.model.realms.RealmContact contactObj = com_tech_world_model_realms_RealmContactRealmProxy.createUsingJsonStream(realm, reader);
                    objProxy.realmSet$contact(contactObj);
                }
            } else if (name.equals("location")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$location(null);
                } else {
                    com.tech.world.model.realms.RealmLocation locationObj = com_tech_world_model_realms_RealmLocationRealmProxy.createUsingJsonStream(realm, reader);
                    objProxy.realmSet$location(locationObj);
                }
            } else if (name.equals("isBroadcast")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$isBroadcast((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'isBroadcast' to null.");
                }
            } else if (name.equals("encryptionType")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$encryptionType((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$encryptionType(null);
                }
            } else if (name.equals("status")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$status(null);
                } else {
                    com.tech.world.model.realms.Status statusObj = com_tech_world_model_realms_StatusRealmProxy.createUsingJsonStream(realm, reader);
                    objProxy.realmSet$status(statusObj);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    static com_tech_world_model_realms_QuotedMessageRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.tech.world.model.realms.QuotedMessage.class), false, Collections.<String>emptyList());
        io.realm.com_tech_world_model_realms_QuotedMessageRealmProxy obj = new io.realm.com_tech_world_model_realms_QuotedMessageRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.tech.world.model.realms.QuotedMessage copyOrUpdate(Realm realm, QuotedMessageColumnInfo columnInfo, com.tech.world.model.realms.QuotedMessage object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.tech.world.model.realms.QuotedMessage) cachedRealmObject;
        }

        return copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.tech.world.model.realms.QuotedMessage copy(Realm realm, QuotedMessageColumnInfo columnInfo, com.tech.world.model.realms.QuotedMessage newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.tech.world.model.realms.QuotedMessage) cachedRealmObject;
        }

        com_tech_world_model_realms_QuotedMessageRealmProxyInterface unmanagedSource = (com_tech_world_model_realms_QuotedMessageRealmProxyInterface) newObject;

        Table table = realm.getTable(com.tech.world.model.realms.QuotedMessage.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.messageIdColKey, unmanagedSource.realmGet$messageId());
        builder.addString(columnInfo.fromIdColKey, unmanagedSource.realmGet$fromId());
        builder.addString(columnInfo.fromPhoneColKey, unmanagedSource.realmGet$fromPhone());
        builder.addString(columnInfo.toIdColKey, unmanagedSource.realmGet$toId());
        builder.addInteger(columnInfo.typeColKey, unmanagedSource.realmGet$type());
        builder.addString(columnInfo.contentColKey, unmanagedSource.realmGet$content());
        builder.addString(columnInfo.metadataColKey, unmanagedSource.realmGet$metadata());
        builder.addString(columnInfo.mediaDurationColKey, unmanagedSource.realmGet$mediaDuration());
        builder.addString(columnInfo.thumbColKey, unmanagedSource.realmGet$thumb());
        builder.addString(columnInfo.fileSizeColKey, unmanagedSource.realmGet$fileSize());
        builder.addBoolean(columnInfo.isBroadcastColKey, unmanagedSource.realmGet$isBroadcast());
        builder.addString(columnInfo.encryptionTypeColKey, unmanagedSource.realmGet$encryptionType());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_tech_world_model_realms_QuotedMessageRealmProxy managedCopy = newProxyInstance(realm, row);
        cache.put(newObject, managedCopy);

        // Finally add all fields that reference other Realm Objects, either directly or through a list
        com.tech.world.model.realms.RealmContact contactObj = unmanagedSource.realmGet$contact();
        if (contactObj == null) {
            managedCopy.realmSet$contact(null);
        } else {
            com.tech.world.model.realms.RealmContact cachecontact = (com.tech.world.model.realms.RealmContact) cache.get(contactObj);
            if (cachecontact != null) {
                managedCopy.realmSet$contact(cachecontact);
            } else {
                managedCopy.realmSet$contact(com_tech_world_model_realms_RealmContactRealmProxy.copyOrUpdate(realm, (com_tech_world_model_realms_RealmContactRealmProxy.RealmContactColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.RealmContact.class), contactObj, update, cache, flags));
            }
        }

        com.tech.world.model.realms.RealmLocation locationObj = unmanagedSource.realmGet$location();
        if (locationObj == null) {
            managedCopy.realmSet$location(null);
        } else {
            com.tech.world.model.realms.RealmLocation cachelocation = (com.tech.world.model.realms.RealmLocation) cache.get(locationObj);
            if (cachelocation != null) {
                managedCopy.realmSet$location(cachelocation);
            } else {
                managedCopy.realmSet$location(com_tech_world_model_realms_RealmLocationRealmProxy.copyOrUpdate(realm, (com_tech_world_model_realms_RealmLocationRealmProxy.RealmLocationColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.RealmLocation.class), locationObj, update, cache, flags));
            }
        }

        com.tech.world.model.realms.Status statusObj = unmanagedSource.realmGet$status();
        if (statusObj == null) {
            managedCopy.realmSet$status(null);
        } else {
            com.tech.world.model.realms.Status cachestatus = (com.tech.world.model.realms.Status) cache.get(statusObj);
            if (cachestatus != null) {
                managedCopy.realmSet$status(cachestatus);
            } else {
                managedCopy.realmSet$status(com_tech_world_model_realms_StatusRealmProxy.copyOrUpdate(realm, (com_tech_world_model_realms_StatusRealmProxy.StatusColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.Status.class), statusObj, update, cache, flags));
            }
        }

        return managedCopy;
    }

    public static long insert(Realm realm, com.tech.world.model.realms.QuotedMessage object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.tech.world.model.realms.QuotedMessage.class);
        long tableNativePtr = table.getNativePtr();
        QuotedMessageColumnInfo columnInfo = (QuotedMessageColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.QuotedMessage.class);
        long objKey = OsObject.createRow(table);
        cache.put(object, objKey);
        String realmGet$messageId = ((com_tech_world_model_realms_QuotedMessageRealmProxyInterface) object).realmGet$messageId();
        if (realmGet$messageId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.messageIdColKey, objKey, realmGet$messageId, false);
        }
        String realmGet$fromId = ((com_tech_world_model_realms_QuotedMessageRealmProxyInterface) object).realmGet$fromId();
        if (realmGet$fromId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.fromIdColKey, objKey, realmGet$fromId, false);
        }
        String realmGet$fromPhone = ((com_tech_world_model_realms_QuotedMessageRealmProxyInterface) object).realmGet$fromPhone();
        if (realmGet$fromPhone != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.fromPhoneColKey, objKey, realmGet$fromPhone, false);
        }
        String realmGet$toId = ((com_tech_world_model_realms_QuotedMessageRealmProxyInterface) object).realmGet$toId();
        if (realmGet$toId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.toIdColKey, objKey, realmGet$toId, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.typeColKey, objKey, ((com_tech_world_model_realms_QuotedMessageRealmProxyInterface) object).realmGet$type(), false);
        String realmGet$content = ((com_tech_world_model_realms_QuotedMessageRealmProxyInterface) object).realmGet$content();
        if (realmGet$content != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.contentColKey, objKey, realmGet$content, false);
        }
        String realmGet$metadata = ((com_tech_world_model_realms_QuotedMessageRealmProxyInterface) object).realmGet$metadata();
        if (realmGet$metadata != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.metadataColKey, objKey, realmGet$metadata, false);
        }
        String realmGet$mediaDuration = ((com_tech_world_model_realms_QuotedMessageRealmProxyInterface) object).realmGet$mediaDuration();
        if (realmGet$mediaDuration != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.mediaDurationColKey, objKey, realmGet$mediaDuration, false);
        }
        String realmGet$thumb = ((com_tech_world_model_realms_QuotedMessageRealmProxyInterface) object).realmGet$thumb();
        if (realmGet$thumb != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.thumbColKey, objKey, realmGet$thumb, false);
        }
        String realmGet$fileSize = ((com_tech_world_model_realms_QuotedMessageRealmProxyInterface) object).realmGet$fileSize();
        if (realmGet$fileSize != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.fileSizeColKey, objKey, realmGet$fileSize, false);
        }

        com.tech.world.model.realms.RealmContact contactObj = ((com_tech_world_model_realms_QuotedMessageRealmProxyInterface) object).realmGet$contact();
        if (contactObj != null) {
            Long cachecontact = cache.get(contactObj);
            if (cachecontact == null) {
                cachecontact = com_tech_world_model_realms_RealmContactRealmProxy.insert(realm, contactObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.contactColKey, objKey, cachecontact, false);
        }

        com.tech.world.model.realms.RealmLocation locationObj = ((com_tech_world_model_realms_QuotedMessageRealmProxyInterface) object).realmGet$location();
        if (locationObj != null) {
            Long cachelocation = cache.get(locationObj);
            if (cachelocation == null) {
                cachelocation = com_tech_world_model_realms_RealmLocationRealmProxy.insert(realm, locationObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.locationColKey, objKey, cachelocation, false);
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.isBroadcastColKey, objKey, ((com_tech_world_model_realms_QuotedMessageRealmProxyInterface) object).realmGet$isBroadcast(), false);
        String realmGet$encryptionType = ((com_tech_world_model_realms_QuotedMessageRealmProxyInterface) object).realmGet$encryptionType();
        if (realmGet$encryptionType != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.encryptionTypeColKey, objKey, realmGet$encryptionType, false);
        }

        com.tech.world.model.realms.Status statusObj = ((com_tech_world_model_realms_QuotedMessageRealmProxyInterface) object).realmGet$status();
        if (statusObj != null) {
            Long cachestatus = cache.get(statusObj);
            if (cachestatus == null) {
                cachestatus = com_tech_world_model_realms_StatusRealmProxy.insert(realm, statusObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.statusColKey, objKey, cachestatus, false);
        }
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.tech.world.model.realms.QuotedMessage.class);
        long tableNativePtr = table.getNativePtr();
        QuotedMessageColumnInfo columnInfo = (QuotedMessageColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.QuotedMessage.class);
        com.tech.world.model.realms.QuotedMessage object = null;
        while (objects.hasNext()) {
            object = (com.tech.world.model.realms.QuotedMessage) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = OsObject.createRow(table);
            cache.put(object, objKey);
            String realmGet$messageId = ((com_tech_world_model_realms_QuotedMessageRealmProxyInterface) object).realmGet$messageId();
            if (realmGet$messageId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.messageIdColKey, objKey, realmGet$messageId, false);
            }
            String realmGet$fromId = ((com_tech_world_model_realms_QuotedMessageRealmProxyInterface) object).realmGet$fromId();
            if (realmGet$fromId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.fromIdColKey, objKey, realmGet$fromId, false);
            }
            String realmGet$fromPhone = ((com_tech_world_model_realms_QuotedMessageRealmProxyInterface) object).realmGet$fromPhone();
            if (realmGet$fromPhone != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.fromPhoneColKey, objKey, realmGet$fromPhone, false);
            }
            String realmGet$toId = ((com_tech_world_model_realms_QuotedMessageRealmProxyInterface) object).realmGet$toId();
            if (realmGet$toId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.toIdColKey, objKey, realmGet$toId, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.typeColKey, objKey, ((com_tech_world_model_realms_QuotedMessageRealmProxyInterface) object).realmGet$type(), false);
            String realmGet$content = ((com_tech_world_model_realms_QuotedMessageRealmProxyInterface) object).realmGet$content();
            if (realmGet$content != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.contentColKey, objKey, realmGet$content, false);
            }
            String realmGet$metadata = ((com_tech_world_model_realms_QuotedMessageRealmProxyInterface) object).realmGet$metadata();
            if (realmGet$metadata != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.metadataColKey, objKey, realmGet$metadata, false);
            }
            String realmGet$mediaDuration = ((com_tech_world_model_realms_QuotedMessageRealmProxyInterface) object).realmGet$mediaDuration();
            if (realmGet$mediaDuration != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.mediaDurationColKey, objKey, realmGet$mediaDuration, false);
            }
            String realmGet$thumb = ((com_tech_world_model_realms_QuotedMessageRealmProxyInterface) object).realmGet$thumb();
            if (realmGet$thumb != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.thumbColKey, objKey, realmGet$thumb, false);
            }
            String realmGet$fileSize = ((com_tech_world_model_realms_QuotedMessageRealmProxyInterface) object).realmGet$fileSize();
            if (realmGet$fileSize != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.fileSizeColKey, objKey, realmGet$fileSize, false);
            }

            com.tech.world.model.realms.RealmContact contactObj = ((com_tech_world_model_realms_QuotedMessageRealmProxyInterface) object).realmGet$contact();
            if (contactObj != null) {
                Long cachecontact = cache.get(contactObj);
                if (cachecontact == null) {
                    cachecontact = com_tech_world_model_realms_RealmContactRealmProxy.insert(realm, contactObj, cache);
                }
                table.setLink(columnInfo.contactColKey, objKey, cachecontact, false);
            }

            com.tech.world.model.realms.RealmLocation locationObj = ((com_tech_world_model_realms_QuotedMessageRealmProxyInterface) object).realmGet$location();
            if (locationObj != null) {
                Long cachelocation = cache.get(locationObj);
                if (cachelocation == null) {
                    cachelocation = com_tech_world_model_realms_RealmLocationRealmProxy.insert(realm, locationObj, cache);
                }
                table.setLink(columnInfo.locationColKey, objKey, cachelocation, false);
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.isBroadcastColKey, objKey, ((com_tech_world_model_realms_QuotedMessageRealmProxyInterface) object).realmGet$isBroadcast(), false);
            String realmGet$encryptionType = ((com_tech_world_model_realms_QuotedMessageRealmProxyInterface) object).realmGet$encryptionType();
            if (realmGet$encryptionType != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.encryptionTypeColKey, objKey, realmGet$encryptionType, false);
            }

            com.tech.world.model.realms.Status statusObj = ((com_tech_world_model_realms_QuotedMessageRealmProxyInterface) object).realmGet$status();
            if (statusObj != null) {
                Long cachestatus = cache.get(statusObj);
                if (cachestatus == null) {
                    cachestatus = com_tech_world_model_realms_StatusRealmProxy.insert(realm, statusObj, cache);
                }
                table.setLink(columnInfo.statusColKey, objKey, cachestatus, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.tech.world.model.realms.QuotedMessage object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.tech.world.model.realms.QuotedMessage.class);
        long tableNativePtr = table.getNativePtr();
        QuotedMessageColumnInfo columnInfo = (QuotedMessageColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.QuotedMessage.class);
        long objKey = OsObject.createRow(table);
        cache.put(object, objKey);
        String realmGet$messageId = ((com_tech_world_model_realms_QuotedMessageRealmProxyInterface) object).realmGet$messageId();
        if (realmGet$messageId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.messageIdColKey, objKey, realmGet$messageId, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.messageIdColKey, objKey, false);
        }
        String realmGet$fromId = ((com_tech_world_model_realms_QuotedMessageRealmProxyInterface) object).realmGet$fromId();
        if (realmGet$fromId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.fromIdColKey, objKey, realmGet$fromId, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.fromIdColKey, objKey, false);
        }
        String realmGet$fromPhone = ((com_tech_world_model_realms_QuotedMessageRealmProxyInterface) object).realmGet$fromPhone();
        if (realmGet$fromPhone != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.fromPhoneColKey, objKey, realmGet$fromPhone, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.fromPhoneColKey, objKey, false);
        }
        String realmGet$toId = ((com_tech_world_model_realms_QuotedMessageRealmProxyInterface) object).realmGet$toId();
        if (realmGet$toId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.toIdColKey, objKey, realmGet$toId, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.toIdColKey, objKey, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.typeColKey, objKey, ((com_tech_world_model_realms_QuotedMessageRealmProxyInterface) object).realmGet$type(), false);
        String realmGet$content = ((com_tech_world_model_realms_QuotedMessageRealmProxyInterface) object).realmGet$content();
        if (realmGet$content != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.contentColKey, objKey, realmGet$content, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.contentColKey, objKey, false);
        }
        String realmGet$metadata = ((com_tech_world_model_realms_QuotedMessageRealmProxyInterface) object).realmGet$metadata();
        if (realmGet$metadata != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.metadataColKey, objKey, realmGet$metadata, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.metadataColKey, objKey, false);
        }
        String realmGet$mediaDuration = ((com_tech_world_model_realms_QuotedMessageRealmProxyInterface) object).realmGet$mediaDuration();
        if (realmGet$mediaDuration != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.mediaDurationColKey, objKey, realmGet$mediaDuration, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.mediaDurationColKey, objKey, false);
        }
        String realmGet$thumb = ((com_tech_world_model_realms_QuotedMessageRealmProxyInterface) object).realmGet$thumb();
        if (realmGet$thumb != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.thumbColKey, objKey, realmGet$thumb, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.thumbColKey, objKey, false);
        }
        String realmGet$fileSize = ((com_tech_world_model_realms_QuotedMessageRealmProxyInterface) object).realmGet$fileSize();
        if (realmGet$fileSize != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.fileSizeColKey, objKey, realmGet$fileSize, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.fileSizeColKey, objKey, false);
        }

        com.tech.world.model.realms.RealmContact contactObj = ((com_tech_world_model_realms_QuotedMessageRealmProxyInterface) object).realmGet$contact();
        if (contactObj != null) {
            Long cachecontact = cache.get(contactObj);
            if (cachecontact == null) {
                cachecontact = com_tech_world_model_realms_RealmContactRealmProxy.insertOrUpdate(realm, contactObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.contactColKey, objKey, cachecontact, false);
        } else {
            Table.nativeNullifyLink(tableNativePtr, columnInfo.contactColKey, objKey);
        }

        com.tech.world.model.realms.RealmLocation locationObj = ((com_tech_world_model_realms_QuotedMessageRealmProxyInterface) object).realmGet$location();
        if (locationObj != null) {
            Long cachelocation = cache.get(locationObj);
            if (cachelocation == null) {
                cachelocation = com_tech_world_model_realms_RealmLocationRealmProxy.insertOrUpdate(realm, locationObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.locationColKey, objKey, cachelocation, false);
        } else {
            Table.nativeNullifyLink(tableNativePtr, columnInfo.locationColKey, objKey);
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.isBroadcastColKey, objKey, ((com_tech_world_model_realms_QuotedMessageRealmProxyInterface) object).realmGet$isBroadcast(), false);
        String realmGet$encryptionType = ((com_tech_world_model_realms_QuotedMessageRealmProxyInterface) object).realmGet$encryptionType();
        if (realmGet$encryptionType != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.encryptionTypeColKey, objKey, realmGet$encryptionType, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.encryptionTypeColKey, objKey, false);
        }

        com.tech.world.model.realms.Status statusObj = ((com_tech_world_model_realms_QuotedMessageRealmProxyInterface) object).realmGet$status();
        if (statusObj != null) {
            Long cachestatus = cache.get(statusObj);
            if (cachestatus == null) {
                cachestatus = com_tech_world_model_realms_StatusRealmProxy.insertOrUpdate(realm, statusObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.statusColKey, objKey, cachestatus, false);
        } else {
            Table.nativeNullifyLink(tableNativePtr, columnInfo.statusColKey, objKey);
        }
        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.tech.world.model.realms.QuotedMessage.class);
        long tableNativePtr = table.getNativePtr();
        QuotedMessageColumnInfo columnInfo = (QuotedMessageColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.QuotedMessage.class);
        com.tech.world.model.realms.QuotedMessage object = null;
        while (objects.hasNext()) {
            object = (com.tech.world.model.realms.QuotedMessage) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = OsObject.createRow(table);
            cache.put(object, objKey);
            String realmGet$messageId = ((com_tech_world_model_realms_QuotedMessageRealmProxyInterface) object).realmGet$messageId();
            if (realmGet$messageId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.messageIdColKey, objKey, realmGet$messageId, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.messageIdColKey, objKey, false);
            }
            String realmGet$fromId = ((com_tech_world_model_realms_QuotedMessageRealmProxyInterface) object).realmGet$fromId();
            if (realmGet$fromId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.fromIdColKey, objKey, realmGet$fromId, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.fromIdColKey, objKey, false);
            }
            String realmGet$fromPhone = ((com_tech_world_model_realms_QuotedMessageRealmProxyInterface) object).realmGet$fromPhone();
            if (realmGet$fromPhone != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.fromPhoneColKey, objKey, realmGet$fromPhone, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.fromPhoneColKey, objKey, false);
            }
            String realmGet$toId = ((com_tech_world_model_realms_QuotedMessageRealmProxyInterface) object).realmGet$toId();
            if (realmGet$toId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.toIdColKey, objKey, realmGet$toId, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.toIdColKey, objKey, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.typeColKey, objKey, ((com_tech_world_model_realms_QuotedMessageRealmProxyInterface) object).realmGet$type(), false);
            String realmGet$content = ((com_tech_world_model_realms_QuotedMessageRealmProxyInterface) object).realmGet$content();
            if (realmGet$content != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.contentColKey, objKey, realmGet$content, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.contentColKey, objKey, false);
            }
            String realmGet$metadata = ((com_tech_world_model_realms_QuotedMessageRealmProxyInterface) object).realmGet$metadata();
            if (realmGet$metadata != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.metadataColKey, objKey, realmGet$metadata, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.metadataColKey, objKey, false);
            }
            String realmGet$mediaDuration = ((com_tech_world_model_realms_QuotedMessageRealmProxyInterface) object).realmGet$mediaDuration();
            if (realmGet$mediaDuration != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.mediaDurationColKey, objKey, realmGet$mediaDuration, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.mediaDurationColKey, objKey, false);
            }
            String realmGet$thumb = ((com_tech_world_model_realms_QuotedMessageRealmProxyInterface) object).realmGet$thumb();
            if (realmGet$thumb != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.thumbColKey, objKey, realmGet$thumb, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.thumbColKey, objKey, false);
            }
            String realmGet$fileSize = ((com_tech_world_model_realms_QuotedMessageRealmProxyInterface) object).realmGet$fileSize();
            if (realmGet$fileSize != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.fileSizeColKey, objKey, realmGet$fileSize, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.fileSizeColKey, objKey, false);
            }

            com.tech.world.model.realms.RealmContact contactObj = ((com_tech_world_model_realms_QuotedMessageRealmProxyInterface) object).realmGet$contact();
            if (contactObj != null) {
                Long cachecontact = cache.get(contactObj);
                if (cachecontact == null) {
                    cachecontact = com_tech_world_model_realms_RealmContactRealmProxy.insertOrUpdate(realm, contactObj, cache);
                }
                Table.nativeSetLink(tableNativePtr, columnInfo.contactColKey, objKey, cachecontact, false);
            } else {
                Table.nativeNullifyLink(tableNativePtr, columnInfo.contactColKey, objKey);
            }

            com.tech.world.model.realms.RealmLocation locationObj = ((com_tech_world_model_realms_QuotedMessageRealmProxyInterface) object).realmGet$location();
            if (locationObj != null) {
                Long cachelocation = cache.get(locationObj);
                if (cachelocation == null) {
                    cachelocation = com_tech_world_model_realms_RealmLocationRealmProxy.insertOrUpdate(realm, locationObj, cache);
                }
                Table.nativeSetLink(tableNativePtr, columnInfo.locationColKey, objKey, cachelocation, false);
            } else {
                Table.nativeNullifyLink(tableNativePtr, columnInfo.locationColKey, objKey);
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.isBroadcastColKey, objKey, ((com_tech_world_model_realms_QuotedMessageRealmProxyInterface) object).realmGet$isBroadcast(), false);
            String realmGet$encryptionType = ((com_tech_world_model_realms_QuotedMessageRealmProxyInterface) object).realmGet$encryptionType();
            if (realmGet$encryptionType != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.encryptionTypeColKey, objKey, realmGet$encryptionType, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.encryptionTypeColKey, objKey, false);
            }

            com.tech.world.model.realms.Status statusObj = ((com_tech_world_model_realms_QuotedMessageRealmProxyInterface) object).realmGet$status();
            if (statusObj != null) {
                Long cachestatus = cache.get(statusObj);
                if (cachestatus == null) {
                    cachestatus = com_tech_world_model_realms_StatusRealmProxy.insertOrUpdate(realm, statusObj, cache);
                }
                Table.nativeSetLink(tableNativePtr, columnInfo.statusColKey, objKey, cachestatus, false);
            } else {
                Table.nativeNullifyLink(tableNativePtr, columnInfo.statusColKey, objKey);
            }
        }
    }

    public static com.tech.world.model.realms.QuotedMessage createDetachedCopy(com.tech.world.model.realms.QuotedMessage realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.tech.world.model.realms.QuotedMessage unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.tech.world.model.realms.QuotedMessage();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.tech.world.model.realms.QuotedMessage) cachedObject.object;
            }
            unmanagedObject = (com.tech.world.model.realms.QuotedMessage) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_tech_world_model_realms_QuotedMessageRealmProxyInterface unmanagedCopy = (com_tech_world_model_realms_QuotedMessageRealmProxyInterface) unmanagedObject;
        com_tech_world_model_realms_QuotedMessageRealmProxyInterface realmSource = (com_tech_world_model_realms_QuotedMessageRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$messageId(realmSource.realmGet$messageId());
        unmanagedCopy.realmSet$fromId(realmSource.realmGet$fromId());
        unmanagedCopy.realmSet$fromPhone(realmSource.realmGet$fromPhone());
        unmanagedCopy.realmSet$toId(realmSource.realmGet$toId());
        unmanagedCopy.realmSet$type(realmSource.realmGet$type());
        unmanagedCopy.realmSet$content(realmSource.realmGet$content());
        unmanagedCopy.realmSet$metadata(realmSource.realmGet$metadata());
        unmanagedCopy.realmSet$mediaDuration(realmSource.realmGet$mediaDuration());
        unmanagedCopy.realmSet$thumb(realmSource.realmGet$thumb());
        unmanagedCopy.realmSet$fileSize(realmSource.realmGet$fileSize());

        // Deep copy of contact
        unmanagedCopy.realmSet$contact(com_tech_world_model_realms_RealmContactRealmProxy.createDetachedCopy(realmSource.realmGet$contact(), currentDepth + 1, maxDepth, cache));

        // Deep copy of location
        unmanagedCopy.realmSet$location(com_tech_world_model_realms_RealmLocationRealmProxy.createDetachedCopy(realmSource.realmGet$location(), currentDepth + 1, maxDepth, cache));
        unmanagedCopy.realmSet$isBroadcast(realmSource.realmGet$isBroadcast());
        unmanagedCopy.realmSet$encryptionType(realmSource.realmGet$encryptionType());

        // Deep copy of status
        unmanagedCopy.realmSet$status(com_tech_world_model_realms_StatusRealmProxy.createDetachedCopy(realmSource.realmGet$status(), currentDepth + 1, maxDepth, cache));

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("QuotedMessage = proxy[");
        stringBuilder.append("{messageId:");
        stringBuilder.append(realmGet$messageId() != null ? realmGet$messageId() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{fromId:");
        stringBuilder.append(realmGet$fromId() != null ? realmGet$fromId() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{fromPhone:");
        stringBuilder.append(realmGet$fromPhone() != null ? realmGet$fromPhone() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{toId:");
        stringBuilder.append(realmGet$toId() != null ? realmGet$toId() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{type:");
        stringBuilder.append(realmGet$type());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{content:");
        stringBuilder.append(realmGet$content() != null ? realmGet$content() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{metadata:");
        stringBuilder.append(realmGet$metadata() != null ? realmGet$metadata() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{mediaDuration:");
        stringBuilder.append(realmGet$mediaDuration() != null ? realmGet$mediaDuration() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{thumb:");
        stringBuilder.append(realmGet$thumb() != null ? realmGet$thumb() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{fileSize:");
        stringBuilder.append(realmGet$fileSize() != null ? realmGet$fileSize() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{contact:");
        stringBuilder.append(realmGet$contact() != null ? "RealmContact" : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{location:");
        stringBuilder.append(realmGet$location() != null ? "RealmLocation" : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{isBroadcast:");
        stringBuilder.append(realmGet$isBroadcast());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{encryptionType:");
        stringBuilder.append(realmGet$encryptionType() != null ? realmGet$encryptionType() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{status:");
        stringBuilder.append(realmGet$status() != null ? "Status" : "null");
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
        com_tech_world_model_realms_QuotedMessageRealmProxy aQuotedMessage = (com_tech_world_model_realms_QuotedMessageRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aQuotedMessage.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aQuotedMessage.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aQuotedMessage.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
