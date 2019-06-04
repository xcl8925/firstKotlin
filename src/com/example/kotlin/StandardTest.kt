package com.example.kotlin

fun main() {

    var user = User("xie", 30)

    val result = user.let {
        println(it.name)
        println(it.name)
        println(it.name)
    }
    println("-----")


    var userOut = with(user) {
        println("user: $name, $age")
        1000
    }
    println(userOut)
    println("-----")

    var userApply = user.apply {
        println("user: $name, $age")
        name = "xiechunlei"
    }
    println(userApply.name)
    println(user.name)
    println("-----")

    var userRun = user.run {
        println("user: $name, $age")
        1000
    }
    println(userRun)
    println("-----")

    var userAlso = user.also {
        println("user: ${it.name}, ${it.age}")
    }
    println(userAlso)
    println("-----")
}

class User(var name: String, var age: Int)