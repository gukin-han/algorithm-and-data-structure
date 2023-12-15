class Solution {
    private final int MOD = 1234567;
    public int solution(int n) {
        
        int[] memo = new int[n + 1];
        memo[0] = 0;
        memo[1] = 1;
        for(int i = 2; i <= n; i++) {
            memo[i] = (memo[i - 1] + memo[i - 2]) % MOD;
        }
        
        return memo[n];
        
    }
    
    private int fib(int n) {
        if (n == 0) return 0;
        else if (n == 1) return 1;
        
        return fib(n - 1) % MOD + fib (n - 2) % MOD;
    }
}