package com.mohammad.kotlinlearning.delegation

/**
 * Created by mohammadmoradyar on 8/11/17.
 */
fun localDelegatedProperties() {
    val lazy by lazy { lateInit() }
}

fun lateInit(): String {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}
