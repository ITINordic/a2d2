package com.itinordic.a2d2.trackedentityinstanceattributevalue;

import androidx.annotation.NonNull;
import androidx.room.PrimaryKey;

public class TrackedEntityInstanceEmailValueModel {

    public TrackedEntityInstanceEmailValueModel(int id, @NonNull String trackedEntityTypeId, @NonNull String trackedEntityAttributeId, @NonNull String trackedEntityInstanceId, @NonNull String value) {

        this.trackedEntityTypeId = trackedEntityTypeId;
        this.trackedEntityAttributeId = trackedEntityAttributeId;
        this.trackedEntityInstanceId = trackedEntityInstanceId;
        this.value = value;
    }


    @NonNull
    @PrimaryKey
    private  String trackedEntityTypeId;

    @NonNull
    private String trackedEntityAttributeId;

    @NonNull
    private  String trackedEntityInstanceId;

    @NonNull
    private String value;

}
