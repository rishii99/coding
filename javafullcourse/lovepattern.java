public class lovepattern {
    public static void main(String[] args) {
        String message = "I LOVE YOU";
        int length = message.length();
        
        for (int i = 0; i < length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(message.charAt(j));
            }
            System.out.println();
        }
    }
}