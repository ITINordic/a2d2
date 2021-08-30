package com.itinordic.a2d2.programenrolment;

import androidx.annotation.NonNull;

public class ProgramEnrolment {

    public final String orgUnit;
    public final String program;
    public final String enrollmentDate;
    public final String incidentDate;


    public ProgramEnrolment(String orgUnit, String program, String enrollmentDate, String incidentDate) {
        this.orgUnit = orgUnit;
        this.program = program;
        this.enrollmentDate = enrollmentDate;
        this.incidentDate = incidentDate;
    }

    public static class Builder
    {
        private String orgUnit;
        private String program;
        private String enrollmentDate;
        private String incidentDate;

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

        public ProgramEnrolment build(){

            return new ProgramEnrolment(orgUnit, program, enrollmentDate, incidentDate);
        }
    }
}
