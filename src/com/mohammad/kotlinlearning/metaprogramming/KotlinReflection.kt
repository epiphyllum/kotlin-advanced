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
    val classInfo = Transaction::class

    classInfo.memberProperties.forEach {
        println("Property ${it.name} of type ${it.returnType}")
    }

    getKotlinType(Transaction::class)
}