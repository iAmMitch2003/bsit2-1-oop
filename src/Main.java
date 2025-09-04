
public class Main {
    public static void main(String[] args) {
        
        System.out.println("══ Book Record System ══");
        
        System.out.println("Adding books and ratings...");
        
        Book book1 = new Book("Java Programming", "John Smith");
        Book book2 = new Book("Data Structures", "Alice Brown");
        Book book3 = new Book("Web Development", "Bob Wilson");

        book1.addRating(4);
        System.out.println("Rating 4 added successfully");

        book2.addMultipleRatings(5, 4, 3, 5);
        System.out.println("Ratings added: 5, 4, 3, 5");

        try {
            book1.addRating(6);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Book Results:");
        System.out.println(book1.displayBook());
        System.out.println(book2.displayBook());
        System.out.println(book3.displayBook());

        System.out.println("Total books created: " + Book.getTotalBooks());

        Book highestRatedBook = book1;
        if (book2.getAverageRating() > highestRatedBook.getAverageRating()) {
            highestRatedBook = book2;
        }
        if (book3.getAverageRating() > highestRatedBook.getAverageRating()) {
            highestRatedBook = book3;
        }

        System.out.println("Highest rated book: " + highestRatedBook.getTitle() + " by " + highestRatedBook.getAuthor() + " (" + highestRatedBook.getAverageRating() + ")");
    }
}