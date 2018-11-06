package com.itinordic.a2d2.trackedentitytype;

import io.reactivex.Flowable;
import retrofit2.Response;

/**
 * Created by regnatpopulus on 30/09/2018.
 * dev@itinordic.com
 * Copyright (c) 2018, ITINordic
 * All rights reserved.
 */
public interface TrackedEntityTypeTask {

    Flowable<Response<TrackedEntityType>> getTrackedEntityType(String trackedEntityTypeId);

    Flowable<Response<TrackedEntityTypeList>> getUserTrackedEntityTypes(String fields);

}
