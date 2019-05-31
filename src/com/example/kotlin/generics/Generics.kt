package com.example.kotlin.generics

import kotlin.String

fun main() {
    var generics = Generics(1)
    println(generics.value)

    var box = box(111)
    println(box.value)

    var strCo: Out<String> = Out("a")
    var anyCo: Out<Any> = Out<Any>("b")
    anyCo = strCo
    println(anyCo.foo())   // 输出 a

    var in1 = In(10)
    var in2 = In<Any>(100)
    in1 = in2
    in2.foo(100)

    val list: ArrayList<*> = arrayListOf(
        1, "test",
        Generics(12),
        Data("12121")
    )
    for (item in list) {
        println(item)
    }
}

data class Data(var name: String)

class Generics<T>(t: T) {
    var value = t
}

fun <T> box(t: T)
        where T : Int = Generics(t)

// 定义一个支持协变的类
class Out<out A>(val a: A) {
    fun foo(): A {
        return a
    }
}

class In<in A>(a: A) {
    fun foo(a: A) {
        println(a)
    }
}



