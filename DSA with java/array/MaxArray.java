// find the max. value out of all element in the array
package array;

public class MaxArray { 
    public static void main(String[] args) {
        int [] marks = { 55,85,3,45,98,78,39,56};
        int max = marks[0];
        for(int i =0;i<marks.length;i++){
            if(marks[i]>max) max =marks[i]; 

        }
        System.out.println(max);
    }
    
}
