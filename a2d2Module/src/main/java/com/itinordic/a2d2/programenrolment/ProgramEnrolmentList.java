package com.itinordic.a2d2.programenrolment;

import androidx.annotation.NonNull;

import java.util.List;

public class ProgramEnrolmentList {

    public final List<ProgramEnrolment> enrollments;

    public ProgramEnrolmentList(List<ProgramEnrolment> enrollments) {
        this.enrollments = enrollments;
    }

    public static class Builder
    {

        private List<ProgramEnrolment> enrollments;

        @NonNull
        public Builder enrollments(@NonNull List<ProgramEnrolment> enrollments){
            this.enrollments = enrollments;
            return this;
        }

        public ProgramEnrolmentList build(){

            return new ProgramEnrolmentList(enrollments);
        }
    }
}
