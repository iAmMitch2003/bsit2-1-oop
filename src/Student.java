class Student {
    String name;
    int age;
    String course;
    double grade1, grade2, grade3;

    Student(String name, int age, String course, double grade1, double grade2, double grade3) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }

    void displayInfo() {
        System.out.println("Student's Information:");
        System.out.println("Name: " + name + ", Age: " + age + ", Course: " + course);
        System.out.println("Grades: " + grade1 + ", " + grade2 + ", " + grade3);
        System.out.println("Average: " + calculateAverage());
        System.out.println("Letter Grade: " + getLetterGrade());
        System.out.println("Status: " + (isPassing() ? "PASSING" : "FAILING"));
        System.out.println(); // blank line for readability
    }

    double calculateAverage() {
        return (grade1 + grade2 + grade3) / 3.0;
    }

    String getLetterGrade() {
        double avg = calculateAverage();
        if (avg >= 90) return "A";
        else if (avg >= 80) return "B";
        else if (avg >= 70) return "C";
        else if (avg >= 60) return "D";
        else return "F";
    }

    boolean isPassing() {
        return calculateAverage() >= 70;
    }
}

