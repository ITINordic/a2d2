package com.itinordic.a2d2.programstagesection;

import com.itinordic.a2d2.paging.Pager;
import com.itinordic.a2d2.paging.PagingBase;

import java.util.List;

/**
 * Created by regnatpopulus on 2019-06-06.
 * dev@itinordic.com
 * Copyright (c) 2019, ITINordic
 * All rights reserved.
 */
public class ProgramStageSectionList extends PagingBase {

    public final List<ProgramStageSection> programStageSections;

    public ProgramStageSectionList(Pager pager, List<ProgramStageSection> programStageSections) {

        super(pager);
        this.programStageSections = programStageSections;
    }

    public List<ProgramStageSection> getProgramStageSections() {
        return programStageSections;
    }

}
