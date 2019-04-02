package com.itinordic.a2d2.trackedentityinstanceattributevalue;

import com.itinordic.a2d2.geojson.GeoPoint;
import com.itinordic.a2d2.trackedentityattribute.TrackedEntityAttributeModel;
import com.itinordic.a2d2.trackedentityinstance.TrackedEntityInstanceModel;
import com.itinordic.a2d2.trackedentitytype.TrackedEntityTypeModel;

import androidx.annotation.NonNull;
import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;

@Entity(primaryKeys = { "trackedEntityTypeId", "trackedEntityAttributeId", "trackedEntityInstanceId", "polygonPointPosition" },
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
public class TrackedEntityInstancePolygonValueModel {



    @NonNull
    private int polygonPointPosition;

    @NonNull
    private  String trackedEntityTypeId;

    @NonNull
    private String trackedEntityAttributeId;

    @NonNull
    private  String trackedEntityInstanceId;

    @Embedded
    GeoPoint value;

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

    public GeoPoint getValue() {
        return value;
    }
    public int getPolygonPointPosition() {
        return polygonPointPosition;
    }

    public void setPolygonPointPosition(int polygonPointPosition) {
        this.polygonPointPosition = polygonPointPosition;
    }

    public void setValue(GeoPoint value) {
        this.value = value;
    }

    public TrackedEntityInstancePolygonValueModel(@NonNull String trackedEntityTypeId,
                                                  @NonNull String trackedEntityAttributeId,
                                                  @NonNull String trackedEntityInstanceId,
                                                  GeoPoint value,
                                                  int polygonPointPosition) {
        this.trackedEntityTypeId = trackedEntityTypeId;
        this.trackedEntityAttributeId = trackedEntityAttributeId;
        this.trackedEntityInstanceId = trackedEntityInstanceId;
        this.value = value;
    }

    public static class Builder {

        private String trackedEntityTypeId;
        private String trackedEntityAttributeId;
        private String trackedEntityInstanceId;
        private int polygonPointPosition;
        GeoPoint value;


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
         public Builder polygonPointPosition(@NonNull int polygonPointPosition){
            this.polygonPointPosition = polygonPointPosition;
            return this;
        }

        @NonNull
        public Builder value(@NonNull GeoPoint value){
            this.value = value;
            return this;
        }

        public TrackedEntityInstancePolygonValueModel build(){

            if ( trackedEntityTypeId == null) {
                throw new IllegalStateException("trackedEntityTypeId must be set");
            }
            if ( trackedEntityAttributeId == null) {
                throw new IllegalStateException("trackedEntityAttributeId must be set");

            }
            if ( trackedEntityInstanceId == null) {
                throw new IllegalStateException("trackedEntityInstanceId must be set");

            }
            if ( value == null) {
                throw new IllegalStateException("Value  must be set");
            }

            return new TrackedEntityInstancePolygonValueModel(
                    trackedEntityTypeId,
                    trackedEntityAttributeId,
                    trackedEntityInstanceId,
                    value,
                    polygonPointPosition
            );

        }
    }
}
