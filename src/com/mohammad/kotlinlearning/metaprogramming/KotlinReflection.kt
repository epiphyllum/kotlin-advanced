package com.mohammad.kotlinlearning.metaprogramming

import kotlin.reflect.KClass
import kotlin.reflect.full.memberProperties

/**
 * Created by mohammadmoradyar on 8/17/17.
 */

fun getKotlinType(obj: KClass<*>) {
    println(obj.qualifiedName)
}

fun main(args: Array<String>) {
//    val classInfo = Transaction::class
//
//    classInfo.memberProperties.forEach {
//        println("Property ${it.name} of type ${it.returnType}")
//    }
//
//    classInfo.constructors.forEach {
//        println("Constructor ${it.name} with parameters : ${it.parameters}")
//    }
//
//    getKotlinType(Transaction::class)
    val constructor = ::Transaction
    println(constructor.name)
//    val transaction = constructor.call(0, 200.0, "Some decription")
    val transaction = constructor.callBy(mapOf(constructor.parameters[0] to 0, constructor.parameters[1] to 200.0))

    val idParam = constructor.parameters.first { it.name == "id" }
    val amountParam = constructor.parameters.first { it.name == "amount" }

    val transaction2 = constructor.callBy(mapOf(idParam to 0, amountParam to 200.0))

    println(transaction.description)
    println(transaction2.description)

    val trans = Transaction(22, 230000.0, "new Value")
    val descProperty = Transaction::class.memberProperties.find { it.name == "description" }
    val value = descProperty?.get(trans)
    println(value)
}