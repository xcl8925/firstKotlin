package com.example.kotlin.casting

fun main() {
    var car: Car? = null
    if (car is Car) {
        println("car is Car")
    } else {
        println("car is not Car or null")
    }

    var cars = listOf(1, 3, 4, 5)
    cars.stream().filter { it > 3 }.forEach { println(it) }

    cars.sortedWith(Comparator { o1, o2 ->
        when {
            o1 > o2 -> return@Comparator -1
            o1 < o2 -> return@Comparator 1
            else -> return@Comparator 0
        }
    }).forEach { println(it) }

    val (key, value, middle) = "name=xie=chun".split("=")
    println("$key, $value, $middle")
}


class Car