package Function;

public class CountDigit {
    public static void main(String[] args) {
        countDigit(91234);
        countDigitViaLog(265);
        
    }
    public static void  countDigit(int num){
        if(num==0){
            System.out.println("Number of digits: 1");
            return;
        }



        int counter = 0;
        while (num > 0) {
            num = num / 10;
            counter++;
        }
        System.out.println("Number of digits: " + counter);
    }
    public static void countDigitViaLog(int num){
        if(num==0){
            System.out.println("Number of digits: 1");
            return;
        }
        int digits = (int)(Math.log10(num)) + 1;
        System.out.println("Number of digits: " + digits);
    }
}
