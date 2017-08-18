package com.mohammad.kotlinlearning.classes

/**
 * Created by mohammadmoradyar on 7/28/17.
 */
class Log private constructor() {

    companion object Factory {
        @JvmStatic fun createFileLog(fileName: String): Log = Log(fileName)
    }

    constructor(fileName: String) : this()

}

fun main(args: Array<String>) {
    val fileLog = Log.createFileLog("file.txt")
}