package com.itinordic.a2d2.programevent;

import androidx.annotation.NonNull;

import com.itinordic.a2d2.trackedentityinstance.TrackedEntityInstance;

public class ProgramEvent {

    public final String program;
    public final String orgUnit;
    public final String eventDate;
    public final String status;
    public final String storedBy;
    public final String programStage;


    public ProgramEvent(String program, String orgUnit, String eventDate, String status, String storedBy, String programStage) {
        this.program = program;
        this.orgUnit = orgUnit;
        this.eventDate = eventDate;
        this.status = status;
        this.storedBy = storedBy;
        this.programStage = programStage;
    }

    public static class Builder
    {

        private String program;
        private String orgUnit;
        private String eventDate;
        private String status;
        private String storedBy;
        private String programStage;

        @NonNull
        public Builder program(@NonNull String program) {
            this.program = program;
            return this;
        }

        @NonNull
        public Builder orgUnit(@NonNull String orgUnit) {
            this.orgUnit = orgUnit;
            return this;
        }

        @NonNull
        public Builder status(@NonNull String status) {
            this.status = status;
            return this;
        }

        @NonNull
        public Builder programStage(@NonNull String programStage) {
            this.programStage = programStage;
            return this;
        }

        @NonNull
        public Builder storedBy(@NonNull String storedBy) {
            this.storedBy = storedBy;
            return this;
        }

        @NonNull
        public Builder eventDate(@NonNull String eventDate) {
            this.eventDate = eventDate;
            return this;
        }

        public ProgramEvent build(){
            return new ProgramEvent(program, orgUnit, eventDate, status, storedBy, programStage);
        }
    }
}
