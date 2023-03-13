import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] chArray = s.toCharArray();
        Arrays.sort(chArray);
        
        for (int i = chArray.length - 1; i >= 0; i--) {
            answer += chArray[i];    
        }
        
        return answer;
    }
}