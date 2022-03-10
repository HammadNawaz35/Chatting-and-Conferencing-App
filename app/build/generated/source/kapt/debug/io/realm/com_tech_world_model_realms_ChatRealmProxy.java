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
public class com_tech_world_model_realms_ChatRealmProxy extends com.tech.world.model.realms.Chat
    implements RealmObjectProxy, com_tech_world_model_realms_ChatRealmProxyInterface {

    static final class ChatColumnInfo extends ColumnInfo {
        long chatIdColKey;
        long lastMessageColKey;
        long lastMessageTimestampColKey;
        long userColKey;
        long isMutedColKey;
        long unReadCountColKey;
        long firstUnreadMessageIdColKey;
        long notificationIdColKey;
        long unreadMessagesColKey;

        ChatColumnInfo(OsSchemaInfo schemaInfo) {
            super(9);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("Chat");
            this.chatIdColKey = addColumnDetails("chatId", "chatId", objectSchemaInfo);
            this.lastMessageColKey = addColumnDetails("lastMessage", "lastMessage", objectSchemaInfo);
            this.lastMessageTimestampColKey = addColumnDetails("lastMessageTimestamp", "lastMessageTimestamp", objectSchemaInfo);
            this.userColKey = addColumnDetails("user", "user", objectSchemaInfo);
            this.isMutedColKey = addColumnDetails("isMuted", "isMuted", objectSchemaInfo);
            this.unReadCountColKey = addColumnDetails("unReadCount", "unReadCount", objectSchemaInfo);
            this.firstUnreadMessageIdColKey = addColumnDetails("firstUnreadMessageId", "firstUnreadMessageId", objectSchemaInfo);
            this.notificationIdColKey = addColumnDetails("notificationId", "notificationId", objectSchemaInfo);
            this.unreadMessagesColKey = addColumnDetails("unreadMessages", "unreadMessages", objectSchemaInfo);
        }

        ChatColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new ChatColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final ChatColumnInfo src = (ChatColumnInfo) rawSrc;
            final ChatColumnInfo dst = (ChatColumnInfo) rawDst;
            dst.chatIdColKey = src.chatIdColKey;
            dst.lastMessageColKey = src.lastMessageColKey;
            dst.lastMessageTimestampColKey = src.lastMessageTimestampColKey;
            dst.userColKey = src.userColKey;
            dst.isMutedColKey = src.isMutedColKey;
            dst.unReadCountColKey = src.unReadCountColKey;
            dst.firstUnreadMessageIdColKey = src.firstUnreadMessageIdColKey;
            dst.notificationIdColKey = src.notificationIdColKey;
            dst.unreadMessagesColKey = src.unreadMessagesColKey;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private ChatColumnInfo columnInfo;
    private ProxyState<com.tech.world.model.realms.Chat> proxyState;
    private RealmList<com.tech.world.model.realms.Message> unreadMessagesRealmList;

    com_tech_world_model_realms_ChatRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (ChatColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.tech.world.model.realms.Chat>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
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
            // default value of the primary key is always ignored.
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        throw new io.realm.exceptions.RealmException("Primary key field 'chatId' cannot be changed after object was created.");
    }

    @Override
    public com.tech.world.model.realms.Message realmGet$lastMessage() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNullLink(columnInfo.lastMessageColKey)) {
            return null;
        }
        return proxyState.getRealm$realm().get(com.tech.world.model.realms.Message.class, proxyState.getRow$realm().getLink(columnInfo.lastMessageColKey), false, Collections.<String>emptyList());
    }

    @Override
    public void realmSet$lastMessage(com.tech.world.model.realms.Message value) {
        Realm realm = (Realm) proxyState.getRealm$realm();
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("lastMessage")) {
                return;
            }
            if (value != null && !RealmObject.isManaged(value)) {
                value = realm.copyToRealm(value);
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                // Table#nullifyLink() does not support default value. Just using Row.
                row.nullifyLink(columnInfo.lastMessageColKey);
                return;
            }
            proxyState.checkValidObject(value);
            row.getTable().setLink(columnInfo.lastMessageColKey, row.getObjectKey(), ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getObjectKey(), true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().nullifyLink(columnInfo.lastMessageColKey);
            return;
        }
        proxyState.checkValidObject(value);
        proxyState.getRow$realm().setLink(columnInfo.lastMessageColKey, ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getObjectKey());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$lastMessageTimestamp() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.lastMessageTimestampColKey);
    }

    @Override
    public void realmSet$lastMessageTimestamp(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.lastMessageTimestampColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.lastMessageTimestampColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.lastMessageTimestampColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.lastMessageTimestampColKey, value);
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
    public boolean realmGet$isMuted() {
        proxyState.getRealm$realm().checkIfValid();
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.isMutedColKey);
    }

    @Override
    public void realmSet$isMuted(boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setBoolean(columnInfo.isMutedColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setBoolean(columnInfo.isMutedColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$unReadCount() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.unReadCountColKey);
    }

    @Override
    public void realmSet$unReadCount(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.unReadCountColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.unReadCountColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$firstUnreadMessageId() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.firstUnreadMessageIdColKey);
    }

    @Override
    public void realmSet$firstUnreadMessageId(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.firstUnreadMessageIdColKey, row.getObjectKey(), true);
                return;
            }
            row.getTable().setString(columnInfo.firstUnreadMessageIdColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.firstUnreadMessageIdColKey);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.firstUnreadMessageIdColKey, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$notificationId() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.notificationIdColKey);
    }

    @Override
    public void realmSet$notificationId(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.notificationIdColKey, row.getObjectKey(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.notificationIdColKey, value);
    }

    @Override
    public RealmList<com.tech.world.model.realms.Message> realmGet$unreadMessages() {
        proxyState.getRealm$realm().checkIfValid();
        // use the cached value if available
        if (unreadMessagesRealmList != null) {
            return unreadMessagesRealmList;
        } else {
            OsList osList = proxyState.getRow$realm().getModelList(columnInfo.unreadMessagesColKey);
            unreadMessagesRealmList = new RealmList<com.tech.world.model.realms.Message>(com.tech.world.model.realms.Message.class, osList, proxyState.getRealm$realm());
            return unreadMessagesRealmList;
        }
    }

    @Override
    public void realmSet$unreadMessages(RealmList<com.tech.world.model.realms.Message> value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("unreadMessages")) {
                return;
            }
            // if the list contains unmanaged RealmObjects, convert them to managed.
            if (value != null && !value.isManaged()) {
                final Realm realm = (Realm) proxyState.getRealm$realm();
                final RealmList<com.tech.world.model.realms.Message> original = value;
                value = new RealmList<com.tech.world.model.realms.Message>();
                for (com.tech.world.model.realms.Message item : original) {
                    if (item == null || RealmObject.isManaged(item)) {
                        value.add(item);
                    } else {
                        value.add(realm.copyToRealm(item));
                    }
                }
            }
        }

        proxyState.getRealm$realm().checkIfValid();
        OsList osList = proxyState.getRow$realm().getModelList(columnInfo.unreadMessagesColKey);
        // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
        if (value != null && value.size() == osList.size()) {
            int objects = value.size();
            for (int i = 0; i < objects; i++) {
                com.tech.world.model.realms.Message linkedObject = value.get(i);
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
                com.tech.world.model.realms.Message linkedObject = value.get(i);
                proxyState.checkValidObject(linkedObject);
                osList.addRow(((RealmObjectProxy) linkedObject).realmGet$proxyState().getRow$realm().getObjectKey());
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Chat", false, 9, 0);
        builder.addPersistedProperty("chatId", RealmFieldType.STRING, Property.PRIMARY_KEY, Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedLinkProperty("lastMessage", RealmFieldType.OBJECT, "Message");
        builder.addPersistedProperty("lastMessageTimestamp", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedLinkProperty("user", RealmFieldType.OBJECT, "User");
        builder.addPersistedProperty("isMuted", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("unReadCount", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("firstUnreadMessageId", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("notificationId", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedLinkProperty("unreadMessages", RealmFieldType.LIST, "Message");
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static ChatColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new ChatColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "Chat";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Chat";
    }

    @SuppressWarnings("cast")
    public static com.tech.world.model.realms.Chat createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(3);
        com.tech.world.model.realms.Chat obj = null;
        if (update) {
            Table table = realm.getTable(com.tech.world.model.realms.Chat.class);
            ChatColumnInfo columnInfo = (ChatColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.Chat.class);
            long pkColumnKey = columnInfo.chatIdColKey;
            long objKey = Table.NO_MATCH;
            if (json.isNull("chatId")) {
                objKey = table.findFirstNull(pkColumnKey);
            } else {
                objKey = table.findFirstString(pkColumnKey, json.getString("chatId"));
            }
            if (objKey != Table.NO_MATCH) {
                final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
                try {
                    objectContext.set(realm, table.getUncheckedRow(objKey), realm.getSchema().getColumnInfo(com.tech.world.model.realms.Chat.class), false, Collections.<String> emptyList());
                    obj = new io.realm.com_tech_world_model_realms_ChatRealmProxy();
                } finally {
                    objectContext.clear();
                }
            }
        }
        if (obj == null) {
            if (json.has("lastMessage")) {
                excludeFields.add("lastMessage");
            }
            if (json.has("user")) {
                excludeFields.add("user");
            }
            if (json.has("unreadMessages")) {
                excludeFields.add("unreadMessages");
            }
            if (json.has("chatId")) {
                if (json.isNull("chatId")) {
                    obj = (io.realm.com_tech_world_model_realms_ChatRealmProxy) realm.createObjectInternal(com.tech.world.model.realms.Chat.class, null, true, excludeFields);
                } else {
                    obj = (io.realm.com_tech_world_model_realms_ChatRealmProxy) realm.createObjectInternal(com.tech.world.model.realms.Chat.class, json.getString("chatId"), true, excludeFields);
                }
            } else {
                throw new IllegalArgumentException("JSON object doesn't have the primary key field 'chatId'.");
            }
        }

        final com_tech_world_model_realms_ChatRealmProxyInterface objProxy = (com_tech_world_model_realms_ChatRealmProxyInterface) obj;
        if (json.has("lastMessage")) {
            if (json.isNull("lastMessage")) {
                objProxy.realmSet$lastMessage(null);
            } else {
                com.tech.world.model.realms.Message lastMessageObj = com_tech_world_model_realms_MessageRealmProxy.createOrUpdateUsingJsonObject(realm, json.getJSONObject("lastMessage"), update);
                objProxy.realmSet$lastMessage(lastMessageObj);
            }
        }
        if (json.has("lastMessageTimestamp")) {
            if (json.isNull("lastMessageTimestamp")) {
                objProxy.realmSet$lastMessageTimestamp(null);
            } else {
                objProxy.realmSet$lastMessageTimestamp((String) json.getString("lastMessageTimestamp"));
            }
        }
        if (json.has("user")) {
            if (json.isNull("user")) {
                objProxy.realmSet$user(null);
            } else {
                com.tech.world.model.realms.User userObj = com_tech_world_model_realms_UserRealmProxy.createOrUpdateUsingJsonObject(realm, json.getJSONObject("user"), update);
                objProxy.realmSet$user(userObj);
            }
        }
        if (json.has("isMuted")) {
            if (json.isNull("isMuted")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'isMuted' to null.");
            } else {
                objProxy.realmSet$isMuted((boolean) json.getBoolean("isMuted"));
            }
        }
        if (json.has("unReadCount")) {
            if (json.isNull("unReadCount")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'unReadCount' to null.");
            } else {
                objProxy.realmSet$unReadCount((int) json.getInt("unReadCount"));
            }
        }
        if (json.has("firstUnreadMessageId")) {
            if (json.isNull("firstUnreadMessageId")) {
                objProxy.realmSet$firstUnreadMessageId(null);
            } else {
                objProxy.realmSet$firstUnreadMessageId((String) json.getString("firstUnreadMessageId"));
            }
        }
        if (json.has("notificationId")) {
            if (json.isNull("notificationId")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'notificationId' to null.");
            } else {
                objProxy.realmSet$notificationId((int) json.getInt("notificationId"));
            }
        }
        if (json.has("unreadMessages")) {
            if (json.isNull("unreadMessages")) {
                objProxy.realmSet$unreadMessages(null);
            } else {
                objProxy.realmGet$unreadMessages().clear();
                JSONArray array = json.getJSONArray("unreadMessages");
                for (int i = 0; i < array.length(); i++) {
                    com.tech.world.model.realms.Message item = com_tech_world_model_realms_MessageRealmProxy.createOrUpdateUsingJsonObject(realm, array.getJSONObject(i), update);
                    objProxy.realmGet$unreadMessages().add(item);
                }
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.tech.world.model.realms.Chat createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        boolean jsonHasPrimaryKey = false;
        final com.tech.world.model.realms.Chat obj = new com.tech.world.model.realms.Chat();
        final com_tech_world_model_realms_ChatRealmProxyInterface objProxy = (com_tech_world_model_realms_ChatRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("chatId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$chatId((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$chatId(null);
                }
                jsonHasPrimaryKey = true;
            } else if (name.equals("lastMessage")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$lastMessage(null);
                } else {
                    com.tech.world.model.realms.Message lastMessageObj = com_tech_world_model_realms_MessageRealmProxy.createUsingJsonStream(realm, reader);
                    objProxy.realmSet$lastMessage(lastMessageObj);
                }
            } else if (name.equals("lastMessageTimestamp")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$lastMessageTimestamp((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$lastMessageTimestamp(null);
                }
            } else if (name.equals("user")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$user(null);
                } else {
                    com.tech.world.model.realms.User userObj = com_tech_world_model_realms_UserRealmProxy.createUsingJsonStream(realm, reader);
                    objProxy.realmSet$user(userObj);
                }
            } else if (name.equals("isMuted")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$isMuted((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'isMuted' to null.");
                }
            } else if (name.equals("unReadCount")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$unReadCount((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'unReadCount' to null.");
                }
            } else if (name.equals("firstUnreadMessageId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$firstUnreadMessageId((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$firstUnreadMessageId(null);
                }
            } else if (name.equals("notificationId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$notificationId((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'notificationId' to null.");
                }
            } else if (name.equals("unreadMessages")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$unreadMessages(null);
                } else {
                    objProxy.realmSet$unreadMessages(new RealmList<com.tech.world.model.realms.Message>());
                    reader.beginArray();
                    while (reader.hasNext()) {
                        com.tech.world.model.realms.Message item = com_tech_world_model_realms_MessageRealmProxy.createUsingJsonStream(realm, reader);
                        objProxy.realmGet$unreadMessages().add(item);
                    }
                    reader.endArray();
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        if (!jsonHasPrimaryKey) {
            throw new IllegalArgumentException("JSON object doesn't have the primary key field 'chatId'.");
        }
        return realm.copyToRealm(obj);
    }

    static com_tech_world_model_realms_ChatRealmProxy newProxyInstance(BaseRealm realm, Row row) {
        // Ignore default values to avoid creating unexpected objects from RealmModel/RealmList fields
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        objectContext.set(realm, row, realm.getSchema().getColumnInfo(com.tech.world.model.realms.Chat.class), false, Collections.<String>emptyList());
        io.realm.com_tech_world_model_realms_ChatRealmProxy obj = new io.realm.com_tech_world_model_realms_ChatRealmProxy();
        objectContext.clear();
        return obj;
    }

    public static com.tech.world.model.realms.Chat copyOrUpdate(Realm realm, ChatColumnInfo columnInfo, com.tech.world.model.realms.Chat object, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
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
            return (com.tech.world.model.realms.Chat) cachedRealmObject;
        }

        com.tech.world.model.realms.Chat realmObject = null;
        boolean canUpdate = update;
        if (canUpdate) {
            Table table = realm.getTable(com.tech.world.model.realms.Chat.class);
            long pkColumnKey = columnInfo.chatIdColKey;
            String value = ((com_tech_world_model_realms_ChatRealmProxyInterface) object).realmGet$chatId();
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
                    realmObject = new io.realm.com_tech_world_model_realms_ChatRealmProxy();
                    cache.put(object, (RealmObjectProxy) realmObject);
                } finally {
                    objectContext.clear();
                }
            }
        }

        return (canUpdate) ? update(realm, columnInfo, realmObject, object, cache, flags) : copy(realm, columnInfo, object, update, cache, flags);
    }

    public static com.tech.world.model.realms.Chat copy(Realm realm, ChatColumnInfo columnInfo, com.tech.world.model.realms.Chat newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache, Set<ImportFlag> flags) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.tech.world.model.realms.Chat) cachedRealmObject;
        }

        com_tech_world_model_realms_ChatRealmProxyInterface unmanagedSource = (com_tech_world_model_realms_ChatRealmProxyInterface) newObject;

        Table table = realm.getTable(com.tech.world.model.realms.Chat.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);

        // Add all non-"object reference" fields
        builder.addString(columnInfo.chatIdColKey, unmanagedSource.realmGet$chatId());
        builder.addString(columnInfo.lastMessageTimestampColKey, unmanagedSource.realmGet$lastMessageTimestamp());
        builder.addBoolean(columnInfo.isMutedColKey, unmanagedSource.realmGet$isMuted());
        builder.addInteger(columnInfo.unReadCountColKey, unmanagedSource.realmGet$unReadCount());
        builder.addString(columnInfo.firstUnreadMessageIdColKey, unmanagedSource.realmGet$firstUnreadMessageId());
        builder.addInteger(columnInfo.notificationIdColKey, unmanagedSource.realmGet$notificationId());

        // Create the underlying object and cache it before setting any object/objectlist references
        // This will allow us to break any circular dependencies by using the object cache.
        Row row = builder.createNewObject();
        io.realm.com_tech_world_model_realms_ChatRealmProxy managedCopy = newProxyInstance(realm, row);
        cache.put(newObject, managedCopy);

        // Finally add all fields that reference other Realm Objects, either directly or through a list
        com.tech.world.model.realms.Message lastMessageObj = unmanagedSource.realmGet$lastMessage();
        if (lastMessageObj == null) {
            managedCopy.realmSet$lastMessage(null);
        } else {
            com.tech.world.model.realms.Message cachelastMessage = (com.tech.world.model.realms.Message) cache.get(lastMessageObj);
            if (cachelastMessage != null) {
                managedCopy.realmSet$lastMessage(cachelastMessage);
            } else {
                managedCopy.realmSet$lastMessage(com_tech_world_model_realms_MessageRealmProxy.copyOrUpdate(realm, (com_tech_world_model_realms_MessageRealmProxy.MessageColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.Message.class), lastMessageObj, update, cache, flags));
            }
        }

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

        RealmList<com.tech.world.model.realms.Message> unreadMessagesUnmanagedList = unmanagedSource.realmGet$unreadMessages();
        if (unreadMessagesUnmanagedList != null) {
            RealmList<com.tech.world.model.realms.Message> unreadMessagesManagedList = managedCopy.realmGet$unreadMessages();
            unreadMessagesManagedList.clear();
            for (int i = 0; i < unreadMessagesUnmanagedList.size(); i++) {
                com.tech.world.model.realms.Message unreadMessagesUnmanagedItem = unreadMessagesUnmanagedList.get(i);
                com.tech.world.model.realms.Message cacheunreadMessages = (com.tech.world.model.realms.Message) cache.get(unreadMessagesUnmanagedItem);
                if (cacheunreadMessages != null) {
                    unreadMessagesManagedList.add(cacheunreadMessages);
                } else {
                    unreadMessagesManagedList.add(com_tech_world_model_realms_MessageRealmProxy.copyOrUpdate(realm, (com_tech_world_model_realms_MessageRealmProxy.MessageColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.Message.class), unreadMessagesUnmanagedItem, update, cache, flags));
                }
            }
        }

        return managedCopy;
    }

    public static long insert(Realm realm, com.tech.world.model.realms.Chat object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.tech.world.model.realms.Chat.class);
        long tableNativePtr = table.getNativePtr();
        ChatColumnInfo columnInfo = (ChatColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.Chat.class);
        long pkColumnKey = columnInfo.chatIdColKey;
        String primaryKeyValue = ((com_tech_world_model_realms_ChatRealmProxyInterface) object).realmGet$chatId();
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

        com.tech.world.model.realms.Message lastMessageObj = ((com_tech_world_model_realms_ChatRealmProxyInterface) object).realmGet$lastMessage();
        if (lastMessageObj != null) {
            Long cachelastMessage = cache.get(lastMessageObj);
            if (cachelastMessage == null) {
                cachelastMessage = com_tech_world_model_realms_MessageRealmProxy.insert(realm, lastMessageObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.lastMessageColKey, objKey, cachelastMessage, false);
        }
        String realmGet$lastMessageTimestamp = ((com_tech_world_model_realms_ChatRealmProxyInterface) object).realmGet$lastMessageTimestamp();
        if (realmGet$lastMessageTimestamp != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.lastMessageTimestampColKey, objKey, realmGet$lastMessageTimestamp, false);
        }

        com.tech.world.model.realms.User userObj = ((com_tech_world_model_realms_ChatRealmProxyInterface) object).realmGet$user();
        if (userObj != null) {
            Long cacheuser = cache.get(userObj);
            if (cacheuser == null) {
                cacheuser = com_tech_world_model_realms_UserRealmProxy.insert(realm, userObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.userColKey, objKey, cacheuser, false);
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.isMutedColKey, objKey, ((com_tech_world_model_realms_ChatRealmProxyInterface) object).realmGet$isMuted(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.unReadCountColKey, objKey, ((com_tech_world_model_realms_ChatRealmProxyInterface) object).realmGet$unReadCount(), false);
        String realmGet$firstUnreadMessageId = ((com_tech_world_model_realms_ChatRealmProxyInterface) object).realmGet$firstUnreadMessageId();
        if (realmGet$firstUnreadMessageId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.firstUnreadMessageIdColKey, objKey, realmGet$firstUnreadMessageId, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.notificationIdColKey, objKey, ((com_tech_world_model_realms_ChatRealmProxyInterface) object).realmGet$notificationId(), false);

        RealmList<com.tech.world.model.realms.Message> unreadMessagesList = ((com_tech_world_model_realms_ChatRealmProxyInterface) object).realmGet$unreadMessages();
        if (unreadMessagesList != null) {
            OsList unreadMessagesOsList = new OsList(table.getUncheckedRow(objKey), columnInfo.unreadMessagesColKey);
            for (com.tech.world.model.realms.Message unreadMessagesItem : unreadMessagesList) {
                Long cacheItemIndexunreadMessages = cache.get(unreadMessagesItem);
                if (cacheItemIndexunreadMessages == null) {
                    cacheItemIndexunreadMessages = com_tech_world_model_realms_MessageRealmProxy.insert(realm, unreadMessagesItem, cache);
                }
                unreadMessagesOsList.addRow(cacheItemIndexunreadMessages);
            }
        }
        return objKey;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.tech.world.model.realms.Chat.class);
        long tableNativePtr = table.getNativePtr();
        ChatColumnInfo columnInfo = (ChatColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.Chat.class);
        long pkColumnKey = columnInfo.chatIdColKey;
        com.tech.world.model.realms.Chat object = null;
        while (objects.hasNext()) {
            object = (com.tech.world.model.realms.Chat) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            String primaryKeyValue = ((com_tech_world_model_realms_ChatRealmProxyInterface) object).realmGet$chatId();
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

            com.tech.world.model.realms.Message lastMessageObj = ((com_tech_world_model_realms_ChatRealmProxyInterface) object).realmGet$lastMessage();
            if (lastMessageObj != null) {
                Long cachelastMessage = cache.get(lastMessageObj);
                if (cachelastMessage == null) {
                    cachelastMessage = com_tech_world_model_realms_MessageRealmProxy.insert(realm, lastMessageObj, cache);
                }
                table.setLink(columnInfo.lastMessageColKey, objKey, cachelastMessage, false);
            }
            String realmGet$lastMessageTimestamp = ((com_tech_world_model_realms_ChatRealmProxyInterface) object).realmGet$lastMessageTimestamp();
            if (realmGet$lastMessageTimestamp != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.lastMessageTimestampColKey, objKey, realmGet$lastMessageTimestamp, false);
            }

            com.tech.world.model.realms.User userObj = ((com_tech_world_model_realms_ChatRealmProxyInterface) object).realmGet$user();
            if (userObj != null) {
                Long cacheuser = cache.get(userObj);
                if (cacheuser == null) {
                    cacheuser = com_tech_world_model_realms_UserRealmProxy.insert(realm, userObj, cache);
                }
                table.setLink(columnInfo.userColKey, objKey, cacheuser, false);
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.isMutedColKey, objKey, ((com_tech_world_model_realms_ChatRealmProxyInterface) object).realmGet$isMuted(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.unReadCountColKey, objKey, ((com_tech_world_model_realms_ChatRealmProxyInterface) object).realmGet$unReadCount(), false);
            String realmGet$firstUnreadMessageId = ((com_tech_world_model_realms_ChatRealmProxyInterface) object).realmGet$firstUnreadMessageId();
            if (realmGet$firstUnreadMessageId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.firstUnreadMessageIdColKey, objKey, realmGet$firstUnreadMessageId, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.notificationIdColKey, objKey, ((com_tech_world_model_realms_ChatRealmProxyInterface) object).realmGet$notificationId(), false);

            RealmList<com.tech.world.model.realms.Message> unreadMessagesList = ((com_tech_world_model_realms_ChatRealmProxyInterface) object).realmGet$unreadMessages();
            if (unreadMessagesList != null) {
                OsList unreadMessagesOsList = new OsList(table.getUncheckedRow(objKey), columnInfo.unreadMessagesColKey);
                for (com.tech.world.model.realms.Message unreadMessagesItem : unreadMessagesList) {
                    Long cacheItemIndexunreadMessages = cache.get(unreadMessagesItem);
                    if (cacheItemIndexunreadMessages == null) {
                        cacheItemIndexunreadMessages = com_tech_world_model_realms_MessageRealmProxy.insert(realm, unreadMessagesItem, cache);
                    }
                    unreadMessagesOsList.addRow(cacheItemIndexunreadMessages);
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.tech.world.model.realms.Chat object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey();
        }
        Table table = realm.getTable(com.tech.world.model.realms.Chat.class);
        long tableNativePtr = table.getNativePtr();
        ChatColumnInfo columnInfo = (ChatColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.Chat.class);
        long pkColumnKey = columnInfo.chatIdColKey;
        String primaryKeyValue = ((com_tech_world_model_realms_ChatRealmProxyInterface) object).realmGet$chatId();
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

        com.tech.world.model.realms.Message lastMessageObj = ((com_tech_world_model_realms_ChatRealmProxyInterface) object).realmGet$lastMessage();
        if (lastMessageObj != null) {
            Long cachelastMessage = cache.get(lastMessageObj);
            if (cachelastMessage == null) {
                cachelastMessage = com_tech_world_model_realms_MessageRealmProxy.insertOrUpdate(realm, lastMessageObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.lastMessageColKey, objKey, cachelastMessage, false);
        } else {
            Table.nativeNullifyLink(tableNativePtr, columnInfo.lastMessageColKey, objKey);
        }
        String realmGet$lastMessageTimestamp = ((com_tech_world_model_realms_ChatRealmProxyInterface) object).realmGet$lastMessageTimestamp();
        if (realmGet$lastMessageTimestamp != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.lastMessageTimestampColKey, objKey, realmGet$lastMessageTimestamp, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.lastMessageTimestampColKey, objKey, false);
        }

        com.tech.world.model.realms.User userObj = ((com_tech_world_model_realms_ChatRealmProxyInterface) object).realmGet$user();
        if (userObj != null) {
            Long cacheuser = cache.get(userObj);
            if (cacheuser == null) {
                cacheuser = com_tech_world_model_realms_UserRealmProxy.insertOrUpdate(realm, userObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.userColKey, objKey, cacheuser, false);
        } else {
            Table.nativeNullifyLink(tableNativePtr, columnInfo.userColKey, objKey);
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.isMutedColKey, objKey, ((com_tech_world_model_realms_ChatRealmProxyInterface) object).realmGet$isMuted(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.unReadCountColKey, objKey, ((com_tech_world_model_realms_ChatRealmProxyInterface) object).realmGet$unReadCount(), false);
        String realmGet$firstUnreadMessageId = ((com_tech_world_model_realms_ChatRealmProxyInterface) object).realmGet$firstUnreadMessageId();
        if (realmGet$firstUnreadMessageId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.firstUnreadMessageIdColKey, objKey, realmGet$firstUnreadMessageId, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.firstUnreadMessageIdColKey, objKey, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.notificationIdColKey, objKey, ((com_tech_world_model_realms_ChatRealmProxyInterface) object).realmGet$notificationId(), false);

        OsList unreadMessagesOsList = new OsList(table.getUncheckedRow(objKey), columnInfo.unreadMessagesColKey);
        RealmList<com.tech.world.model.realms.Message> unreadMessagesList = ((com_tech_world_model_realms_ChatRealmProxyInterface) object).realmGet$unreadMessages();
        if (unreadMessagesList != null && unreadMessagesList.size() == unreadMessagesOsList.size()) {
            // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
            int objects = unreadMessagesList.size();
            for (int i = 0; i < objects; i++) {
                com.tech.world.model.realms.Message unreadMessagesItem = unreadMessagesList.get(i);
                Long cacheItemIndexunreadMessages = cache.get(unreadMessagesItem);
                if (cacheItemIndexunreadMessages == null) {
                    cacheItemIndexunreadMessages = com_tech_world_model_realms_MessageRealmProxy.insertOrUpdate(realm, unreadMessagesItem, cache);
                }
                unreadMessagesOsList.setRow(i, cacheItemIndexunreadMessages);
            }
        } else {
            unreadMessagesOsList.removeAll();
            if (unreadMessagesList != null) {
                for (com.tech.world.model.realms.Message unreadMessagesItem : unreadMessagesList) {
                    Long cacheItemIndexunreadMessages = cache.get(unreadMessagesItem);
                    if (cacheItemIndexunreadMessages == null) {
                        cacheItemIndexunreadMessages = com_tech_world_model_realms_MessageRealmProxy.insertOrUpdate(realm, unreadMessagesItem, cache);
                    }
                    unreadMessagesOsList.addRow(cacheItemIndexunreadMessages);
                }
            }
        }

        return objKey;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.tech.world.model.realms.Chat.class);
        long tableNativePtr = table.getNativePtr();
        ChatColumnInfo columnInfo = (ChatColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.Chat.class);
        long pkColumnKey = columnInfo.chatIdColKey;
        com.tech.world.model.realms.Chat object = null;
        while (objects.hasNext()) {
            object = (com.tech.world.model.realms.Chat) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && !RealmObject.isFrozen(object) && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getObjectKey());
                continue;
            }
            String primaryKeyValue = ((com_tech_world_model_realms_ChatRealmProxyInterface) object).realmGet$chatId();
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

            com.tech.world.model.realms.Message lastMessageObj = ((com_tech_world_model_realms_ChatRealmProxyInterface) object).realmGet$lastMessage();
            if (lastMessageObj != null) {
                Long cachelastMessage = cache.get(lastMessageObj);
                if (cachelastMessage == null) {
                    cachelastMessage = com_tech_world_model_realms_MessageRealmProxy.insertOrUpdate(realm, lastMessageObj, cache);
                }
                Table.nativeSetLink(tableNativePtr, columnInfo.lastMessageColKey, objKey, cachelastMessage, false);
            } else {
                Table.nativeNullifyLink(tableNativePtr, columnInfo.lastMessageColKey, objKey);
            }
            String realmGet$lastMessageTimestamp = ((com_tech_world_model_realms_ChatRealmProxyInterface) object).realmGet$lastMessageTimestamp();
            if (realmGet$lastMessageTimestamp != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.lastMessageTimestampColKey, objKey, realmGet$lastMessageTimestamp, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.lastMessageTimestampColKey, objKey, false);
            }

            com.tech.world.model.realms.User userObj = ((com_tech_world_model_realms_ChatRealmProxyInterface) object).realmGet$user();
            if (userObj != null) {
                Long cacheuser = cache.get(userObj);
                if (cacheuser == null) {
                    cacheuser = com_tech_world_model_realms_UserRealmProxy.insertOrUpdate(realm, userObj, cache);
                }
                Table.nativeSetLink(tableNativePtr, columnInfo.userColKey, objKey, cacheuser, false);
            } else {
                Table.nativeNullifyLink(tableNativePtr, columnInfo.userColKey, objKey);
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.isMutedColKey, objKey, ((com_tech_world_model_realms_ChatRealmProxyInterface) object).realmGet$isMuted(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.unReadCountColKey, objKey, ((com_tech_world_model_realms_ChatRealmProxyInterface) object).realmGet$unReadCount(), false);
            String realmGet$firstUnreadMessageId = ((com_tech_world_model_realms_ChatRealmProxyInterface) object).realmGet$firstUnreadMessageId();
            if (realmGet$firstUnreadMessageId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.firstUnreadMessageIdColKey, objKey, realmGet$firstUnreadMessageId, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.firstUnreadMessageIdColKey, objKey, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.notificationIdColKey, objKey, ((com_tech_world_model_realms_ChatRealmProxyInterface) object).realmGet$notificationId(), false);

            OsList unreadMessagesOsList = new OsList(table.getUncheckedRow(objKey), columnInfo.unreadMessagesColKey);
            RealmList<com.tech.world.model.realms.Message> unreadMessagesList = ((com_tech_world_model_realms_ChatRealmProxyInterface) object).realmGet$unreadMessages();
            if (unreadMessagesList != null && unreadMessagesList.size() == unreadMessagesOsList.size()) {
                // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
                int objectCount = unreadMessagesList.size();
                for (int i = 0; i < objectCount; i++) {
                    com.tech.world.model.realms.Message unreadMessagesItem = unreadMessagesList.get(i);
                    Long cacheItemIndexunreadMessages = cache.get(unreadMessagesItem);
                    if (cacheItemIndexunreadMessages == null) {
                        cacheItemIndexunreadMessages = com_tech_world_model_realms_MessageRealmProxy.insertOrUpdate(realm, unreadMessagesItem, cache);
                    }
                    unreadMessagesOsList.setRow(i, cacheItemIndexunreadMessages);
                }
            } else {
                unreadMessagesOsList.removeAll();
                if (unreadMessagesList != null) {
                    for (com.tech.world.model.realms.Message unreadMessagesItem : unreadMessagesList) {
                        Long cacheItemIndexunreadMessages = cache.get(unreadMessagesItem);
                        if (cacheItemIndexunreadMessages == null) {
                            cacheItemIndexunreadMessages = com_tech_world_model_realms_MessageRealmProxy.insertOrUpdate(realm, unreadMessagesItem, cache);
                        }
                        unreadMessagesOsList.addRow(cacheItemIndexunreadMessages);
                    }
                }
            }

        }
    }

    public static com.tech.world.model.realms.Chat createDetachedCopy(com.tech.world.model.realms.Chat realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.tech.world.model.realms.Chat unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.tech.world.model.realms.Chat();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.tech.world.model.realms.Chat) cachedObject.object;
            }
            unmanagedObject = (com.tech.world.model.realms.Chat) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_tech_world_model_realms_ChatRealmProxyInterface unmanagedCopy = (com_tech_world_model_realms_ChatRealmProxyInterface) unmanagedObject;
        com_tech_world_model_realms_ChatRealmProxyInterface realmSource = (com_tech_world_model_realms_ChatRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$chatId(realmSource.realmGet$chatId());

        // Deep copy of lastMessage
        unmanagedCopy.realmSet$lastMessage(com_tech_world_model_realms_MessageRealmProxy.createDetachedCopy(realmSource.realmGet$lastMessage(), currentDepth + 1, maxDepth, cache));
        unmanagedCopy.realmSet$lastMessageTimestamp(realmSource.realmGet$lastMessageTimestamp());

        // Deep copy of user
        unmanagedCopy.realmSet$user(com_tech_world_model_realms_UserRealmProxy.createDetachedCopy(realmSource.realmGet$user(), currentDepth + 1, maxDepth, cache));
        unmanagedCopy.realmSet$isMuted(realmSource.realmGet$isMuted());
        unmanagedCopy.realmSet$unReadCount(realmSource.realmGet$unReadCount());
        unmanagedCopy.realmSet$firstUnreadMessageId(realmSource.realmGet$firstUnreadMessageId());
        unmanagedCopy.realmSet$notificationId(realmSource.realmGet$notificationId());

        // Deep copy of unreadMessages
        if (currentDepth == maxDepth) {
            unmanagedCopy.realmSet$unreadMessages(null);
        } else {
            RealmList<com.tech.world.model.realms.Message> managedunreadMessagesList = realmSource.realmGet$unreadMessages();
            RealmList<com.tech.world.model.realms.Message> unmanagedunreadMessagesList = new RealmList<com.tech.world.model.realms.Message>();
            unmanagedCopy.realmSet$unreadMessages(unmanagedunreadMessagesList);
            int nextDepth = currentDepth + 1;
            int size = managedunreadMessagesList.size();
            for (int i = 0; i < size; i++) {
                com.tech.world.model.realms.Message item = com_tech_world_model_realms_MessageRealmProxy.createDetachedCopy(managedunreadMessagesList.get(i), nextDepth, maxDepth, cache);
                unmanagedunreadMessagesList.add(item);
            }
        }

        return unmanagedObject;
    }

    static com.tech.world.model.realms.Chat update(Realm realm, ChatColumnInfo columnInfo, com.tech.world.model.realms.Chat realmObject, com.tech.world.model.realms.Chat newObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        com_tech_world_model_realms_ChatRealmProxyInterface realmObjectTarget = (com_tech_world_model_realms_ChatRealmProxyInterface) realmObject;
        com_tech_world_model_realms_ChatRealmProxyInterface realmObjectSource = (com_tech_world_model_realms_ChatRealmProxyInterface) newObject;
        Table table = realm.getTable(com.tech.world.model.realms.Chat.class);
        OsObjectBuilder builder = new OsObjectBuilder(table, flags);
        builder.addString(columnInfo.chatIdColKey, realmObjectSource.realmGet$chatId());

        com.tech.world.model.realms.Message lastMessageObj = realmObjectSource.realmGet$lastMessage();
        if (lastMessageObj == null) {
            builder.addNull(columnInfo.lastMessageColKey);
        } else {
            com.tech.world.model.realms.Message cachelastMessage = (com.tech.world.model.realms.Message) cache.get(lastMessageObj);
            if (cachelastMessage != null) {
                builder.addObject(columnInfo.lastMessageColKey, cachelastMessage);
            } else {
                builder.addObject(columnInfo.lastMessageColKey, com_tech_world_model_realms_MessageRealmProxy.copyOrUpdate(realm, (com_tech_world_model_realms_MessageRealmProxy.MessageColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.Message.class), lastMessageObj, true, cache, flags));
            }
        }
        builder.addString(columnInfo.lastMessageTimestampColKey, realmObjectSource.realmGet$lastMessageTimestamp());

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
        builder.addBoolean(columnInfo.isMutedColKey, realmObjectSource.realmGet$isMuted());
        builder.addInteger(columnInfo.unReadCountColKey, realmObjectSource.realmGet$unReadCount());
        builder.addString(columnInfo.firstUnreadMessageIdColKey, realmObjectSource.realmGet$firstUnreadMessageId());
        builder.addInteger(columnInfo.notificationIdColKey, realmObjectSource.realmGet$notificationId());

        RealmList<com.tech.world.model.realms.Message> unreadMessagesUnmanagedList = realmObjectSource.realmGet$unreadMessages();
        if (unreadMessagesUnmanagedList != null) {
            RealmList<com.tech.world.model.realms.Message> unreadMessagesManagedCopy = new RealmList<com.tech.world.model.realms.Message>();
            for (int i = 0; i < unreadMessagesUnmanagedList.size(); i++) {
                com.tech.world.model.realms.Message unreadMessagesItem = unreadMessagesUnmanagedList.get(i);
                com.tech.world.model.realms.Message cacheunreadMessages = (com.tech.world.model.realms.Message) cache.get(unreadMessagesItem);
                if (cacheunreadMessages != null) {
                    unreadMessagesManagedCopy.add(cacheunreadMessages);
                } else {
                    unreadMessagesManagedCopy.add(com_tech_world_model_realms_MessageRealmProxy.copyOrUpdate(realm, (com_tech_world_model_realms_MessageRealmProxy.MessageColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.Message.class), unreadMessagesItem, true, cache, flags));
                }
            }
            builder.addObjectList(columnInfo.unreadMessagesColKey, unreadMessagesManagedCopy);
        } else {
            builder.addObjectList(columnInfo.unreadMessagesColKey, new RealmList<com.tech.world.model.realms.Message>());
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
