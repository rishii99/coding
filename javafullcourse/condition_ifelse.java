import java.util.Scanner;

public class condition_ifelse{
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is positive or negative
        if (number >= 5) {
            System.out.println("The number is larger.");
        } else {
            System.out.println("The number is smaller.");
        }

        // Close the scanner
        scanner.close();

    }
}

    