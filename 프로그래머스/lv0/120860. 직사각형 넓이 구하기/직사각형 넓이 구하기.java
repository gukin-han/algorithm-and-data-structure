class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int maxWidth = 0;
        int maxDepth = 0;
        
        for (int i = 0; i <= dots[i].length - 1; i++) {
            for (int j = i + 1; j <= dots[j].length; j++) {
                int tempWidth = Math.abs(dots[i][0] - dots[j][0]);
                int tempDepth = Math.abs(dots[i][1] - dots[j][1]);
                if (tempWidth > maxWidth) {
                    maxWidth = tempWidth;
                }
                
                if (tempDepth > maxDepth) {
                    maxDepth = tempDepth;
                }
            }
        }
        
        answer = maxDepth * maxWidth;
        return answer;
    }
}