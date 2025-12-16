// public class SearchInsert {
//     // Iterative Binary Search
//     public static int searchInsert(int[] nums, int target) {
//         int low = 0;
//         int high = nums.length - 1;
//         while (low <= high) {
//             int mid = low + (high - low) / 2;
//             if (nums[mid] == target) {
//                 return mid;
//             } else if (nums[mid] < target) {
//                 low = mid + 1;
//             } else {
//                 high = mid - 1;
//             }
//         }
//         return low; // insertion index
//     }
//     // main method (required for VS Code)
//     public static void main(String[] args) {
//         int[] nums = {1, 3, 5, 6};
//         int target = 2;
//         System.out.println("Result: " + searchInsert(nums, target));
//     }
// }


public class SearchInsert {
    // Public method
    public static int searchInsert(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length - 1);
    }
    // Recursive Binary Search
    private static int binarySearch(int[] nums, int target, int low, int high) {
        // Base case: insertion position
        if (low > high) {
            return low;
        }
        int mid = low + (high - low) / 2;
        if (nums[mid] == target) {
            return mid;
        } 
        else if (nums[mid] < target) {
            return binarySearch(nums, target, mid + 1, high);
        } 
        else {
            return binarySearch(nums, target, low, mid - 1);
        }
    }
    // main method for VS Code
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 2;
        System.out.println("Result: " + searchInsert(nums, target));
    }
}


