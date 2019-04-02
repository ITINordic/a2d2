package com.itinordic.a2d2.geojson;

import com.itinordic.a2d2.trackedentityattribute.TrackedEntityAttributeModel;
import com.itinordic.a2d2.trackedentityinstance.TrackedEntityInstanceModel;
import com.itinordic.a2d2.trackedentitytype.TrackedEntityTypeModel;

import androidx.annotation.NonNull;
import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.ForeignKey;

@Entity(foreignKeys = {@ForeignKey(entity = TrackedEntityTypeModel.class,
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
)})
public class GeoPolygonPointsValueModel {


    @Embedded
    GeoPoint geoPoint;

    private int geoPointPosition;

    public GeoPolygonPointsValueModel(GeoPoint geoPoint,
                                      int geoPointPosition) {
        this.geoPoint = geoPoint;
        this.geoPointPosition = geoPointPosition;
    }

    public GeoPoint getGeoPoint() {
        return geoPoint;
    }

    public void setGeoPoint(GeoPoint geoPoint) {
        this.geoPoint = geoPoint;
    }

    public int getGeoPointPosition() {
        return geoPointPosition;
    }

    public void setGeoPointPosition(int geoPointPosition) {
        this.geoPointPosition = geoPointPosition;
    }

    public static class Builder{

        GeoPoint value;
        int geoPoint;


        public Builder() {
            //empty constructor
        }

        @NonNull
        public Builder value(@NonNull GeoPoint value) {

            this.value = value;
            return this;

        }

        @NonNull
        public Builder geoPoint(@NonNull int geoPoint) {
            this.geoPoint = geoPoint;
            return this;

        }

        public GeoPolygonPointsValueModel build(){

            if (value == null){

                throw new IllegalStateException("values must be set");
            }

            return new GeoPolygonPointsValueModel(value,geoPoint);

        }

    }


}
