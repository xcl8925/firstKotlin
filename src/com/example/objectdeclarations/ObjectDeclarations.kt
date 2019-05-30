package com.example.objectdeclarations

fun main() {

    var temp: A = object : A(1),
        B {
        override fun test() {
            println("test in object declarations")
        }

        override val key: Int
            get() = 15
    }

    println(temp.key)

    var create = object {
        var name: String = "name"
    }

    println(create.name)

    C().test()

    var site1 = Site()
    var site2 = Site()
    site1.url = "site1 url"
    site2.url = "site2 url"

    println(site1.url)
    println(site2.url)

    println(Site.Desktop.number)
    Site.ip

    var myClass = MyClass.create()
    myClass.test()
}

open class A(x: Int) {
    open val key = x
}

interface B {
    fun test()
}

class C {
    private fun foo() = object {
        val x = 10
    }

    fun publicFoo() = object {
        val x = 100
    }

    fun test() {
        println(C().foo().x)
//        C().publicFoo().x
    }
}

class Site {
    companion object {
        var ip = "182.1212.1.1"
    }

    var url = "init url"

    object Desktop {
        var number = 1011
    }

}

interface Factory<T> {
    fun create(): T
}

class MyClass {
    companion object : Factory<MyClass> {
        override fun create(): MyClass {
            return MyClass()
        }
    }

    fun test() {
         println("test...")
    }
}

