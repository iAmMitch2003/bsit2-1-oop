public class TestBook {
    public static void main(String[] args) {
      
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book("Moby-Dick", "Herman Melville");

      
        try {
            book1.addRating(4);
            book2.addMultipleRatings(5, 4, 3, 5); 
            book3.addRating(2); 
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

      
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

       
        System.out.println("Total books created: " + Book.getTotalBooks());

    
        Book bestBook = getBestBook(book1, book2, book3);
        System.out.println("The book with the highest average rating is: " + bestBook.getTitle());
    }


    public static Book getBestBook(Book... books) {
        Book bestBook = books[0];
        for (Book book : books) {
            if (book.getAverageRating() > bestBook.getAverageRating()) {
                bestBook = book;
            }
        }
        return bestBook;
    }
}
