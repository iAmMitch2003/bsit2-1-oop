public class Main {
    public static void main(String[] args) {
        System.out.println("═══ LIBRARY MANAGEMENT SYSTEM TEST ═══\n");

        LibraryManager manager = new LibraryManager();


        Book book1 = new Book("B001", "Java Programming", "James Gosling", "123456", 500, "Programming");
        Magazine mag1 = new Magazine("M001", "Tech Today", "Editor Smith", 10, "September", true);
        DVD dvd1 = new DVD("D001", "The Matrix", "Wachowski Sisters", 136, "R", "Sci-Fi");


        System.out.println("═══ Adding Items to Library ═══");
        manager.addItem(book1);
        System.out.println("Added: Book - " + book1.title + " by " + book1.author);

        manager.addItem(mag1);
        System.out.println("Added: Magazine - " + mag1.title + " by " + mag1.author);

        manager.addItem(dvd1);
        System.out.println("Added: DVD - " + dvd1.title + " by " + dvd1.author);
        System.out.println();

        System.out.println("═══ Displaying All Items ═══");
        System.out.println("Book: " + book1.title + " (" + book1.getBorrowingStatus() + ")");
        System.out.println("Magazine: " + mag1.title + " (" + mag1.getBorrowingStatus() + ")");
        System.out.println("DVD: " + dvd1.title + " (" + dvd1.getBorrowingStatus() + ")");
        System.out.println();


        Student student = new Student("U001", "John Smith", "john@liceo.edu.ph", "S1001", "Computer Science");
        Faculty faculty = new Faculty("U002", "Dr. Smith", "drsmith@liceo.edu.ph", "Engineering", "Professor");


        System.out.println("═══ Testing Borrowing ═══");
        manager.borrowItem("B001", student.getName());
        student.addBorrowedItem(book1);
        System.out.println("Student " + student.getName() + " borrowed: " + book1.title);

        manager.borrowItem("D001", faculty.getName());
        faculty.addBorrowedItem(dvd1);
        System.out.println("Faculty " + faculty.getName() + " borrowed: " + dvd1.title);
        System.out.println();

        System.out.println("═══ Displaying Available Items ═══");
        System.out.println("Magazine: " + mag1.title + " (" + mag1.getBorrowingStatus() + ")");
        System.out.println();

        System.out.println("═══ Testing Late Fees ═══");
        int daysLateBook = 5;
        int daysLateDVD = 3;
        System.out.println(book1.title + " - " + daysLateBook + " days late: $" + String.format("%.2f", book1.calculateLateFee(daysLateBook)));
        System.out.println(dvd1.title + " - " + daysLateDVD + " days late: $" + String.format("%.2f", dvd1.calculateLateFee(daysLateDVD)));
        System.out.println();


        System.out.println("═══ Testing User Information ═══");
        System.out.println("Student: " + student.getName() + " (" + student.getMajor() + ") - " + student.getBorrowedItemsCount() + " items borrowed");
        System.out.println("Faculty: " + faculty.getName() + " (" + faculty.getDepartment() + ") - " + faculty.getBorrowedItemsCount() + " items borrowed");
    }
}