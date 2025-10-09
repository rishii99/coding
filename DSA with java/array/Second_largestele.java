package array;

public class Second_largestele {
    public static void main(String[] args) {
        int [] marks = { 1,3,5,8,12,15,17,19,21};
        int max = Integer.MIN_VALUE;
        for(int i =0;i<marks.length;i++){
            if(marks[i]>max) max =marks[i]; 

        }
        int smax= Integer.MIN_VALUE;
        for(int i =0; i<marks.length;i++){
            if(marks[i]>smax && marks[i]!= max) smax = marks[i];
        }
        System.out.println(max);
        System.out.println(smax);
    }
    
}

