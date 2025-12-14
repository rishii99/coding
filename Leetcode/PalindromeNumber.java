public class PalindromeNumber {

    public static boolean isPalindrome(int x) {
        String s = String.valueOf(x); // Convert int to String
        int n = s.length();

        for (int i = 0; i < n / 2; i++) {
            // Compare characters from start and end
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int x = 121;   // test input
        System.out.println(isPalindrome(x)); // Output: true
    }
}
