class Solution {
    public int[] solution(int[][] score) {
        // populate average score
        double[] averageScores = new double[score.length];
        for (int i = 0; i < score.length; i++) {
            averageScores[i] = ((double)score[i][0] + score[i][1])/2;
        }
        int[] answer = new int[score.length];
        for (int i = 0; i < answer.length; i++) {
            int rank = 1;
            for (int j = 0; j < answer.length; j++) {
                if (averageScores[i] < averageScores[j]) rank++;
            }
            answer[i] = rank;
        }
        
        
        return answer;
    }
}