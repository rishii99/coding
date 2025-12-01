package array;

import java.util.Scanner;

public class MyArray {
    public static void main(String[] args) {
        int rollNo[] = new int[5];
        // int age[];
        // age = new int[7];
        int dummy[]= {10, 20, 30, 40, 50};
        rollNo[0]= 54;
        Scanner sc = new Scanner(System.in);
        for(int i =0; i<rollNo.length;i++){
            System.out.println("Enter "+i+" element:");
    
        int element = sc.nextInt();
        rollNo[i]= element;
        System.out.println(rollNo[i]+ "  ");
        }



    //  //   System.out.println(rollNo);

    //    // for(int i = 0; i<rollNo.length; i++){
    //     for(int i = 0; i<5; i++){
    //         System.out.print(rollNo[i]+ " ");

        }

    }

