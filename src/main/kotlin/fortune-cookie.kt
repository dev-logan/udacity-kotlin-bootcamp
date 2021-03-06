fun getFortuneCookie(): String {
    val fortunes = listOf<String>(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune."
    )
    print("Enter your birthday: ")

    val birthday = readLine()?.toIntOrNull() ?: 1

    return fortunes[birthday % fortunes.size]
}

fun main() {
    repeat(10) {
        val fortune = getFortuneCookie()
        println("Your fortune is: $fortune")
        if (fortune == "Take it easy and enjoy life!") {
            return
        }
    }
}