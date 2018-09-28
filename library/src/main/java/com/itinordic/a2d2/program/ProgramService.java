package com.itinordic.a2d2.program;

import java.util.List;

import io.reactivex.Flowable;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by regnatpopulus on 27/09/2018.
 * dev@itinordic.com
 * Copyright (c) 2018, ITINordic
 * All rights reserved.
 */

public interface ProgramService {

    @GET("api/programs")
    Flowable<Response<UserPrograms>> getUserPrograms(@Query("fields" ) String fields);

}
