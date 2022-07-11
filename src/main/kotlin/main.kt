fun main() {
    val numbers = (11..15).toList().toTypedArray()
    val myList = mutableListOf<String>()
    for (i in numbers) {
        myList.add(i.toString())
    }
    println(myList)
}