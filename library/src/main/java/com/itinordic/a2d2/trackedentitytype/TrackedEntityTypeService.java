package com.itinordic.a2d2.trackedentitytype;

import io.reactivex.Flowable;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by regnatpopulus on 30/09/2018.
 * dev@itinordic.com
 * Copyright (c) 2018, ITINordic
 * All rights reserved.
 */
public interface TrackedEntityTypeService {

    @GET("api/trackedEntityTypes/{id}")
    Flowable<Response<TrackedEntityType>> getTrackedEntityTypeById(@Path("id") String trackedEntityTypeUid);


    @GET("api/trackedEntityTypes")
    Flowable<Response<TrackedEntityTypeList>> getUserTrackedEntityTypes(@Query("fields" ) String fields);
}
