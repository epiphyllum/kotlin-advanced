package com.mohammad.kotlinlearning.delegation

import com.mohammad.kotlinlearning.classes.Customer

/**
 * Created by mohammadmoradyar on 8/11/17.
 */
interface Repository {
    fun getById(id: Int): Customer
    fun getAll(): MutableList<Customer>
}

interface Logger {
    fun logAll()
}

class Controller(repository: Repository, logger: Logger) : Repository by repository, Logger by logger {
    fun index() {

    }
}

fun main(args: Array<String>) {

}