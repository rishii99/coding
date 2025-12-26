class Tribonacci{
    public int tribonacci(int n) {
        if (n == 0) return 0;
        int[]memo= new int[n+1];
        for(int i =0;i<=n; i++)memo[i]=-1;
        return solve(n,memo);
    }
    private int solve(int n, int[]memo){
        if (n==0) return 0;
        if (n==1 || n==2) return 1;
        if (memo[n] != -1) return memo[n];
        memo[n] = solve(n-1,memo)+solve(n-2,memo)+solve(n-3,memo);
        return memo[n];
    } 
    public static void main(String[] args) {
        Tribonacci obj = new Tribonacci();
        System.out.println(obj.tribonacci(4));  // example: tribonacci(4)  
    }
}  
     