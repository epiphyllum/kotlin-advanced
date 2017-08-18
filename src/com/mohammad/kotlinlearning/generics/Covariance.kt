package com.mohammad.kotlinlearning.generics

import com.mohammad.kotlinlearning.classes.Customer

/**
 * Created by mohammadmoradyar on 8/17/17.
 */
open class Person

class Employee : Person()

fun operate(person: List<Person>) {

}

interface ReadOnlyRepo<out T> {
    fun getId(id: Int): T
    fun getAll(): List<T>
}

interface WriteRepo<in T> {
    fun save(obj: T)
    fun saveAll(objs: List<T>)
}

fun main(args: Array<String>) {
    val instance = ReadOnlyRepoImpl<Customer>()
    instance.getAll()
}