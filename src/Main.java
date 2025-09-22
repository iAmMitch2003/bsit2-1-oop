public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Java Programming", "John Smith", "1234567890", 2020);
        Book book2 = new Book("Data Structures", "Jane Doe", "9876543210", 2019);
        Book book3 = new Book("Web Development", "Mike Johnson", "5555666677", 2021);

        Library library = new Library();

        System.out.println("Adding books to library...");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.displayAllBooks();

        System.out.println("\nBorrowing Java Programming...");
        boolean borrowed = library.borrowBook("1234567890");
        System.out.println(borrowed ? "Book borrowed successfully!" : "Book not available for borrowing.");

        System.out.println("\nTrying to borrow Java Programming again...");
        borrowed = library.borrowBook("1234567890");
        System.out.println(borrowed ? "Book borrowed successfully!" : "Book not available for borrowing.");

        System.out.println("\nReturning Java Programming...");
        boolean returned = library.returnBook("1234567890");
        System.out.println(returned ? "Book returned successfully!" : "Book not borrowed.");

        library.displayAvailableBooks();

        System.out.println("\nTesting validation...");
        try {
            Book invalidBook = new Book("Invalid Book", "Unknown Author", "12345", 2026);  
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            Book invalidIsbnBook = new Book("Invalid ISBN", "Unknown Author", "12345", 2020); 
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

