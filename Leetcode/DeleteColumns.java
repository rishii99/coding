public class DeleteColumns {

    public static void main(String[] args) {
        DeleteColumns solution = new DeleteColumns();

        // Test Case 1
        String[] strs1 = {"cba", "daf", "ghi"};
        System.out.println("Test 1 Result: " + solution.minDeletionSize(strs1)); // Expected: 1

        // Test Case 2
        String[] strs2 = {"a", "b"};
        System.out.println("Test 2 Result: " + solution.minDeletionSize(strs2)); // Expected: 0

        // Test Case 3
        String[] strs3 = {"zyx", "wvu", "tsr"};
        System.out.println("Test 3 Result: " + solution.minDeletionSize(strs3)); // Expected: 3
    }

    public int minDeletionSize(String[] strs) {
        int res = 0;
        // j represents the column index
        for (int j = 0; j < strs[0].length(); j++) {
            res += isUnsorted(strs, j);
        }
        return res;
    }

    private int isUnsorted(String[] strs, int j) {
        // i represents the row index
        for (int i = 1; i < strs.length; i++) {
            // Compare current character with the one in the row above it
            if (strs[i].charAt(j) < strs[i - 1].charAt(j)) {
                return 1; // Column is not sorted lexicographically
            }
        }
        return 0;
    }
}