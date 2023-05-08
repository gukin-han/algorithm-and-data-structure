import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds){
        
        if(progresses.length == 1) {
            return new int[]{1};
        }
        
        int[] requiredDays = new int[progresses.length];
    
        for (int i = 0; i < progresses.length; i++) {
            int requiredDay = (int) Math.ceil((double)(100 - progresses[i]) / speeds[i]);
            requiredDays[i] = requiredDay;
        }
        
        List<Integer> numOfDeployments = new ArrayList<>();
        int maxRequiredDay = requiredDays[0];
        int maxNumOfDeployments = 1;
        for (int i = 1; i < progresses.length; i++) {
            if (maxRequiredDay >= requiredDays[i]) {
                maxNumOfDeployments++;
            } else {
                numOfDeployments.add(maxNumOfDeployments);
                maxRequiredDay = requiredDays[i];
                maxNumOfDeployments = 1;

            }
            
            if (i + 1 >= progresses.length) {
                numOfDeployments.add(maxNumOfDeployments);
            }
        }
        
        int[] answer = new int[numOfDeployments.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = numOfDeployments.get(i);
        }
        
        return answer;
    }
}