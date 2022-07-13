open class Book(val title: String = "default_title", val author: String = "default_author") {
    private var currentPage: Int = 0

    open fun readPage() {
        currentPage += 1
    }
}

class eBook(val format: String = "text"): Book() {
    private var wordCount: Int = 0

    override fun readPage() {
        wordCount += 250
    }
}