package com.itinordic.a2d2.optionset;

import com.itinordic.a2d2.scope.PerService;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * Created by regnatpopulus on 04/11/2018.
 * dev@itinordic.com
 * Copyright (c) 2018, ITINordic
 * All rights reserved.
 */

@Module
public class OptionSetModule {

    @Provides
    @PerService
    OptionSetService provideOptionSetService(Retrofit retrofit){
        return retrofit.create(OptionSetService.class);
    }
}
