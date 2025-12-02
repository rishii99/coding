package array;

public class insertion {
    public static void main(String[] args) {
        int [] arr= {10,20,30,40,50};
        int indexpos = 2;
        int element = 100;
        // 1st step
        int [] newArray = new int[arr.length+1];
        // 2nd step
        for(int i =0; i<indexpos; i++){
           newArray[i]= arr[i];

        }

        // 3rd step
        newArray[indexpos]= element;
        // 4th step
        for(int i = indexpos; i<arr.length; i++){
            newArray[i+1]= arr[i];
        }

        //traverse
        for(int no: newArray){
            System.out.print(no+" ");
        }

    }
}
