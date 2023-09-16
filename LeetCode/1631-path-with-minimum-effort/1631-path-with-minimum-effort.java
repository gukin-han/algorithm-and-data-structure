class Solution {
    
    static int[] dRow = new int[]{-1, 0, 1, 0};
    static int[] dCol = new int[]{0, 1, 0, -1};

    public int minimumEffortPath(int[][] heights) {
        int rows = heights.length;
        int cols = heights[0].length;
        int[][] memo = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            Arrays.fill(memo[i], Integer.MAX_VALUE);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[2], b[2]));
        pq.offer(new int[]{0, 0, 0});
        memo[0][0] = 0;

        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int row = current[0];
            int col = current[1];
            int effort = current[2];

            if (row == rows - 1 && col == cols - 1) {
                return effort;
            }

            for (int i = 0; i < 4; i++) {
                int newRow = row + dRow[i];
                int newCol = col + dCol[i];

                if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols) {
                    int newEffort = Math.max(effort, Math.abs(heights[newRow][newCol] - heights[row][col]));
                    if (newEffort < memo[newRow][newCol]) {
                        pq.offer(new int[]{newRow, newCol, newEffort});
                        memo[newRow][newCol] = newEffort;
                    }
                }
            }
        }

        return 0; // This point should never be reached
    }
}
