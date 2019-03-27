package com.itinordic.a2d2.trackedentityinstanceattributevalue;

import com.itinordic.a2d2.geojson.GeoPoint;

import androidx.room.Embedded;

public class TrackedEntityInstanceCoordinateValueModel {

    String type;
    @Embedded
    GeoPoint geoPoint;

}
