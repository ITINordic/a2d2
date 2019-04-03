package com.itinordic.a2d2.trackedentityinstanceattributevalue;

import com.itinordic.a2d2.trackedentityattribute.TrackedEntityAttributeModel;
import com.itinordic.a2d2.trackedentityinstance.TrackedEntityInstanceModel;
import com.itinordic.a2d2.trackedentitytype.TrackedEntityTypeModel;

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
public class TrackedEntityInstancePhoneNumberValueModel {

    public static final Pattern VALID_PHONE_NUMBER_REGEX =
            Pattern.compile("/^(\\+(\\d{1,3}))?[-. (]*(\\d{3})[-. )]*(\\d{3})[-. ]*(\\d{4})(?: *x(\\d+))?\\s*$/");

    @NonNull
    private String trackedEntityAttributeId;

    @NonNull
    private  String trackedEntityInstanceId;

    @NonNull
    private int value;

    public TrackedEntityInstancePhoneNumberValueModel(
                                                      @NonNull String trackedEntityAttributeId,
                                                      @NonNull String trackedEntityInstanceId,
                                                      int value) {

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

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public static class Builder{

        private String trackedEntityAttributeId;
        private String trackedEntityInstanceId;
        private int value;

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
        public Builder value(@NonNull int value){
            this.value = value;
            return this;

        }

        public TrackedEntityInstancePhoneNumberValueModel build(){

            if ( trackedEntityAttributeId == null) {
                throw new IllegalStateException("trackedEntityAttributeId must be set");

            }
            if ( trackedEntityInstanceId == null) {
                throw new IllegalStateException("trackedEntityInstanceId must be set");

            } //to be reviewed
            if (!String.valueOf(value).matches(VALID_PHONE_NUMBER_REGEX.pattern())){
                throw new IllegalStateException("Phone number invalid");
        }

        return new TrackedEntityInstancePhoneNumberValueModel(
                trackedEntityAttributeId,
                trackedEntityInstanceId,
                value);
    }

}

}
