fun main() {

    var child = ChildExtend()

    child.body()
    child.nobody()
    println(child.name)
}

interface MyInterface {
    var name: String
    fun nobody()
    fun body() {
        println("interface body")
    }
}

interface MyInterface2 {
    var name: String
    fun nobody()
    fun body() {
        println("interface2 body")
    }
}

class ChildExtend : MyInterface, MyInterface2 {

    override var name: String
        get() = "12"
        set(value) {}

    override fun nobody() {
        println("child extend in extend")
    }

    override fun body() {
        super<MyInterface>.body()
        super<MyInterface2>.body()
    }
}