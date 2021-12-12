package com.itinordic.a2d2.attribute;

import io.reactivex.rxjava3.core.Flowable;
import retrofit2.Response;

/**
 * Created by regnatpopulus on 2019-08-01.
 * dev@itinordic.com
 * Copyright (c) 2019, ITINordic
 * All rights reserved.
 */
public interface AttributeTask {

    Flowable<Response<Attributes>> getAttributes(String fields, boolean paging);

    Flowable<Response<Attribute>> getAttribute(String attributeUid);
}
