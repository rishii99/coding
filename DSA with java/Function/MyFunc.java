package Function;

public class MyFunc {
    public static void main(String[] args) {
        MyFunc mf = new MyFunc();
        //mf.calculateArea(5, 6);
        
        int num1= 10;
        int num2= 3;
        mf.swap(num1,num2);
        System.out.println("num1: "+num2);
    }
    public void swap (int val1, int val2){
      val1= val2;
      int temp = val1;
      val2 =temp;  
    }
    public int calculateArea(int length , int width){
        System.out.println(length*width);
        int area = length * width;
        return area;

    }
    
}
