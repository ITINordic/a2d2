package com.itinordic.a2d2.programevent;

import androidx.annotation.NonNull;

import java.util.List;

public class ProgramEventList {
    public final List<ProgramEvent> events;

    public ProgramEventList(List<ProgramEvent> events) {
        this.events = events;
    }

    public static class Builder
    {

        private List<ProgramEvent> events;

        @NonNull
        public Builder events(@NonNull List<ProgramEvent> events){
            this.events = events;
            return this;
        }

        public ProgramEventList build(){

            return new ProgramEventList(events);
        }
    }
}
