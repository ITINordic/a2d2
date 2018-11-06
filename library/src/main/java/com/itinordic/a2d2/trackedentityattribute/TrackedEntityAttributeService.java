package com.itinordic.a2d2.trackedentityattribute;

import io.reactivex.Flowable;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by regnatpopulus on 04/11/2018.
 * dev@itinordic.com
 * Copyright (c) 2018, ITINordic
 * All rights reserved.
 */
public interface TrackedEntityAttributeService {

    @GET("api/trackedEntityAttributes/{id}")
    Flowable<Response<TrackedEntityAttribute>> getTrackedEntityAttributesById(@Path("id") String trackedEntityAttributesUid);

    @GET("api/trackedEntityAttributes")
    Flowable<Response<TrackedEntityAttributeList>> getTrackedEntityAttributes(@Query("fields" ) String fields);
}
