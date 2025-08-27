import java.util.Scanner;

public class addtwonumber {
    public static void main(String args []) {
        int a ,b, c;
        System.out.println("enter any two number:");
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        c = a+b;
        System.out.println("sum of two number:"+c);
       }
}
 