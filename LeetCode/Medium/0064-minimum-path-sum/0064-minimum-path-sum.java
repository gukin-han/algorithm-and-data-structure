import java.util.*;

class Solution {
    int[][] dp;
    public int minPathSum(int[][] grid) {
        dp = new int[grid.length][grid[0].length];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }
    
        return minSum(grid, grid.length - 1, grid[0].length - 1);
    }
    
    int minSum(int[][] grid, int row, int col) {
        if (row == 0 && col == 0) return grid[0][0];
        if (row < 0 || col < 0) return Integer.MAX_VALUE;
        if (dp[row][col] != -1) return dp[row][col];
        return dp[row][col] = Math.min(minSum(grid, row, col - 1), minSum(grid, row - 1, col)) + grid[row][col];
    }
}