public class rishi{
    public static int binarySearch(int[] arr, int left, int right, int target) {
        if (left > right) {
            return -1; // Target not found
        }
        
        int mid = left + (right - left) / 2; // Avoids integer overflow

        if (arr[mid] == target) {
            return mid; // Target found
        } else if (arr[mid] > target) {
            return binarySearch(arr, left, mid - 1, target); // Search left half
        } else {
            return binarySearch(arr, mid + 1, right, target); // Search right half
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14};
        int target = 10;
        int result = binarySearch(arr, 0, arr.length - 1, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
 
    
