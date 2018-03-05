package com.gyro.tests

/* DO NOT EDIT | Generated by gyro */

import io.realm.RealmList
import io.realm.RealmObject
import io.realm.annotations.Required

open class Shop : RealmObject() {

    object Attributes {
        const val NAME: String = "name"
    }

    object Relationships {
        const val PRODUCTS: String = "products"
    }

    @Required
    var name: String = ""
    var products: RealmList<Product>? = null
}
