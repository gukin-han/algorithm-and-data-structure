import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        int size = my_string.length();
        String[] answer = new String[size];
        for (int i = 0; i < size; i++){
            answer[i] = my_string.substring(i, size);
        }
        Arrays.sort(answer);
        return answer;
    }
}