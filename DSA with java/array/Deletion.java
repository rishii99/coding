package array;

public class Deletion {
    
    public static void main(String[] args) {
        int arr[]= {10,20,30,40,50};
        int indexpos = 1;
        // 1st step
        int [] newArray= new int[arr.length-1];
        // 2nd step
        int j=0;
        for(int i =0; i<arr.length; i++){
            if(i==indexpos)
            {
                continue;
            }
            newArray[j]= arr[i];
            j++;

        }
        for(int no: newArray){
            System.out.print(no+" ");
        }


    }
}
