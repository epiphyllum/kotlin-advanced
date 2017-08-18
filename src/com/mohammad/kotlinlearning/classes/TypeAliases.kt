package com.mohammad.kotlinlearning.classes

import kotlin.properties.Delegates

/**
 * Created by mohammadmoradyar on 8/11/17.
 */

typealias Name = String
typealias Email = String

data class Employee(val name: Name, val email: Email) {

    var department: String by Delegates.observable("", { property, oldValue, newValue ->
        println("Property (${property.name}) has changed from $oldValue to $newValue")
    })

    fun printName(string: Name) {
        println(string)
    }
}

fun main(args: Array<String>) {
    val employee = Employee("Mohammad", "mohammad@gmail.com")
    employee.printName("String to print")
    employee.department = "ELECTRONIC"
    employee.department = "IT"
}