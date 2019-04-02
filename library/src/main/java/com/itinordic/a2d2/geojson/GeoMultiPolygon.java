package com.itinordic.a2d2.geojson;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.room.Entity;

public class GeoMultiPolygon {

    List<GeoPolygon> geoPolygons;

    public GeoMultiPolygon(List<GeoPolygon> geoPolygons) {
        this.geoPolygons = geoPolygons;
    }

    public List<GeoPolygon> getGeoPolygons() {
        return geoPolygons;
    }

    public void setGeoPolygons(List<GeoPolygon> geoPolygons) {
        this.geoPolygons = geoPolygons;
    }

    public class Builder{

        List<GeoPolygon> geoPolygons;

        public Builder(){
            //empty constructor
        }

        public Builder geoPolygons(@NonNull List<GeoPolygon> geoPolygons){
                this.geoPolygons = geoPolygons;
                return this;
        }

        public GeoMultiPolygon build(){
            if (geoPolygons.isEmpty()){
                throw new IllegalStateException("Values must be set");
            }

            return new GeoMultiPolygon(geoPolygons);
        }
    }

}
