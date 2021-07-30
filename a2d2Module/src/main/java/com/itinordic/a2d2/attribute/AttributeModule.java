package com.itinordic.a2d2.attribute;

import com.itinordic.a2d2.scope.PerService;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * Created by regnatpopulus on 2019-08-01.
 * dev@itinordic.com
 * Copyright (c) 2019, ITINordic
 * All rights reserved.
 */

@Module
public class AttributeModule {
    @Provides
    @PerService
    AttributeService provideAttributeService(Retrofit retrofit){
        return retrofit.create(AttributeService.class);
    }
}
