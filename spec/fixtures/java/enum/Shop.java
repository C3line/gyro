package com.gyro.tests;

import io.realm.RealmObject;
import io.realm.annotations.Ignore;

/* DO NOT EDIT | Generated by gyro */

public class Shop extends RealmObject {

    public static class Attributes {
        private Attributes() {
            // Hide constructor
        }
        
        public static final String NAME = "name";
        public static final String OPTIONAL_VALUE = "optionalValue";
        public static final String TYPE = "type";
    }

    private String name;
    @Ignore
    private OptValue optionalValueEnum;
    private String optionalValue;
    @Ignore
    private Type typeEnum;
    private String type;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getOptionalValue() {
        return optionalValue;
    }

    public void setOptionalValue(final String optionalValue) {
        this.optionalValue = optionalValue;
    }

    public OptValue getOptionalValueEnum() {
        return OptValue.get(getOptionalValue());
    }

    public void setOptionalValueEnum(final OptValue optionalValue) {
        this.optionalValue = optionalValue.getJsonValue();
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public Type getTypeEnum() {
        return Type.get(getType());
    }

    public void setTypeEnum(final Type type) {
        this.type = type.getJsonValue();
    }
}
