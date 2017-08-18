package com.mohammad.kotlinlearning.functions

/**
 * Created by mohammadmoradyar on 7/7/17.
 */
class Request(val method: String, val query: String, val contentType: String)

class Response(var contents: String, var status: Status) {
    fun status(status: Status.() -> Unit) {}
    operator fun invoke(status: Status.() -> Unit) {

    }
}

class Status(var code: Int, var description: String)

class RouteHandler(val request: Request, val response: Response)

fun routeHandler(path: String, router: RouteHandler.() -> Unit): RouteHandler.() -> Unit = router

fun main(args: Array<String>) {
    routeHandler("/user/api/register") {
        if (request.query != "") {
            // Process the query parameter
        } else {
            response {
                code = 404
                description = "Not found"
            }
        }
    }

    val manager = Manager()
    manager("Hello this is a invoke functionality")
}

class Manager {
    operator fun invoke(value: String) {
        println(value)
    }

}