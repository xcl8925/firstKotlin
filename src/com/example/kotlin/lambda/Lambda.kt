package com.example.kotlin.lambda

fun main() {
    var sum = { x: Int, y: Int -> x + y }
    println(sum(1, 2))

    var out: (Int) -> Int = out@{
        println("$it")
        println("$it")
        100
    }
    println(out(12))
    println("------")

    shop(1, 11000, sum)

    shop(100, 21000) { x: Int, y: Int -> x + y - y }
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun shop(a: Int, b: Int, sum: (Int, Int) -> Int) {
    println(sum(a, b))
}