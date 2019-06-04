package com.example.kotlin.companion

fun main() {

    MyClass.get()
    println(MyClass.value)

    MyClass.name = 1000
    println(MyClass.name)
}

class MyClass {
    companion object {
        var name = 100
    }
}

fun MyClass.Companion.get() {
    println("companion expansion fun")
}

val MyClass.Companion.value: Int
    get() = 10
