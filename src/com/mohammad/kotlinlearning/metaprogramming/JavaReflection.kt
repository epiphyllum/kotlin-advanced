package com.mohammad.kotlinlearning.metaprogramming

import java.lang.reflect.Type

/**
 * Created by mohammadmoradyar on 8/17/17.
 */
class Transaction(val id: Int, val amount: Double, var description: String = "Default") {
    fun validate() {
        if (amount > 10000) {
            println("Amount is too large")
        }
    }
}

fun introspectInstance(obj: Any) {
    println("Class : ${obj.javaClass}")
    println("Properties\n")
    obj.javaClass.declaredFields.forEach {
        println("${it.name} of type ${it.type}")
    }
    println("Functions\n")
    obj.javaClass.declaredMethods.forEach {
        println("${it.name}")
    }
}

fun getType(obj: Type) {
    println(obj.typeName)
}

fun main(args: Array<String>) {
    getType(Transaction::class.java)
//    introspectInstance(Transaction(0, 200.0, "Transaction A"))
}