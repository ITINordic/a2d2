package com.itinordic.a2d2.program;

import com.itinordic.a2d2.scope.PerService;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * Created by regnatpopulus on 28/09/2018.
 * dev@itinordic.com
 * Copyright (c) 2018, ITINordic
 * All rights reserved.
 */

@Module
public class ProgramModule {

    @Provides
    @PerService
    ProgramService provideProgramService(Retrofit retrofit){
        return retrofit.create(ProgramService.class);
    }
}
