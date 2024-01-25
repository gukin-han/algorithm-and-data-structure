class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();

        int[][] memo = new int[n+1][m+1];
        
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= m; col++) {
                if (text1.charAt(row-1) != text2.charAt(col-1)) {
                    memo[row][col] = Math.max(memo[row-1][col], memo[row][col-1]);
                } else {
                    memo[row][col] = memo[row-1][col-1] + 1;
                }
            }
        }

        return memo[n][m];
    }
}