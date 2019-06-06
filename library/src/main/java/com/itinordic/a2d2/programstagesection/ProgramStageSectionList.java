package com.itinordic.a2d2.programstagesection;

import java.util.List;

/**
 * Created by regnatpopulus on 2019-06-06.
 * dev@itinordic.com
 * Copyright (c) 2019, ITINordic
 * All rights reserved.
 */
public class ProgramStageSectionList {

    public final List<ProgramStageSection> programStageSections;

    public ProgramStageSectionList(List<ProgramStageSection> programStageSections) {
        this.programStageSections = programStageSections;
    }

    public List<ProgramStageSection> getProgramStageSections() {
        return programStageSections;
    }

}
