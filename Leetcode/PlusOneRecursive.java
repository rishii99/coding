//Iterative Approach.

// import java.util.Arrays;
// public class PlusOneIterative {
//     public static int[] plusOne(int[] digits) {
//         int n = digits.length;        // Traverse from last digit
//         for (int i = n - 1; i >= 0; i--) {
//             // If digit is less than 9, add 1 and return
//             if (digits[i] < 9) {
//                 digits[i]++;
//                 return digits;
//             }
//             // If digit is 9, make it 0
//             digits[i] = 0;
//         }
//         // If all digits were 9
//         int[] result = new int[n + 1];
//         result[0] = 1;
//         return result;
//     }
//     // Main method for VS Code execution
//     public static void main(String[] args) {
//         int[] digits = {9, 9, 9};

//         int[] output = plusOne(digits);
//         System.out.println(Arrays.toString(output));
//     }
// }


//Recusive App.

import java.util.Arrays;
public class PlusOneRecursive {
    // Public method
    public static int[] plusOne(int[] digits) {
        // Start recursion from last index
        if (addCarry(digits, digits.length - 1)) {
            // If carry still exists after recursion
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            return result;
        }
        return digits;
    }
    // Recursive helper method
    private static boolean addCarry(int[] digits, int index) {
        // Base case: carry beyond most significant digit
        if (index < 0) {
            return true;
        }
        // If digit < 9, increment and stop recursion
        if (digits[index] < 9) {
            digits[index]++;
            return false;
        }
        // If digit is 9, make it 0 and propagate carry
        digits[index] = 0;
        return addCarry(digits, index - 1);
    }
    // Main method for VS Code execution
    public static void main(String[] args) {
        int[] digits = {9, 9, 9};
        int[] output = plusOne(digits);
        System.out.println(Arrays.toString(output));
    }
}
