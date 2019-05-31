package com.example.kotlin.clazz

fun main() {
    var dataClass = DataClass("dataclass")
    println(dataClass)

    var newDataClass = dataClass.copy(name = "newDataclass")
    println(newDataClass)

    val (name1) = newDataClass

    println(name1)
}

data class DataClass(var name: String)