package com.itinordic.a2d2.dataelement;

import com.itinordic.a2d2.scope.PerService;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

@Module
public class DataElementModule {

    @Provides
    @PerService
    DataElementService provideProgramService(Retrofit retrofit) {
        return retrofit.create(DataElementService.class);
    }
}
