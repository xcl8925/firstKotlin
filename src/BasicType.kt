fun main() {
    var oneMillion = 100_00_00
    println(oneMillion)

    val a = 127
    val newA: Int? = a
    val another: Int? = a

    println(a === newA)
    println(another === newA)
    println(a == newA)

    for (i in 1..9) {

    }

    val c = '1'
    println("c to int is: " + c.toInt())
    if (c in '0'..'9') {
        println("c in " + c.toInt())

    }

    var array = arrayOf(1, 2, 3)
    println(array)
    for (i in array) {
        print("$i,")
    }
    println()
    array = Array(3) { i -> (i * 2) }
    for (i in array) {
        print("$i,")
    }
    println()

    var text = """
        one
        two
    """.trimIndent()

    println(text)

    val price = """
    ${'$'}9.99
    """.trimIndent()
    println(price)  // 求值结果为 $9.99

    val s = "runoob"
    val str = "$s.length is ${s.length}" // 求值结果为 "runoob.length is 6"
    println(str)

    out@ for (i in 1..10) {
        for (j in 1..10) {
            if (i == 2) {
                break@out
            }
//            println("$i, $j")
        }
    }

    tag()
}

fun tag() {
    val array = arrayOf(1, 2, 3)
    array.forEach iot@{
        if (it == 2) {
            return@iot
        }
        println(it)
    }

    array.forEach(
        fun(value: Int) {
            if (value == 2) {
                return
            }
            println(value)
        }
    )

    println("end tag.")
}



