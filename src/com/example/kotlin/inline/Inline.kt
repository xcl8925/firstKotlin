package com.example.kotlin.inline

fun main() {
    go go@{
        if (it == 1)
            return@go
        else
            println(it)
    }

    println("-----\n")

    var list = listOf(1, 2, 3)
    list.forEach {
        if (it == 2) {
            return@forEach
        } else {
            println(it)
        }
    }

    println("end")
}

fun cal(a: Int, b: Int): Int {
    return a + b
}

inline fun go(a: Int, b: Int, cal: (a: Int, b: Int) -> Int) {
    var c = cal(a, b)
    print(c)
}

inline fun go(f: (a: Int) -> Unit) {
    var i = 0
    while (i <= 3) {
        f(i)
        i++
    }
}