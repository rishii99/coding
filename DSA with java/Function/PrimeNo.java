package Function;

public class PrimeNo {
    
    public static void main(String[] args) {
        int counter = 2;
        int num = 29;

        int sqroot = (int)Math.sqrt(num);
        while(counter<=sqroot){
            if(num%counter ==0){
                System.out.println("Is prime: false");
                return;
            }
            counter++;
        }
        System.out.println(num + " is prime: true");
    }

}
