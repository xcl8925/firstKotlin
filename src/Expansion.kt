fun main() {

    var list = mutableListOf<Int>(1, 2, 3)
    list.swap(0, 2)
    list.forEach {
        println(it)
    }

    list.forEach {
        println(it * 2)
    }

    list.forEach(fun(value: Int) {
        println(value)
    })

    printFoo(D())

    var nullObject = null
    println(nullObject.toString())

    var intList = listOf(1, 2, 3)
    println(intList.lastIndex)

    println(C().name)

}

val <T> List<T>.lastIndex: Int
    get() = size - 1

fun MutableList<Int>.swap(from: Int, to: Int) {
    var temp = this[from]
    this[from] = this[to]
    this[to] = temp
}

open class C {
    open fun foo() {
        println("fun c foo")
    }
}

val C.name
    get() = "name"

class D : C() {
    override fun foo() {
        println("fun d foo")
    }
}

fun C.foo() {
    println("c.foo")
}

fun D.foo() {
    println("d.foo")
}

fun printFoo(c: C) {
    c.foo()
}

fun Any?.toString(): String {
    if (this == null)
        return "nu111ll"

    return toString()
}
