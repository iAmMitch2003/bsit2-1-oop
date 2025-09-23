
interface LibraryUser {
    String getUserType();
    void borrowMedia(Media media);
    void returnMedia(Media media);
    int getMaxBorrowLimit();
}

class Student implements LibraryUser {
    private String name;
    private String studentId;

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    @Override
    public String getUserType() {
        return "Student";
    }

    @Override
    public void borrowMedia(Media media) {
        if (media.isAvailable()) {
            media.borrowItem();
            System.out.println(name + " (" + getUserType() + ") borrowed: " + media.getTitle());
        } else {
            System.out.println("Sorry, " + media.getTitle() + " is not available.");
        }
    }

    @Override
    public void returnMedia(Media media) {
        media.returnItem();
    }

    @Override
    public int getMaxBorrowLimit() {
        return 3;
    }
}

class Teacher implements LibraryUser {
    private String name;
    private String employeeId;

    public Teacher(String name, String employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    @Override
    public String getUserType() {
        return "Teacher";
    }

    @Override
    public void borrowMedia(Media media) {
        if (media.isAvailable()) {
            media.borrowItem();
            System.out.println(name + " (" + getUserType() + ") borrowed: " + media.getTitle());
        } else {
            System.out.println("Sorry, " + media.getTitle() + " is not available.");
        }
    }

    @Override
    public void returnMedia(Media media) {
        media.returnItem();
    }

    @Override
    public int getMaxBorrowLimit() {
        return 5;
    }
}

class Librarian implements LibraryUser {
    private String name;
    private String employeeId;

    public Librarian(String name, String employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    @Override
    public String getUserType() {
        return "Librarian";
    }

    @Override
    public void borrowMedia(Media media) {
        if (media.isAvailable()) {
            media.borrowItem();
            System.out.println(name + " (" + getUserType() + ") borrowed: " + media.getTitle());
        } else {
            System.out.println("Sorry, " + media.getTitle() + " is not available.");
        }
    }

    @Override
    public void returnMedia(Media media) {
        media.returnItem();
    }

    @Override
    public int getMaxBorrowLimit() {
        return 10;
    }
}
