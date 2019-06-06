package com.itinordic.a2d2.programstagesection;

import com.itinordic.a2d2.scope.PerService;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * Created by regnatpopulus on 2019-06-06.
 * dev@itinordic.com
 * Copyright (c) 2019, ITINordic
 * All rights reserved.
 */
@Module
public class ProgramStageSectionModule {

    @Provides
    @PerService
    ProgramStageSectionService provideProgramStageSectionService(Retrofit retrofit){
        return retrofit.create(ProgramStageSectionService.class);
    }
}
