package com.mohammad.kotlinlearning.metaprogramming

/**
 * Created by mohammadmoradyar on 8/18/17.
 */
fun <T> printList(items: List<T>) {
    if (items is List<*>)
        println("This is list")
}

fun <T> printList(items: T) {
    when (items) {
        Int -> println("Int")
        String -> println("String")
    }
}

inline fun <reified T> erased(input: Any) {
    if (input is T)
        println("YES")
}

inline fun <reified T> typeInfo(obj: Any) {
    println(obj)
}

fun main(args: Array<String>) {
    val lst1 = listOf("A", "B", "C")
    val lst2 = listOf(1, 2, 3)

    erased<List<String>>(lst1)
    typeInfo<List<String>>(lst2)
}