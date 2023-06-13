import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<Process> q = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            q.add(new Process(i, priorities[i]));
        }
        int answer = 0;
        while (!q.isEmpty()) {
            Process temp = q.peek();
            boolean isTempTurn = true;
            for (int i = 0; i < q.size(); i++) {
                if (temp.priority < q.peek().priority) {
                    isTempTurn = false;
                    break;
                } else {
                    q.add(q.poll());
                }
            }
            if (isTempTurn) {
                answer++;
                q.poll();
                if (temp.id == location) return answer;
            }
        }
        
        
        return answer;
    }
}

class Process {
    public int id;
    public int priority;
    
    public Process(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}