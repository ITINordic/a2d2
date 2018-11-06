package com.itinordic.a2d2.option;

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
public interface OptionService {

    @GET("api/options/{id}")
    Flowable<Response<Option>> getOptionById(@Path("id") String optionUid);

    @GET("api/options")
    Flowable<Response<OptionList>> getOptions(@Query("fields" ) String fields);
}
