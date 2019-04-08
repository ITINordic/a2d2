package com.itinordic.a2d2.trackedentityinstance;

import io.reactivex.Flowable;
import retrofit2.Response;

public interface TrackedEntityInstanceTask {

    Flowable<Response<TrackedEntityInstanceList>> getTrackedEntityInstances(String fields, String ou);

}
