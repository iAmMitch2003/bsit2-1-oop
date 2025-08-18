    public static void main(String[] args) {
        String studentName = "John Smith";
        double average = calculateAverage(85.5, 92.0, 78.5, 90.0);
        String letterGrade = getLetterGrade(average);

        displayResult(studentName, average);
        System.out.println();
        displayResult(studentName, average, letterGrade);
    }
