package array;

public class BinarySearch {

    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2; // avoids overflow

            if (arr[mid] == target) {
                return mid;  // element found
            } else if (arr[mid] < target) {
                start = mid + 1; // search right
            } else {
                end = mid - 1;   // search left
            }
        }
        return -1; // not found
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16, 23, 38};
        int target = 16;

        int result = binarySearch(arr, target);
        System.out.println("Index: " + result);
    }
}
