package com.itinordic.a2d2.trackedentityinstance;

import com.itinordic.a2d2.scope.PerService;

import dagger.Subcomponent;

@PerService
@Subcomponent(modules =
        TrackedEntityInstanceModule.class)
public interface TrackedEntityInstanceComponent {

    // injection targets
    void inject(TrackedEntityInstanceTaskImpl trackedEntityInstanceTask);

    //specifies an interface to supply necessary modules to construct the subcomponent
    @Subcomponent.Builder
    interface Builder {
        Builder requestModule(TrackedEntityInstanceModule module);
        TrackedEntityInstanceComponent build();
    }

}
