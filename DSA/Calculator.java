import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {
     Scanner Scanner = new Scanner(System.in);
     System.out.println("enter a : ");
     int a = Scanner . nextInt(); 
     System.out.println("enter b :");
     int b = Scanner.nextInt() ;
     System.out.println("enter operator");
     char operator = Scanner.next().charAt(0);
      
     switch(operator){
      case '+' : System.out.println(a+b);
      break;
      case '-': System.out.println(a-b);
      break;
      case '*' : System.out.println(a*b);
      break;
      case '/' :System.out.println(a/b);
      break;
      case '%' : System.out.println(a%b); 
      break;
      default : System.out.println("advanced calculator");  
     }






    }
}

