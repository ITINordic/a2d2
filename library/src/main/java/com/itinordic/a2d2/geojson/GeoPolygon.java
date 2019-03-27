package com.itinordic.a2d2.geojson;

import androidx.annotation.NonNull;
import androidx.room.Entity;

@Entity
public class GeoPolygon {

    double latitude;
    double longitude;

    public GeoPolygon(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public class Builder {


        double latitude;
        double longitude;

        public Builder(){
            //empty constructor
        }

        @NonNull
        public Builder latitude(@NonNull double latitude){
            this.latitude = latitude;
            return this;
        }

        public Builder longitude(@NonNull double longitude){
            this.longitude = longitude;
            return this;
        }

        public GeoPolygon build(){
            if (latitude>= -90 && latitude <= 90){
                throw new  IllegalStateException("Latitude value must range from -90 to 90");
            }

            if (longitude >= -180 && longitude <= 180){
                throw new IllegalStateException("Longitude value must range from -90 to 90");

            }

            return new GeoPolygon(latitude,longitude);
        }

    }
}
