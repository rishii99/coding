package array;

import java.util.Scanner;

public class Update {
    public static void main(String[] args) {
        // input output of array
        int marks[]= new int [100];
        Scanner sc = new Scanner (System.in);
        marks[0]= sc.nextInt(); //phy
        marks[1]= sc.nextInt(); //che
        marks[2]= sc.nextInt(); //maths
        System.out.println("phy:" +marks[0]);
        System.out.println("che:" +marks[1]);
        System.out.println("maths:" +marks[2]);

        // update
        marks[2]= 100;
        System.out.println("maths:" +marks[2]);

        // calculate percentage
        int percentage = (marks[0]+marks[1]+marks[2])/3;
        System.out.println("percentage:" +percentage);

        // length of array 
        System.out.println("length of array:" +marks.length);

    }
    
}

