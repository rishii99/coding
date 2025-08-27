import java.util.Scanner;

public class while_loop{
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a positive number
        System.out.print("Enter a positive number (or 0 to stop): ");
        int number = scanner.nextInt();

        // Use a while loop to continue until the user enters 0
        while (number > 0) {
            System.out.println("You entered: " + number);

            // Ask for the next input
            System.out.print("Enter another positive number (or 0 to stop): ");
            number = scanner.nextInt();
        }

        System.out.println("You entered 0 or a negative number. Exiting...");

        // Close the scanner
        scanner.close();
    }
}
