package com.itinordic.a2d2.optionset;

import java.util.List;

/**
 * Created by regnatpopulus on 04/11/2018.
 * dev@itinordic.com
 * Copyright (c) 2018, ITINordic
 * All rights reserved.
 */
public class OptionSetList {
    public final List<OptionSet> optionSets;


    public OptionSetList(List<OptionSet> optionSets) {
        this.optionSets = optionSets;
    }

    public List<OptionSet> getOptionSets() {
        return optionSets;
    }
}
