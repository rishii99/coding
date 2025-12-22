import java.util.Arrays;
public class MaximumGap {
    public static int maximumGap(int[] nums) {
        // Edge case
        if (nums == null || nums.length < 2) {
            return 0;
        }
        // Sort the array
        Arrays.sort(nums);
        int maxGap = 0;
        // Find maximum difference between consecutive elements
        for (int i = 1; i < nums.length; i++) {
            maxGap = Math.max(maxGap, nums[i] - nums[i - 1]);
        }
        return maxGap;
    }
    // Main method for VS Code execution
    public static void main(String[] args) {
        int[] nums = {3, 6, 9, 1};
        System.out.println("Maximum Gap: " + maximumGap(nums));
    }
}
