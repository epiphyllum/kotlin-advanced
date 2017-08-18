package com.mohammad.kotlinlearning.generics

import java.io.Serializable

/**
 * Created by mohammadmoradyar on 8/11/17.
 */
open class Entity(val id: Int)

class Repository<T> where T : Entity, T : Serializable {
    fun save(entity: T) {
        if (entity.id != 0) {
            // TODO
        }
    }
}

fun <T : Serializable> streamObject(obj: T) {

}

fun main(args: Array<String>) {
    Repository<CustomerEntity>().save(CustomerEntity(22))
}

class CustomerEntity(id: Int) : Entity(id), Serializable
