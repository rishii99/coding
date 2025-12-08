public class SquareSumTriples {
    public int countTriples(int n) {
        int res = 0;
        for (int u = 2; u * u <= n; u++) {
            for (int v = 1; v < u; v++) {
                if (((u - v) & 1) == 0 || gcd(u, v) != 1) continue;
                
                int c = u * u + v * v;
                if (c > n) continue;
                
                res += (n / c) << 1;
            }
        }
        return res;
    }

    private int gcd(int x, int y) {
        return y == 0 ? x : gcd(y, x % y);
    }

    // For testing in VS Code
    public static void main(String[] args) {
        SquareSumTriples obj = new SquareSumTriples();
        System.out.println(obj.countTriples(10)); // Example test
    }
}
