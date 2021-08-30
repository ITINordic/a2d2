package com.itinordic.a2d2.programenrolment;

import androidx.annotation.NonNull;

import com.itinordic.a2d2.programevent.ProgramEvent;

import java.util.List;

public class ProgramEnrolment {

    public final String trackedEntityInstance;
    public final String trackedEntityType;
    public final String orgUnit;
    public final String program;
    public final String enrollmentDate;
    public final String incidentDate;
    public final List<ProgramEvent> events;
    public final String enrollment;


    public ProgramEnrolment(String trackedEntityInstance, String trackedEntityType, String orgUnit, String program, String enrollmentDate, String incidentDate, List<ProgramEvent> events, String enrollment) {
        this.trackedEntityInstance	 = trackedEntityInstance	;
        this.trackedEntityType = trackedEntityType;
        this.orgUnit = orgUnit;
        this.program = program;
        this.enrollmentDate = enrollmentDate;
        this.incidentDate = incidentDate;
        this.events = events;
        this.enrollment = enrollment;
    }

    public static class Builder
    {
        private String trackedEntityInstance;
        private String orgUnit;
        private String program;
        private String enrollmentDate;
        private String incidentDate;
        private List<ProgramEvent> events;
        private String enrollment;
        private String trackedEntityType;


        @NonNull
        public Builder trackedEntityInstance(@NonNull String trackedEntityInstance){
            this.trackedEntityInstance = trackedEntityInstance;
            return this;
        }
        @NonNull
        public Builder trackedEntityType(@NonNull String trackedEntityType){
            this.trackedEntityType = trackedEntityType;
            return this;
        }

        @NonNull
        public Builder enrollment(@NonNull String enrollment) {
            this.enrollment = enrollment;
            return this;
        }

        @NonNull
        public Builder orgUnit(@NonNull String orgUnit){
            this.orgUnit = orgUnit;
            return this;
        }

        @NonNull
        public Builder program(@NonNull String program){
            this.program = program;
            return this;
        }

        @NonNull
        public Builder enrollmentDate(@NonNull String enrollmentDate){
            this.enrollmentDate = enrollmentDate;
            return this;
        }

        public Builder incidentDate(String incidentDate){
            this.incidentDate = incidentDate;
            return this;
        }

        public Builder events(List<ProgramEvent> events){
            this.events = events;
            return this;
        }

        public ProgramEnrolment build(){

            return new ProgramEnrolment(trackedEntityInstance, trackedEntityType, orgUnit, program, enrollmentDate, incidentDate, events, enrollment);
        }
    }
}
