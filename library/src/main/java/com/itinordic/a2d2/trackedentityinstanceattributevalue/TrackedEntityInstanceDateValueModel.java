package com.itinordic.a2d2.trackedentityinstanceattributevalue;

import com.itinordic.a2d2.trackedentityattribute.TrackedEntityAttributeModel;
import com.itinordic.a2d2.trackedentityinstance.TrackedEntityInstance;
import com.itinordic.a2d2.trackedentityinstance.TrackedEntityInstanceModel;

import java.util.Date;
import java.util.regex.Pattern;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;

@Entity(primaryKeys = { "trackedEntityAttributeId", "trackedEntityInstanceId" },
        foreignKeys = {
                @ForeignKey(entity = TrackedEntityAttributeModel.class,
                        parentColumns = "id",
                        childColumns = "trackedEntityAttributeId"
                ),
                @ForeignKey(entity = TrackedEntityInstanceModel.class,
                        parentColumns = "id",
                        childColumns = "trackedEntityInstanceId"
                )}, indices = {@Index("trackedEntityAttributeId"), @Index("trackedEntityInstanceId")})
public class TrackedEntityInstanceDateValueModel {

    public static final Pattern VALID_DATE_REGEX = Pattern.compile("((?:19|20)\\\\d\\\\d)/(0?[1-9]|1[012])/([12][0-9]|3[01]|0?[1-9])");

    @NonNull
    private String trackedEntityAttributeId;

    @NonNull
    private  String trackedEntityInstanceId;

    @NonNull
    private String value;

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
    public String getValue() {
        return value;
    }

    public void setValue(@NonNull String value) {
        this.value = value;
    }


    public TrackedEntityInstanceDateValueModel(@NonNull String trackedEntityAttributeId,
                                               @NonNull String trackedEntityInstanceId,
                                               @NonNull String value) {
        this.trackedEntityAttributeId = trackedEntityAttributeId;
        this.trackedEntityInstanceId = trackedEntityInstanceId;
        this.value = value;
    }


    public static class Builder {

        private String trackedEntityAttributeId;
        private String trackedEntityInstanceId;
        private String value;


        public Builder() {
            //Empty constructor
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
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public TrackedEntityInstanceDateValueModel build() {

            if (trackedEntityAttributeId == null) {
                throw new IllegalStateException("trackedEntityAttributeId must be set");

            }
            if (trackedEntityInstanceId == null) {
                throw new IllegalStateException("trackedEntityInstanceId must be set");

            }

            if (!value.matches(VALID_DATE_REGEX.pattern()))
                throw new IllegalStateException("Date format incorrect.");

            return new TrackedEntityInstanceDateValueModel(
                    trackedEntityAttributeId,
                    trackedEntityInstanceId,
                    value
            );
        }

    }
    }


