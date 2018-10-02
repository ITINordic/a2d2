package com.itinordic.a2d2.dataelement;

import com.itinordic.a2d2.a2d2Component;

import javax.inject.Inject;

import androidx.annotation.NonNull;
import io.reactivex.Flowable;
import retrofit2.Response;

public class DataElementTaskImpl implements DataElementTask {

    @Inject
    DataElementService dataElementService;

    public DataElementTaskImpl(a2d2Component a2d2component){
        a2d2component.dataElementComponent().build().inject(this);
    }

    public Flowable<Response<DataElement>> getDataElement(String fields){
        return dataElementService.getDataElement(fields);
    }

    //builder that returns a new ProgramTask instance when it is passed a URL
    public static class Builder {
        private a2d2Component component;

        public Builder() {
            // empty constructor
        }

        @NonNull
        public Builder a2d2Component(@NonNull a2d2Component component) {
            this.component = component;
            return this;
        }

        public DataElementTaskImpl build() {

            if (component == null) {
                throw new IllegalStateException("a2d2 component is null");
            }

            return new DataElementTaskImpl(component);
        }

    }
}
