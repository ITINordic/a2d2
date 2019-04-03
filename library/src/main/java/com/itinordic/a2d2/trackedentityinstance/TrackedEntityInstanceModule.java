package com.itinordic.a2d2.trackedentityinstance;

import com.itinordic.a2d2.scope.PerService;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

@Module
public class TrackedEntityInstanceModule {

    @Provides
    @PerService
    TrackedEntityInstanceService provideTrackedEntityInstanceService(Retrofit retrofit){
        return retrofit.create(TrackedEntityInstanceService.class);
    }

}
