class Solution {
    public Integer[] memo;
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        memo = new Integer[n + 1];
        dp(n, cost);
        return memo[n];
    }
    
    public int dp(int x, int[] cost) {
        if (x < 0) return 0;
        if (memo[x] != null) return memo[x];
        if (x >= cost.length) memo[x] = Math.min(dp(x - 1, cost), dp(x - 2, cost)) + 0;
        else memo[x] = Math.min(dp(x - 1, cost), dp(x - 2, cost)) + cost[x];
        
        return memo[x];
    }
}