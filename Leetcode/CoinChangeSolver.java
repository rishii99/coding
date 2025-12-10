import java.util.*;
public class CoinChangeSolver {
    public static int coinChange(int[] coins, int amount) {
        int[] memo = new int[amount + 1];
        return dfs(coins, amount, memo);
    }
    private static int dfs(int[] coins, int rem, int[] memo) {
        if (rem == 0) return 0;          // exact amount found
        if (rem < 0) return -1;          // invalid path
        if (memo[rem] != 0) return memo[rem];  // already computed
        int min = Integer.MAX_VALUE;
        for (int c : coins) {
            int res = dfs(coins, rem - c, memo);
            if (res >= 0 && res < min) {
                min = res + 1;           // take coin c
            }
        }
        memo[rem] = (min == Integer.MAX_VALUE) ? -1 : min;
        return memo[rem];
    }
    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 11;
        int result = coinChange(coins, amount);
        System.out.println("Minimum coins required = " + result);
    }
}
