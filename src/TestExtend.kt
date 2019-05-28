fun main() {

    var student = Student(12, "name", 1)
    println(student.name)
    println(student.age)

    var worker = Worker()
    println(worker.name)
    worker.f()
    println(worker.age)
}

open class Person(var name: String) {
    open var age: Int = 10
    open fun f() {
        println("print int person")
    }
}

interface Listener {
    fun f() {
        println("print in listener")
    }
}

class Student(override var age: Int, name: String) : Person(name) {
    constructor(age: Int, name: String, sex: Int) : this(age, name) {

    }
}

class Worker : Person(name = "worker name"), Listener {
    override var age: Int
        get() = 122
        set(value) {}

    override fun f() {
        super<Person>.f()
        super<Listener>.f()
    }
}