package com.itinordic.a2d2.trackedentityinstanceattributevalue;

public class TrackedEntityInstanceAttributeValue {

    public final String lastUpdated;
    public final String storedBy;
    public final String displayName;
    public final String created;
    public final String valueType;
    public final String attribute;
    public final String value;

    public TrackedEntityInstanceAttributeValue(String lastUpdated,
                                               String storedBy,
                                               String displayName,
                                               String created,
                                               String valueType,
                                               String attribute,
                                               String value) {
        this.lastUpdated = lastUpdated;
        this.storedBy = storedBy;
        this.displayName = displayName;
        this.created = created;
        this.valueType = valueType;
        this.attribute = attribute;
        this.value = value;
    }
}
