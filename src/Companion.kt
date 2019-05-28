fun main() {

    MyClass.get()
    println(MyClass.value)
}

class MyClass {
    companion object
}

fun MyClass.Companion.get() {
    println("companion expansion fun")
}

val MyClass.Companion.value: Int
    get() = 10
