package Cooking

class SimpleSpice {
    var name: String = "curry"
    var spiciness: String = "mild"
    val heat: Int
        get() = when (spiciness) {
            "mild" -> 5
            else -> 0
        }
}

class Spice (val name: String, val spiciness: String = "mild") {
    val heat = when (spiciness) {
        "hot" -> 10
        "mild" -> 5
        else -> -1
    }
    init {
        println("name: $name, spiciness: $spiciness, heat: $heat")
    }
}