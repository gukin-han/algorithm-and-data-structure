class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> q = new LinkedList<>();
        for(int i = 1; i <= n; i++) {
            q.add(i);
        }
        
        while (q.size() != 1) {
            removeOne(q, k);
        }
        
        return q.poll();
    }
    
    public Queue<Integer> removeOne(Queue<Integer> q, int k) {
        for(int i = 0; i < k - 1; i++) {
            q.add(q.poll());
        }
        q.remove();
        return q;
    }
}