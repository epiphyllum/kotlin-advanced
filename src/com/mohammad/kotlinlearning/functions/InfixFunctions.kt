package com.mohammad.kotlinlearning.functions

/**
 * Created by mohammadmoradyar on 7/2/17.
 */
infix fun String.shouldBeEqualTo(value: String) = this == value

fun main(args: Array<String>) {
    println("Hello".shouldBeEqualTo("Hello"))
    println("Hello" shouldBeEqualTo "Hello")
}