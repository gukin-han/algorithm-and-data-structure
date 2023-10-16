class Solution {
    public List<Integer> getRow(int rowIndex) {
        int[][] dp = new int[rowIndex + 1][rowIndex + 1];
        for (int i = 0; i <= rowIndex ; i++) {
            for (int col = 0; col <= rowIndex; col++) {
                if (col == 0) dp[i][col] = 1;
                else if (col == rowIndex) dp[i][col] = 1;
                else if (i >= 1 && col >= 1) {
                    dp[i][col] = dp[i - 1][col -1] + dp[i - 1][col];
                }
            }
        }
        
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            answer.add(dp[rowIndex][i]);
        }
        
        return answer;
    }
}