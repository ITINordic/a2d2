package com.itinordic.a2d2.geojson;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.room.Relation;

public class GeoPolygon {

    private List<GeoPoint> geoPoints;


    public GeoPolygon(List<GeoPoint> geoPoints) {
        this.geoPoints = geoPoints;
    }

    public List<GeoPoint> getGeoPoints() {
        return geoPoints;
    }

    public void setGeoPoints(List<GeoPoint> geoPoints) {
        this.geoPoints = geoPoints;
    }

    public class Builder{

        List<GeoPoint> geoPoints;

        public Builder(){
            //empty constructor
        }

       public Builder geoPoints(@NonNull List<GeoPoint> geoPoints){
            this.geoPoints = geoPoints;
            return this;
       }

       public GeoPolygon build(){

            if (geoPoints.isEmpty()){

                throw new IllegalStateException("values must be set");
            }

           if (!(geoPoints.get(0).equals(geoPoints.get(geoPoints.size()-1)))){

               throw new IllegalStateException("First and Last geoPoints do not match");
           }

            return new GeoPolygon(geoPoints);
       }
    }







}
