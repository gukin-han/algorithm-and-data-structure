import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        
        int first = getFirstPersonScore(answers);
        int second = getSecondPersonScore(answers);
        int third = getThirdPersonScore(answers);
        
        List<Integer> list = new ArrayList();
        int max = Math.max(first, Math.max(second,third));
        
        if (max == first) {
            list.add(1);
        }
        if (max == second) {
            list.add(2);
        }
        if (max == third) {
            list.add(3);
        }
        int cnt = 0;
        int[] answer = new int[list.size()];
        for(int item: list) {
            answer[cnt++] = item;
        }
        return answer;
    }
    
    int getFirstPersonScore(int[] answers) {
        int[] answerSheet = new int[answers.length];
        int[] answerPattern = new int[]{1,2,3,4,5};
        for (int i = 0; i < answerSheet.length; i++) {
            answerSheet[i] = answerPattern[i % answerPattern.length];
        }
        
        int score = 0;
        for (int i = 0; i < answerSheet.length; i++) {
            if (answerSheet[i] == answers[i]) {
                score++;
            }
        }
        
        return score;
    }
    
    int getSecondPersonScore(int[] answers) {
        int[] answerSheet = new int[answers.length];
        int[] answerPattern = new int[]{2,1,2,3,2,4,2,5};
        for (int i = 0; i < answerSheet.length; i++) {
            answerSheet[i] = answerPattern[i % answerPattern.length];
        }
        
        int score = 0;
        for (int i = 0; i < answerSheet.length; i++) {
            if (answerSheet[i] == answers[i]) {
                score++;
            }
        }
        
        return score;
    }
    
        int getThirdPersonScore(int[] answers) {
        int[] answerSheet = new int[answers.length];
        int[] answerPattern = new int[]{3,3,1,1,2,2,4,4,5,5};
        for (int i = 0; i < answerSheet.length; i++) {
            answerSheet[i] = answerPattern[i % answerPattern.length];
        }
        
        int score = 0;
        for (int i = 0; i < answerSheet.length; i++) {
            if (answerSheet[i] == answers[i]) {
                score++;
            }
        }
        
        return score;
    }
}