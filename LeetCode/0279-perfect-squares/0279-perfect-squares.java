class Solution {
    private final int MAX = 100000;
    public int numSquares(int n) {

        // populate the array
        int[] dp = new int[n + 1];
        Arrays.fill(dp, MAX);
        for (int i = 1; i <= n; i++) {
            int sq = i * i;
            if (sq > n) break;
            dp[sq] = 1;
        }

        for (int i = 1; i <= n; i++) {
            if (dp[i] != MAX) continue;

            for (int j = 1; j <= i/2; j++) {
                dp[i] = Math.min(dp[i], dp[j] + dp[i - j]);
            }
        }

        return dp[n];
    }
}