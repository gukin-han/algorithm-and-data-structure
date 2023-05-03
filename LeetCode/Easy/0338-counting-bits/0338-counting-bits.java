class Solution {
    public int[] countBits(int n) {        
        int[] dp = new int[n+1];
        if (n == 0) return dp;
        
        int offset = 1;
        for (int i = 1; i < dp.length; i++) {
            if (i == offset * 2) offset *=2;
            dp[i] = dp[i - offset] + 1;
        }
        return dp;
    }
}