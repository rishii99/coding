import java.util.Scanner;

public class for_loop {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of times to print a message
        System.out.print("Enter the number of times to print the message: ");
        int count = scanner.nextInt();

        // Use a for loop to repeat the message
        for (int i = 1; i <= count; i++) {
            System.out.println("This is message number " + i);
        }

        // Close the scanner
        scanner.close();
    }
}
