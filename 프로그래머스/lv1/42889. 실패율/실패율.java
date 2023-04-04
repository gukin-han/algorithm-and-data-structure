class Solution {
    public int[] solution(int N, int[] stages) {
        
        int[] numPlayerIsOnStage = new int[N + 1];
        int[] numPlayerBeenOnStage = new int[N + 1];
        
        for (int i = 1; i <= N; i++) {
            int cnt = 0;
            for (int num: stages) {
                if (num == i) { // currently is on Stage
                    cnt++;
                }
            }
            numPlayerIsOnStage[i] = cnt;
        }
        
        for (int num: stages) {          
                for (int j = 1; j <= num; j++) {
                    if(j == N + 1) {
                        continue;
                    }
                    numPlayerBeenOnStage[j]++; // count up players have been on
                } 
            }
        
        double[] failureRate = new double[N + 1];
        for (int i = 1; i <= N; i++) {
            if (numPlayerBeenOnStage[i] == 0) {
                failureRate[i] = 0;
            } else {
                failureRate[i] = 
                    numPlayerIsOnStage[i] / (double) numPlayerBeenOnStage[i];
            }
            
        }
        boolean[] visited = new boolean[N];
        int[] answer = new int[N];
        int cnt = 0;
        for (int i = 0; i < visited.length; i++) { // get Nth max
            double maxValue = -1;
            int maxValueIdx = -1;
            for (int j = 1; j <= N ; j++) {
                if (maxValue < failureRate[j] && !visited[j - 1]) {
                    maxValue = failureRate[j];
                    maxValueIdx = j - 1;
                }
            }
            visited[maxValueIdx] = true;
            answer[cnt++] = maxValueIdx + 1;
        }

        return answer;
    }
}