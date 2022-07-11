fun main(args: Array<String>) {
    val time = args[0].toInt()
    if (time !in 0..23) {
        return
    }
    if (time < 12) {
        println("Good morning")
    } else {
        println("Good night, Kotlin")
    }
}