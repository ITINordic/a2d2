package com.itinordic.a2d2.dataelement;


import com.itinordic.a2d2.scope.PerService;

import dagger.Subcomponent;

@PerService
@Subcomponent (modules =
        DataElementModule.class)
public interface DataElementComponent {

    // injection targets
    void inject(DataElementTaskImpl dataElementTask);

    //specifies an interface to supply necessary modules to construct the subcomponent
    @Subcomponent.Builder
    interface Builder {
        Builder requestModule(DataElementModule module);
        DataElementComponent build();
    }
}
