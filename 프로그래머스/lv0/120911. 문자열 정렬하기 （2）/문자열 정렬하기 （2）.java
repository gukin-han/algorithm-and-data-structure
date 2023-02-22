import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        // convert to lowerCase
        // use string.charAt() -> unicode int[]
        // sort arrays
        // int[] -> char concatenate
        String answer = "";
        answer = my_string.toLowerCase();
        
        int[] my_stringToInt = new int[answer.length()];
        for (int i = 0; i < answer.length(); i++) {
            my_stringToInt[i] = (int) answer.charAt(i);
        }
        
        Arrays.sort(my_stringToInt);
        answer = "";
        for (int i = 0; i < my_stringToInt.length; i++) {
            answer += (char) my_stringToInt[i];
        }
        return answer;
    }
}