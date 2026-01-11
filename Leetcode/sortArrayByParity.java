public class sortArrayByParity {

    public static int[] sortArrayByParity(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            if (nums[start] % 2 != 0 && nums[end] % 2 == 0) {
                swap(start, end, nums);
                start++;
                end--;
            }

            if (nums[start] % 2 == 0) {
                start++;
            }

            if (nums[end] % 2 != 0) {
                end--;
            }
        }
        return nums;
    }

    public static void swap(int start, int end, int[] arr) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 4};
        nums = sortArrayByParity(nums);

        for (int n : nums) {
            System.out.print(n + " ");
        }
    }
}
