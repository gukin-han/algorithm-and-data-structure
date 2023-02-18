import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        
        String onlyDigit = my_string.replaceAll("[abcdefghijklmnopqrstuvwxz]", "");
        
        int[] answer = new int[onlyDigit.length()];
        for (int i = 0; i < onlyDigit.length(); i++) {
            answer[i] = (int) onlyDigit.charAt(i) - 48;
        }
        
        Arrays.sort(answer);
        return answer;
    }
}