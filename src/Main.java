import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        String studentId = scanner.nextLine();

        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter Course: ");
        String course = scanner.nextLine();

        System.out.print("Enter Section: ");
        String section = scanner.nextLine();

        System.out.println("STUDENT INFORMATION");
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + firstName + " " + lastName);
        System.out.println("Course: " + course);
        System.out.println("Section: " + section);

        System.out.print("Enter Prelim Exam Score: ");
        int prelim = scanner.nextInt();

        System.out.print("Enter Midterm Exam Score: ");
        int midterm = scanner.nextInt();

        System.out.print("Enter Final Exam Score: ");
        int finalExam = scanner.nextInt();

        System.out.print("Enter Project Score: ");
        int project = scanner.nextInt();

        System.out.print("Enter Attendance Percentage: ");
        int attendance = scanner.nextInt();

        int totalScore = midterm + finalExam + project + attendance;
        double averageScore = (double) totalScore / 400 * 100;

        String remarks = (averageScore < 75) ? "FAILED" : "PASSED";

        System.out.println("STUDENT SCORE");
        System.out.println("Prelim Exam Score:" + prelim);
        System.out.println("Midterm Exam Score: " + midterm);
        System.out.println("Final Exam Score: " + finalExam);
        System.out.println("Project Score: " + project);
        System.out.println("Attendance Score: " + attendance);
        System.out.println("Average Score: " + String.format("%.2f", averageScore));
        System.out.println("Remarks: " + remarks);
    }
}