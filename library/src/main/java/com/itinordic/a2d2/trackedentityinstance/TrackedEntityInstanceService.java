package com.itinordic.a2d2.trackedentityinstance;

import io.reactivex.Flowable;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface TrackedEntityInstanceService {

    @GET("api/trackedEntityInstances")
    Flowable<Response<TrackedEntityInstanceList>> getUserTrackedEntityInstances(@Query("fields" ) String fields, @Query("ou" ) String ou);

}
