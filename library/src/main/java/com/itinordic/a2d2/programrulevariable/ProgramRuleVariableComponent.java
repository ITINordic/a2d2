package com.itinordic.a2d2.programrulevariable;

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
        ProgramRuleVariableModule.class)
public interface ProgramRuleVariableComponent {


    // injection targets
    void inject(ProgramRuleVariableTaskImpl programRuleVariableTask);

    //specifies an interface to supply necessary modules to construct the subcomponent
    @Subcomponent.Builder
    interface Builder {
        Builder requestModule(ProgramRuleVariableModule module);
        ProgramRuleVariableComponent build();
    }

}
