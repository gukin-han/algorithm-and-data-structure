class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int result = 0;
        for (int i = 0; i < points.length - 1; i++) {
            int[] from = points[i];
            int[] to = points[i + 1];
            result += getDistance(from, to);
        }
        return result;
    }
    
    private int getDistance(int[] from, int[] to) {
        int dRow = Math.abs(from[0] - to[0]);
        int dCol = Math.abs(from[1] - to[1]);
        int distance = 0;
        while(dRow > 0 || dCol > 0) {
            if (dRow > 0 && dCol > 0) {
                int diff = Math.min(dRow, dCol);
                dRow -= diff;
                dCol -= diff;
                distance += diff;
            } else if (dRow > 0 && dCol == 0) {
                distance += dRow;
                dRow = 0;
            } else if (dRow == 0 && dCol > 0) {
                distance += dCol;
                dCol = 0;
            }
        }
        
        return distance;
    }
}