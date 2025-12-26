package pattern;
import java.util.Scanner;

public class AlphaNumeric {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   // Scanner initialize

        int n = sc.nextInt();  // rows input
        for (int i = 1; i <= n; i++) {
            
            if (i % 2 != 0) {   // odd row -> numbers
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
            } 
            else {             // even row -> alphabets
                for (int j = 1; j <= i; j++) {
                    System.out.print((char)(j + 64) + " ");
                }
            }
            
            System.out.println(); // हर row के बाद नई line
        }
    }
}
