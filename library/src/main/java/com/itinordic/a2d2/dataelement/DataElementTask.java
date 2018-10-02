package com.itinordic.a2d2.dataelement;

import io.reactivex.Flowable;
import retrofit2.Response;

public interface DataElementTask {
    Flowable<Response<DataElement>> getDataElement(String fields);
}
