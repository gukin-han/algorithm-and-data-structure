class Solution {
    public int[] solution(int[][] score) {
        // get the average value and add in the average Array with the same index of given score
        // create boolean array of visited flag to check if it's visited before
        // loop through the average array to find max value
        // except for the index visited before
        // if it find, check if there is the same value in the visited index
        // if there is then give the same rank 
        // if it's not then ++rank and give the rank.
        int[] answer = new int[score.length];
        double[] averageScore = new double[score.length];
        boolean[] visited = new boolean[score.length];

        for (int i = 0; i < score.length; i++) {
            averageScore[i] = getAverage(score[i]); 
        }
        
        int duplicateCheck = 0;
        int rank = 0;
        int visitedCount = 0;
        while (visitedCount < score.length) {
            double maxValue = 0;
            int maxValueIndex = 0;

            for (int i = 0; i < averageScore.length; i++) { // find maxValue that is not in visited before.
                if(averageScore[i] > maxValue && !visited[i]) {
                    maxValue = averageScore[i];
                    maxValueIndex = i;
                }
            }
            
            boolean Found = false;
            for (int i = 0; i < averageScore.length; i++) { // compare this maxValue with the value 
                if(averageScore[i] == maxValue && visited[i]) { // in the visited index
                    answer[maxValueIndex] = rank;
                    Found = true;  
                    duplicateCheck++;
                    break;
                }
            }
            if (!Found) {
                rank += 1 + duplicateCheck;
                answer[maxValueIndex] = rank;
                duplicateCheck = 0;
            }
            visited[maxValueIndex] = true;
            visitedCount++;
        }
        
        return answer;
    }
    
    double getAverage (int[] scores) {
        int sum = 0;
        double num = scores.length;
        for (int score: scores) {
            sum += score;
        }
        
        return sum/num;
    }
}