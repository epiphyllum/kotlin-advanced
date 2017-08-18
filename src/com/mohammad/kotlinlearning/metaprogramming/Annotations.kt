package com.mohammad.kotlinlearning.metaprogramming

/**
 * Created by mohammadmoradyar on 8/18/17.
 */
@Target(AnnotationTarget.CLASS)
annotation class Table(val name: String)

@Target(AnnotationTarget.PROPERTY)
annotation class Field(val name: String)

@Table(name = "ContactTable")
data class Contact(@Field(name = "ID") val id: Int, @Field("NAME") val name: String, @Field("email") val email: String)

fun main(args: Array<String>) {
    val annotation = Contact::class.annotations.find { it.annotationClass.simpleName == "Table" }
    println(annotation)
}