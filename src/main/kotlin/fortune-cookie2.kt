fun main(args: Array<String>) {
    var fortune: String
//    for (i in 1..10) {
//        fortune = getFortune(getBirthday())
//        println("\nYour fortune is: $fortune")
//        if (fortune.contains("Take it easy")) break;
//    }
    var count = 0
    while (count < 10) {
        count++
        fortune = getFortune(getBirthday())
        println("\nYour fortune is: $fortune")
        if (fortune.contains("Take it easy")) break;
    }
}

fun getBirthday(): Int {
    print("생일 입력: ")
    return readLine()?.toIntOrNull() ?: 1
}

fun getFortune(birthday: Int): String {
    return when (birthday % 7) {
        0 -> "You will have a great day!"
        1 -> "Things will go well for you today."
        2 -> "Enjoy a wonderful day of success."
        3 -> "Be humble and all will turn out well."
        4 -> "Today is a good day for exercising restraint."
        5 -> "Take it easy and enjoy life!"
        6 -> "Treasure your friends because they are your greatest fortune."
        else -> "No fortune"
    }
}