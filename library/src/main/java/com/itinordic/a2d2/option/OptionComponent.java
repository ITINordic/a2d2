package com.itinordic.a2d2.option;

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
        OptionModule.class)
public interface OptionComponent {

    // injection targets
    void inject(OptionTaskImpl optionTask);

    //specifies an interface to supply necessary modules to construct the subcomponent
    @Subcomponent.Builder
    interface Builder {
        Builder requestModule(OptionModule module);
        OptionComponent build();
    }
}
