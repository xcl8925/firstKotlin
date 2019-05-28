fun main() {

    var runoob = Runoob("test")
    println(runoob.id)
    runoob.id = 10
    println(runoob.id)
    println("name: " + runoob.name)

    runoob = Runoob("xiechunlei", 30)
    println(runoob.name)
    var age = Grand().Man().getAge()
    println("get outer age:$age")
    Grand().Man().innerGetAge()

    testChild(object : Child() {
        override fun f() {
            println("匿名内部流")
        }
    })
}

fun testChild(child: Child) {
    child.f()
}

class Runoob constructor(var name: String) {

    constructor(name: String, age: Int) : this(name)

    init {
        println("init")
    }

    var id: Int = 1
        get() = field + 1
        set(value) {
            field = value + 1
        }

    lateinit var subject: Subject
}

class Subject {}

open class Base {
    open fun f() {
        println("open class open f")
    }
}

abstract class Child : Base() {
    abstract override fun f()
}

class Grand : Child() {
    var age = 10
    override fun f() {
        println("grand")
    }

    inner class Man {
        fun getAge() = age
        var parent = this@Grand
        fun innerGetAge() {
            println("innter get age ${parent.age}")
        }
    }
}
