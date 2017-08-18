package com.mohammad.kotlinlearning.delegation

import kotlin.properties.Delegates

/**
 * Created by mohammadmoradyar on 8/11/17.
 */
class Veto {
    var value: String by Delegates.vetoable("String", { property, old, new ->
        new.startsWith("S")
    })
}

fun main(args: Array<String>) {
    val veto = Veto()
    println(veto.value)
    veto.value = "London"
    println(veto.value)
    veto.value = "Spain"
    println(veto.value)
}