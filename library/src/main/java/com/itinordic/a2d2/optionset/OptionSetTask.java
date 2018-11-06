package com.itinordic.a2d2.optionset;

import java.util.List;

import io.reactivex.Flowable;
import retrofit2.Response;

/**
 * Created by regnatpopulus on 04/11/2018.
 * dev@itinordic.com
 * Copyright (c) 2018, ITINordic
 * All rights reserved.
 */
public interface OptionSetTask {


    Flowable<Response<OptionSet>> getOptionSetById(String optionSetId);

    Flowable<Response<OptionSetList>> getOptionSets(String fields, boolean paging);

}
