package com.itinordic.a2d2.programstagesection;

import io.reactivex.Flowable;
import retrofit2.Response;

/**
 * Created by regnatpopulus on 2019-06-06.
 * dev@itinordic.com
 * Copyright (c) 2019, ITINordic
 */
public interface ProgramStageSectionTask {

    Flowable<Response<ProgramStageSection>> getProgramStageSection(String programStageSectionId);

    Flowable<Response<ProgramStageSectionList>> getProgramStageSectionList(String fields, boolean paging);

}
