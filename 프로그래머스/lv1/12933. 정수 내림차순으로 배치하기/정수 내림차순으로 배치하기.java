import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long answer = 0;
        char[] charArrayInt = ("" + n).toCharArray();
        Arrays.sort(charArrayInt);
        
        String temp = "";
        for (int i = charArrayInt.length - 1; i >= 0; i--) {
            temp += charArrayInt[i];
        }
        
        answer = Long.parseLong(temp);
        return answer;
    }
}