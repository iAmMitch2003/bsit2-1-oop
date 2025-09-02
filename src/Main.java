public class Main {
    public static void main(String[] args) {
        LibraryManager manager = new LibraryManager();

        manager.showBooks();    // display initial books
        manager.addBook();      // add a book
        manager.removeBook();   // remove a book

        System.out.println("Program completed successfully.");
    }
}
