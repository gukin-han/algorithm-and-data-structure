class Solution {
    
    
    private class Vertex implements Comparable<Vertex>{
        Integer from;
        Integer to;
        Integer distance;
        
        private Vertex (int from, int to, int distance) {
            this.from = from;
            this.to = to;
            this.distance = distance;
        }
        
        public int compareTo(Vertex o) {
            return this.distance.compareTo(o.distance);
        }
    }
    
    public int minCostConnectPoints(int[][] points) {
        
        int[] union = new int[points.length];
        for (int i = 0; i < union.length; i++) {
            union[i] = i;
        }
        
        PriorityQueue<Vertex> pq = new PriorityQueue<>();
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points.length; j++) {
                if (i == j) continue;
                int[] a = points[i];
                int[] b = points[j];
                pq.add(new Vertex(i, j, distance(a, b)));
            }
        }
        
        int minCost = 0;
        while (!pq.isEmpty()) {
            Vertex cur = pq.poll();
            int from = cur.from;
            int to = cur.to;
            int distance = cur.distance;
            
            if (union[from] == union[to]) continue;
            int toValue = union[to];
            for (int i = 0; i < union.length;i++) {
                if (toValue != union[i]) continue;
                union[i] = union[from];
            }
            minCost += distance;
        }
        
        return minCost;
    }
   
    
    private int distance(int[] a, int[] b){
        int x1 = a[0];
        int y1 = a[1];
        int x2 = b[0];
        int y2 = b[1];
        
        return Math.abs(x1-x2) + Math.abs(y1-y2);
    }
}