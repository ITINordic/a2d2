package com.itinordic.a2d2.programruleaction;

import com.itinordic.a2d2.scope.PerService;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * Created by regnatpopulus on 2019-05-27.
 * dev@itinordic.com
 * Copyright (c) 2019, ITINordic
 * All rights reserved.
 */
@Module
public class ProgramRuleActionModule {

    @Provides
    @PerService
    ProgramRuleActionService provideProgramRuleActionService(Retrofit retrofit){
        return retrofit.create(ProgramRuleActionService.class);
    }
}
