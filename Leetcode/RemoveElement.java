public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        return helper(nums, val, 0, 0);
    }
    private static int helper(int[] nums, int val, int index, int k) {
        // Base case: if we reach the end of array
        if (index == nums.length) {
            return k;
        }
        // If nums[index] is not equal to val, keep it
        if (nums[index] != val) {
            nums[k] = nums[index];
            return helper(nums, val, index + 1, k + 1);
        } else {
            // Skip this element
            return helper(nums, val, index + 1, k);
        }
    }
    // Test in VS Code
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int k = removeElement(nums, val);
        System.out.println("k = " + k);
        System.out.print("Array after removal: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
