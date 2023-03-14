import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue queue = new LinkedList();
        
        for (int i = 0; i < progresses.length; i++) {
            int leftOver = (100 - progresses[i]);
            int element = leftOver/speeds[i];
            if (leftOver % speeds[i] != 0) {
                element++;
            }
            queue.add(element);
        }
        
        List<Integer> list = new ArrayList<>();
        int countUp = 1;
        int current = (int) queue.poll();
        while(!queue.isEmpty()) {
            if ((int) queue.peek() / current == 0 || (int) queue.peek() == current) {
                countUp++;
                queue.poll();
            } else {
                list.add(countUp);
                countUp = 1;
                current = (int) queue.poll();
            }
            
            if(queue.isEmpty()) {
                list.add(countUp);
                break;
            }
        }
    
        
        int[] answer = list.stream()
                .mapToInt(i -> i)
                .toArray();
        
        
        return answer;
    }
}