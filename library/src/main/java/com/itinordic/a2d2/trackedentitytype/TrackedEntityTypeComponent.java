package com.itinordic.a2d2.trackedentitytype;

import com.itinordic.a2d2.scope.PerService;

import dagger.Subcomponent;

/**
 * Created by regnatpopulus on 30/09/2018.
 * dev@itinordic.com
 * Copyright (c) 2018, ITINordic
 * All rights reserved.
 */

@PerService
@Subcomponent(modules =
        TrackedEntityTypeModule.class)
public interface TrackedEntityTypeComponent {

    // injection targets
    void inject(TrackedEntityTypeTaskImpl trackedEntityTypeTask);

    //specifies an interface to supply necessary modules to construct the subcomponent
    @Subcomponent.Builder
    interface Builder {
        Builder requestModule(TrackedEntityTypeModule module);
        TrackedEntityTypeComponent build();
    }

}
