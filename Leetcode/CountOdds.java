public class CountOdds {

    public int countOdds(int low, int high) {
        // If both boundaries are even
        if (low % 2 == 0 && high % 2 == 0) {
            return (high - low) / 2;
        }
        // Otherwise at least one odd exists in range
        return (high - low) / 2 + 1;
    }

    // Main method for VS Code / Terminal execution
    public static void main(String[] args) {
        CountOdds obj = new CountOdds();

        int low = 3;
        int high = 7;

        int result = obj.countOdds(low, high);
        System.out.println("Odd count = " + result);
    }
}
