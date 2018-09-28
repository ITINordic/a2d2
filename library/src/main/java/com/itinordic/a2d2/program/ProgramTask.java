package com.itinordic.a2d2.program;

import java.util.List;

import io.reactivex.Flowable;
import retrofit2.Response;

/**
 * Created by regnatpopulus on 28/09/2018.
 * dev@itinordic.com
 * Copyright (c) 2018, ITINordic
 * All rights reserved.
 */
public interface ProgramTask {

    Flowable<Response<UserPrograms>> getUserPrograms(String fields);

}
