package com.itinordic.a2d2.programstage;

import com.itinordic.a2d2.paging.Pager;
import com.itinordic.a2d2.paging.PagingBase;

import java.util.List;

/**
 * Created by regnatpopulus on 2019-05-27.
 * dev@itinordic.com
 * Copyright (c) 2019, ITINordic
 * All rights reserved.
 */
public class ProgramStages extends PagingBase {

    public final List<ProgramStage> programStages;

    public ProgramStages(Pager pager, List<ProgramStage> programStages) {
        super(pager);
        this.programStages = programStages;
    }
}
