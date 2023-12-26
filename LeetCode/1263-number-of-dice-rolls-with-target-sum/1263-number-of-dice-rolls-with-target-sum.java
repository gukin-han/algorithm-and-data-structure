class Solution {
    private final int MOD = 1000000007;
    public int numRollsToTarget(int n, int k, int target) {
        long[][] dp = new long[n + 1][target+1];
        dp[0][0] = 1;

        for (int row = 1; row < n + 1; row++) {
            for (int col = 1; col < target + 1; col++) {
                for (int i = 1; i <= k; i++) {
                    if (col - i >= 0) {
                        dp[row][col] += dp[row-1][col - i];
                    }
                    dp[row][col] %= MOD;
                }
            }
        }

        return (int) dp[n][target];
    }
}