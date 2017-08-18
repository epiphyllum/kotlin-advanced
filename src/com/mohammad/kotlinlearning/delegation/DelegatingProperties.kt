package com.mohammad.kotlinlearning.delegation

import kotlin.reflect.KProperty

/**
 * Created by mohammadmoradyar on 8/11/17.
 */
class Service {
    var someProperty: String by ExternalFunctionality()
}

class ExternalFunctionality {

    var backingField = "Default"

    operator fun getValue(service: Service, property: KProperty<*>): String {
        println("Service : $service" +
                "property : ${property.name}" +
                "value : $property"
        )
        return backingField
    }

    operator fun setValue(service: Service, property: KProperty<*>, value: String) {
        backingField = value
    }

}

fun main(args: Array<String>) {
    val service = Service()
    println(service.someProperty)
    service.someProperty = "Some value"
    println(service.someProperty)
}
