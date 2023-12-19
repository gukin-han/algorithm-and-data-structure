class Solution {
    private int[] drow = new int[]{-1, -1, -1, 0, 0 ,0, 1, 1, 1};
    private int[] dcol = new int[]{-1, 0, 1, -1, 0, 1, -1, 0, 1};
    
    public int[][] imageSmoother(int[][] img) {
        int m = img.length;
        int n = img[0].length;
        
        int[][] ret = new int[m][n];
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                
                int count = 0;
                int sum = 0;
                
                for (int i = 0; i < 9; i++) {
                    int newRow = row + drow[i];
                    int newCol = col + dcol[i];
                    
                    if (newRow >= 0 && newRow < m && newCol >= 0 && newCol < n) {
                        count++;
                        sum += img[newRow][newCol];
                    }
                }
                
                ret[row][col] = (sum / count);
                
            }
        }
        
        return ret;
    }
}