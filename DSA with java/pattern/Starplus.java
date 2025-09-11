package pattern.pattern;

public class Starplus {
    public static void main(String[] args) {
        int n = 5; // You can change the value of n to print a different size
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == n / 2 + 1 || j == n / 2 + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
