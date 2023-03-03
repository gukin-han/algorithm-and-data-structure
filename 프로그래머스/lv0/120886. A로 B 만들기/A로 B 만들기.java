import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        int answer = 1;

        // convert both String toCharArray
        // sort those arrays in the ascending order 
        // compare onebyone
        char[] beforeCharArray = before.toCharArray();
        char[] afterCharArray = after.toCharArray();
        
        Arrays.sort(beforeCharArray);
        Arrays.sort(afterCharArray);
        
        for (int i = 0; i < beforeCharArray.length; i++) {
            if (beforeCharArray[i] != afterCharArray[i]) {
                answer = 0;
            }
        }

        return answer;
    }
}