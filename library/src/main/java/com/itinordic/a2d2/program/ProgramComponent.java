package com.itinordic.a2d2.program;

import com.itinordic.a2d2.scope.PerService;

import dagger.Subcomponent;

/**
 * Created by regnatpopulus on 28/09/2018.
 * dev@itinordic.com
 * Copyright (c) 2018, ITINordic
 * All rights reserved.
 */

@PerService
@Subcomponent(modules =
        ProgramModule.class)
public interface ProgramComponent {

    // injection targets
    void inject(ProgramTaskImpl programTask);

    //specifies an interface to supply necessary modules to construct the subcomponent
    @Subcomponent.Builder
    interface Builder {
        Builder requestModule(ProgramModule module);
        ProgramComponent build();
    }
}
