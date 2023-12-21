class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points, (o1, o2) -> {
            return o1[0] - o2[0];
        });

        int result = 0;
        for (int i = 1; i < points.length; i++) {
            result = Math.max(points[i][0]-points[i-1][0], result);
        }

        return result;
    }
}