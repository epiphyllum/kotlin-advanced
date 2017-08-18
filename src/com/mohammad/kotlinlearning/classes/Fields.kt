package com.mohammad.kotlinlearning.classes

/**
 * Created by mohammadmoradyar on 7/28/17.
 */
class Customer {
    var lastAmount: Double = 0.0
        get() = field
        set(value) {
            if (value > 100.0) {
                field = value
            }
        }
}

fun main(args: Array<String>) {
    val customer = Customer()
    println(customer.lastAmount)
    customer.lastAmount = 200.0
    println(customer.lastAmount)
    customer.lastAmount = 100.0
    println(customer.lastAmount)
    customer.lastAmount = 50.0
    println(customer.lastAmount)
}