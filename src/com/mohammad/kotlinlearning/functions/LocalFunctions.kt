package com.mohammad.kotlinlearning.functions

/**
 * Created by mohammadmoradyar on 7/2/17.
 */
fun foo(fooParameter: String) {

    val outerValue = "Outer"

    fun bar(barParameter: String) {
        println(fooParameter)
        println(barParameter)
        println(outerValue)
    }
}

fun main(args: Array<String>) {
    foo("Mohammad")
}