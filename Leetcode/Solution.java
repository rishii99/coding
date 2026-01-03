import java.util.HashMap;
import java.util.Map;
public class Solution {
    public int longestPalindrome(String s) {
        int oddCount = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            if (map.get(ch) % 2 == 1)
                oddCount++;
            else
                oddCount--;
        }
        if (oddCount > 1)
            return s.length() - oddCount + 1;
        return s.length();
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "abccccdd";
        System.out.println(sol.longestPalindrome(s)); // Expected output: 7
    }
}
