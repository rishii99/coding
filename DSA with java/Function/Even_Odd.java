package Function;

public class Even_Odd {
    public static void main(String[] args) {
        findEvenOdd(10);
    }

    static void findEvenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
    }
}
