package com.mohammad.kotlinlearning.functions

/**
 * Created by mohammadmoradyar on 7/3/17.
 */
fun containingFunctionWithLamdaWithLabel() {
    val numbers = 1..100
    numbers.forEach myLabel@ {
        if (it % 5 == 0) {
            println(it)
            return@myLabel
        }
    }
    println("Hello")
}

fun containingFunctionWithLamda() {
    val numbers = 1..100
    numbers.forEach {
        if (it % 5 == 0) {
            println(it)
            return
        }
    }
    println("Hello")
}

fun containingFunctionWithAnonymousFunction() {
    val numbers = 1..100
    numbers.forEach(fun(element) {
        if (element % 5 == 0)
            return
    })
    println("Hello")
}

fun main(args: Array<String>) {
    containingFunctionWithLamdaWithLabel()
    containingFunctionWithLamda()
    containingFunctionWithAnonymousFunction()
}