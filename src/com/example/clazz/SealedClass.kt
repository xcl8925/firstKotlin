package com.example.clazz

fun main() {

    test(Number("12"))

    test(Anything)
}

fun test(sealedClass: SealedClass) = when (sealedClass) {
    is Number -> println("is number")
    is TestString -> println("is string")
    Anything -> println("anything")
}

sealed class SealedClass

data class Number(val value: kotlin.String) : SealedClass()

data class TestString(val sealedClass: SealedClass) : SealedClass()

object Anything : SealedClass()