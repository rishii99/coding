import java.util.Scanner;

public class condition_if {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is positive
        if (number > 9) {
            System.out.println("The number is larger.");
        }

        // Close the scanner
        scanner.close();
    }
}
 
    

