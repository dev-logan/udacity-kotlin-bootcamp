import java.util.Random

fun main() {
    println(gamePlay(12, ::rollDice2))
}

val rollDice = { numberOfSides: Int ->
    if (numberOfSides != 0) {
        Random().nextInt(1, numberOfSides)
    } else 0
}

fun rollDice2(numberOfSides: Int) = if (numberOfSides != 0) {
    Random().nextInt(1, numberOfSides)
} else 0

fun gamePlay(numberOfSides: Int, operation: (Int) -> Int): Int {
    return operation(numberOfSides)
}