package Spices

fun main() {
//    val myCurry = Curry("hot")
//    println(myCurry.color)
    val c1 = SpiceContainer("curry")
    println(c1)
    val c2 = SpiceContainer("pepper")
    println(c2)
}

abstract class Spice(val spiceColor: SpiceColor = YellowSpiceColor) : SpiceColor by spiceColor {
    abstract var spiciness: String
    abstract fun prepareSpice()
}

class Curry(val setSpiciness: String) :
    Spice(), Grinder {
    override var spiciness = setSpiciness

    override fun prepareSpice() {
        TODO("Not yet implemented")
    }

    override fun grind() {
        TODO("Not yet implemented")
    }
}

interface Grinder {
    fun grind()
}

interface SpiceColor {
    val color: Color
}

object YellowSpiceColor : SpiceColor {
    override val color = Color.YELLOW
}

data class SpiceContainer(val label: String) {}

enum class Color(val rgb: Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF), YELLOW(0xFFFF00);
}