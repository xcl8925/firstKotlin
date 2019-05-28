package com.example

fun main() {
    var dataClass = DataClass("dataclass")
    println(dataClass)

    var newDataClass = dataClass.copy(name = "newDataclass")
    println(newDataClass)

    val (name) = newDataClass

    println(name)
}

data class DataClass(var name: kotlin.String) {

}