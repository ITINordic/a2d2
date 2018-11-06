package com.itinordic.a2d2.option;

import io.reactivex.Flowable;
import retrofit2.Response;

/**
 * Created by regnatpopulus on 04/11/2018.
 * dev@itinordic.com
 * Copyright (c) 2018, ITINordic
 * All rights reserved.
 */
public interface OptionTask {

    Flowable<Response<Option>> getOptionById(String optionSetId);

    Flowable<Response<OptionList>> getOptions(String fields, boolean paging);

}
