package com.itinordic.a2d2.trackedentityattribute;

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
        TrackedEntityAttributeModule.class)
public interface TrackedEntityAttributeComponent {

    // injection targets
    void inject(TrackedEntityAttributeTaskImpl trackedEntityAttributeTask);

    //specifies an interface to supply necessary modules to construct the subcomponent
    @Subcomponent.Builder
    interface Builder {
        Builder requestModule(TrackedEntityAttributeModule module);
        TrackedEntityAttributeComponent build();
    }
}
