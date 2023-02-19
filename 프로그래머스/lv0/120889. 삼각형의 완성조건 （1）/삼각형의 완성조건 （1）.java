import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        // sort ascending numerical order
        // it requires that sides[2] < sides[0] + sides[1] -> true -> 1, otherwise it returns 2
        int answer = 0;
        
        Arrays.sort(sides);
        if (sides[2] < (sides[0] + sides[1])) {
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;
    }
}