package array;

public class PassingArrayToMethods {
     public static void change(int[] rishi) {
        rishi[1]= 55;
     }
     public static void main(String[] args) {
        int[]arr ={20,15,19,30,88};
        System.out.println(arr[1]);
        change (arr);
        System.out.println(arr[1]);
     }
}
