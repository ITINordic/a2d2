package com.itinordic.a2d2.programevent;

import androidx.annotation.NonNull;

import com.itinordic.a2d2.trackedentityinstance.TrackedEntityInstance;

public class ProgramEventDataValue {
    public final String dataElement;
    public final String value;

    public ProgramEventDataValue(String dataElement, String value) {
        this.dataElement = dataElement;
        this.value = value;
    }

    public static class Builder
    {

        private String dataElement;
        private String value;

        @NonNull
        public Builder dataElement(@NonNull String dataElement) {
            this.dataElement = dataElement;
            return this;
        }

        @NonNull
        public Builder value(@NonNull String value) {
            this.value = value;
            return this;
        }

        public ProgramEventDataValue build(){

            if (dataElement == null) {
                throw new IllegalStateException("dataElement for program data value must be set");
            }

            if (value == null) {
                throw new IllegalStateException("value must be set");
            }

            return new ProgramEventDataValue( dataElement, value);
        }
    }
}
