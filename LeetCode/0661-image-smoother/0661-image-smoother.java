class Solution {
    private int m;
    private int n;
    private int[][] img;
    public int[][] imageSmoother(int[][] img) {
        m = img.length;
        n = img[0].length;
        this.img = img;
        
        int[][] answer = new int[m][n];
        
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                answer[row][col] = getSmoothed(row, col);
            }
        }
        
        return answer;
        
    }
    
    private int getSmoothed(int row, int col) {
        
        int count = 0;
        int sum = 0;
        
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                int newRow = row + i;
                int newCol = col + j;
                if (newRow < m && newRow >= 0 && newCol < n && newCol >= 0) {
                    count++;
                    sum += img[newRow][newCol];
                }
            }
        }
        
        return sum / count;
    }
}