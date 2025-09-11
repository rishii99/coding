package pattern;
import java.util.Scanner;
public class FloydTriangle {
    
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a =1;
       // int col = sc.nextInt();
        for(int i =1 ;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(a++ +"  ");
            }
            System.out.println();
        }
    }  
}

