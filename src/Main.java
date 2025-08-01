import java.util.Scanner;

public class Main {
    static int number = 0;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter number " + i+ ": " );
            number = number+scanner.nextInt();

        }
        System.out.println("Total Number: "+number);
    }
}
