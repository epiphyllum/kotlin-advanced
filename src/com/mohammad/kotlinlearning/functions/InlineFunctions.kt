package com.mohammad.kotlinlearning.functions

/**
 * Created by mohammadmoradyar on 7/2/17.
 */
inline fun operation(op: () -> Unit) {
    println("Before call op function")
    op()
    println("After call op function")
}

fun main(args: Array<String>) {
    operation { println("This is op function") }
}