package com.itinordic.a2d2.programevent;

import androidx.annotation.NonNull;

import java.util.List;

public class ProgramEvent {

    public final String event;
    public final String trackedEntityInstance;
    public final String program;
    public final String orgUnit;
    public final String eventDate;
    public final String status;
    public final String storedBy;
    public final String programStage;
    public final String enrollment;
    public final List<ProgramEventDataValue> dataValues;


    public ProgramEvent(String event, String trackedEntityInstance, String program, String orgUnit, String eventDate, String status, String storedBy, String programStage, String enrollment, List<ProgramEventDataValue> dataValues) {
        this.event = event;
        this.trackedEntityInstance = trackedEntityInstance;
        this.program = program;
        this.orgUnit = orgUnit;
        this.eventDate = eventDate;
        this.status = status;
        this.storedBy = storedBy;
        this.programStage = programStage;
        this.enrollment = enrollment;
        this.dataValues = dataValues;
    }

    public static class Builder
    {

        private String event;
        private String trackedEntityInstance;
        private String program;
        private String orgUnit;
        private String eventDate;
        private String status;
        private String storedBy;
        private String programStage;
        private List<ProgramEventDataValue> dataValues;
        private String enrollment;

        @NonNull
        public Builder program(@NonNull String program) {
            this.program = program;
            return this;
        }


        @NonNull
        public Builder event(@NonNull String event) {
            this.event = event;
            return this;
        }

        @NonNull
        public Builder trackedEntityInstance(@NonNull String trackedEntityInstance) {
            this.trackedEntityInstance = trackedEntityInstance;
            return this;
        }

        @NonNull
        public Builder enrollment(@NonNull String enrollment) {
            this.enrollment = enrollment;
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

        public Builder dataValues(List<ProgramEventDataValue> dataValues) {
            this.dataValues = dataValues;
            return this;
        }

        public ProgramEvent build(){
            return new ProgramEvent(event, trackedEntityInstance, program, orgUnit, eventDate, status, storedBy, programStage, enrollment, dataValues);
        }
    }
}
