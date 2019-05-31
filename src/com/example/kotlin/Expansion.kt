package com.example.kotlin

fun main() {
    C().call(D())
    C().call(D1())
    C1().call(D())
    C1().call(D1())
}

open class C {
    fun print() {
        println("print in c")
    }

    open fun D.test() {
        println("d expansion test")
    }

    open fun D1.test() {
        println("d1 expansion test")
    }

    fun call(d: D) {
        d.test()
    }
}

class C1 : C() {
    override fun D.test() {
        println("c1 override d expansion test")
    }

    override fun D1.test() {
        println("c1 overrid d1 expansion test")
    }
}

open class D {
    fun print() {
        println("print in d fun")
    }
}

class D1 : D() {

}
