package com.itinordic.a2d2.trackedentityinstanceattributevalue;

import com.itinordic.a2d2.trackedentityattribute.TrackedEntityAttributeModel;
import com.itinordic.a2d2.trackedentityinstance.TrackedEntityInstanceModel;
import com.itinordic.a2d2.trackedentitytype.TrackedEntityTypeModel;

import java.sql.Time;
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
                )},indices = { @Index("trackedEntityAttributeId"), @Index("trackedEntityInstanceId")}
)
public class TrackedEntityInstanceTimeValueModel {

    public static final Pattern VALID_TIME_REGEX =
            Pattern.compile("/^$|^(([01][0-9])|(2[0-3])):[0-5][0-9]$/");

    @NonNull
    private String trackedEntityAttributeId;

    @NonNull
    private  String trackedEntityInstanceId;

    @NonNull
    private String value;


    public TrackedEntityInstanceTimeValueModel(
                                               @NonNull String trackedEntityAttributeId,
                                               @NonNull String trackedEntityInstanceId,
                                               String value) {
        this.trackedEntityAttributeId = trackedEntityAttributeId;
        this.trackedEntityInstanceId = trackedEntityInstanceId;
        this.value = value;
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

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public static class Builder{

        private String trackedEntityAttributeId;
        private String trackedEntityInstanceId;
        private String value;


        public Builder() {
            //empty constructor
        }

        @NonNull
        public Builder trackedEntityAttributeId(@NonNull String trackedEntityAttributeId){
            this.trackedEntityAttributeId = trackedEntityAttributeId;
            return  this;

        }
        @NonNull
        public Builder trackedEntityInstanceId(@NonNull String trackedEntityInstanceId){
            this.trackedEntityInstanceId = trackedEntityInstanceId;
            return this;

        }

        @NonNull
        public Builder value(@NonNull String value){
            this.value = value;
            return this;

        }

        public TrackedEntityInstanceTimeValueModel build(){
            if ( trackedEntityAttributeId == null) {
                throw new IllegalStateException("trackedEntityAttributeId must be set");

            }
            if ( trackedEntityInstanceId == null) {
                throw new IllegalStateException("trackedEntityInstanceId must be set");

            } //to be reviewed
            if (!Time.valueOf(value).toString().matches(VALID_TIME_REGEX.pattern())){
                throw new IllegalStateException("Please enter a valid time");
            }

            return new TrackedEntityInstanceTimeValueModel(
                    trackedEntityAttributeId,
                    trackedEntityInstanceId,
                    value);
    }
}}
