import java.util.Arrays;
public class PlusOneIterative {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;        // Traverse from last digit
        for (int i = n - 1; i >= 0; i--) {
            // If digit is less than 9, add 1 and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // If digit is 9, make it 0
            digits[i] = 0;
        }
        // If all digits were 9
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }
    // Main method for VS Code execution
    public static void main(String[] args) {
        int[] digits = {9, 9, 9};

        int[] output = plusOne(digits);
        System.out.println(Arrays.toString(output));
    }
}
