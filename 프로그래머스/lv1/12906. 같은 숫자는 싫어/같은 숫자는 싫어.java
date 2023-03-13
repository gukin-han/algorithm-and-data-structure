import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        
        Stack stack = new Stack();
        
        for (int x: arr) {
            if (stack.isEmpty()) stack.push(x);
            else if ((int) stack.peek() != x) stack.push(x);
        }
                
        int sizeOfStack = stack.size();
        answer = new int[sizeOfStack];
        for (int i = sizeOfStack - 1; i >= 0; i--) {
            answer[i] = (int) stack.pop();
        }

        return answer;
    }
}