package com.itinordic.a2d2.programstagesection;

import com.itinordic.a2d2.scope.PerService;

import dagger.Subcomponent;

/**
 * Created by regnatpopulus on 2019-06-06.
 * dev@itinordic.com
 * Copyright (c) 2019, ITINordic
 * All rights reserved.
 */

@PerService
@Subcomponent(modules =
        ProgramStageSectionModule.class)
public interface ProgramStageSectionComponent {

    // injection targets
    void inject(ProgramStageSectionTaskImpl programStageSectionTask);

    //specifies an interface to supply necessary modules to construct the subcomponent
    @Subcomponent.Builder
    interface Builder {
        Builder requestModule(ProgramStageSectionModule module);
        ProgramStageSectionComponent build();
    }
}
