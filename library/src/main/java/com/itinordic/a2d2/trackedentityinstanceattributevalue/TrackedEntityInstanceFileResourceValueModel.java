package com.itinordic.a2d2.trackedentityinstanceattributevalue;

import com.itinordic.a2d2.trackedentityattribute.TrackedEntityAttributeModel;
import com.itinordic.a2d2.trackedentityinstance.TrackedEntityInstanceModel;
import com.itinordic.a2d2.trackedentitytype.TrackedEntityTypeModel;

import java.io.File;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;

@Entity(primaryKeys = { "trackedEntityTypeId", "trackedEntityAttributeId", "trackedEntityInstanceId" },
        foreignKeys = {@ForeignKey(entity = TrackedEntityTypeModel.class,
                parentColumns = "id",
                childColumns = "trackedEntityTypeId"
        ),
                @ForeignKey(entity = TrackedEntityAttributeModel.class,
                        parentColumns = "id",
                        childColumns = "trackedEntityAttributeId"
                ),
                @ForeignKey(entity = TrackedEntityInstanceModel.class,
                        parentColumns = "id",
                        childColumns = "trackedEntityInstanceId"
                )},indices = {@Index("trackedEntityTypeId"), @Index("trackedEntityAttributeId"), @Index("trackedEntityInstanceId")})
public class TrackedEntityInstanceFileResourceValueModel {
    @NonNull
    public String trackedEntityTypeId;

    @NonNull
    public String trackedEntityAttributeId;

    @NonNull
    public String trackedEntityInstanceId;

    @NonNull
    public File value;

    public TrackedEntityInstanceFileResourceValueModel(@NonNull String trackedEntityTypeId, @NonNull String trackedEntityAttributeId, @NonNull String trackedEntityInstanceId, @NonNull File value) {
        this.trackedEntityTypeId = trackedEntityTypeId;
        this.trackedEntityAttributeId = trackedEntityAttributeId;
        this.trackedEntityInstanceId = trackedEntityInstanceId;
        this.value = value;
    }

    @NonNull
    public String getTrackedEntityTypeId() {
        return trackedEntityTypeId;
    }

    public void setTrackedEntityTypeId(@NonNull String trackedEntityTypeId) {
        this.trackedEntityTypeId = trackedEntityTypeId;
    }

    @NonNull
    public String getTrackedEntityAttributeId() {
        return trackedEntityAttributeId;
    }

    public void setTrackedEntityAttributeId(@NonNull String trackedEntityAttributeId) {
        this.trackedEntityAttributeId = trackedEntityAttributeId;
    }

    @NonNull
    public String getTrackedEntityInstanceId() {
        return trackedEntityInstanceId;
    }

    public void setTrackedEntityInstanceId(@NonNull String trackedEntityInstanceId) {
        this.trackedEntityInstanceId = trackedEntityInstanceId;
    }

    @NonNull
    public File getValue() {
        return value;
    }

    public void setValue(@NonNull File value) {
        this.value = value;
    }

    public static class Builder {

        private String trackedEntityTypeId;
        private String trackedEntityAttributeId;
        private String trackedEntityInstanceId;
        private File value;


        public Builder() {
            //empty constructor
        }


        @NonNull
        public Builder trackedEntityTypeId(@NonNull String trackedEntityTypeId) {

            this.trackedEntityTypeId = trackedEntityTypeId;

            return this;

        }

        @NonNull
        public Builder trackedEntityAttributeId(@NonNull String trackedEntityAttributeId) {
            this.trackedEntityAttributeId = trackedEntityAttributeId;
            return this;
        }

        @NonNull
        public Builder trackedEntityInstanceId(@NonNull String trackedEntityInstanceId) {
            this.trackedEntityInstanceId = trackedEntityInstanceId;
            return this;

        }

        @NonNull
        public Builder value(@NonNull File value) {
            this.value = value;
            return this;
        }

        public TrackedEntityInstanceFileResourceValueModel build() {
            if (trackedEntityTypeId == null) {
                throw new IllegalStateException("trackedEntityTypeId must be set");
            }
            if (trackedEntityAttributeId == null) {
                throw new IllegalStateException("trackedEntityAttributeId must be set");

            }
            if (trackedEntityInstanceId == null) {
                throw new IllegalStateException("trackedEntityInstanceId must be set");

            }
            if (value == null) {
                throw new IllegalStateException("Value must be set");
            }


            return new TrackedEntityInstanceFileResourceValueModel(
                    trackedEntityTypeId,
                    trackedEntityInstanceId,
                    trackedEntityTypeId,
                    value

            );
        }
    }




}
