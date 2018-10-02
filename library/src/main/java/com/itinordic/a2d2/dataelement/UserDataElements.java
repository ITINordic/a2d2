package com.itinordic.a2d2.dataelement;

import java.util.List;

public class UserDataElements {

    public final List<DataElement> dataElements;

    public UserDataElements(List<DataElement> dataElements) {
        this.dataElements = dataElements;
    }
    public List<DataElement> getDataElements() {
            return dataElements;
        }
}

