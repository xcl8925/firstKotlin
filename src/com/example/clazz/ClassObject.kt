package com.example.clazz

fun main() {
    println(ClassObject().name)
}

class ClassObject {
    var name = 10
        get() = field
        set(value) {
            field = value
        }
}