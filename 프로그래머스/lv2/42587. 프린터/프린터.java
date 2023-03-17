import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue queue = new LinkedList();
        
        int answer = 0;
        for (int priority: priorities) {
            queue.add(priority);
        }
        
        while (!queue.isEmpty()) {
            if (isHighestPriority(queue,(int) queue.peek())) {
                queue.poll();
                location--;
                answer++;
                if (location < 0) {
                    break;
                }
            } else {
                queue.add(queue.poll());
                if (location == 0) {
                    location = queue.size() - 1;
                } else {
                    location--;
                }
            }
        }
        
        return answer;
    }
    
    boolean isHighestPriority(Queue queue, int currentPriority) {
        for (int i = currentPriority + 1; i <= 9; i++) {
            if (queue.contains(i)) {
                return false;
            }
        }
        return true;
    }
}