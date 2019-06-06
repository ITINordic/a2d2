package com.itinordic.a2d2.programstagesection;

import io.reactivex.Flowable;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by regnatpopulus on 2019-06-06.
 * dev@itinordic.com
 * Copyright (c) 2019, ITINordic
 * All rights reserved.
 */
public interface ProgramStageSectionService {

    @GET("api/programStageSections/{id}")
    Flowable<Response<ProgramStageSection>> getProgramStageSection(@Path("id") String programStageSectionId);

    @GET("api/programStageSections")
    Flowable<Response<ProgramStageSectionList>> getProgramStageSectionList(@Query("fields" ) String fields, @Query("paging" ) boolean paging);

}
