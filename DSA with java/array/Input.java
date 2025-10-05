package array;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        // int marks[]=new int[40]; 
        // int number []= {1,2,3};
        // String fruits[]= {"apple", "mango", "orange"};
        // System.out.println(fruits[2]);
        // System.out.println(marks[22]);
        // System.out.println(number[1]);
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size: ");
        int n =sc .nextInt();
        int[] arr = new int[n];
        // input
        System.out.println("enter array elements : ");
        for(int i = 0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        // output
        for(int i = 0; i<n; i++){
            // System.out.print(arr[i] + " ");
            System.out.print(arr[i]*2+" ");
        }

    }
}

