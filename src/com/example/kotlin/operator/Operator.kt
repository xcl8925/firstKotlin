package com.example.kotlin.operator

fun main() {
    val list = listOf(1, 2, 3, 4)
    val finalList = list.flatMap { listOf(it, it + 1) }
    for (item in finalList) {
        println(item)
    }

    var map = list.groupBy {
        if (it % 2 == 0)
            "even"
        else
            "odd"

    }

    for ((key, value) in map) {
        println("$key:")
        for (item in value) {
            print("$item,")
        }
        println()
    }

    list.mapIndexed { index, i ->
        i * index
    }

    var temp = list.mapNotNull {
        it * 2
    }

    temp.map {
        println(it)
    }

    println(temp.firstOrNull { it > 10 })

    val result = list + temp
    result.map {
        println(it)
    }

    var pairList = list.zip(temp)
    pairList.map {
        println(it.toString())
    }

    pairList.unzip().first.map { println(it) }
}

