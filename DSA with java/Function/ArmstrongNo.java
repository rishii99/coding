package Function;

public class ArmstrongNo {
    public static void main(String[] args) {
        int num = 121;
        
        int res = 0;
        int copy=num;
        while(num>0){
            int digit = num%10;
            res = res+(int)Math.pow(digit,3);
            num/=10;
        }
        System.out.println("Armstrong number check: " + (res == 153));
    }
}


