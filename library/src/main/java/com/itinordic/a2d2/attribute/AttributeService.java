package com.itinordic.a2d2.attribute;

import io.reactivex.Flowable;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by regnatpopulus on 2019-08-01.
 * dev@itinordic.com
 * Copyright (c) 2019, ITINordic
 * All rights reserved.
 */
public interface AttributeService {

    @GET("api/attributes")
    Flowable<Response<Attributes>> getAttributes(@Query("fields" ) String fields, @Query("paging" ) boolean paging);

    @GET("api/attributes/{id}")
    Flowable<Response<Attribute>> getAttribute(@Path("id") String attributeUid);

}
