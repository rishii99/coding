package Function;

public class Reverse_Num {
    public static void main(String[] args) {
        reverseNumber(65879 );
    }

    static void reverseNumber(int num) {
        int reversed = 0;
        while (num >0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println("Reversed number is " + reversed);
    }
}

 
