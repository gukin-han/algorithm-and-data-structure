class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        
        int[] onesRow = new int[m];
        int[] onesCol = new int[n];
        int[] zerosRow = new int[m];
        int[] zerosCol = new int[n];
        
        int[][] diff = new int[m][n];
        
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                int target = grid[row][col];
                if (target == 1) onesRow[row]++;
                else if (target == 0) zerosRow[row]++;
            }
        }
        
        for (int col = 0; col < n; col++) {
            for (int row = 0; row < m; row++) {
                int target = grid[row][col];
                if (target == 1) onesCol[col]++;
                else if (target == 0) zerosCol[col]++;
            }
        }
        
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                diff[row][col] = onesRow[row] + onesCol[col] - zerosRow[row] - zerosCol[col];
            }
        }
        
        return diff;
    }
}