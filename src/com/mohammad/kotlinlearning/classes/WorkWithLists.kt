package com.mohammad.kotlinlearning.classes

/**
 * Created by mohammadmoradyar on 8/8/17.
 */
class WorkWithLists {

    fun test() {
        var map = mutableListOf(Pair(TestEnum.C, mutableListOf(1, 2, 3)), Pair(TestEnum.B, mutableListOf(1, 2, 3)), Pair(TestEnum.A, mutableListOf(1, 2, 3)))
        map.sortBy { it.first.ordinal }
        println(map)
    }

    enum class TestEnum(value: Int, desc: String) {
        A(0, "A"),
        B(1, "B"),
        C(2, "C")
    }

}

fun main(args: Array<String>) {
    WorkWithLists().test()
}