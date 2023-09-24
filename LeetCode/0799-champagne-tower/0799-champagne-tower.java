class Solution {
    Double[][] memo = new Double[101][101];
    int poured;
    public double champagneTower(int poured, int query_row, int query_glass) {
        this.poured = poured;
        if (poured == 0) return 0;
        memo[0][0] = (double) poured;
        dp(query_row, query_glass);
        return memo[query_row][query_glass] >= 1? 1:memo[query_row][query_glass];
    }
    
    private double dp(int row, int col) {
        if (col < 0 || col > row) return 0;
        if (memo[row][col] != null) return memo[row][col];
        if (row == 0 && col == 0) return poured;
        
        return memo[row][col] = Math.max((dp(row  - 1, col) - 1)/2, 0) + Math.max((dp(row  - 1, col - 1) - 1)/2, 0);
    }
}
