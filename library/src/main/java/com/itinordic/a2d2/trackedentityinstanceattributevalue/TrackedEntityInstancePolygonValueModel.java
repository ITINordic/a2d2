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

@Entity(primaryKeys = { "trackedEntityAttributeId", "trackedEntityInstanceId", "polygonPointPosition" },
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
public class TrackedEntityInstancePolygonValueModel {



    @NonNull
    private int polygonPointPosition;

    @NonNull
    private String trackedEntityAttributeId;

    @NonNull
    private  String trackedEntityInstanceId;

    @Embedded
    GeoPoint value;

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

    public TrackedEntityInstancePolygonValueModel(
                                                  @NonNull String trackedEntityAttributeId,
                                                  @NonNull String trackedEntityInstanceId,
                                                  GeoPoint value,
                                                  int polygonPointPosition) {
        this.trackedEntityAttributeId = trackedEntityAttributeId;
        this.trackedEntityInstanceId = trackedEntityInstanceId;
        this.value = value;
        this.polygonPointPosition = polygonPointPosition;
    }

    public static class Builder {

        private String trackedEntityAttributeId;
        private String trackedEntityInstanceId;
        private int polygonPointPosition;
        GeoPoint value;


        public Builder() {
            //empty constructor
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

            if ( trackedEntityAttributeId == null) {
                throw new IllegalStateException("trackedEntityAttributeId must be set");

            }
            if ( trackedEntityInstanceId == null) {
                throw new IllegalStateException("trackedEntityInstanceId must be set");

            }
            if ( value == null) {
                throw new IllegalStateException("Value  must be set");
            }
            if ( polygonPointPosition < 0) {
                throw new IllegalStateException("Position  must be at least 0");
            }

            return new TrackedEntityInstancePolygonValueModel(
                    trackedEntityAttributeId,
                    trackedEntityInstanceId,
                    value,
                    polygonPointPosition
            );

        }
    }
}
