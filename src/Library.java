public class Library {
    private Book[] books;
    private int bookCount;

    public Library() {
        books = new Book[10];  
        bookCount = 0;
    }

    public boolean addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount++] = book;
            System.out.println("Book added: " + book.getTitle() + " by " + book.getAuthor());
            return true;
        }
        return false;  
    }

    public Book findBook(String isbn) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getIsbn().equals(isbn)) {
                return books[i];
            }
        }
        return null;
    }

    public boolean borrowBook(String isbn) {
        Book book = findBook(isbn);
        if (book != null) {
            return book.borrowBook();
        }
        return false;
    }

    public boolean returnBook(String isbn) {
        Book book = findBook(isbn);
        if (book != null) {
            return book.returnBook();
        }
        return false;
    }

    public void displayAvailableBooks() {
        System.out.println("\nAvailable books:");
        for (int i = 0; i < bookCount; i++) {
            if (books[i].isAvailable()) {
                books[i].displayBookInfo();
            }
        }
    }

    public void displayAllBooks() {
        System.out.println("\nAll books in library:");
        for (int i = 0; i < bookCount; i++) {
            books[i].displayBookInfo();
        }
    }

    public int getBookCount() {
        return bookCount;
    }
}
