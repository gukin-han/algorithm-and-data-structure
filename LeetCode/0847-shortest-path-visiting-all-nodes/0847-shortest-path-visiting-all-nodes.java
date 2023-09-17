class Solution {
    public int shortestPathLength(int[][] graph) {
        int n = graph.length;
        int allVisited = (1 << n) - 1;
        
        Queue<int[]> q = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        
        for (int i = 0; i < n ; i++) {
            int curMask = 1 << i;
            int curNode = i;
            int curCnt = 0;
            
            q.offer(new int[]{curMask, curNode, curCnt});
            visited.add((1 << i) * 16 + i);
        }
        
        while(!q.isEmpty()) {
            int[] cur = q.poll();
            
            if (cur[0] == allVisited) return cur[2];
            
            for (int neighbor: graph[cur[1]]) {
                int newMask =  cur[0] | (1 << neighbor);
                int hashValue = newMask * 16 + neighbor;
                
                if (visited.contains(hashValue)) continue;
                visited.add(hashValue);
                
                int newNode = neighbor;
                int newCnt = cur[2] + 1;
                q.offer(new int[]{newMask, newNode, newCnt});
            }
        }
        return -1;
    }
}