package com.example

fun main() {

    var temp: A = object : A(1), B {
        override fun test() {
            println("test in object declarations")
        }

        override val key: Int
            get() = 15
    }

    println(temp.key)
}

open class A(x: Int) {
    open val key = x
}

interface B {
    fun test()
}

