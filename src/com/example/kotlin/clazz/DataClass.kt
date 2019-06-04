package com.example.kotlin.clazz

fun main() {
    var dataClass = DataClass("dataclass")
    println(dataClass)

    var newDataClass = dataClass.copy(name = "newDataclass")
    println(newDataClass)

    val (name1) = newDataClass

    println(name1)

    println(newDataClass[101])
}

data class DataClass(var name: String) {
    var list = listOf(1, 2, 3, 54, 56)
    operator fun get(position: Int) = list[4]
}