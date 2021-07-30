package com.itinordic.a2d2.dataelement;

import com.itinordic.a2d2.paging.Pager;
import com.itinordic.a2d2.paging.PagingBase;

import java.util.List;

/**
 * Created by regnatpopulus on 2019-05-27.
 * dev@itinordic.com
 * Copyright (c) 2019, ITINordic
 * All rights reserved.
 */
public class DataElements extends PagingBase {

    public final List<DataElement> dataElements;

    public DataElements(Pager pager, List<DataElement> dataElements) {
        super(pager);
        this.dataElements = dataElements;
    }
}
