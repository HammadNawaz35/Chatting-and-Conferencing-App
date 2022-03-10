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
public class com_tech_world_model_realms_TempMessageRealmProxy extends com.tech.world.model.realms.TempMessage
    implements RealmObjectProxy, com_tech_world_model_realms_TempMessageRealmProxyInterface {

    static final class TempMessageColumnInfo extends ColumnInfo {
        long messageIdColKey;
        long fromIdColKey;
        long fromPhoneColKey;
        long toIdColKey;
        long typeColKey;
        long contentColKey;
        long timestampColKey;
        long chatIdColKey;
        long messageStatColKey;
        long localPathColKey;
        long downloadUploadStatColKey;
        long metadataColKey;
        long voiceMessageSeenColKey;
        long mediaDurationColKey;
        long thumbColKey;
        long isForwardedColKey;
        long videoThumbColKey;
        long fileSizeColKey;
        long contactColKey;
        long locationColKey;
        long isGroupColKey;
        long isBroadcastColKey;
        long isSeenColKey;
        long encryptionTypeColKey;
        long quotedMessageColKey;

        TempMessageColumnInfo(OsSchemaInfo schemaInfo) {
            super(25);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("TempMessage");
            this.messageIdColKey = addColumnDetails("messageId", "messageId", objectSchemaInfo);
            this.fromIdColKey = addColumnDetails("fromId", "fromId", objectSchemaInfo);
            this.fromPhoneColKey = addColumnDetails("fromPhone", "fromPhone", objectSchemaInfo);
            this.toIdColKey = addColumnDetails("toId", "toId", objectSchemaInfo);
            this.typeColKey = addColumnDetails("type", "type", objectSchemaInfo);
            this.contentColKey = addColumnDetails("content", "content", objectSchemaInfo);
            this.timestampColKey = addColumnDetails("timestamp", "timestamp", objectSchemaInfo);
            this.chatIdColKey = addColumnDetails("chatId", "chatId", objectSchemaInfo);
            this.messageStatColKey = addColumnDetails("messageStat", "messageStat", objectSchemaInfo);
            this.localPathColKey = addColumnDetails("localPath", "localPath", objectSchemaInfo);
            this.downloadUploadStatColKey = addColumnDetails("downloadUploadStat", "downloadUploadStat", objectSchemaInfo);
            this.metadataColKey = addColumnDetails("metadata", "metadata", objectSchemaInfo);
            this.voiceMessageSeenColKey = addColumnDetails("voiceMessageSeen", "voiceMessageSeen", objectSchemaInfo);
            this.mediaDurationColKey = addColumnDetails("mediaDuration", "mediaDuration", objectSchemaInfo);
            this.thumbColKey = addColumnDetails("thumb", "thumb", objectSchemaInfo);
            this.isForwardedColKey = addColumnDetails("isForwarded", "isForwarded", objectSchemaInfo);
            this.videoThumbColKey = addColumnDetails("videoThumb", "videoThumb", objectSchemaInfo);
            this.fileSizeColKey = addColumnDetails("fileSize", "fileSize", objectSchemaInfo);
            this.contactColKey = addColumnDetails("contact", "contact", objectSchemaInfo);
            this.locationColKey = addColumnDetails("location", "location", objectSchemaInfo);
            this.isGroupColKey = addColumnDetails("isGroup", "isGroup", objectSchemaInfo);
            this.isBroadcastColKey = addColumnDetails("isBroadcast", "isBroadcast", objectSchemaInfo);
            this.isSeenColKey = addColumnDetails("isSeen", "isSeen", objectSchemaInfo);
            this.encryptionTypeColKey = addColumnDetails("encryptionType", "encryptionType", objectSchemaInfo);
            this.quotedMessageColKey = addColumnDetails("quotedMessage", "quotedMessage", objectSchemaInfo);
        }

        TempMessageColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new TempMessageColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final TempMessageColumnInfo src = (TempMessageColumnInfo) rawSrc;
            final TempMessageColumnInfo dst = (TempMessageColumnInfo) rawDst;
            dst.messageIdColKey = src.messageIdColKey;
            dst.fromIdColKey = src.fromIdColKey;
            dst.fromPhoneColKey = src.fromPhoneColKey;
            dst.toIdColKey = src.toIdColKey;
            dst.typeColKey = src.typeColKey;
            dst.contentColKey = src.contentColKey;
            dst.timestampColKey = src.timestampColKey;
            dst.chatIdColKey = src.chatIdColKey;
            dst.messageStatColKey = src.messageStatColKey;
            dst.localPathColKey = src.localPathColKey;
            dst.downloadUploadStatColKey = src.downloadUploadStatColKey;
            dst.metadataColKey = src.metadataColKey;
            dst.voiceMessageSeenColKey = src.voiceMessageSeenColKey;
            dst.mediaDurationColKey = src.mediaDurationColKey;
            dst.thumbColKey = src.thumbColKey;
            dst.isForwardedColKey = src.isForwardedColKey;
            dst.videoThumbColKey = src.videoThumbColKey;
            dst.fileSizeColKey = src.fileSizeColKey;
            dst.contactColKey = src.contactColKey;
            dst.locationColKey = src.locationColKey;
            dst.isGroupColKey = src.isGroupColKey;
            dst.isBroadcastColKey = src.isBroadcastColKey;
            dst.isSeenColKey = src.isSeenColKey;
            dst.encryptionTypeColKey = src.encryptionTypeColKey;
            dst.quotedMessageColKey = src.quotedMessageColKey;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private TempMessageColumnInfo columnInfo;
    private ProxyState<com.tech.world.model.realms.TempMessage> proxyState;

    com_tech_world_model_realms_TempMessageRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (TempMessageColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.tech.world.model.realms.TempMessage>(this);
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
    public String realmGet$chatId() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.chatIdColKey);
    }

    @Override
    public void realmSet$chatId(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.chatIdColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.chatIdColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.chatIdColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.chatIdColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$messageStat() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.messageStatColKey);
    }

    @Override
    public void realmSet$messageStat(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.messageStatColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.messageStatColKey, value);
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
    @SuppressWarnings("cast")
    public int realmGet$downloadUploadStat() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.downloadUploadStatColKey);
    }

    @Override
    public void realmSet$downloadUploadStat(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.downloadUploadStatColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.downloadUploadStatColKey, value);
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
    public boolean realmGet$voiceMessageSeen() {
        proxyState.getRealm$realm().checkIfValid();
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.voiceMessageSeenColKey);
    }

    @Override
    public void realmSet$voiceMessageSeen(boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setBoolean(columnInfo.voiceMessageSeenColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setBoolean(columnInfo.voiceMessageSeenColKey, value);
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
    public boolean realmGet$isForwarded() {
        proxyState.getRealm$realm().checkIfValid();
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.isForwardedColKey);
    }

    @Override
    public void realmSet$isForwarded(boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setBoolean(columnInfo.isForwardedColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setBoolean(columnInfo.isForwardedColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$videoThumb() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.videoThumbColKey);
    }

    @Override
    public void realmSet$videoThumb(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.videoThumbColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.videoThumbColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.videoThumbColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.videoThumbColKey, value);
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
    public boolean realmGet$isGroup() {
        proxyState.getRealm$realm().checkIfValid();
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.isGroupColKey);
    }

    @Override
    public void realmSet$isGroup(boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setBoolean(columnInfo.isGroupColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setBoolean(columnInfo.isGroupColKey, value);
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
    public com.tech.world.model.realms.QuotedMessage realmGet$quotedMessage() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNullLink(columnInfo.quotedMessageColKey)) {
            return null;
        }
        return proxyState.getRealm$realm().get(com.tech.world.model.realms.QuotedMessage.class, proxyState.getRow$realm().getLink(columnInfo.quotedMessageColKey), false, Collections.<String>emptyList());
    }

    @Override
    public void realmSet$quotedMessage(com.tech.world.model.realms.QuotedMessage value) {
        Realm realm = (Realm) proxyState.getRealm$realm();
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("quotedMessage")) {
                return;
            }
            if (value != null && !RealmObject.isManaged(value)) {
                value = realm.copyToRealm(value);
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                // Table#nullifyLink() does not support default value. Just using Row.
                row.nullifyLink(columnInfo.quotedMessageColKey);
                return;
            }
            proxyState.checkValidObject(value);
            row.getTable().setLink(columnInfo.quotedMessageColKey, row.getObjectKey(), ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getObjectKey(), true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().nullifyLink(columnInfo.quotedMessageColKey);
            return;
        }
        proxyState.checkValidObject(value);
        proxyState.getRow$realm().setLink(columnInfo.quotedMessageColKey, ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getObjectKey());
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("TempMessage", false, 25, 0);
        builder.addPersistedProperty("messageId", RealmFieldType.STRING, !Property.PRIMARY_KEY, Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("fromId", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("fromPhone", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("toId", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("type", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("content", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("timestamp", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("chatId", RealmFieldType.STRING, !Property.PRIMARY_KEY, Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("messageStat", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("localPath", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("downloadUploadStat", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("metadata", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("voiceMessageSeen", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("mediaDuration", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("thumb", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("isForwarded", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("videoThumb", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("fileSize", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedLinkProperty("contact", RealmFieldType.OBJECT, "RealmContact");
        builder.addPersistedLinkProperty("location", RealmFieldType.OBJECT, "RealmLocation");
        builder.addPersistedProperty("isGroup", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("isBroadcast", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("isSeen", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("encryptionType", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedLinkProperty("quotedMessage", RealmFieldType.OBJECT, "QuotedMessage");
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static TempMessageColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new TempMessageColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "TempMessage";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "TempMessage";
    }

    @SuppressWarnings("cast")
    public static com.tech.world.model.realms.TempMessage createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(3);
        if (json.has("contact")) {
            excludeFields.add("contact");
        }
        if (json.has("location")) {
            excludeFields.add("location");
        }
        if (json.has("quotedMessage")) {
            excludeFields.add("quotedMessage");
        }
        com.tech.world.model.realms.TempMessage obj = realm.createObjectInternal(com.tech.world.model.realms.TempMessage.class, true, excludeFields);

        final com_tech_world_model_realms_TempMessageRealmProxyInterface objProxy = (com_tech_world_model_realms_TempMessageRealmProxyInterface) obj;
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
        if (json.has("timestamp")) {
            if (json.isNull("timestamp")) {
                objProxy.realmSet$timestamp(null);
            } else {
                objProxy.realmSet$timestamp((String) json.getString("timestamp"));
            }
        }
        if (json.has("chatId")) {
            if (json.isNull("chatId")) {
                objProxy.realmSet$chatId(null);
            } else {
                objProxy.realmSet$chatId((String) json.getString("chatId"));
            }
        }
        if (json.has("messageStat")) {
            if (json.isNull("messageStat")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'messageStat' to null.");
            } else {
                objProxy.realmSet$messageStat((int) json.getInt("messageStat"));
            }
        }
        if (json.has("localPath")) {
            if (json.isNull("localPath")) {
                objProxy.realmSet$localPath(null);
            } else {
                objProxy.realmSet$localPath((String) json.getString("localPath"));
            }
        }
        if (json.has("downloadUploadStat")) {
            if (json.isNull("downloadUploadStat")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'downloadUploadStat' to null.");
            } else {
                objProxy.realmSet$downloadUploadStat((int) json.getInt("downloadUploadStat"));
            }
        }
        if (json.has("metadata")) {
            if (json.isNull("metadata")) {
                objProxy.realmSet$metadata(null);
            } else {
                objProxy.realmSet$metadata((String) json.getString("metadata"));
            }
        }
        if (json.has("voiceMessageSeen")) {
            if (json.isNull("voiceMessageSeen")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'voiceMessageSeen' to null.");
            } else {
                objProxy.realmSet$voiceMessageSeen((boolean) json.getBoolean("voiceMessageSeen"));
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
        if (json.has("isForwarded")) {
            if (json.isNull("isForwarded")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'isForwarded' to null.");
            } else {
                objProxy.realmSet$isForwarded((boolean) json.getBoolean("isForwarded"));
            }
        }
        if (json.has("videoThumb")) {
            if (json.isNull("videoThumb")) {
                objProxy.realmSet$videoThumb(null);
            } else {
                objProxy.realmSet$videoThumb((String) json.getString("videoThumb"));
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
        if (json.has("isGroup")) {
            if (json.isNull("isGroup")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'isGroup' to null.");
            } else {
                objProxy.realmSet$isGroup((boolean) json.getBoolean("isGroup"));
            }
        }
        if (json.has("isBroadcast")) {
            if (json.isNull("isBroadcast")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'isBroadcast' to null.");
            } else {
                objProxy.realmSet$isBroadcast((boolean) json.getBoolean("isBroadcast"));
            }
        }
        if (json.has("isSeen")) {
            if (json.isNull("isSeen")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'isSeen' to null.");
            } else {
                objProxy.realmSet$isSeen((boolean) json.getBoolean("isSeen"));
            }
        }
        if (json.has("encryptionType")) {
            if (json.isNull("encryptionType")) {
                objProxy.realmSet$encryptionType(null);
            } else {
                objProxy.realmSet$encryptionType((String) json.getString("encryptionType"));
            }
        }
        if (json.has("quotedMessage")) {
            if (json.isNull("quotedMessage")) {
                objProxy.realmSet$quotedMessage(null);
            } else {
                com.tech.world.model.realms.QuotedMessage quotedMessageObj = com_tech_world_model_realms_QuotedMessageRealmProxy.createOrUpdateUsingJsonObject(realm, json.getJSONObject("quotedMessage"), update);
                objProxy.realmSet$quotedMessage(quotedMessageObj);
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.tech.world.model.realms.TempMessage createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final com.tech.world.model.realms.TempMessage obj = new com.tech.world.model.realms.TempMessage();
        final com_tech_world_model_realms_TempMessageRealmProxyInterface objProxy = (com_tech_world_model_realms_TempMessageRealmProxyInterface) obj;
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
            } else if (name.equals("timestamp")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$timestamp((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$timestamp(null);
                }
            } else if (name.equals("chatId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$chatId((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$chatId(null);
                }
            } else if (name.equals("messageStat")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$messageStat((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'messageStat' to null.");
                }
            } else if (name.equals("localPath")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$localPath((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$localPath(null);
                }
            } else if (name.equals("downloadUploadStat")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$downloadUploadStat((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'downloadUploadStat' to null.");
                }
            } else if (name.equals("metadata")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$metadata((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$metadata(null);
                }
            } else if (name.equals("voiceMessageSeen")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$voiceMessageSeen((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'voiceMessageSeen' to null.");
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
            } else if (name.equals("isForwarded")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$isForwarded((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'isForwarded' to null.");
                }
            } else if (name.equals("videoThumb")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$videoThumb((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$videoThumb(null);
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
            } else if (name.equals("isGroup")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$isGroup((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'isGroup' to null.");
                }
            } else if (name.equals("isBroadcast")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$isBroadcast((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'isBroadcast' to null.");
                }
            } else if (name.equals("isSeen")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$isSeen((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'isSeen' to null.");
                }
            } else if (name.equals("encryptionType")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$encryptionType((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$encryptionType(null);
                }
            } else if (name.equals("quotedMessage")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$quotedMessage(null);
                } else {
                    com.tech.world.model.realms.QuotedMessage quotedMessageObj = com_tech_world_model_realms_QuotedMessageRealmProxy.createUsingJsonStream(realm, reader);
                    objProxy.realmSet$quotedMessage(quotedMessageObj);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    static com_tech_world_model_realms_TempMessageRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.tech.world.model.realms.TempMessage.class), false, Collections.<String>emptyList());
        io.realm.com_tech_world_model_realms_TempMessageRealmProxy obj = new io.realm.com_tech_world_model_realms_TempMessageRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.tech.world.model.realms.TempMessage copyOrUpdate(Realm realm, TempMessageColumnInfo columnInfo, com.tech.world.model.realms.TempMessage object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.tech.world.model.realms.TempMessage) cachedRealmObject;
        }

        return copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.tech.world.model.realms.TempMessage copy(Realm realm, TempMessageColumnInfo columnInfo, com.tech.world.model.realms.TempMessage newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.tech.world.model.realms.TempMessage) cachedRealmObject;
        }

        com_tech_world_model_realms_TempMessageRealmProxyInterface unmanagedSource = (com_tech_world_model_realms_TempMessageRealmProxyInterface) newObject;

        Table table = realm.getTable(com.tech.world.model.realms.TempMessage.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.messageIdColKey, unmanagedSource.realmGet$messageId());
        builder.addString(columnInfo.fromIdColKey, unmanagedSource.realmGet$fromId());
        builder.addString(columnInfo.fromPhoneColKey, unmanagedSource.realmGet$fromPhone());
        builder.addString(columnInfo.toIdColKey, unmanagedSource.realmGet$toId());
        builder.addInteger(columnInfo.typeColKey, unmanagedSource.realmGet$type());
        builder.addString(columnInfo.contentColKey, unmanagedSource.realmGet$content());
        builder.addString(columnInfo.timestampColKey, unmanagedSource.realmGet$timestamp());
        builder.addString(columnInfo.chatIdColKey, unmanagedSource.realmGet$chatId());
        builder.addInteger(columnInfo.messageStatColKey, unmanagedSource.realmGet$messageStat());
        builder.addString(columnInfo.localPathColKey, unmanagedSource.realmGet$localPath());
        builder.addInteger(columnInfo.downloadUploadStatColKey, unmanagedSource.realmGet$downloadUploadStat());
        builder.addString(columnInfo.metadataColKey, unmanagedSource.realmGet$metadata());
        builder.addBoolean(columnInfo.voiceMessageSeenColKey, unmanagedSource.realmGet$voiceMessageSeen());
        builder.addString(columnInfo.mediaDurationColKey, unmanagedSource.realmGet$mediaDuration());
        builder.addString(columnInfo.thumbColKey, unmanagedSource.realmGet$thumb());
        builder.addBoolean(columnInfo.isForwardedColKey, unmanagedSource.realmGet$isForwarded());
        builder.addString(columnInfo.videoThumbColKey, unmanagedSource.realmGet$videoThumb());
        builder.addString(columnInfo.fileSizeColKey, unmanagedSource.realmGet$fileSize());
        builder.addBoolean(columnInfo.isGroupColKey, unmanagedSource.realmGet$isGroup());
        builder.addBoolean(columnInfo.isBroadcastColKey, unmanagedSource.realmGet$isBroadcast());
        builder.addBoolean(columnInfo.isSeenColKey, unmanagedSource.realmGet$isSeen());
        builder.addString(columnInfo.encryptionTypeColKey, unmanagedSource.realmGet$encryptionType());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_tech_world_model_realms_TempMessageRealmProxy managedCopy = newProxyInstance(realm, row);
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

        com.tech.world.model.realms.QuotedMessage quotedMessageObj = unmanagedSource.realmGet$quotedMessage();
        if (quotedMessageObj == null) {
            managedCopy.realmSet$quotedMessage(null);
        } else {
            com.tech.world.model.realms.QuotedMessage cachequotedMessage = (com.tech.world.model.realms.QuotedMessage) cache.get(quotedMessageObj);
            if (cachequotedMessage != null) {
                managedCopy.realmSet$quotedMessage(cachequotedMessage);
            } else {
                managedCopy.realmSet$quotedMessage(com_tech_world_model_realms_QuotedMessageRealmProxy.copyOrUpdate(realm, (com_tech_world_model_realms_QuotedMessageRealmProxy.QuotedMessageColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.QuotedMessage.class), quotedMessageObj, update, cache, flags));
            }
        }

        return managedCopy;
    }

    public static long insert(Realm realm, com.tech.world.model.realms.TempMessage object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.tech.world.model.realms.TempMessage.class);
        long tableNativePtr = table.getNativePtr();
        TempMessageColumnInfo columnInfo = (TempMessageColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.TempMessage.class);
        long objKey = OsObject.createRow(table);
        cache.put(object, objKey);
        String realmGet$messageId = ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$messageId();
        if (realmGet$messageId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.messageIdColKey, objKey, realmGet$messageId, false);
        }
        String realmGet$fromId = ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$fromId();
        if (realmGet$fromId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.fromIdColKey, objKey, realmGet$fromId, false);
        }
        String realmGet$fromPhone = ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$fromPhone();
        if (realmGet$fromPhone != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.fromPhoneColKey, objKey, realmGet$fromPhone, false);
        }
        String realmGet$toId = ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$toId();
        if (realmGet$toId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.toIdColKey, objKey, realmGet$toId, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.typeColKey, objKey, ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$type(), false);
        String realmGet$content = ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$content();
        if (realmGet$content != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.contentColKey, objKey, realmGet$content, false);
        }
        String realmGet$timestamp = ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$timestamp();
        if (realmGet$timestamp != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.timestampColKey, objKey, realmGet$timestamp, false);
        }
        String realmGet$chatId = ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$chatId();
        if (realmGet$chatId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.chatIdColKey, objKey, realmGet$chatId, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.messageStatColKey, objKey, ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$messageStat(), false);
        String realmGet$localPath = ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$localPath();
        if (realmGet$localPath != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.localPathColKey, objKey, realmGet$localPath, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.downloadUploadStatColKey, objKey, ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$downloadUploadStat(), false);
        String realmGet$metadata = ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$metadata();
        if (realmGet$metadata != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.metadataColKey, objKey, realmGet$metadata, false);
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.voiceMessageSeenColKey, objKey, ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$voiceMessageSeen(), false);
        String realmGet$mediaDuration = ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$mediaDuration();
        if (realmGet$mediaDuration != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.mediaDurationColKey, objKey, realmGet$mediaDuration, false);
        }
        String realmGet$thumb = ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$thumb();
        if (realmGet$thumb != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.thumbColKey, objKey, realmGet$thumb, false);
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.isForwardedColKey, objKey, ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$isForwarded(), false);
        String realmGet$videoThumb = ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$videoThumb();
        if (realmGet$videoThumb != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.videoThumbColKey, objKey, realmGet$videoThumb, false);
        }
        String realmGet$fileSize = ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$fileSize();
        if (realmGet$fileSize != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.fileSizeColKey, objKey, realmGet$fileSize, false);
        }

        com.tech.world.model.realms.RealmContact contactObj = ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$contact();
        if (contactObj != null) {
            Long cachecontact = cache.get(contactObj);
            if (cachecontact == null) {
                cachecontact = com_tech_world_model_realms_RealmContactRealmProxy.insert(realm, contactObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.contactColKey, objKey, cachecontact, false);
        }

        com.tech.world.model.realms.RealmLocation locationObj = ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$location();
        if (locationObj != null) {
            Long cachelocation = cache.get(locationObj);
            if (cachelocation == null) {
                cachelocation = com_tech_world_model_realms_RealmLocationRealmProxy.insert(realm, locationObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.locationColKey, objKey, cachelocation, false);
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.isGroupColKey, objKey, ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$isGroup(), false);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.isBroadcastColKey, objKey, ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$isBroadcast(), false);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.isSeenColKey, objKey, ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$isSeen(), false);
        String realmGet$encryptionType = ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$encryptionType();
        if (realmGet$encryptionType != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.encryptionTypeColKey, objKey, realmGet$encryptionType, false);
        }

        com.tech.world.model.realms.QuotedMessage quotedMessageObj = ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$quotedMessage();
        if (quotedMessageObj != null) {
            Long cachequotedMessage = cache.get(quotedMessageObj);
            if (cachequotedMessage == null) {
                cachequotedMessage = com_tech_world_model_realms_QuotedMessageRealmProxy.insert(realm, quotedMessageObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.quotedMessageColKey, objKey, cachequotedMessage, false);
        }
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.tech.world.model.realms.TempMessage.class);
        long tableNativePtr = table.getNativePtr();
        TempMessageColumnInfo columnInfo = (TempMessageColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.TempMessage.class);
        com.tech.world.model.realms.TempMessage object = null;
        while (objects.hasNext()) {
            object = (com.tech.world.model.realms.TempMessage) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = OsObject.createRow(table);
            cache.put(object, objKey);
            String realmGet$messageId = ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$messageId();
            if (realmGet$messageId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.messageIdColKey, objKey, realmGet$messageId, false);
            }
            String realmGet$fromId = ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$fromId();
            if (realmGet$fromId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.fromIdColKey, objKey, realmGet$fromId, false);
            }
            String realmGet$fromPhone = ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$fromPhone();
            if (realmGet$fromPhone != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.fromPhoneColKey, objKey, realmGet$fromPhone, false);
            }
            String realmGet$toId = ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$toId();
            if (realmGet$toId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.toIdColKey, objKey, realmGet$toId, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.typeColKey, objKey, ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$type(), false);
            String realmGet$content = ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$content();
            if (realmGet$content != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.contentColKey, objKey, realmGet$content, false);
            }
            String realmGet$timestamp = ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$timestamp();
            if (realmGet$timestamp != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.timestampColKey, objKey, realmGet$timestamp, false);
            }
            String realmGet$chatId = ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$chatId();
            if (realmGet$chatId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.chatIdColKey, objKey, realmGet$chatId, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.messageStatColKey, objKey, ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$messageStat(), false);
            String realmGet$localPath = ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$localPath();
            if (realmGet$localPath != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.localPathColKey, objKey, realmGet$localPath, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.downloadUploadStatColKey, objKey, ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$downloadUploadStat(), false);
            String realmGet$metadata = ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$metadata();
            if (realmGet$metadata != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.metadataColKey, objKey, realmGet$metadata, false);
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.voiceMessageSeenColKey, objKey, ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$voiceMessageSeen(), false);
            String realmGet$mediaDuration = ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$mediaDuration();
            if (realmGet$mediaDuration != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.mediaDurationColKey, objKey, realmGet$mediaDuration, false);
            }
            String realmGet$thumb = ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$thumb();
            if (realmGet$thumb != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.thumbColKey, objKey, realmGet$thumb, false);
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.isForwardedColKey, objKey, ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$isForwarded(), false);
            String realmGet$videoThumb = ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$videoThumb();
            if (realmGet$videoThumb != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.videoThumbColKey, objKey, realmGet$videoThumb, false);
            }
            String realmGet$fileSize = ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$fileSize();
            if (realmGet$fileSize != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.fileSizeColKey, objKey, realmGet$fileSize, false);
            }

            com.tech.world.model.realms.RealmContact contactObj = ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$contact();
            if (contactObj != null) {
                Long cachecontact = cache.get(contactObj);
                if (cachecontact == null) {
                    cachecontact = com_tech_world_model_realms_RealmContactRealmProxy.insert(realm, contactObj, cache);
                }
                table.setLink(columnInfo.contactColKey, objKey, cachecontact, false);
            }

            com.tech.world.model.realms.RealmLocation locationObj = ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$location();
            if (locationObj != null) {
                Long cachelocation = cache.get(locationObj);
                if (cachelocation == null) {
                    cachelocation = com_tech_world_model_realms_RealmLocationRealmProxy.insert(realm, locationObj, cache);
                }
                table.setLink(columnInfo.locationColKey, objKey, cachelocation, false);
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.isGroupColKey, objKey, ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$isGroup(), false);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.isBroadcastColKey, objKey, ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$isBroadcast(), false);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.isSeenColKey, objKey, ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$isSeen(), false);
            String realmGet$encryptionType = ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$encryptionType();
            if (realmGet$encryptionType != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.encryptionTypeColKey, objKey, realmGet$encryptionType, false);
            }

            com.tech.world.model.realms.QuotedMessage quotedMessageObj = ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$quotedMessage();
            if (quotedMessageObj != null) {
                Long cachequotedMessage = cache.get(quotedMessageObj);
                if (cachequotedMessage == null) {
                    cachequotedMessage = com_tech_world_model_realms_QuotedMessageRealmProxy.insert(realm, quotedMessageObj, cache);
                }
                table.setLink(columnInfo.quotedMessageColKey, objKey, cachequotedMessage, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.tech.world.model.realms.TempMessage object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.tech.world.model.realms.TempMessage.class);
        long tableNativePtr = table.getNativePtr();
        TempMessageColumnInfo columnInfo = (TempMessageColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.TempMessage.class);
        long objKey = OsObject.createRow(table);
        cache.put(object, objKey);
        String realmGet$messageId = ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$messageId();
        if (realmGet$messageId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.messageIdColKey, objKey, realmGet$messageId, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.messageIdColKey, objKey, false);
        }
        String realmGet$fromId = ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$fromId();
        if (realmGet$fromId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.fromIdColKey, objKey, realmGet$fromId, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.fromIdColKey, objKey, false);
        }
        String realmGet$fromPhone = ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$fromPhone();
        if (realmGet$fromPhone != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.fromPhoneColKey, objKey, realmGet$fromPhone, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.fromPhoneColKey, objKey, false);
        }
        String realmGet$toId = ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$toId();
        if (realmGet$toId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.toIdColKey, objKey, realmGet$toId, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.toIdColKey, objKey, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.typeColKey, objKey, ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$type(), false);
        String realmGet$content = ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$content();
        if (realmGet$content != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.contentColKey, objKey, realmGet$content, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.contentColKey, objKey, false);
        }
        String realmGet$timestamp = ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$timestamp();
        if (realmGet$timestamp != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.timestampColKey, objKey, realmGet$timestamp, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.timestampColKey, objKey, false);
        }
        String realmGet$chatId = ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$chatId();
        if (realmGet$chatId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.chatIdColKey, objKey, realmGet$chatId, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.chatIdColKey, objKey, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.messageStatColKey, objKey, ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$messageStat(), false);
        String realmGet$localPath = ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$localPath();
        if (realmGet$localPath != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.localPathColKey, objKey, realmGet$localPath, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.localPathColKey, objKey, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.downloadUploadStatColKey, objKey, ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$downloadUploadStat(), false);
        String realmGet$metadata = ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$metadata();
        if (realmGet$metadata != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.metadataColKey, objKey, realmGet$metadata, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.metadataColKey, objKey, false);
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.voiceMessageSeenColKey, objKey, ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$voiceMessageSeen(), false);
        String realmGet$mediaDuration = ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$mediaDuration();
        if (realmGet$mediaDuration != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.mediaDurationColKey, objKey, realmGet$mediaDuration, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.mediaDurationColKey, objKey, false);
        }
        String realmGet$thumb = ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$thumb();
        if (realmGet$thumb != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.thumbColKey, objKey, realmGet$thumb, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.thumbColKey, objKey, false);
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.isForwardedColKey, objKey, ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$isForwarded(), false);
        String realmGet$videoThumb = ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$videoThumb();
        if (realmGet$videoThumb != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.videoThumbColKey, objKey, realmGet$videoThumb, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.videoThumbColKey, objKey, false);
        }
        String realmGet$fileSize = ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$fileSize();
        if (realmGet$fileSize != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.fileSizeColKey, objKey, realmGet$fileSize, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.fileSizeColKey, objKey, false);
        }

        com.tech.world.model.realms.RealmContact contactObj = ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$contact();
        if (contactObj != null) {
            Long cachecontact = cache.get(contactObj);
            if (cachecontact == null) {
                cachecontact = com_tech_world_model_realms_RealmContactRealmProxy.insertOrUpdate(realm, contactObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.contactColKey, objKey, cachecontact, false);
        } else {
            Table.nativeNullifyLink(tableNativePtr, columnInfo.contactColKey, objKey);
        }

        com.tech.world.model.realms.RealmLocation locationObj = ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$location();
        if (locationObj != null) {
            Long cachelocation = cache.get(locationObj);
            if (cachelocation == null) {
                cachelocation = com_tech_world_model_realms_RealmLocationRealmProxy.insertOrUpdate(realm, locationObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.locationColKey, objKey, cachelocation, false);
        } else {
            Table.nativeNullifyLink(tableNativePtr, columnInfo.locationColKey, objKey);
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.isGroupColKey, objKey, ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$isGroup(), false);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.isBroadcastColKey, objKey, ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$isBroadcast(), false);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.isSeenColKey, objKey, ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$isSeen(), false);
        String realmGet$encryptionType = ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$encryptionType();
        if (realmGet$encryptionType != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.encryptionTypeColKey, objKey, realmGet$encryptionType, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.encryptionTypeColKey, objKey, false);
        }

        com.tech.world.model.realms.QuotedMessage quotedMessageObj = ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$quotedMessage();
        if (quotedMessageObj != null) {
            Long cachequotedMessage = cache.get(quotedMessageObj);
            if (cachequotedMessage == null) {
                cachequotedMessage = com_tech_world_model_realms_QuotedMessageRealmProxy.insertOrUpdate(realm, quotedMessageObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.quotedMessageColKey, objKey, cachequotedMessage, false);
        } else {
            Table.nativeNullifyLink(tableNativePtr, columnInfo.quotedMessageColKey, objKey);
        }
        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.tech.world.model.realms.TempMessage.class);
        long tableNativePtr = table.getNativePtr();
        TempMessageColumnInfo columnInfo = (TempMessageColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.TempMessage.class);
        com.tech.world.model.realms.TempMessage object = null;
        while (objects.hasNext()) {
            object = (com.tech.world.model.realms.TempMessage) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            long objKey = OsObject.createRow(table);
            cache.put(object, objKey);
            String realmGet$messageId = ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$messageId();
            if (realmGet$messageId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.messageIdColKey, objKey, realmGet$messageId, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.messageIdColKey, objKey, false);
            }
            String realmGet$fromId = ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$fromId();
            if (realmGet$fromId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.fromIdColKey, objKey, realmGet$fromId, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.fromIdColKey, objKey, false);
            }
            String realmGet$fromPhone = ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$fromPhone();
            if (realmGet$fromPhone != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.fromPhoneColKey, objKey, realmGet$fromPhone, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.fromPhoneColKey, objKey, false);
            }
            String realmGet$toId = ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$toId();
            if (realmGet$toId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.toIdColKey, objKey, realmGet$toId, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.toIdColKey, objKey, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.typeColKey, objKey, ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$type(), false);
            String realmGet$content = ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$content();
            if (realmGet$content != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.contentColKey, objKey, realmGet$content, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.contentColKey, objKey, false);
            }
            String realmGet$timestamp = ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$timestamp();
            if (realmGet$timestamp != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.timestampColKey, objKey, realmGet$timestamp, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.timestampColKey, objKey, false);
            }
            String realmGet$chatId = ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$chatId();
            if (realmGet$chatId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.chatIdColKey, objKey, realmGet$chatId, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.chatIdColKey, objKey, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.messageStatColKey, objKey, ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$messageStat(), false);
            String realmGet$localPath = ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$localPath();
            if (realmGet$localPath != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.localPathColKey, objKey, realmGet$localPath, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.localPathColKey, objKey, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.downloadUploadStatColKey, objKey, ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$downloadUploadStat(), false);
            String realmGet$metadata = ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$metadata();
            if (realmGet$metadata != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.metadataColKey, objKey, realmGet$metadata, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.metadataColKey, objKey, false);
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.voiceMessageSeenColKey, objKey, ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$voiceMessageSeen(), false);
            String realmGet$mediaDuration = ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$mediaDuration();
            if (realmGet$mediaDuration != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.mediaDurationColKey, objKey, realmGet$mediaDuration, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.mediaDurationColKey, objKey, false);
            }
            String realmGet$thumb = ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$thumb();
            if (realmGet$thumb != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.thumbColKey, objKey, realmGet$thumb, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.thumbColKey, objKey, false);
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.isForwardedColKey, objKey, ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$isForwarded(), false);
            String realmGet$videoThumb = ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$videoThumb();
            if (realmGet$videoThumb != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.videoThumbColKey, objKey, realmGet$videoThumb, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.videoThumbColKey, objKey, false);
            }
            String realmGet$fileSize = ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$fileSize();
            if (realmGet$fileSize != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.fileSizeColKey, objKey, realmGet$fileSize, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.fileSizeColKey, objKey, false);
            }

            com.tech.world.model.realms.RealmContact contactObj = ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$contact();
            if (contactObj != null) {
                Long cachecontact = cache.get(contactObj);
                if (cachecontact == null) {
                    cachecontact = com_tech_world_model_realms_RealmContactRealmProxy.insertOrUpdate(realm, contactObj, cache);
                }
                Table.nativeSetLink(tableNativePtr, columnInfo.contactColKey, objKey, cachecontact, false);
            } else {
                Table.nativeNullifyLink(tableNativePtr, columnInfo.contactColKey, objKey);
            }

            com.tech.world.model.realms.RealmLocation locationObj = ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$location();
            if (locationObj != null) {
                Long cachelocation = cache.get(locationObj);
                if (cachelocation == null) {
                    cachelocation = com_tech_world_model_realms_RealmLocationRealmProxy.insertOrUpdate(realm, locationObj, cache);
                }
                Table.nativeSetLink(tableNativePtr, columnInfo.locationColKey, objKey, cachelocation, false);
            } else {
                Table.nativeNullifyLink(tableNativePtr, columnInfo.locationColKey, objKey);
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.isGroupColKey, objKey, ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$isGroup(), false);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.isBroadcastColKey, objKey, ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$isBroadcast(), false);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.isSeenColKey, objKey, ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$isSeen(), false);
            String realmGet$encryptionType = ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$encryptionType();
            if (realmGet$encryptionType != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.encryptionTypeColKey, objKey, realmGet$encryptionType, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.encryptionTypeColKey, objKey, false);
            }

            com.tech.world.model.realms.QuotedMessage quotedMessageObj = ((com_tech_world_model_realms_TempMessageRealmProxyInterface) object).realmGet$quotedMessage();
            if (quotedMessageObj != null) {
                Long cachequotedMessage = cache.get(quotedMessageObj);
                if (cachequotedMessage == null) {
                    cachequotedMessage = com_tech_world_model_realms_QuotedMessageRealmProxy.insertOrUpdate(realm, quotedMessageObj, cache);
                }
                Table.nativeSetLink(tableNativePtr, columnInfo.quotedMessageColKey, objKey, cachequotedMessage, false);
            } else {
                Table.nativeNullifyLink(tableNativePtr, columnInfo.quotedMessageColKey, objKey);
            }
        }
    }

    public static com.tech.world.model.realms.TempMessage createDetachedCopy(com.tech.world.model.realms.TempMessage realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.tech.world.model.realms.TempMessage unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.tech.world.model.realms.TempMessage();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.tech.world.model.realms.TempMessage) cachedObject.object;
            }
            unmanagedObject = (com.tech.world.model.realms.TempMessage) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_tech_world_model_realms_TempMessageRealmProxyInterface unmanagedCopy = (com_tech_world_model_realms_TempMessageRealmProxyInterface) unmanagedObject;
        com_tech_world_model_realms_TempMessageRealmProxyInterface realmSource = (com_tech_world_model_realms_TempMessageRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$messageId(realmSource.realmGet$messageId());
        unmanagedCopy.realmSet$fromId(realmSource.realmGet$fromId());
        unmanagedCopy.realmSet$fromPhone(realmSource.realmGet$fromPhone());
        unmanagedCopy.realmSet$toId(realmSource.realmGet$toId());
        unmanagedCopy.realmSet$type(realmSource.realmGet$type());
        unmanagedCopy.realmSet$content(realmSource.realmGet$content());
        unmanagedCopy.realmSet$timestamp(realmSource.realmGet$timestamp());
        unmanagedCopy.realmSet$chatId(realmSource.realmGet$chatId());
        unmanagedCopy.realmSet$messageStat(realmSource.realmGet$messageStat());
        unmanagedCopy.realmSet$localPath(realmSource.realmGet$localPath());
        unmanagedCopy.realmSet$downloadUploadStat(realmSource.realmGet$downloadUploadStat());
        unmanagedCopy.realmSet$metadata(realmSource.realmGet$metadata());
        unmanagedCopy.realmSet$voiceMessageSeen(realmSource.realmGet$voiceMessageSeen());
        unmanagedCopy.realmSet$mediaDuration(realmSource.realmGet$mediaDuration());
        unmanagedCopy.realmSet$thumb(realmSource.realmGet$thumb());
        unmanagedCopy.realmSet$isForwarded(realmSource.realmGet$isForwarded());
        unmanagedCopy.realmSet$videoThumb(realmSource.realmGet$videoThumb());
        unmanagedCopy.realmSet$fileSize(realmSource.realmGet$fileSize());

        // Deep copy of contact
        unmanagedCopy.realmSet$contact(com_tech_world_model_realms_RealmContactRealmProxy.createDetachedCopy(realmSource.realmGet$contact(), currentDepth + 1, maxDepth, cache));

        // Deep copy of location
        unmanagedCopy.realmSet$location(com_tech_world_model_realms_RealmLocationRealmProxy.createDetachedCopy(realmSource.realmGet$location(), currentDepth + 1, maxDepth, cache));
        unmanagedCopy.realmSet$isGroup(realmSource.realmGet$isGroup());
        unmanagedCopy.realmSet$isBroadcast(realmSource.realmGet$isBroadcast());
        unmanagedCopy.realmSet$isSeen(realmSource.realmGet$isSeen());
        unmanagedCopy.realmSet$encryptionType(realmSource.realmGet$encryptionType());

        // Deep copy of quotedMessage
        unmanagedCopy.realmSet$quotedMessage(com_tech_world_model_realms_QuotedMessageRealmProxy.createDetachedCopy(realmSource.realmGet$quotedMessage(), currentDepth + 1, maxDepth, cache));

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("TempMessage = proxy[");
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
        stringBuilder.append("{timestamp:");
        stringBuilder.append(realmGet$timestamp() != null ? realmGet$timestamp() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{chatId:");
        stringBuilder.append(realmGet$chatId() != null ? realmGet$chatId() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{messageStat:");
        stringBuilder.append(realmGet$messageStat());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{localPath:");
        stringBuilder.append(realmGet$localPath() != null ? realmGet$localPath() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{downloadUploadStat:");
        stringBuilder.append(realmGet$downloadUploadStat());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{metadata:");
        stringBuilder.append(realmGet$metadata() != null ? realmGet$metadata() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{voiceMessageSeen:");
        stringBuilder.append(realmGet$voiceMessageSeen());
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
        stringBuilder.append("{isForwarded:");
        stringBuilder.append(realmGet$isForwarded());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{videoThumb:");
        stringBuilder.append(realmGet$videoThumb() != null ? realmGet$videoThumb() : "null");
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
        stringBuilder.append("{isGroup:");
        stringBuilder.append(realmGet$isGroup());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{isBroadcast:");
        stringBuilder.append(realmGet$isBroadcast());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{isSeen:");
        stringBuilder.append(realmGet$isSeen());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{encryptionType:");
        stringBuilder.append(realmGet$encryptionType() != null ? realmGet$encryptionType() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{quotedMessage:");
        stringBuilder.append(realmGet$quotedMessage() != null ? "QuotedMessage" : "null");
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
        com_tech_world_model_realms_TempMessageRealmProxy aTempMessage = (com_tech_world_model_realms_TempMessageRealmProxy)o;

        BaseRealm realm = proxyState.getRealm$realm();
        BaseRealm otherRealm = aTempMessage.proxyState.getRealm$realm();
        String path = realm.getPath();
        String otherPath = otherRealm.getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;
        if (realm.isFrozen() != otherRealm.isFrozen()) return false;
        if (!realm.sharedRealm.getVersionID().equals(otherRealm.sharedRealm.getVersionID())) {
            return false;
        }

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aTempMessage.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getObjectKey() != aTempMessage.proxyState.getRow$realm().getObjectKey()) return false;

        return true;
    }
}
