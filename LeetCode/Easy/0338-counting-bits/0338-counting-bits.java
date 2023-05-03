class Solution {
    public int[] countBits(int n) {        
        int[] dp = new int[n+1];
        if (n == 0) return dp;
        
        dp[1] = 1;
        
        for (int i = 2; i < dp.length; i++) {
            if (i % 2 == 0) dp[i] = dp[i/2];
            else dp[i] = dp[i/2] + 1;
        }
        return dp;
    }
}