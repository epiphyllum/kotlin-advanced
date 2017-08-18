package com.mohammad.kotlinlearning.delegation

/**
 * Created by mohammadmoradyar on 8/11/17.
 */
val String.hasAmpersand: Boolean
    get() = this.contains("&")

fun main(args: Array<String>) {
    println("Hello".hasAmpersand)
}