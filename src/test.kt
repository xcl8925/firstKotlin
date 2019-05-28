fun main() {
//    println("test")
//    print(add(1, 2))
//    vars(1, 3, 4)

    test()
}

fun add(a: Int, b: Int): Int = a + b

fun vars(vararg v: Int) {
    for (vt in v) {
        println(vt)
    }
}

fun test() {
    var a = 10
    var b: Int = 320
    val c = 20

//    vars(a, b, c)

    var s = 2
    var str = "value is $s"

//    println(str)

    var newS = 10
//    println("${str.replace("is", "was")}, but now is $newS")

    var age: String? = null

    var age1 = age?.toInt() ?: "213"
    var age2 = age?.toInt() ?: "213"

    println(age)
    println(age1)
    println(age2)

    println(age2 is Int)

    println(parseInt())

    getStringLength(12)

    for (i in 1..4) println(i) // 输出“1234”

    for (i in 4..1) println(i) // 什么都不输出

    for (i in 1 until 4) println(i)

}

fun parseInt(): Int? {
    return null
}

fun getStringLength(obj: Any): Int? {
    if (obj is String) {
        println(obj.length)
    }

    if (obj !is String) {
        return null
    }

    return null
}
