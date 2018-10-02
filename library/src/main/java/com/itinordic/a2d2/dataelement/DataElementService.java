package com.itinordic.a2d2.dataelement;

import io.reactivex.Flowable;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface DataElementService {

    @GET("api/dataElements")
    Flowable<Response<DataElement>> getDataElement(@Query("fields") String fields);
}
