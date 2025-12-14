//Iterative App.
// public class PalindromeNumber {

//     public static boolean isPalindrome(int x) {
//         String s = String.valueOf(x); // Convert int to String
//         int n = s.length();

//         for (int i = 0; i < n / 2; i++) {
//             // Compare characters from start and end
//             if (s.charAt(i) != s.charAt(n - i - 1)) {
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         int x = 121;   // test input
//         System.out.println(isPalindrome(x)); // Output: true
//     }
// }


//Recursive App.
public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        return checkPalindrome(s, 0, s.length() - 1);
    }
    private static boolean checkPalindrome(String s, int left, int right) {
        // Base case
        if (left >= right) {
            return true;
        }
        // Mismatch case
        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }
        // Recursive call
        return checkPalindrome(s, left + 1, right - 1);
    }
    public static void main(String[] args) {
        int x = 121;   // test input
        System.out.println(isPalindrome(x)); // Output: true
    }
}
