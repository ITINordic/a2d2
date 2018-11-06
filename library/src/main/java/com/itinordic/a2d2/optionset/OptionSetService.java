package com.itinordic.a2d2.optionset;

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
public interface OptionSetService {

    @GET("api/optionSets/{id}")
    Flowable<Response<OptionSet>> getOptionSetById(@Path("id") String optionSetUid);

    @GET("api/optionSets")
    Flowable<Response<OptionSetList>> getOptionSets(@Query("fields") String fields, @Query("paging" ) boolean paging);

}
