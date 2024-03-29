class Solution {
    public int numWays(int steps, int arrLen) {
        int maxPos = Math.min(steps,arrLen);  
        long[][] dp = new long[steps+1][maxPos+1]; 
        dp[0][0]=1; 
        for(int i = 1; i <= steps; i++) { 
            for(int j = 0; j < maxPos; j++) {
                dp[i][j] = (dp[i-1][j] + dp[i-1][j+1] + (j>0?dp[i-1][j-1]:0))%1000000007;
            }
        }
        
        return (int)dp[steps][0];        
    }
}