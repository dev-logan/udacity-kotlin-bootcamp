package Cooking

fun makeSalt() = Spice("salt", "mild")

fun main() {
    val spices = listOf(
        Spice("curry","mild"),
        Spice("pepper","hot"),
        Spice("cayenne","mild"),
        Spice("ginger","hot"),
        Spice("red curry","hot"),
        Spice("green curry","mild"),
        Spice("red pepper","hot"),
    )

    val spicySpices = spices.filter {it.heat > 5}
    val mildSpices = spices.filter {it.heat <= 5}

    println(spices.map { it.name })
    println("spicy spices: " + spicySpices.map { it.name })
    println("mild spices: " + mildSpices.map { it.name })
}