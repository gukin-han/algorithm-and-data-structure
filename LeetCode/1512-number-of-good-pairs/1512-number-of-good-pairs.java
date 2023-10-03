class Solution {
    
    private Integer[] dp = new Integer[101];
    private int[] memo = new int[101];
    
    public int numIdenticalPairs(int[] nums) {
        for (int num: nums) {
            memo[num]++;
        }
        
        int result = 0;
        for (int e: memo) {
            if (e >=2) result += e * (e - 1) / 2;
        }
        return result;
    }
    
    private int combination (int n, int r) {
        if (n == r || r == 0) return 1;
        if (dp[n] != null) return dp[n];
        dp[n] = combination(n-1, r-1) + combination(n-1, r);
        return dp[n];
    }
}