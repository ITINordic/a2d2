package com.itinordic.a2d2.optionset;

import com.itinordic.a2d2.scope.PerService;

import dagger.Subcomponent;

/**
 * Created by regnatpopulus on 04/11/2018.
 * dev@itinordic.com
 * Copyright (c) 2018, ITINordic
 * All rights reserved.
 */

@PerService
@Subcomponent(modules =
        OptionSetModule.class)
public interface OptionSetComponent {

    // injection targets
    void inject(OptionSetTaskImpl optionSetTask);

    //specifies an interface to supply necessary modules to construct the subcomponent
    @Subcomponent.Builder
    interface Builder {
        Builder requestModule(OptionSetModule module);
        OptionSetComponent build();
    }
}
