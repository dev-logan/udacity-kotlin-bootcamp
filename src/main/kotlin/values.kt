import java.util.Calendar

fun dayOfWeek() {
    println("What day is it today?")
    when (Calendar.getInstance().get(Calendar.DAY_OF_WEEK)) {
        1 -> println("Sunday")
        2 -> println("Monday")
        3 -> println("Tuesday")
        4 -> println("Wednesday")
        5 -> println("Thursday")
        6 -> println("Friday")
        7 -> println("Saturday")
    }
}

fun main(args: Array<String>) {
    println("Hello, ${args[0]}")

    val isUnit = println("This is an expression")
    println(isUnit)

    val temperature = 10
    val isHot = if (temperature > 50) true else false
    println(isHot)

    val message = "You are ${ if (temperature > 50) "fried" else "safe" } fish"
    println(message)

    dayOfWeek()
}