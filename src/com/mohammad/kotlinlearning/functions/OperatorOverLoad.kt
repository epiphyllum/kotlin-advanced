package com.mohammad.kotlinlearning.functions

/**
 * Created by mohammadmoradyar on 7/7/17.
 */
data class Time(val hours: Int, val mins: Int) {
    operator fun plus(time: Time): Time {
        val minutes = this.mins + time.mins
        val hoursInMinutes = minutes / 60
        val remainingMinutes = minutes % 60
        val hours = this.hours + time.hours + hoursInMinutes
        return Time(hours, remainingMinutes)
    }
}

fun main(args: Array<String>) {
    val newTime = Time(2, 30) + Time(3, 50)
    println(newTime.toString())
}