import kotlin.random.Random

const val MAX_NUM_BOOKS = 5

class Book(
    val title: String,
    val author: String,
    val year: Int,
    var pages: Int
) {
    fun getTitleAuthor(): Pair<String, String> {
        return Pair(this.title, this.author)
    }

    fun getTitleAuthorYear(): Triple<String, String, Int> {
        return Triple(this.title, this.author, this.year)
    }

    fun canBorrow(borrowedNumberOfBooks: Int): Boolean {
        return borrowedNumberOfBooks < MAX_NUM_BOOKS
    }

    fun printUrl(bookTitle: String) {
        println("${BASE_URL}$bookTitle.html")
    }

    companion object {
        const val BASE_URL = "https://jeongho.library.com/"
    }
}

fun Book.weight() = this.pages * 1.5

fun Book.tornPages(tornPages: Int) {
    this.pages -= tornPages
}

class Puppy {
    fun playWithBook(book: Book) {
        val tornPages = Random.nextInt(0, book.pages + 1)
        book.tornPages(tornPages)
    }
}

object Constants {
    const val BASE_URL = "https://jeongho.library.com/"

}

fun main() {
//    val book = LibraryBook("Moby-Dick", "Herman Melville", 1851)
//    val (title, author, year) = book.getTitleAuthorYear()
//    println("Here is your book $title written by $author in $year")

//    val allBooks = setOf<String>("Hamlet", "King Lear", "Macbeth")
//    val library = allBooks.associateWith { "William Shakespeare" }
//    println(library.any { it.key == "Hamlet" })
//    val moreBooks = mutableMapOf<String, String>()
//    moreBooks["Othello"] = "William Shakespeare"
//    println(moreBooks.getOrPut("abc") { "William Shakespeare" })
//    println(moreBooks)

//    val libraryBook = LibraryBook("Moby-Dick", "Herman Melville", 1851)
//    println("Can I borrow? " + libraryBook.canBorrow(2))
//    print("URL: ")
//    libraryBook.printUrl("moby-dick")

    val book = Book("Moby-Dick", "Herman Melville", 1851, 500)
    val puppy = Puppy()
    println("Before play: ${book.pages} pages")
    while (book.pages > 0) {
        puppy.playWithBook(book)
        println("After play: ${book.pages} pages")
    }
}