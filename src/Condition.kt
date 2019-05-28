fun main() {

    val a = 10
    when (a) {
        in 1..10 -> println("in 1-10")
        !in 20..30 -> println("not in 20-30")
        else -> println("over")
    }

}