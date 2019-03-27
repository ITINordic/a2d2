package com.itinordic.a2d2.trackedentityinstanceattributevalue;

import com.itinordic.a2d2.trackedentityattribute.TrackedEntityAttributeModel;
import com.itinordic.a2d2.trackedentityinstance.TrackedEntityInstanceModel;
import com.itinordic.a2d2.trackedentitytype.TrackedEntityTypeModel;

import java.util.regex.Pattern;

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
                )},indices = {@Index("trackedEntityTypeId"), @Index("trackedEntityAttributeId"), @Index("trackedEntityInstanceId")}
)
public class TrackedEntityInstanceLetterValueModel {

    public static final Pattern VALID_LETTER_REGEX =
            Pattern.compile("/[a-z]+/g", Pattern.CASE_INSENSITIVE);

    @NonNull
    private  String trackedEntityTypeId;

    @NonNull
    private String trackedEntityAttributeId;

    @NonNull
    private  String trackedEntityInstanceId;

    @NonNull
    private char value;

    public TrackedEntityInstanceLetterValueModel(@NonNull String trackedEntityTypeId,
                                                 @NonNull String trackedEntityAttributeId,
                                                 @NonNull String trackedEntityInstanceId,
                                                 @NonNull char value){
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
    public char getValue() {
        return value;
    }

    public void setValue(@NonNull char value) {
        this.value = value;
    }

    public static class Builder{

        private  String trackedEntityTypeId;
        private String trackedEntityAttributeId;
        private  String trackedEntityInstanceId;
        private char value;


        public Builder() {
            //empty constructor
        }

        @NonNull
        public Builder trackedEntityTypeId(@NonNull String trackedEntityTypeId) {

            this.trackedEntityTypeId = trackedEntityTypeId;
            return this;

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
        public Builder value(@NonNull char value){
            this.value = value;
            return this;

        }

        public TrackedEntityInstanceLetterValueModel build(){
            if ( trackedEntityTypeId == null) {
                throw new IllegalStateException("trackedEntityTypeId must be set");
            }
            if ( trackedEntityAttributeId == null) {
                throw new IllegalStateException("trackedEntityAttributeId must be set");

            }
            if ( trackedEntityInstanceId == null) {
                throw new IllegalStateException("trackedEntityInstanceId must be set");

            }
            if (!Character.toString(value).matches(VALID_LETTER_REGEX.pattern())) {
                throw new IllegalStateException("Letter is invalid. Please try again");
            }

            return new TrackedEntityInstanceLetterValueModel(
                    trackedEntityTypeId,
                    trackedEntityAttributeId,
                    trackedEntityInstanceId,
                    value
            );
        }
    }

}
