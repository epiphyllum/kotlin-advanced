package com.mohammad.kotlinlearning.classes

/**
 * Created by mohammadmoradyar on 7/28/17.
 */

sealed class PageResult

class Success(val content: String) : PageResult()
class Error(val code: Int, val message: String) : PageResult()

fun getURLPage(url: String): PageResult {
    val wasValidCall = false
    if (wasValidCall) {
        return Success("The Content")
    } else {
        return Error(404, "Page not found")
    }
}

fun main(args: Array<String>) {
    val pageResult = getURLPage("/")
    when (pageResult) {
        is Success -> println(pageResult.content)
        is Error -> println(pageResult.message)
    }
}