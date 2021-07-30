package com.itinordic.a2d2.attribute;

import com.itinordic.a2d2.scope.PerService;

import dagger.Subcomponent;

/**
 * Created by regnatpopulus on 2019-08-01.
 * dev@itinordic.com
 * Copyright (c) 2019, ITINordic
 * All rights reserved.
 */

@PerService
@Subcomponent(modules =
        AttributeModule.class)
public interface AttributeComponent {

    // injection targets
    void inject(AttributeTaskImpl attributeTaskImpl);

    //specifies an interface to supply necessary modules to construct the subcomponent
    @Subcomponent.Builder
    interface Builder {
        Builder requestModule(AttributeModule module);
        AttributeComponent build();
    }
}
