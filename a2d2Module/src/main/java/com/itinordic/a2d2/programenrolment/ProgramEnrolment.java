package com.itinordic.a2d2.programenrolment;

import androidx.annotation.NonNull;

import com.itinordic.a2d2.programevent.ProgramEvent;

import java.util.List;

public class ProgramEnrolment {

    public final String orgUnit;
    public final String program;
    public final String enrollmentDate;
    public final String incidentDate;
    public final List<ProgramEvent> events;


    public ProgramEnrolment(String orgUnit, String program, String enrollmentDate, String incidentDate, List<ProgramEvent> events) {
        this.orgUnit = orgUnit;
        this.program = program;
        this.enrollmentDate = enrollmentDate;
        this.incidentDate = incidentDate;
        this.events = events;
    }

    public static class Builder
    {
        private String orgUnit;
        private String program;
        private String enrollmentDate;
        private String incidentDate;
        private List<ProgramEvent> events;

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

            return new ProgramEnrolment(orgUnit, program, enrollmentDate, incidentDate, events);
        }
    }
}
