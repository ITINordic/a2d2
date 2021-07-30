package com.itinordic.a2d2.programrule;

import com.itinordic.a2d2.paging.Pager;
import com.itinordic.a2d2.paging.PagingBase;

import java.util.List;

/**
 * Created by regnatpopulus on 2019-05-27.
 * dev@itinordic.com
 * Copyright (c) 2019, ITINordic
 * All rights reserved.
 */
public class ProgramRules extends PagingBase {

    public final List<ProgramRule> programRules;

    public ProgramRules(Pager pager, List<ProgramRule> programRules) {
        super(pager);
        this.programRules = programRules;
    }
}
