package com.itinordic.a2d2.programrulevariable;

import com.itinordic.a2d2.paging.Pager;
import com.itinordic.a2d2.paging.PagingBase;

import java.util.List;

/**
 * Created by regnatpopulus on 2019-05-27.
 * dev@itinordic.com
 * Copyright (c) 2019, ITINordic
 * All rights reserved.
 */
public class ProgramRuleVariables extends PagingBase {

    public final List<ProgramRuleVariable> programRuleVariables;

    public ProgramRuleVariables(Pager pager, List<ProgramRuleVariable> programRuleVariables) {
        super(pager);
        this.programRuleVariables = programRuleVariables;
    }
}
