import java.util.*;

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] memo = new int[n][n];
        for (int i = 0; i < memo.length; i++) {
            for (int j = 0; j < memo[i].length; j++) {
                memo[i][j] = 10_000_000;
            }
        }
        memo[0][0] = triangle.get(0).get(0);
        
        for (int i = 0; i < triangle.size(); i++) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                int step = memo[i][j];
                
                
                if (i + 1 < triangle.size()) {
                    memo[i+1][j] = Math.min(memo[i+1][j], step + triangle.get(i+1).get(j));
                    memo[i+1][j+1] = Math.min(memo[i+1][j+1], step + triangle.get(i+1).get(j+1));
                    System.out.println(memo[i+1][j] + " " + memo[i+1][j+1]);
                }
             }
        }
        int answer = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            answer = Math.min(answer, memo[n-1][i]);
            
        }
        
        return answer;
    }
}