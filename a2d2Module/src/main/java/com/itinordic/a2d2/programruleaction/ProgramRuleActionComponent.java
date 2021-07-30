package com.itinordic.a2d2.programruleaction;

import com.itinordic.a2d2.scope.PerService;

import dagger.Subcomponent;

/**
 * Created by regnatpopulus on 2019-05-27.
 * dev@itinordic.com
 * Copyright (c) 2019, ITINordic
 * All rights reserved.
 */


@PerService
@Subcomponent(modules =
        ProgramRuleActionModule.class)
public interface ProgramRuleActionComponent {

    // injection targets
    void inject(ProgramRuleActionTaskImpl programRuleActionTask);

    //specifies an interface to supply necessary modules to construct the subcomponent
    @Subcomponent.Builder
    interface Builder {
        Builder requestModule(ProgramRuleActionModule module);
        ProgramRuleActionComponent build();
    }
}
