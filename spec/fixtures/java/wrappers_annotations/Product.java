package com.gyro.tests;

/* DO NOT EDIT | Generated by gyro */

import io.realm.RealmObject;
import io.realm.annotations.Required;

public class Product extends RealmObject {

    public static final class Attributes {
        public static final String BRAND = "brand";
        public static final String NAME = "name";
        public static final String PRICE = "price";

        private Attributes() {
            // Hide constructor
        }
    }

    private String brand;
    @Required
    private String name;
    private Integer price = 0;

    @android.support.annotation.Nullable
    public String getBrand() {
        return brand;
    }

    public void setBrand(@android.support.annotation.Nullable final String brand) {
        this.brand = brand;
    }

    @android.support.annotation.NonNull
    public String getName() {
        return name;
    }

    public void setName(@android.support.annotation.NonNull final String name) {
        this.name = name;
    }

    @android.support.annotation.Nullable
    public Integer getPrice() {
        return price;
    }

    public void setPrice(@android.support.annotation.Nullable final Integer price) {
        this.price = price;
    }
}
