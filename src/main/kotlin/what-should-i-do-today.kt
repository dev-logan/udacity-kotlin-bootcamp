fun main() {
    print("What's your mood?")
    val mood = readLine()!!
    println(whatShouldIDoToday(mood))
}

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24): String {
    return when {
        isGood(mood, weather) -> "go for a walk"
        isBad(mood, weather, temperature) -> "stay in bed"
        isHot(temperature) -> "go swimming"
        else -> "stay home and read"
    }
}

fun isGood(mood: String, weather: String) = mood == "happy" && weather == "sunny"
fun isBad(mood: String, weather: String, temperature: Int) = mood == "sad" && weather == "rainy" && temperature == 0
fun isHot(temperature: Int) = temperature > 35