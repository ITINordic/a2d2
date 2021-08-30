package com.itinordic.a2d2.programevent;

import androidx.annotation.NonNull;

import java.util.List;

public class ProgramEventDataValueList {

    public final List<ProgramEventDataValue> dataValues;

    public ProgramEventDataValueList(List<ProgramEventDataValue> dataValues) {
        this.dataValues = dataValues;
    }

    public static class Builder
    {

        private List<ProgramEventDataValue> dataValues;

        @NonNull
        public Builder dataValues( @NonNull List<ProgramEventDataValue> dataValues){
            this.dataValues = dataValues;
            return this;
        }

        public ProgramEventDataValueList build(){

            return new ProgramEventDataValueList(dataValues);

        }
    }
}
