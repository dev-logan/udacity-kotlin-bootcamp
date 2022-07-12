fun main() {
    eagerExample()
}

fun eagerExample() {
    val decorations = listOf("rock", "pagoda", "plastic plant", "alligator", "flowerpot")

    val eager = decorations.filter { it[0] == 'p' }
    println(eager)

    val filtered = decorations.asSequence().filter { it[0] == 'p' }
    println(filtered)
    println(filtered.toList())

    val lazyMap = decorations.asSequence().map {
        println("map: $it")
        it
    }

    println(lazyMap)
    println("first: ${lazyMap.first()}")
    println("all: ${lazyMap.toList()}")
}