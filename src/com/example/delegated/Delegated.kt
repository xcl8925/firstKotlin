package com.example.delegated

import kotlin.properties.Delegates
import kotlin.reflect.KProperty

fun main() {
    Derived(BaseImpl(19)).print()

    println(Example().key)
    var example = Example()
    example.key = 10
    println(example.key)

    val lazyValue: String by lazy {
        println("lazy init1")
        println("lazy init2")
        "value"
    }

    println(lazyValue)
    println(lazyValue)

    var observableValue: String by Delegates.observable("init value") { prop, old, new ->
        println("$prop, old value is $old, new value is $new")
    }

    observableValue = "first"
    observableValue = "second"
    println(observableValue)
}

interface Base {
    fun print()
}

class BaseImpl(var x: Int) : Base {
    override fun print() {
        print(x)
    }
}

class Derived(base: Base) : Base by base {
    override fun print() {
        println("print in derived.")
    }
}

class Example {
    var key: Int by ParamsDelegate()
}

class ParamsDelegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): Int {
        return 12
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, i: Int) {
        println("$thisRef set value $i in delegate")
    }
}