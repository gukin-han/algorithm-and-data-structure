import java.util.Arrays;

class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        // All char = -1
        answer = new int[s.length()];
        Arrays.fill(answer, -1);
        
        // from the second char, compare it with the nearest one
        for (int i=1; i < s.length(); i++) {
            int dupCount = 0;
            for (int j = i-1; j >= 0 ; j--) {
                // if there is not the same one, count up until we found the nearest or at the front.
                dupCount++;
                if (s.charAt(j) == s.charAt(i)) {
                    answer[i] = dupCount;
                    break;
                }
            }
        }
        return answer;
    }
}