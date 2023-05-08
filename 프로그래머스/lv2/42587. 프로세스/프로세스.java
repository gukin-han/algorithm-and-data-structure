import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> order = new LinkedList<>();
        
        for (int i = 0; i < priorities.length; i++) {
            order.add(i);
            q.add(priorities[i]);
        }
        
        int ret = 0;
        
        while (!q.isEmpty()) {
            int maxP = q.peek();
            boolean foundMax = false;
            for (int i = 0; i < q.size(); i++) {
                q.add(q.poll());
                order.add(order.poll());
                
                if (maxP < q.peek()) {
                    foundMax = true;
                    break;
                }                
            }
            
            if (!foundMax) {
                ret++;
                if (order.peek() == location) {
                    return ret;
                }
                q.poll();
                order.poll();
            }
        }
        
        return order.peek();
    }
}