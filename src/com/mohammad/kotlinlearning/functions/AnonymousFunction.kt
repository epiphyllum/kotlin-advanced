package com.mohammad.kotlinlearning.functions

/**
 * Created by mohammadmoradyar on 7/2/17.
 */
fun higherOrderFunction(x: Int, op: (Int) -> Int): Int {
    return op(x)
}

fun main(args: Array<String>) {

    println(higherOrderFunction(15) {
        x ->
        if (x > 10)
            x
        else
            x * x
    })

    println(higherOrderFunction(15,
            fun(x): Int {
                if (x > 10)
                    return 0
                else
                    return x * x
            }))

}