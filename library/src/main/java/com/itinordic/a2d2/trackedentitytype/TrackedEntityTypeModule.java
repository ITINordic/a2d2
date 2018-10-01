package com.itinordic.a2d2.trackedentitytype;

import com.itinordic.a2d2.scope.PerService;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * Created by regnatpopulus on 30/09/2018.
 * dev@itinordic.com
 * Copyright (c) 2018, ITINordic
 * All rights reserved.
 */

@Module
public class TrackedEntityTypeModule {
    @Provides
    @PerService
    TrackedEntityTypeService provideTrackedEntityTypeService(Retrofit retrofit){
        return retrofit.create(TrackedEntityTypeService.class);
    }
}
