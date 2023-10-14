class Solution {
    private int[][] memo;
    private int[] cost;
    private int[] time;
    
    public int paintWalls(int[] cost, int[] time) {
        this.cost = cost;
        this.time = time;
        int n = cost.length;
        memo = new int[n + 1][n + 1];
        
        // Initialize memo array with -1
        for(int i = 0; i < n + 1; i++) {
            for(int j = 0; j < n + 1; j++) {
                memo[i][j] = -1;
            }
        }
        
        return dp(n-1, n);
    }
    
    private int dp(int index, int walls) {
        if (walls <= 0) return 0;
        if (index < 0) return (int) 1e9;
        if (memo[index][walls] != -1) return memo[index][walls];
        
        int notTake = 0 + dp(index - 1, walls);
        int take = cost[index] + dp(index - 1, walls - time[index] - 1);
        return memo[index][walls] = Math.min(notTake, take);
    }
}