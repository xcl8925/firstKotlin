package com.example

fun main() {

    test(Number("12"))

    test(Anything)
}

fun test(sealedClass: SealedClass) = when (sealedClass) {
    is Number -> println("is number")
    is String -> println("is string")
    Anything -> println("anything")
}

sealed class SealedClass

data class Number(val value: kotlin.String) : SealedClass()

data class String(val sealedClass: SealedClass) : SealedClass()

object Anything : SealedClass()