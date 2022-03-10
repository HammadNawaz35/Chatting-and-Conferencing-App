package com.tech.world.events;

public class UpdateGroupEvent {

    private String groupId;

    public UpdateGroupEvent( String groupId) {
        this.groupId = groupId;
    }


    public String getGroupId() {
        return groupId;
    }
}
