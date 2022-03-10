package io.realm;


import android.util.JsonReader;
import io.realm.ImportFlag;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.RealmProxyMediator;
import io.realm.internal.Row;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

@io.realm.annotations.RealmModule
class DefaultRealmModuleMediator extends RealmProxyMediator {

    private static final Set<Class<? extends RealmModel>> MODEL_CLASSES;
    static {
        Set<Class<? extends RealmModel>> modelClasses = new HashSet<Class<? extends RealmModel>>(22);
        modelClasses.add(com.tech.world.model.realms.Broadcast.class);
        modelClasses.add(com.tech.world.model.realms.Chat.class);
        modelClasses.add(com.tech.world.model.realms.CurrentUserInfo.class);
        modelClasses.add(com.tech.world.model.realms.DeletedMessage.class);
        modelClasses.add(com.tech.world.model.realms.FireCall.class);
        modelClasses.add(com.tech.world.model.realms.Group.class);
        modelClasses.add(com.tech.world.model.realms.GroupEvent.class);
        modelClasses.add(com.tech.world.model.realms.JobId.class);
        modelClasses.add(com.tech.world.model.realms.Message.class);
        modelClasses.add(com.tech.world.model.realms.PendingGroupJob.class);
        modelClasses.add(com.tech.world.model.realms.PhoneNumber.class);
        modelClasses.add(com.tech.world.model.realms.QuotedMessage.class);
        modelClasses.add(com.tech.world.model.realms.RealmContact.class);
        modelClasses.add(com.tech.world.model.realms.RealmLocation.class);
        modelClasses.add(com.tech.world.model.realms.Status.class);
        modelClasses.add(com.tech.world.model.realms.TempMessage.class);
        modelClasses.add(com.tech.world.model.realms.UnUpdatedStat.class);
        modelClasses.add(com.tech.world.model.realms.UnUpdatedVoiceMessageStat.class);
        modelClasses.add(com.tech.world.model.realms.User.class);
        modelClasses.add(com.tech.world.model.realms.UserStatuses.class);
        modelClasses.add(com.tech.world.model.realms.StatusSeenBy.class);
        modelClasses.add(com.tech.world.model.realms.TextStatus.class);
        MODEL_CLASSES = Collections.unmodifiableSet(modelClasses);
    }

    @Override
    public Map<Class<? extends RealmModel>, OsObjectSchemaInfo> getExpectedObjectSchemaInfoMap() {
        Map<Class<? extends RealmModel>, OsObjectSchemaInfo> infoMap = new HashMap<Class<? extends RealmModel>, OsObjectSchemaInfo>(22);
        infoMap.put(com.tech.world.model.realms.Broadcast.class, io.realm.com_tech_world_model_realms_BroadcastRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.tech.world.model.realms.Chat.class, io.realm.com_tech_world_model_realms_ChatRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.tech.world.model.realms.CurrentUserInfo.class, io.realm.com_tech_world_model_realms_CurrentUserInfoRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.tech.world.model.realms.DeletedMessage.class, io.realm.com_tech_world_model_realms_DeletedMessageRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.tech.world.model.realms.FireCall.class, io.realm.com_tech_world_model_realms_FireCallRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.tech.world.model.realms.Group.class, io.realm.com_tech_world_model_realms_GroupRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.tech.world.model.realms.GroupEvent.class, io.realm.com_tech_world_model_realms_GroupEventRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.tech.world.model.realms.JobId.class, io.realm.com_tech_world_model_realms_JobIdRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.tech.world.model.realms.Message.class, io.realm.com_tech_world_model_realms_MessageRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.tech.world.model.realms.PendingGroupJob.class, io.realm.com_tech_world_model_realms_PendingGroupJobRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.tech.world.model.realms.PhoneNumber.class, io.realm.com_tech_world_model_realms_PhoneNumberRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.tech.world.model.realms.QuotedMessage.class, io.realm.com_tech_world_model_realms_QuotedMessageRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.tech.world.model.realms.RealmContact.class, io.realm.com_tech_world_model_realms_RealmContactRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.tech.world.model.realms.RealmLocation.class, io.realm.com_tech_world_model_realms_RealmLocationRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.tech.world.model.realms.Status.class, io.realm.com_tech_world_model_realms_StatusRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.tech.world.model.realms.TempMessage.class, io.realm.com_tech_world_model_realms_TempMessageRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.tech.world.model.realms.UnUpdatedStat.class, io.realm.com_tech_world_model_realms_UnUpdatedStatRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.tech.world.model.realms.UnUpdatedVoiceMessageStat.class, io.realm.com_tech_world_model_realms_UnUpdatedVoiceMessageStatRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.tech.world.model.realms.User.class, io.realm.com_tech_world_model_realms_UserRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.tech.world.model.realms.UserStatuses.class, io.realm.com_tech_world_model_realms_UserStatusesRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.tech.world.model.realms.StatusSeenBy.class, io.realm.com_tech_world_model_realms_StatusSeenByRealmProxy.getExpectedObjectSchemaInfo());
        infoMap.put(com.tech.world.model.realms.TextStatus.class, io.realm.com_tech_world_model_realms_TextStatusRealmProxy.getExpectedObjectSchemaInfo());
        return infoMap;
    }

    @Override
    public ColumnInfo createColumnInfo(Class<? extends RealmModel> clazz, OsSchemaInfo schemaInfo) {
        checkClass(clazz);

        if (clazz.equals(com.tech.world.model.realms.Broadcast.class)) {
            return io.realm.com_tech_world_model_realms_BroadcastRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.tech.world.model.realms.Chat.class)) {
            return io.realm.com_tech_world_model_realms_ChatRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.tech.world.model.realms.CurrentUserInfo.class)) {
            return io.realm.com_tech_world_model_realms_CurrentUserInfoRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.tech.world.model.realms.DeletedMessage.class)) {
            return io.realm.com_tech_world_model_realms_DeletedMessageRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.tech.world.model.realms.FireCall.class)) {
            return io.realm.com_tech_world_model_realms_FireCallRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.tech.world.model.realms.Group.class)) {
            return io.realm.com_tech_world_model_realms_GroupRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.tech.world.model.realms.GroupEvent.class)) {
            return io.realm.com_tech_world_model_realms_GroupEventRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.tech.world.model.realms.JobId.class)) {
            return io.realm.com_tech_world_model_realms_JobIdRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.tech.world.model.realms.Message.class)) {
            return io.realm.com_tech_world_model_realms_MessageRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.tech.world.model.realms.PendingGroupJob.class)) {
            return io.realm.com_tech_world_model_realms_PendingGroupJobRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.tech.world.model.realms.PhoneNumber.class)) {
            return io.realm.com_tech_world_model_realms_PhoneNumberRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.tech.world.model.realms.QuotedMessage.class)) {
            return io.realm.com_tech_world_model_realms_QuotedMessageRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.tech.world.model.realms.RealmContact.class)) {
            return io.realm.com_tech_world_model_realms_RealmContactRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.tech.world.model.realms.RealmLocation.class)) {
            return io.realm.com_tech_world_model_realms_RealmLocationRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.tech.world.model.realms.Status.class)) {
            return io.realm.com_tech_world_model_realms_StatusRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.tech.world.model.realms.TempMessage.class)) {
            return io.realm.com_tech_world_model_realms_TempMessageRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.tech.world.model.realms.UnUpdatedStat.class)) {
            return io.realm.com_tech_world_model_realms_UnUpdatedStatRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.tech.world.model.realms.UnUpdatedVoiceMessageStat.class)) {
            return io.realm.com_tech_world_model_realms_UnUpdatedVoiceMessageStatRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.tech.world.model.realms.User.class)) {
            return io.realm.com_tech_world_model_realms_UserRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.tech.world.model.realms.UserStatuses.class)) {
            return io.realm.com_tech_world_model_realms_UserStatusesRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.tech.world.model.realms.StatusSeenBy.class)) {
            return io.realm.com_tech_world_model_realms_StatusSeenByRealmProxy.createColumnInfo(schemaInfo);
        }
        if (clazz.equals(com.tech.world.model.realms.TextStatus.class)) {
            return io.realm.com_tech_world_model_realms_TextStatusRealmProxy.createColumnInfo(schemaInfo);
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public String getSimpleClassNameImpl(Class<? extends RealmModel> clazz) {
        checkClass(clazz);

        if (clazz.equals(com.tech.world.model.realms.Broadcast.class)) {
            return "Broadcast";
        }
        if (clazz.equals(com.tech.world.model.realms.Chat.class)) {
            return "Chat";
        }
        if (clazz.equals(com.tech.world.model.realms.CurrentUserInfo.class)) {
            return "CurrentUserInfo";
        }
        if (clazz.equals(com.tech.world.model.realms.DeletedMessage.class)) {
            return "DeletedMessage";
        }
        if (clazz.equals(com.tech.world.model.realms.FireCall.class)) {
            return "FireCall";
        }
        if (clazz.equals(com.tech.world.model.realms.Group.class)) {
            return "Group";
        }
        if (clazz.equals(com.tech.world.model.realms.GroupEvent.class)) {
            return "GroupEvent";
        }
        if (clazz.equals(com.tech.world.model.realms.JobId.class)) {
            return "JobId";
        }
        if (clazz.equals(com.tech.world.model.realms.Message.class)) {
            return "Message";
        }
        if (clazz.equals(com.tech.world.model.realms.PendingGroupJob.class)) {
            return "PendingGroupJob";
        }
        if (clazz.equals(com.tech.world.model.realms.PhoneNumber.class)) {
            return "PhoneNumber";
        }
        if (clazz.equals(com.tech.world.model.realms.QuotedMessage.class)) {
            return "QuotedMessage";
        }
        if (clazz.equals(com.tech.world.model.realms.RealmContact.class)) {
            return "RealmContact";
        }
        if (clazz.equals(com.tech.world.model.realms.RealmLocation.class)) {
            return "RealmLocation";
        }
        if (clazz.equals(com.tech.world.model.realms.Status.class)) {
            return "Status";
        }
        if (clazz.equals(com.tech.world.model.realms.TempMessage.class)) {
            return "TempMessage";
        }
        if (clazz.equals(com.tech.world.model.realms.UnUpdatedStat.class)) {
            return "UnUpdatedStat";
        }
        if (clazz.equals(com.tech.world.model.realms.UnUpdatedVoiceMessageStat.class)) {
            return "UnUpdatedVoiceMessageStat";
        }
        if (clazz.equals(com.tech.world.model.realms.User.class)) {
            return "User";
        }
        if (clazz.equals(com.tech.world.model.realms.UserStatuses.class)) {
            return "UserStatuses";
        }
        if (clazz.equals(com.tech.world.model.realms.StatusSeenBy.class)) {
            return "StatusSeenBy";
        }
        if (clazz.equals(com.tech.world.model.realms.TextStatus.class)) {
            return "TextStatus";
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E newInstance(Class<E> clazz, Object baseRealm, Row row, ColumnInfo columnInfo, boolean acceptDefaultValue, List<String> excludeFields) {
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        try {
            objectContext.set((BaseRealm) baseRealm, row, columnInfo, acceptDefaultValue, excludeFields);
            checkClass(clazz);

            if (clazz.equals(com.tech.world.model.realms.Broadcast.class)) {
                return clazz.cast(new io.realm.com_tech_world_model_realms_BroadcastRealmProxy());
            }
            if (clazz.equals(com.tech.world.model.realms.Chat.class)) {
                return clazz.cast(new io.realm.com_tech_world_model_realms_ChatRealmProxy());
            }
            if (clazz.equals(com.tech.world.model.realms.CurrentUserInfo.class)) {
                return clazz.cast(new io.realm.com_tech_world_model_realms_CurrentUserInfoRealmProxy());
            }
            if (clazz.equals(com.tech.world.model.realms.DeletedMessage.class)) {
                return clazz.cast(new io.realm.com_tech_world_model_realms_DeletedMessageRealmProxy());
            }
            if (clazz.equals(com.tech.world.model.realms.FireCall.class)) {
                return clazz.cast(new io.realm.com_tech_world_model_realms_FireCallRealmProxy());
            }
            if (clazz.equals(com.tech.world.model.realms.Group.class)) {
                return clazz.cast(new io.realm.com_tech_world_model_realms_GroupRealmProxy());
            }
            if (clazz.equals(com.tech.world.model.realms.GroupEvent.class)) {
                return clazz.cast(new io.realm.com_tech_world_model_realms_GroupEventRealmProxy());
            }
            if (clazz.equals(com.tech.world.model.realms.JobId.class)) {
                return clazz.cast(new io.realm.com_tech_world_model_realms_JobIdRealmProxy());
            }
            if (clazz.equals(com.tech.world.model.realms.Message.class)) {
                return clazz.cast(new io.realm.com_tech_world_model_realms_MessageRealmProxy());
            }
            if (clazz.equals(com.tech.world.model.realms.PendingGroupJob.class)) {
                return clazz.cast(new io.realm.com_tech_world_model_realms_PendingGroupJobRealmProxy());
            }
            if (clazz.equals(com.tech.world.model.realms.PhoneNumber.class)) {
                return clazz.cast(new io.realm.com_tech_world_model_realms_PhoneNumberRealmProxy());
            }
            if (clazz.equals(com.tech.world.model.realms.QuotedMessage.class)) {
                return clazz.cast(new io.realm.com_tech_world_model_realms_QuotedMessageRealmProxy());
            }
            if (clazz.equals(com.tech.world.model.realms.RealmContact.class)) {
                return clazz.cast(new io.realm.com_tech_world_model_realms_RealmContactRealmProxy());
            }
            if (clazz.equals(com.tech.world.model.realms.RealmLocation.class)) {
                return clazz.cast(new io.realm.com_tech_world_model_realms_RealmLocationRealmProxy());
            }
            if (clazz.equals(com.tech.world.model.realms.Status.class)) {
                return clazz.cast(new io.realm.com_tech_world_model_realms_StatusRealmProxy());
            }
            if (clazz.equals(com.tech.world.model.realms.TempMessage.class)) {
                return clazz.cast(new io.realm.com_tech_world_model_realms_TempMessageRealmProxy());
            }
            if (clazz.equals(com.tech.world.model.realms.UnUpdatedStat.class)) {
                return clazz.cast(new io.realm.com_tech_world_model_realms_UnUpdatedStatRealmProxy());
            }
            if (clazz.equals(com.tech.world.model.realms.UnUpdatedVoiceMessageStat.class)) {
                return clazz.cast(new io.realm.com_tech_world_model_realms_UnUpdatedVoiceMessageStatRealmProxy());
            }
            if (clazz.equals(com.tech.world.model.realms.User.class)) {
                return clazz.cast(new io.realm.com_tech_world_model_realms_UserRealmProxy());
            }
            if (clazz.equals(com.tech.world.model.realms.UserStatuses.class)) {
                return clazz.cast(new io.realm.com_tech_world_model_realms_UserStatusesRealmProxy());
            }
            if (clazz.equals(com.tech.world.model.realms.StatusSeenBy.class)) {
                return clazz.cast(new io.realm.com_tech_world_model_realms_StatusSeenByRealmProxy());
            }
            if (clazz.equals(com.tech.world.model.realms.TextStatus.class)) {
                return clazz.cast(new io.realm.com_tech_world_model_realms_TextStatusRealmProxy());
            }
            throw getMissingProxyClassException(clazz);
        } finally {
            objectContext.clear();
        }
    }

    @Override
    public Set<Class<? extends RealmModel>> getModelClasses() {
        return MODEL_CLASSES;
    }

    @Override
    public <E extends RealmModel> E copyOrUpdate(Realm realm, E obj, boolean update, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<E> clazz = (Class<E>) ((obj instanceof RealmObjectProxy) ? obj.getClass().getSuperclass() : obj.getClass());

        if (clazz.equals(com.tech.world.model.realms.Broadcast.class)) {
            com_tech_world_model_realms_BroadcastRealmProxy.BroadcastColumnInfo columnInfo = (com_tech_world_model_realms_BroadcastRealmProxy.BroadcastColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.Broadcast.class);
            return clazz.cast(io.realm.com_tech_world_model_realms_BroadcastRealmProxy.copyOrUpdate(realm, columnInfo, (com.tech.world.model.realms.Broadcast) obj, update, cache, flags));
        }
        if (clazz.equals(com.tech.world.model.realms.Chat.class)) {
            com_tech_world_model_realms_ChatRealmProxy.ChatColumnInfo columnInfo = (com_tech_world_model_realms_ChatRealmProxy.ChatColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.Chat.class);
            return clazz.cast(io.realm.com_tech_world_model_realms_ChatRealmProxy.copyOrUpdate(realm, columnInfo, (com.tech.world.model.realms.Chat) obj, update, cache, flags));
        }
        if (clazz.equals(com.tech.world.model.realms.CurrentUserInfo.class)) {
            com_tech_world_model_realms_CurrentUserInfoRealmProxy.CurrentUserInfoColumnInfo columnInfo = (com_tech_world_model_realms_CurrentUserInfoRealmProxy.CurrentUserInfoColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.CurrentUserInfo.class);
            return clazz.cast(io.realm.com_tech_world_model_realms_CurrentUserInfoRealmProxy.copyOrUpdate(realm, columnInfo, (com.tech.world.model.realms.CurrentUserInfo) obj, update, cache, flags));
        }
        if (clazz.equals(com.tech.world.model.realms.DeletedMessage.class)) {
            com_tech_world_model_realms_DeletedMessageRealmProxy.DeletedMessageColumnInfo columnInfo = (com_tech_world_model_realms_DeletedMessageRealmProxy.DeletedMessageColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.DeletedMessage.class);
            return clazz.cast(io.realm.com_tech_world_model_realms_DeletedMessageRealmProxy.copyOrUpdate(realm, columnInfo, (com.tech.world.model.realms.DeletedMessage) obj, update, cache, flags));
        }
        if (clazz.equals(com.tech.world.model.realms.FireCall.class)) {
            com_tech_world_model_realms_FireCallRealmProxy.FireCallColumnInfo columnInfo = (com_tech_world_model_realms_FireCallRealmProxy.FireCallColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.FireCall.class);
            return clazz.cast(io.realm.com_tech_world_model_realms_FireCallRealmProxy.copyOrUpdate(realm, columnInfo, (com.tech.world.model.realms.FireCall) obj, update, cache, flags));
        }
        if (clazz.equals(com.tech.world.model.realms.Group.class)) {
            com_tech_world_model_realms_GroupRealmProxy.GroupColumnInfo columnInfo = (com_tech_world_model_realms_GroupRealmProxy.GroupColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.Group.class);
            return clazz.cast(io.realm.com_tech_world_model_realms_GroupRealmProxy.copyOrUpdate(realm, columnInfo, (com.tech.world.model.realms.Group) obj, update, cache, flags));
        }
        if (clazz.equals(com.tech.world.model.realms.GroupEvent.class)) {
            com_tech_world_model_realms_GroupEventRealmProxy.GroupEventColumnInfo columnInfo = (com_tech_world_model_realms_GroupEventRealmProxy.GroupEventColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.GroupEvent.class);
            return clazz.cast(io.realm.com_tech_world_model_realms_GroupEventRealmProxy.copyOrUpdate(realm, columnInfo, (com.tech.world.model.realms.GroupEvent) obj, update, cache, flags));
        }
        if (clazz.equals(com.tech.world.model.realms.JobId.class)) {
            com_tech_world_model_realms_JobIdRealmProxy.JobIdColumnInfo columnInfo = (com_tech_world_model_realms_JobIdRealmProxy.JobIdColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.JobId.class);
            return clazz.cast(io.realm.com_tech_world_model_realms_JobIdRealmProxy.copyOrUpdate(realm, columnInfo, (com.tech.world.model.realms.JobId) obj, update, cache, flags));
        }
        if (clazz.equals(com.tech.world.model.realms.Message.class)) {
            com_tech_world_model_realms_MessageRealmProxy.MessageColumnInfo columnInfo = (com_tech_world_model_realms_MessageRealmProxy.MessageColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.Message.class);
            return clazz.cast(io.realm.com_tech_world_model_realms_MessageRealmProxy.copyOrUpdate(realm, columnInfo, (com.tech.world.model.realms.Message) obj, update, cache, flags));
        }
        if (clazz.equals(com.tech.world.model.realms.PendingGroupJob.class)) {
            com_tech_world_model_realms_PendingGroupJobRealmProxy.PendingGroupJobColumnInfo columnInfo = (com_tech_world_model_realms_PendingGroupJobRealmProxy.PendingGroupJobColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.PendingGroupJob.class);
            return clazz.cast(io.realm.com_tech_world_model_realms_PendingGroupJobRealmProxy.copyOrUpdate(realm, columnInfo, (com.tech.world.model.realms.PendingGroupJob) obj, update, cache, flags));
        }
        if (clazz.equals(com.tech.world.model.realms.PhoneNumber.class)) {
            com_tech_world_model_realms_PhoneNumberRealmProxy.PhoneNumberColumnInfo columnInfo = (com_tech_world_model_realms_PhoneNumberRealmProxy.PhoneNumberColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.PhoneNumber.class);
            return clazz.cast(io.realm.com_tech_world_model_realms_PhoneNumberRealmProxy.copyOrUpdate(realm, columnInfo, (com.tech.world.model.realms.PhoneNumber) obj, update, cache, flags));
        }
        if (clazz.equals(com.tech.world.model.realms.QuotedMessage.class)) {
            com_tech_world_model_realms_QuotedMessageRealmProxy.QuotedMessageColumnInfo columnInfo = (com_tech_world_model_realms_QuotedMessageRealmProxy.QuotedMessageColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.QuotedMessage.class);
            return clazz.cast(io.realm.com_tech_world_model_realms_QuotedMessageRealmProxy.copyOrUpdate(realm, columnInfo, (com.tech.world.model.realms.QuotedMessage) obj, update, cache, flags));
        }
        if (clazz.equals(com.tech.world.model.realms.RealmContact.class)) {
            com_tech_world_model_realms_RealmContactRealmProxy.RealmContactColumnInfo columnInfo = (com_tech_world_model_realms_RealmContactRealmProxy.RealmContactColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.RealmContact.class);
            return clazz.cast(io.realm.com_tech_world_model_realms_RealmContactRealmProxy.copyOrUpdate(realm, columnInfo, (com.tech.world.model.realms.RealmContact) obj, update, cache, flags));
        }
        if (clazz.equals(com.tech.world.model.realms.RealmLocation.class)) {
            com_tech_world_model_realms_RealmLocationRealmProxy.RealmLocationColumnInfo columnInfo = (com_tech_world_model_realms_RealmLocationRealmProxy.RealmLocationColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.RealmLocation.class);
            return clazz.cast(io.realm.com_tech_world_model_realms_RealmLocationRealmProxy.copyOrUpdate(realm, columnInfo, (com.tech.world.model.realms.RealmLocation) obj, update, cache, flags));
        }
        if (clazz.equals(com.tech.world.model.realms.Status.class)) {
            com_tech_world_model_realms_StatusRealmProxy.StatusColumnInfo columnInfo = (com_tech_world_model_realms_StatusRealmProxy.StatusColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.Status.class);
            return clazz.cast(io.realm.com_tech_world_model_realms_StatusRealmProxy.copyOrUpdate(realm, columnInfo, (com.tech.world.model.realms.Status) obj, update, cache, flags));
        }
        if (clazz.equals(com.tech.world.model.realms.TempMessage.class)) {
            com_tech_world_model_realms_TempMessageRealmProxy.TempMessageColumnInfo columnInfo = (com_tech_world_model_realms_TempMessageRealmProxy.TempMessageColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.TempMessage.class);
            return clazz.cast(io.realm.com_tech_world_model_realms_TempMessageRealmProxy.copyOrUpdate(realm, columnInfo, (com.tech.world.model.realms.TempMessage) obj, update, cache, flags));
        }
        if (clazz.equals(com.tech.world.model.realms.UnUpdatedStat.class)) {
            com_tech_world_model_realms_UnUpdatedStatRealmProxy.UnUpdatedStatColumnInfo columnInfo = (com_tech_world_model_realms_UnUpdatedStatRealmProxy.UnUpdatedStatColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.UnUpdatedStat.class);
            return clazz.cast(io.realm.com_tech_world_model_realms_UnUpdatedStatRealmProxy.copyOrUpdate(realm, columnInfo, (com.tech.world.model.realms.UnUpdatedStat) obj, update, cache, flags));
        }
        if (clazz.equals(com.tech.world.model.realms.UnUpdatedVoiceMessageStat.class)) {
            com_tech_world_model_realms_UnUpdatedVoiceMessageStatRealmProxy.UnUpdatedVoiceMessageStatColumnInfo columnInfo = (com_tech_world_model_realms_UnUpdatedVoiceMessageStatRealmProxy.UnUpdatedVoiceMessageStatColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.UnUpdatedVoiceMessageStat.class);
            return clazz.cast(io.realm.com_tech_world_model_realms_UnUpdatedVoiceMessageStatRealmProxy.copyOrUpdate(realm, columnInfo, (com.tech.world.model.realms.UnUpdatedVoiceMessageStat) obj, update, cache, flags));
        }
        if (clazz.equals(com.tech.world.model.realms.User.class)) {
            com_tech_world_model_realms_UserRealmProxy.UserColumnInfo columnInfo = (com_tech_world_model_realms_UserRealmProxy.UserColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.User.class);
            return clazz.cast(io.realm.com_tech_world_model_realms_UserRealmProxy.copyOrUpdate(realm, columnInfo, (com.tech.world.model.realms.User) obj, update, cache, flags));
        }
        if (clazz.equals(com.tech.world.model.realms.UserStatuses.class)) {
            com_tech_world_model_realms_UserStatusesRealmProxy.UserStatusesColumnInfo columnInfo = (com_tech_world_model_realms_UserStatusesRealmProxy.UserStatusesColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.UserStatuses.class);
            return clazz.cast(io.realm.com_tech_world_model_realms_UserStatusesRealmProxy.copyOrUpdate(realm, columnInfo, (com.tech.world.model.realms.UserStatuses) obj, update, cache, flags));
        }
        if (clazz.equals(com.tech.world.model.realms.StatusSeenBy.class)) {
            com_tech_world_model_realms_StatusSeenByRealmProxy.StatusSeenByColumnInfo columnInfo = (com_tech_world_model_realms_StatusSeenByRealmProxy.StatusSeenByColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.StatusSeenBy.class);
            return clazz.cast(io.realm.com_tech_world_model_realms_StatusSeenByRealmProxy.copyOrUpdate(realm, columnInfo, (com.tech.world.model.realms.StatusSeenBy) obj, update, cache, flags));
        }
        if (clazz.equals(com.tech.world.model.realms.TextStatus.class)) {
            com_tech_world_model_realms_TextStatusRealmProxy.TextStatusColumnInfo columnInfo = (com_tech_world_model_realms_TextStatusRealmProxy.TextStatusColumnInfo) realm.getSchema().getColumnInfo(com.tech.world.model.realms.TextStatus.class);
            return clazz.cast(io.realm.com_tech_world_model_realms_TextStatusRealmProxy.copyOrUpdate(realm, columnInfo, (com.tech.world.model.realms.TextStatus) obj, update, cache, flags));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public void insert(Realm realm, RealmModel object, Map<RealmModel, Long> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

        if (clazz.equals(com.tech.world.model.realms.Broadcast.class)) {
            io.realm.com_tech_world_model_realms_BroadcastRealmProxy.insert(realm, (com.tech.world.model.realms.Broadcast) object, cache);
        } else if (clazz.equals(com.tech.world.model.realms.Chat.class)) {
            io.realm.com_tech_world_model_realms_ChatRealmProxy.insert(realm, (com.tech.world.model.realms.Chat) object, cache);
        } else if (clazz.equals(com.tech.world.model.realms.CurrentUserInfo.class)) {
            io.realm.com_tech_world_model_realms_CurrentUserInfoRealmProxy.insert(realm, (com.tech.world.model.realms.CurrentUserInfo) object, cache);
        } else if (clazz.equals(com.tech.world.model.realms.DeletedMessage.class)) {
            io.realm.com_tech_world_model_realms_DeletedMessageRealmProxy.insert(realm, (com.tech.world.model.realms.DeletedMessage) object, cache);
        } else if (clazz.equals(com.tech.world.model.realms.FireCall.class)) {
            io.realm.com_tech_world_model_realms_FireCallRealmProxy.insert(realm, (com.tech.world.model.realms.FireCall) object, cache);
        } else if (clazz.equals(com.tech.world.model.realms.Group.class)) {
            io.realm.com_tech_world_model_realms_GroupRealmProxy.insert(realm, (com.tech.world.model.realms.Group) object, cache);
        } else if (clazz.equals(com.tech.world.model.realms.GroupEvent.class)) {
            io.realm.com_tech_world_model_realms_GroupEventRealmProxy.insert(realm, (com.tech.world.model.realms.GroupEvent) object, cache);
        } else if (clazz.equals(com.tech.world.model.realms.JobId.class)) {
            io.realm.com_tech_world_model_realms_JobIdRealmProxy.insert(realm, (com.tech.world.model.realms.JobId) object, cache);
        } else if (clazz.equals(com.tech.world.model.realms.Message.class)) {
            io.realm.com_tech_world_model_realms_MessageRealmProxy.insert(realm, (com.tech.world.model.realms.Message) object, cache);
        } else if (clazz.equals(com.tech.world.model.realms.PendingGroupJob.class)) {
            io.realm.com_tech_world_model_realms_PendingGroupJobRealmProxy.insert(realm, (com.tech.world.model.realms.PendingGroupJob) object, cache);
        } else if (clazz.equals(com.tech.world.model.realms.PhoneNumber.class)) {
            io.realm.com_tech_world_model_realms_PhoneNumberRealmProxy.insert(realm, (com.tech.world.model.realms.PhoneNumber) object, cache);
        } else if (clazz.equals(com.tech.world.model.realms.QuotedMessage.class)) {
            io.realm.com_tech_world_model_realms_QuotedMessageRealmProxy.insert(realm, (com.tech.world.model.realms.QuotedMessage) object, cache);
        } else if (clazz.equals(com.tech.world.model.realms.RealmContact.class)) {
            io.realm.com_tech_world_model_realms_RealmContactRealmProxy.insert(realm, (com.tech.world.model.realms.RealmContact) object, cache);
        } else if (clazz.equals(com.tech.world.model.realms.RealmLocation.class)) {
            io.realm.com_tech_world_model_realms_RealmLocationRealmProxy.insert(realm, (com.tech.world.model.realms.RealmLocation) object, cache);
        } else if (clazz.equals(com.tech.world.model.realms.Status.class)) {
            io.realm.com_tech_world_model_realms_StatusRealmProxy.insert(realm, (com.tech.world.model.realms.Status) object, cache);
        } else if (clazz.equals(com.tech.world.model.realms.TempMessage.class)) {
            io.realm.com_tech_world_model_realms_TempMessageRealmProxy.insert(realm, (com.tech.world.model.realms.TempMessage) object, cache);
        } else if (clazz.equals(com.tech.world.model.realms.UnUpdatedStat.class)) {
            io.realm.com_tech_world_model_realms_UnUpdatedStatRealmProxy.insert(realm, (com.tech.world.model.realms.UnUpdatedStat) object, cache);
        } else if (clazz.equals(com.tech.world.model.realms.UnUpdatedVoiceMessageStat.class)) {
            io.realm.com_tech_world_model_realms_UnUpdatedVoiceMessageStatRealmProxy.insert(realm, (com.tech.world.model.realms.UnUpdatedVoiceMessageStat) object, cache);
        } else if (clazz.equals(com.tech.world.model.realms.User.class)) {
            io.realm.com_tech_world_model_realms_UserRealmProxy.insert(realm, (com.tech.world.model.realms.User) object, cache);
        } else if (clazz.equals(com.tech.world.model.realms.UserStatuses.class)) {
            io.realm.com_tech_world_model_realms_UserStatusesRealmProxy.insert(realm, (com.tech.world.model.realms.UserStatuses) object, cache);
        } else if (clazz.equals(com.tech.world.model.realms.StatusSeenBy.class)) {
            io.realm.com_tech_world_model_realms_StatusSeenByRealmProxy.insert(realm, (com.tech.world.model.realms.StatusSeenBy) object, cache);
        } else if (clazz.equals(com.tech.world.model.realms.TextStatus.class)) {
            io.realm.com_tech_world_model_realms_TextStatusRealmProxy.insert(realm, (com.tech.world.model.realms.TextStatus) object, cache);
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public void insert(Realm realm, Collection<? extends RealmModel> objects) {
        Iterator<? extends RealmModel> iterator = objects.iterator();
        RealmModel object = null;
        Map<RealmModel, Long> cache = new HashMap<RealmModel, Long>(objects.size());
        if (iterator.hasNext()) {
            //  access the first element to figure out the clazz for the routing below
            object = iterator.next();
            // This cast is correct because obj is either
            // generated by RealmProxy or the original type extending directly from RealmObject
            @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

            if (clazz.equals(com.tech.world.model.realms.Broadcast.class)) {
                io.realm.com_tech_world_model_realms_BroadcastRealmProxy.insert(realm, (com.tech.world.model.realms.Broadcast) object, cache);
            } else if (clazz.equals(com.tech.world.model.realms.Chat.class)) {
                io.realm.com_tech_world_model_realms_ChatRealmProxy.insert(realm, (com.tech.world.model.realms.Chat) object, cache);
            } else if (clazz.equals(com.tech.world.model.realms.CurrentUserInfo.class)) {
                io.realm.com_tech_world_model_realms_CurrentUserInfoRealmProxy.insert(realm, (com.tech.world.model.realms.CurrentUserInfo) object, cache);
            } else if (clazz.equals(com.tech.world.model.realms.DeletedMessage.class)) {
                io.realm.com_tech_world_model_realms_DeletedMessageRealmProxy.insert(realm, (com.tech.world.model.realms.DeletedMessage) object, cache);
            } else if (clazz.equals(com.tech.world.model.realms.FireCall.class)) {
                io.realm.com_tech_world_model_realms_FireCallRealmProxy.insert(realm, (com.tech.world.model.realms.FireCall) object, cache);
            } else if (clazz.equals(com.tech.world.model.realms.Group.class)) {
                io.realm.com_tech_world_model_realms_GroupRealmProxy.insert(realm, (com.tech.world.model.realms.Group) object, cache);
            } else if (clazz.equals(com.tech.world.model.realms.GroupEvent.class)) {
                io.realm.com_tech_world_model_realms_GroupEventRealmProxy.insert(realm, (com.tech.world.model.realms.GroupEvent) object, cache);
            } else if (clazz.equals(com.tech.world.model.realms.JobId.class)) {
                io.realm.com_tech_world_model_realms_JobIdRealmProxy.insert(realm, (com.tech.world.model.realms.JobId) object, cache);
            } else if (clazz.equals(com.tech.world.model.realms.Message.class)) {
                io.realm.com_tech_world_model_realms_MessageRealmProxy.insert(realm, (com.tech.world.model.realms.Message) object, cache);
            } else if (clazz.equals(com.tech.world.model.realms.PendingGroupJob.class)) {
                io.realm.com_tech_world_model_realms_PendingGroupJobRealmProxy.insert(realm, (com.tech.world.model.realms.PendingGroupJob) object, cache);
            } else if (clazz.equals(com.tech.world.model.realms.PhoneNumber.class)) {
                io.realm.com_tech_world_model_realms_PhoneNumberRealmProxy.insert(realm, (com.tech.world.model.realms.PhoneNumber) object, cache);
            } else if (clazz.equals(com.tech.world.model.realms.QuotedMessage.class)) {
                io.realm.com_tech_world_model_realms_QuotedMessageRealmProxy.insert(realm, (com.tech.world.model.realms.QuotedMessage) object, cache);
            } else if (clazz.equals(com.tech.world.model.realms.RealmContact.class)) {
                io.realm.com_tech_world_model_realms_RealmContactRealmProxy.insert(realm, (com.tech.world.model.realms.RealmContact) object, cache);
            } else if (clazz.equals(com.tech.world.model.realms.RealmLocation.class)) {
                io.realm.com_tech_world_model_realms_RealmLocationRealmProxy.insert(realm, (com.tech.world.model.realms.RealmLocation) object, cache);
            } else if (clazz.equals(com.tech.world.model.realms.Status.class)) {
                io.realm.com_tech_world_model_realms_StatusRealmProxy.insert(realm, (com.tech.world.model.realms.Status) object, cache);
            } else if (clazz.equals(com.tech.world.model.realms.TempMessage.class)) {
                io.realm.com_tech_world_model_realms_TempMessageRealmProxy.insert(realm, (com.tech.world.model.realms.TempMessage) object, cache);
            } else if (clazz.equals(com.tech.world.model.realms.UnUpdatedStat.class)) {
                io.realm.com_tech_world_model_realms_UnUpdatedStatRealmProxy.insert(realm, (com.tech.world.model.realms.UnUpdatedStat) object, cache);
            } else if (clazz.equals(com.tech.world.model.realms.UnUpdatedVoiceMessageStat.class)) {
                io.realm.com_tech_world_model_realms_UnUpdatedVoiceMessageStatRealmProxy.insert(realm, (com.tech.world.model.realms.UnUpdatedVoiceMessageStat) object, cache);
            } else if (clazz.equals(com.tech.world.model.realms.User.class)) {
                io.realm.com_tech_world_model_realms_UserRealmProxy.insert(realm, (com.tech.world.model.realms.User) object, cache);
            } else if (clazz.equals(com.tech.world.model.realms.UserStatuses.class)) {
                io.realm.com_tech_world_model_realms_UserStatusesRealmProxy.insert(realm, (com.tech.world.model.realms.UserStatuses) object, cache);
            } else if (clazz.equals(com.tech.world.model.realms.StatusSeenBy.class)) {
                io.realm.com_tech_world_model_realms_StatusSeenByRealmProxy.insert(realm, (com.tech.world.model.realms.StatusSeenBy) object, cache);
            } else if (clazz.equals(com.tech.world.model.realms.TextStatus.class)) {
                io.realm.com_tech_world_model_realms_TextStatusRealmProxy.insert(realm, (com.tech.world.model.realms.TextStatus) object, cache);
            } else {
                throw getMissingProxyClassException(clazz);
            }
            if (iterator.hasNext()) {
                if (clazz.equals(com.tech.world.model.realms.Broadcast.class)) {
                    io.realm.com_tech_world_model_realms_BroadcastRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.tech.world.model.realms.Chat.class)) {
                    io.realm.com_tech_world_model_realms_ChatRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.tech.world.model.realms.CurrentUserInfo.class)) {
                    io.realm.com_tech_world_model_realms_CurrentUserInfoRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.tech.world.model.realms.DeletedMessage.class)) {
                    io.realm.com_tech_world_model_realms_DeletedMessageRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.tech.world.model.realms.FireCall.class)) {
                    io.realm.com_tech_world_model_realms_FireCallRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.tech.world.model.realms.Group.class)) {
                    io.realm.com_tech_world_model_realms_GroupRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.tech.world.model.realms.GroupEvent.class)) {
                    io.realm.com_tech_world_model_realms_GroupEventRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.tech.world.model.realms.JobId.class)) {
                    io.realm.com_tech_world_model_realms_JobIdRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.tech.world.model.realms.Message.class)) {
                    io.realm.com_tech_world_model_realms_MessageRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.tech.world.model.realms.PendingGroupJob.class)) {
                    io.realm.com_tech_world_model_realms_PendingGroupJobRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.tech.world.model.realms.PhoneNumber.class)) {
                    io.realm.com_tech_world_model_realms_PhoneNumberRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.tech.world.model.realms.QuotedMessage.class)) {
                    io.realm.com_tech_world_model_realms_QuotedMessageRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.tech.world.model.realms.RealmContact.class)) {
                    io.realm.com_tech_world_model_realms_RealmContactRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.tech.world.model.realms.RealmLocation.class)) {
                    io.realm.com_tech_world_model_realms_RealmLocationRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.tech.world.model.realms.Status.class)) {
                    io.realm.com_tech_world_model_realms_StatusRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.tech.world.model.realms.TempMessage.class)) {
                    io.realm.com_tech_world_model_realms_TempMessageRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.tech.world.model.realms.UnUpdatedStat.class)) {
                    io.realm.com_tech_world_model_realms_UnUpdatedStatRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.tech.world.model.realms.UnUpdatedVoiceMessageStat.class)) {
                    io.realm.com_tech_world_model_realms_UnUpdatedVoiceMessageStatRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.tech.world.model.realms.User.class)) {
                    io.realm.com_tech_world_model_realms_UserRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.tech.world.model.realms.UserStatuses.class)) {
                    io.realm.com_tech_world_model_realms_UserStatusesRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.tech.world.model.realms.StatusSeenBy.class)) {
                    io.realm.com_tech_world_model_realms_StatusSeenByRealmProxy.insert(realm, iterator, cache);
                } else if (clazz.equals(com.tech.world.model.realms.TextStatus.class)) {
                    io.realm.com_tech_world_model_realms_TextStatusRealmProxy.insert(realm, iterator, cache);
                } else {
                    throw getMissingProxyClassException(clazz);
                }
            }
        }
    }

    @Override
    public void insertOrUpdate(Realm realm, RealmModel obj, Map<RealmModel, Long> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((obj instanceof RealmObjectProxy) ? obj.getClass().getSuperclass() : obj.getClass());

        if (clazz.equals(com.tech.world.model.realms.Broadcast.class)) {
            io.realm.com_tech_world_model_realms_BroadcastRealmProxy.insertOrUpdate(realm, (com.tech.world.model.realms.Broadcast) obj, cache);
        } else if (clazz.equals(com.tech.world.model.realms.Chat.class)) {
            io.realm.com_tech_world_model_realms_ChatRealmProxy.insertOrUpdate(realm, (com.tech.world.model.realms.Chat) obj, cache);
        } else if (clazz.equals(com.tech.world.model.realms.CurrentUserInfo.class)) {
            io.realm.com_tech_world_model_realms_CurrentUserInfoRealmProxy.insertOrUpdate(realm, (com.tech.world.model.realms.CurrentUserInfo) obj, cache);
        } else if (clazz.equals(com.tech.world.model.realms.DeletedMessage.class)) {
            io.realm.com_tech_world_model_realms_DeletedMessageRealmProxy.insertOrUpdate(realm, (com.tech.world.model.realms.DeletedMessage) obj, cache);
        } else if (clazz.equals(com.tech.world.model.realms.FireCall.class)) {
            io.realm.com_tech_world_model_realms_FireCallRealmProxy.insertOrUpdate(realm, (com.tech.world.model.realms.FireCall) obj, cache);
        } else if (clazz.equals(com.tech.world.model.realms.Group.class)) {
            io.realm.com_tech_world_model_realms_GroupRealmProxy.insertOrUpdate(realm, (com.tech.world.model.realms.Group) obj, cache);
        } else if (clazz.equals(com.tech.world.model.realms.GroupEvent.class)) {
            io.realm.com_tech_world_model_realms_GroupEventRealmProxy.insertOrUpdate(realm, (com.tech.world.model.realms.GroupEvent) obj, cache);
        } else if (clazz.equals(com.tech.world.model.realms.JobId.class)) {
            io.realm.com_tech_world_model_realms_JobIdRealmProxy.insertOrUpdate(realm, (com.tech.world.model.realms.JobId) obj, cache);
        } else if (clazz.equals(com.tech.world.model.realms.Message.class)) {
            io.realm.com_tech_world_model_realms_MessageRealmProxy.insertOrUpdate(realm, (com.tech.world.model.realms.Message) obj, cache);
        } else if (clazz.equals(com.tech.world.model.realms.PendingGroupJob.class)) {
            io.realm.com_tech_world_model_realms_PendingGroupJobRealmProxy.insertOrUpdate(realm, (com.tech.world.model.realms.PendingGroupJob) obj, cache);
        } else if (clazz.equals(com.tech.world.model.realms.PhoneNumber.class)) {
            io.realm.com_tech_world_model_realms_PhoneNumberRealmProxy.insertOrUpdate(realm, (com.tech.world.model.realms.PhoneNumber) obj, cache);
        } else if (clazz.equals(com.tech.world.model.realms.QuotedMessage.class)) {
            io.realm.com_tech_world_model_realms_QuotedMessageRealmProxy.insertOrUpdate(realm, (com.tech.world.model.realms.QuotedMessage) obj, cache);
        } else if (clazz.equals(com.tech.world.model.realms.RealmContact.class)) {
            io.realm.com_tech_world_model_realms_RealmContactRealmProxy.insertOrUpdate(realm, (com.tech.world.model.realms.RealmContact) obj, cache);
        } else if (clazz.equals(com.tech.world.model.realms.RealmLocation.class)) {
            io.realm.com_tech_world_model_realms_RealmLocationRealmProxy.insertOrUpdate(realm, (com.tech.world.model.realms.RealmLocation) obj, cache);
        } else if (clazz.equals(com.tech.world.model.realms.Status.class)) {
            io.realm.com_tech_world_model_realms_StatusRealmProxy.insertOrUpdate(realm, (com.tech.world.model.realms.Status) obj, cache);
        } else if (clazz.equals(com.tech.world.model.realms.TempMessage.class)) {
            io.realm.com_tech_world_model_realms_TempMessageRealmProxy.insertOrUpdate(realm, (com.tech.world.model.realms.TempMessage) obj, cache);
        } else if (clazz.equals(com.tech.world.model.realms.UnUpdatedStat.class)) {
            io.realm.com_tech_world_model_realms_UnUpdatedStatRealmProxy.insertOrUpdate(realm, (com.tech.world.model.realms.UnUpdatedStat) obj, cache);
        } else if (clazz.equals(com.tech.world.model.realms.UnUpdatedVoiceMessageStat.class)) {
            io.realm.com_tech_world_model_realms_UnUpdatedVoiceMessageStatRealmProxy.insertOrUpdate(realm, (com.tech.world.model.realms.UnUpdatedVoiceMessageStat) obj, cache);
        } else if (clazz.equals(com.tech.world.model.realms.User.class)) {
            io.realm.com_tech_world_model_realms_UserRealmProxy.insertOrUpdate(realm, (com.tech.world.model.realms.User) obj, cache);
        } else if (clazz.equals(com.tech.world.model.realms.UserStatuses.class)) {
            io.realm.com_tech_world_model_realms_UserStatusesRealmProxy.insertOrUpdate(realm, (com.tech.world.model.realms.UserStatuses) obj, cache);
        } else if (clazz.equals(com.tech.world.model.realms.StatusSeenBy.class)) {
            io.realm.com_tech_world_model_realms_StatusSeenByRealmProxy.insertOrUpdate(realm, (com.tech.world.model.realms.StatusSeenBy) obj, cache);
        } else if (clazz.equals(com.tech.world.model.realms.TextStatus.class)) {
            io.realm.com_tech_world_model_realms_TextStatusRealmProxy.insertOrUpdate(realm, (com.tech.world.model.realms.TextStatus) obj, cache);
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

    @Override
    public void insertOrUpdate(Realm realm, Collection<? extends RealmModel> objects) {
        Iterator<? extends RealmModel> iterator = objects.iterator();
        RealmModel object = null;
        Map<RealmModel, Long> cache = new HashMap<RealmModel, Long>(objects.size());
        if (iterator.hasNext()) {
            //  access the first element to figure out the clazz for the routing below
            object = iterator.next();
            // This cast is correct because obj is either
            // generated by RealmProxy or the original type extending directly from RealmObject
            @SuppressWarnings("unchecked") Class<RealmModel> clazz = (Class<RealmModel>) ((object instanceof RealmObjectProxy) ? object.getClass().getSuperclass() : object.getClass());

            if (clazz.equals(com.tech.world.model.realms.Broadcast.class)) {
                io.realm.com_tech_world_model_realms_BroadcastRealmProxy.insertOrUpdate(realm, (com.tech.world.model.realms.Broadcast) object, cache);
            } else if (clazz.equals(com.tech.world.model.realms.Chat.class)) {
                io.realm.com_tech_world_model_realms_ChatRealmProxy.insertOrUpdate(realm, (com.tech.world.model.realms.Chat) object, cache);
            } else if (clazz.equals(com.tech.world.model.realms.CurrentUserInfo.class)) {
                io.realm.com_tech_world_model_realms_CurrentUserInfoRealmProxy.insertOrUpdate(realm, (com.tech.world.model.realms.CurrentUserInfo) object, cache);
            } else if (clazz.equals(com.tech.world.model.realms.DeletedMessage.class)) {
                io.realm.com_tech_world_model_realms_DeletedMessageRealmProxy.insertOrUpdate(realm, (com.tech.world.model.realms.DeletedMessage) object, cache);
            } else if (clazz.equals(com.tech.world.model.realms.FireCall.class)) {
                io.realm.com_tech_world_model_realms_FireCallRealmProxy.insertOrUpdate(realm, (com.tech.world.model.realms.FireCall) object, cache);
            } else if (clazz.equals(com.tech.world.model.realms.Group.class)) {
                io.realm.com_tech_world_model_realms_GroupRealmProxy.insertOrUpdate(realm, (com.tech.world.model.realms.Group) object, cache);
            } else if (clazz.equals(com.tech.world.model.realms.GroupEvent.class)) {
                io.realm.com_tech_world_model_realms_GroupEventRealmProxy.insertOrUpdate(realm, (com.tech.world.model.realms.GroupEvent) object, cache);
            } else if (clazz.equals(com.tech.world.model.realms.JobId.class)) {
                io.realm.com_tech_world_model_realms_JobIdRealmProxy.insertOrUpdate(realm, (com.tech.world.model.realms.JobId) object, cache);
            } else if (clazz.equals(com.tech.world.model.realms.Message.class)) {
                io.realm.com_tech_world_model_realms_MessageRealmProxy.insertOrUpdate(realm, (com.tech.world.model.realms.Message) object, cache);
            } else if (clazz.equals(com.tech.world.model.realms.PendingGroupJob.class)) {
                io.realm.com_tech_world_model_realms_PendingGroupJobRealmProxy.insertOrUpdate(realm, (com.tech.world.model.realms.PendingGroupJob) object, cache);
            } else if (clazz.equals(com.tech.world.model.realms.PhoneNumber.class)) {
                io.realm.com_tech_world_model_realms_PhoneNumberRealmProxy.insertOrUpdate(realm, (com.tech.world.model.realms.PhoneNumber) object, cache);
            } else if (clazz.equals(com.tech.world.model.realms.QuotedMessage.class)) {
                io.realm.com_tech_world_model_realms_QuotedMessageRealmProxy.insertOrUpdate(realm, (com.tech.world.model.realms.QuotedMessage) object, cache);
            } else if (clazz.equals(com.tech.world.model.realms.RealmContact.class)) {
                io.realm.com_tech_world_model_realms_RealmContactRealmProxy.insertOrUpdate(realm, (com.tech.world.model.realms.RealmContact) object, cache);
            } else if (clazz.equals(com.tech.world.model.realms.RealmLocation.class)) {
                io.realm.com_tech_world_model_realms_RealmLocationRealmProxy.insertOrUpdate(realm, (com.tech.world.model.realms.RealmLocation) object, cache);
            } else if (clazz.equals(com.tech.world.model.realms.Status.class)) {
                io.realm.com_tech_world_model_realms_StatusRealmProxy.insertOrUpdate(realm, (com.tech.world.model.realms.Status) object, cache);
            } else if (clazz.equals(com.tech.world.model.realms.TempMessage.class)) {
                io.realm.com_tech_world_model_realms_TempMessageRealmProxy.insertOrUpdate(realm, (com.tech.world.model.realms.TempMessage) object, cache);
            } else if (clazz.equals(com.tech.world.model.realms.UnUpdatedStat.class)) {
                io.realm.com_tech_world_model_realms_UnUpdatedStatRealmProxy.insertOrUpdate(realm, (com.tech.world.model.realms.UnUpdatedStat) object, cache);
            } else if (clazz.equals(com.tech.world.model.realms.UnUpdatedVoiceMessageStat.class)) {
                io.realm.com_tech_world_model_realms_UnUpdatedVoiceMessageStatRealmProxy.insertOrUpdate(realm, (com.tech.world.model.realms.UnUpdatedVoiceMessageStat) object, cache);
            } else if (clazz.equals(com.tech.world.model.realms.User.class)) {
                io.realm.com_tech_world_model_realms_UserRealmProxy.insertOrUpdate(realm, (com.tech.world.model.realms.User) object, cache);
            } else if (clazz.equals(com.tech.world.model.realms.UserStatuses.class)) {
                io.realm.com_tech_world_model_realms_UserStatusesRealmProxy.insertOrUpdate(realm, (com.tech.world.model.realms.UserStatuses) object, cache);
            } else if (clazz.equals(com.tech.world.model.realms.StatusSeenBy.class)) {
                io.realm.com_tech_world_model_realms_StatusSeenByRealmProxy.insertOrUpdate(realm, (com.tech.world.model.realms.StatusSeenBy) object, cache);
            } else if (clazz.equals(com.tech.world.model.realms.TextStatus.class)) {
                io.realm.com_tech_world_model_realms_TextStatusRealmProxy.insertOrUpdate(realm, (com.tech.world.model.realms.TextStatus) object, cache);
            } else {
                throw getMissingProxyClassException(clazz);
            }
            if (iterator.hasNext()) {
                if (clazz.equals(com.tech.world.model.realms.Broadcast.class)) {
                    io.realm.com_tech_world_model_realms_BroadcastRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.tech.world.model.realms.Chat.class)) {
                    io.realm.com_tech_world_model_realms_ChatRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.tech.world.model.realms.CurrentUserInfo.class)) {
                    io.realm.com_tech_world_model_realms_CurrentUserInfoRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.tech.world.model.realms.DeletedMessage.class)) {
                    io.realm.com_tech_world_model_realms_DeletedMessageRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.tech.world.model.realms.FireCall.class)) {
                    io.realm.com_tech_world_model_realms_FireCallRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.tech.world.model.realms.Group.class)) {
                    io.realm.com_tech_world_model_realms_GroupRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.tech.world.model.realms.GroupEvent.class)) {
                    io.realm.com_tech_world_model_realms_GroupEventRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.tech.world.model.realms.JobId.class)) {
                    io.realm.com_tech_world_model_realms_JobIdRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.tech.world.model.realms.Message.class)) {
                    io.realm.com_tech_world_model_realms_MessageRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.tech.world.model.realms.PendingGroupJob.class)) {
                    io.realm.com_tech_world_model_realms_PendingGroupJobRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.tech.world.model.realms.PhoneNumber.class)) {
                    io.realm.com_tech_world_model_realms_PhoneNumberRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.tech.world.model.realms.QuotedMessage.class)) {
                    io.realm.com_tech_world_model_realms_QuotedMessageRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.tech.world.model.realms.RealmContact.class)) {
                    io.realm.com_tech_world_model_realms_RealmContactRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.tech.world.model.realms.RealmLocation.class)) {
                    io.realm.com_tech_world_model_realms_RealmLocationRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.tech.world.model.realms.Status.class)) {
                    io.realm.com_tech_world_model_realms_StatusRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.tech.world.model.realms.TempMessage.class)) {
                    io.realm.com_tech_world_model_realms_TempMessageRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.tech.world.model.realms.UnUpdatedStat.class)) {
                    io.realm.com_tech_world_model_realms_UnUpdatedStatRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.tech.world.model.realms.UnUpdatedVoiceMessageStat.class)) {
                    io.realm.com_tech_world_model_realms_UnUpdatedVoiceMessageStatRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.tech.world.model.realms.User.class)) {
                    io.realm.com_tech_world_model_realms_UserRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.tech.world.model.realms.UserStatuses.class)) {
                    io.realm.com_tech_world_model_realms_UserStatusesRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.tech.world.model.realms.StatusSeenBy.class)) {
                    io.realm.com_tech_world_model_realms_StatusSeenByRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else if (clazz.equals(com.tech.world.model.realms.TextStatus.class)) {
                    io.realm.com_tech_world_model_realms_TextStatusRealmProxy.insertOrUpdate(realm, iterator, cache);
                } else {
                    throw getMissingProxyClassException(clazz);
                }
            }
        }
    }

    @Override
    public <E extends RealmModel> E createOrUpdateUsingJsonObject(Class<E> clazz, Realm realm, JSONObject json, boolean update)
        throws JSONException {
        checkClass(clazz);

        if (clazz.equals(com.tech.world.model.realms.Broadcast.class)) {
            return clazz.cast(io.realm.com_tech_world_model_realms_BroadcastRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.tech.world.model.realms.Chat.class)) {
            return clazz.cast(io.realm.com_tech_world_model_realms_ChatRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.tech.world.model.realms.CurrentUserInfo.class)) {
            return clazz.cast(io.realm.com_tech_world_model_realms_CurrentUserInfoRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.tech.world.model.realms.DeletedMessage.class)) {
            return clazz.cast(io.realm.com_tech_world_model_realms_DeletedMessageRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.tech.world.model.realms.FireCall.class)) {
            return clazz.cast(io.realm.com_tech_world_model_realms_FireCallRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.tech.world.model.realms.Group.class)) {
            return clazz.cast(io.realm.com_tech_world_model_realms_GroupRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.tech.world.model.realms.GroupEvent.class)) {
            return clazz.cast(io.realm.com_tech_world_model_realms_GroupEventRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.tech.world.model.realms.JobId.class)) {
            return clazz.cast(io.realm.com_tech_world_model_realms_JobIdRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.tech.world.model.realms.Message.class)) {
            return clazz.cast(io.realm.com_tech_world_model_realms_MessageRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.tech.world.model.realms.PendingGroupJob.class)) {
            return clazz.cast(io.realm.com_tech_world_model_realms_PendingGroupJobRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.tech.world.model.realms.PhoneNumber.class)) {
            return clazz.cast(io.realm.com_tech_world_model_realms_PhoneNumberRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.tech.world.model.realms.QuotedMessage.class)) {
            return clazz.cast(io.realm.com_tech_world_model_realms_QuotedMessageRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.tech.world.model.realms.RealmContact.class)) {
            return clazz.cast(io.realm.com_tech_world_model_realms_RealmContactRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.tech.world.model.realms.RealmLocation.class)) {
            return clazz.cast(io.realm.com_tech_world_model_realms_RealmLocationRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.tech.world.model.realms.Status.class)) {
            return clazz.cast(io.realm.com_tech_world_model_realms_StatusRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.tech.world.model.realms.TempMessage.class)) {
            return clazz.cast(io.realm.com_tech_world_model_realms_TempMessageRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.tech.world.model.realms.UnUpdatedStat.class)) {
            return clazz.cast(io.realm.com_tech_world_model_realms_UnUpdatedStatRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.tech.world.model.realms.UnUpdatedVoiceMessageStat.class)) {
            return clazz.cast(io.realm.com_tech_world_model_realms_UnUpdatedVoiceMessageStatRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.tech.world.model.realms.User.class)) {
            return clazz.cast(io.realm.com_tech_world_model_realms_UserRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.tech.world.model.realms.UserStatuses.class)) {
            return clazz.cast(io.realm.com_tech_world_model_realms_UserStatusesRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.tech.world.model.realms.StatusSeenBy.class)) {
            return clazz.cast(io.realm.com_tech_world_model_realms_StatusSeenByRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        if (clazz.equals(com.tech.world.model.realms.TextStatus.class)) {
            return clazz.cast(io.realm.com_tech_world_model_realms_TextStatusRealmProxy.createOrUpdateUsingJsonObject(realm, json, update));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E createUsingJsonStream(Class<E> clazz, Realm realm, JsonReader reader)
        throws IOException {
        checkClass(clazz);

        if (clazz.equals(com.tech.world.model.realms.Broadcast.class)) {
            return clazz.cast(io.realm.com_tech_world_model_realms_BroadcastRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.tech.world.model.realms.Chat.class)) {
            return clazz.cast(io.realm.com_tech_world_model_realms_ChatRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.tech.world.model.realms.CurrentUserInfo.class)) {
            return clazz.cast(io.realm.com_tech_world_model_realms_CurrentUserInfoRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.tech.world.model.realms.DeletedMessage.class)) {
            return clazz.cast(io.realm.com_tech_world_model_realms_DeletedMessageRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.tech.world.model.realms.FireCall.class)) {
            return clazz.cast(io.realm.com_tech_world_model_realms_FireCallRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.tech.world.model.realms.Group.class)) {
            return clazz.cast(io.realm.com_tech_world_model_realms_GroupRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.tech.world.model.realms.GroupEvent.class)) {
            return clazz.cast(io.realm.com_tech_world_model_realms_GroupEventRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.tech.world.model.realms.JobId.class)) {
            return clazz.cast(io.realm.com_tech_world_model_realms_JobIdRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.tech.world.model.realms.Message.class)) {
            return clazz.cast(io.realm.com_tech_world_model_realms_MessageRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.tech.world.model.realms.PendingGroupJob.class)) {
            return clazz.cast(io.realm.com_tech_world_model_realms_PendingGroupJobRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.tech.world.model.realms.PhoneNumber.class)) {
            return clazz.cast(io.realm.com_tech_world_model_realms_PhoneNumberRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.tech.world.model.realms.QuotedMessage.class)) {
            return clazz.cast(io.realm.com_tech_world_model_realms_QuotedMessageRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.tech.world.model.realms.RealmContact.class)) {
            return clazz.cast(io.realm.com_tech_world_model_realms_RealmContactRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.tech.world.model.realms.RealmLocation.class)) {
            return clazz.cast(io.realm.com_tech_world_model_realms_RealmLocationRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.tech.world.model.realms.Status.class)) {
            return clazz.cast(io.realm.com_tech_world_model_realms_StatusRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.tech.world.model.realms.TempMessage.class)) {
            return clazz.cast(io.realm.com_tech_world_model_realms_TempMessageRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.tech.world.model.realms.UnUpdatedStat.class)) {
            return clazz.cast(io.realm.com_tech_world_model_realms_UnUpdatedStatRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.tech.world.model.realms.UnUpdatedVoiceMessageStat.class)) {
            return clazz.cast(io.realm.com_tech_world_model_realms_UnUpdatedVoiceMessageStatRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.tech.world.model.realms.User.class)) {
            return clazz.cast(io.realm.com_tech_world_model_realms_UserRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.tech.world.model.realms.UserStatuses.class)) {
            return clazz.cast(io.realm.com_tech_world_model_realms_UserStatusesRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.tech.world.model.realms.StatusSeenBy.class)) {
            return clazz.cast(io.realm.com_tech_world_model_realms_StatusSeenByRealmProxy.createUsingJsonStream(realm, reader));
        }
        if (clazz.equals(com.tech.world.model.realms.TextStatus.class)) {
            return clazz.cast(io.realm.com_tech_world_model_realms_TextStatusRealmProxy.createUsingJsonStream(realm, reader));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> E createDetachedCopy(E realmObject, int maxDepth, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> cache) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<E> clazz = (Class<E>) realmObject.getClass().getSuperclass();

        if (clazz.equals(com.tech.world.model.realms.Broadcast.class)) {
            return clazz.cast(io.realm.com_tech_world_model_realms_BroadcastRealmProxy.createDetachedCopy((com.tech.world.model.realms.Broadcast) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.tech.world.model.realms.Chat.class)) {
            return clazz.cast(io.realm.com_tech_world_model_realms_ChatRealmProxy.createDetachedCopy((com.tech.world.model.realms.Chat) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.tech.world.model.realms.CurrentUserInfo.class)) {
            return clazz.cast(io.realm.com_tech_world_model_realms_CurrentUserInfoRealmProxy.createDetachedCopy((com.tech.world.model.realms.CurrentUserInfo) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.tech.world.model.realms.DeletedMessage.class)) {
            return clazz.cast(io.realm.com_tech_world_model_realms_DeletedMessageRealmProxy.createDetachedCopy((com.tech.world.model.realms.DeletedMessage) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.tech.world.model.realms.FireCall.class)) {
            return clazz.cast(io.realm.com_tech_world_model_realms_FireCallRealmProxy.createDetachedCopy((com.tech.world.model.realms.FireCall) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.tech.world.model.realms.Group.class)) {
            return clazz.cast(io.realm.com_tech_world_model_realms_GroupRealmProxy.createDetachedCopy((com.tech.world.model.realms.Group) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.tech.world.model.realms.GroupEvent.class)) {
            return clazz.cast(io.realm.com_tech_world_model_realms_GroupEventRealmProxy.createDetachedCopy((com.tech.world.model.realms.GroupEvent) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.tech.world.model.realms.JobId.class)) {
            return clazz.cast(io.realm.com_tech_world_model_realms_JobIdRealmProxy.createDetachedCopy((com.tech.world.model.realms.JobId) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.tech.world.model.realms.Message.class)) {
            return clazz.cast(io.realm.com_tech_world_model_realms_MessageRealmProxy.createDetachedCopy((com.tech.world.model.realms.Message) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.tech.world.model.realms.PendingGroupJob.class)) {
            return clazz.cast(io.realm.com_tech_world_model_realms_PendingGroupJobRealmProxy.createDetachedCopy((com.tech.world.model.realms.PendingGroupJob) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.tech.world.model.realms.PhoneNumber.class)) {
            return clazz.cast(io.realm.com_tech_world_model_realms_PhoneNumberRealmProxy.createDetachedCopy((com.tech.world.model.realms.PhoneNumber) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.tech.world.model.realms.QuotedMessage.class)) {
            return clazz.cast(io.realm.com_tech_world_model_realms_QuotedMessageRealmProxy.createDetachedCopy((com.tech.world.model.realms.QuotedMessage) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.tech.world.model.realms.RealmContact.class)) {
            return clazz.cast(io.realm.com_tech_world_model_realms_RealmContactRealmProxy.createDetachedCopy((com.tech.world.model.realms.RealmContact) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.tech.world.model.realms.RealmLocation.class)) {
            return clazz.cast(io.realm.com_tech_world_model_realms_RealmLocationRealmProxy.createDetachedCopy((com.tech.world.model.realms.RealmLocation) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.tech.world.model.realms.Status.class)) {
            return clazz.cast(io.realm.com_tech_world_model_realms_StatusRealmProxy.createDetachedCopy((com.tech.world.model.realms.Status) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.tech.world.model.realms.TempMessage.class)) {
            return clazz.cast(io.realm.com_tech_world_model_realms_TempMessageRealmProxy.createDetachedCopy((com.tech.world.model.realms.TempMessage) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.tech.world.model.realms.UnUpdatedStat.class)) {
            return clazz.cast(io.realm.com_tech_world_model_realms_UnUpdatedStatRealmProxy.createDetachedCopy((com.tech.world.model.realms.UnUpdatedStat) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.tech.world.model.realms.UnUpdatedVoiceMessageStat.class)) {
            return clazz.cast(io.realm.com_tech_world_model_realms_UnUpdatedVoiceMessageStatRealmProxy.createDetachedCopy((com.tech.world.model.realms.UnUpdatedVoiceMessageStat) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.tech.world.model.realms.User.class)) {
            return clazz.cast(io.realm.com_tech_world_model_realms_UserRealmProxy.createDetachedCopy((com.tech.world.model.realms.User) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.tech.world.model.realms.UserStatuses.class)) {
            return clazz.cast(io.realm.com_tech_world_model_realms_UserStatusesRealmProxy.createDetachedCopy((com.tech.world.model.realms.UserStatuses) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.tech.world.model.realms.StatusSeenBy.class)) {
            return clazz.cast(io.realm.com_tech_world_model_realms_StatusSeenByRealmProxy.createDetachedCopy((com.tech.world.model.realms.StatusSeenBy) realmObject, 0, maxDepth, cache));
        }
        if (clazz.equals(com.tech.world.model.realms.TextStatus.class)) {
            return clazz.cast(io.realm.com_tech_world_model_realms_TextStatusRealmProxy.createDetachedCopy((com.tech.world.model.realms.TextStatus) realmObject, 0, maxDepth, cache));
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> boolean isEmbedded(Class<E> clazz) {
        if (clazz.equals(com.tech.world.model.realms.Broadcast.class)) {
            return false;
        }
        if (clazz.equals(com.tech.world.model.realms.Chat.class)) {
            return false;
        }
        if (clazz.equals(com.tech.world.model.realms.CurrentUserInfo.class)) {
            return false;
        }
        if (clazz.equals(com.tech.world.model.realms.DeletedMessage.class)) {
            return false;
        }
        if (clazz.equals(com.tech.world.model.realms.FireCall.class)) {
            return false;
        }
        if (clazz.equals(com.tech.world.model.realms.Group.class)) {
            return false;
        }
        if (clazz.equals(com.tech.world.model.realms.GroupEvent.class)) {
            return false;
        }
        if (clazz.equals(com.tech.world.model.realms.JobId.class)) {
            return false;
        }
        if (clazz.equals(com.tech.world.model.realms.Message.class)) {
            return false;
        }
        if (clazz.equals(com.tech.world.model.realms.PendingGroupJob.class)) {
            return false;
        }
        if (clazz.equals(com.tech.world.model.realms.PhoneNumber.class)) {
            return false;
        }
        if (clazz.equals(com.tech.world.model.realms.QuotedMessage.class)) {
            return false;
        }
        if (clazz.equals(com.tech.world.model.realms.RealmContact.class)) {
            return false;
        }
        if (clazz.equals(com.tech.world.model.realms.RealmLocation.class)) {
            return false;
        }
        if (clazz.equals(com.tech.world.model.realms.Status.class)) {
            return false;
        }
        if (clazz.equals(com.tech.world.model.realms.TempMessage.class)) {
            return false;
        }
        if (clazz.equals(com.tech.world.model.realms.UnUpdatedStat.class)) {
            return false;
        }
        if (clazz.equals(com.tech.world.model.realms.UnUpdatedVoiceMessageStat.class)) {
            return false;
        }
        if (clazz.equals(com.tech.world.model.realms.User.class)) {
            return false;
        }
        if (clazz.equals(com.tech.world.model.realms.UserStatuses.class)) {
            return false;
        }
        if (clazz.equals(com.tech.world.model.realms.StatusSeenBy.class)) {
            return false;
        }
        if (clazz.equals(com.tech.world.model.realms.TextStatus.class)) {
            return false;
        }
        throw getMissingProxyClassException(clazz);
    }

    @Override
    public <E extends RealmModel> void updateEmbeddedObject(Realm realm, E unmanagedObject, E managedObject, Map<RealmModel, RealmObjectProxy> cache, Set<ImportFlag> flags) {
        // This cast is correct because obj is either
        // generated by RealmProxy or the original type extending directly from RealmObject
        @SuppressWarnings("unchecked") Class<E> clazz = (Class<E>) managedObject.getClass().getSuperclass();

        if (clazz.equals(com.tech.world.model.realms.Broadcast.class)) {
            throw getNotEmbeddedClassException("com.tech.world.model.realms.Broadcast");
        } else if (clazz.equals(com.tech.world.model.realms.Chat.class)) {
            throw getNotEmbeddedClassException("com.tech.world.model.realms.Chat");
        } else if (clazz.equals(com.tech.world.model.realms.CurrentUserInfo.class)) {
            throw getNotEmbeddedClassException("com.tech.world.model.realms.CurrentUserInfo");
        } else if (clazz.equals(com.tech.world.model.realms.DeletedMessage.class)) {
            throw getNotEmbeddedClassException("com.tech.world.model.realms.DeletedMessage");
        } else if (clazz.equals(com.tech.world.model.realms.FireCall.class)) {
            throw getNotEmbeddedClassException("com.tech.world.model.realms.FireCall");
        } else if (clazz.equals(com.tech.world.model.realms.Group.class)) {
            throw getNotEmbeddedClassException("com.tech.world.model.realms.Group");
        } else if (clazz.equals(com.tech.world.model.realms.GroupEvent.class)) {
            throw getNotEmbeddedClassException("com.tech.world.model.realms.GroupEvent");
        } else if (clazz.equals(com.tech.world.model.realms.JobId.class)) {
            throw getNotEmbeddedClassException("com.tech.world.model.realms.JobId");
        } else if (clazz.equals(com.tech.world.model.realms.Message.class)) {
            throw getNotEmbeddedClassException("com.tech.world.model.realms.Message");
        } else if (clazz.equals(com.tech.world.model.realms.PendingGroupJob.class)) {
            throw getNotEmbeddedClassException("com.tech.world.model.realms.PendingGroupJob");
        } else if (clazz.equals(com.tech.world.model.realms.PhoneNumber.class)) {
            throw getNotEmbeddedClassException("com.tech.world.model.realms.PhoneNumber");
        } else if (clazz.equals(com.tech.world.model.realms.QuotedMessage.class)) {
            throw getNotEmbeddedClassException("com.tech.world.model.realms.QuotedMessage");
        } else if (clazz.equals(com.tech.world.model.realms.RealmContact.class)) {
            throw getNotEmbeddedClassException("com.tech.world.model.realms.RealmContact");
        } else if (clazz.equals(com.tech.world.model.realms.RealmLocation.class)) {
            throw getNotEmbeddedClassException("com.tech.world.model.realms.RealmLocation");
        } else if (clazz.equals(com.tech.world.model.realms.Status.class)) {
            throw getNotEmbeddedClassException("com.tech.world.model.realms.Status");
        } else if (clazz.equals(com.tech.world.model.realms.TempMessage.class)) {
            throw getNotEmbeddedClassException("com.tech.world.model.realms.TempMessage");
        } else if (clazz.equals(com.tech.world.model.realms.UnUpdatedStat.class)) {
            throw getNotEmbeddedClassException("com.tech.world.model.realms.UnUpdatedStat");
        } else if (clazz.equals(com.tech.world.model.realms.UnUpdatedVoiceMessageStat.class)) {
            throw getNotEmbeddedClassException("com.tech.world.model.realms.UnUpdatedVoiceMessageStat");
        } else if (clazz.equals(com.tech.world.model.realms.User.class)) {
            throw getNotEmbeddedClassException("com.tech.world.model.realms.User");
        } else if (clazz.equals(com.tech.world.model.realms.UserStatuses.class)) {
            throw getNotEmbeddedClassException("com.tech.world.model.realms.UserStatuses");
        } else if (clazz.equals(com.tech.world.model.realms.StatusSeenBy.class)) {
            throw getNotEmbeddedClassException("com.tech.world.model.realms.StatusSeenBy");
        } else if (clazz.equals(com.tech.world.model.realms.TextStatus.class)) {
            throw getNotEmbeddedClassException("com.tech.world.model.realms.TextStatus");
        } else {
            throw getMissingProxyClassException(clazz);
        }
    }

}
