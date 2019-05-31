package com.example.kotlin.enum

fun main() {
    println(TestEnum.RED.signal())
    println(TestEnum.RED.tag)
    println(TestEnum.RED.ordinal)
    println(TestEnum.valueOf("RED"))
    println(TestEnum.values())
    for (item in TestEnum.values()) {
        println("name:${item.name}")
    }

    printAllValues<TestEnum>()

    printValue<TestEnum>("GREEN")
}

inline fun <reified T : Enum<T>> printAllValues() {
    println(enumValues<T>().joinToString { it.name })
}

inline fun <reified T : Enum<T>> printValue(value: String) {
    println(enumValueOf<T>(value))
}

enum class TestEnum(value: Int) {
    RED(12) {
        override fun signal(): TestEnum {
            return GREEN
        }
    },
    GREEN(14) {
        override fun signal(): TestEnum? {
            return RED
        }
    };

    var tag = value

    open fun signal(): TestEnum? {
        return null
    }
}