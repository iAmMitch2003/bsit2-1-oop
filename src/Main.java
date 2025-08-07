public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 20, "BSIT", 85.0, 90.0, 88.0);
        Student s2 = new Student("Bob", 19, "BSCS", 92.0, 95.0, 89.0);
        Student s3 = new Student("Charlie", 21, "BSIT", 65.0, 70.0, 68.0);

        Student[] students = { s1, s2, s3 };
        int passingCount = 0;

        for (Student st : students) {
            st.displayInfo();
            if (st.isPassing()) {
                passingCount++;
            }
        }

        System.out.println("Summary: " + passingCount + " out of " +
                students.length + " students are passing.");
    }
}