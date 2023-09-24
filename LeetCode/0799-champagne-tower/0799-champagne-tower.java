// class Solution {
//     private static Double[][] memo = new Double[101][101];
//     public double champagneTower(int poured, int query_row, int query_glass) {
//         if (poured == 0) return 0;
//         memo[0][0] = (double) poured;
//         dp(query_row, query_glass);
        
//         return memo[query_row][query_glass] >= 1? 1:memo[query_row][query_glass];
//     }
    
//     private double dp(int row, int col) {
//         if (col < 0 || col > row) return 0;
//         if (memo[row][col] != null) return memo[row][col];
        
//         if (col == row) { // 맨 우측
//             return memo[row][col] = (dp(row  - 1, col - 1) - 1)/2;
//         } else if (col == 0) { // 맨 좌측
//             return memo[row][col] = (dp(row  - 1, col) - 1)/2;
//         } else  { //중간
//             return memo[row][col] = (dp(row  - 1, col) - 1)/2 + (dp(row  - 1, col - 1) - 1)/2;
//         }
//     }
// }


class Solution {
    int poured;
    Double[][] memo;
    public double champagneTower(int poured, int query_row, int query_glass) {
        this.poured = poured;
        this.memo = new Double[query_row+1][query_glass+1];
        double ans = dp(query_row, query_glass);
        return Math.min(1, ans);
    }
    
    // dp(r, c) means the amount of champagne is poured into cup[r, c]
    double dp(int r, int c) {
        if (c < 0 || c > r) return 0; // Invalid position
        if (r == 0 && c == 0) return poured; // Amount Champaign is poured into the top cup
        if (memo[r][c] != null) return memo[r][c];
        return memo[r][c] = Math.max(dp(r-1, c-1) - 1, 0) / 2 + Math.max(dp(r-1, c) - 1, 0) / 2;
    }
}