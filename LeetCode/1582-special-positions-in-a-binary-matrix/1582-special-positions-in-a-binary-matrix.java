class Solution {
    public int numSpecial(int[][] mat) {
        int result = 0;
        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[0].length; col++) {
                if (mat[row][col] == 1 && isSpecialPosition(mat, row, col)) result++; 
            }
        }
        
        return result;
        
    }
    private boolean isSpecialPosition (int[][] mat, int cRow, int cCol) {
        int rowSize = mat.length;
        int colSize = mat[0].length;
        
        for (int row = 0; row < rowSize; row++) {
            if (row != cRow && mat[row][cCol] == 1) return false;
        }
        
        for (int col = 0; col < colSize; col++) {
            if (col != cCol && mat[cRow][col] == 1) return false;
        }
        
        return true;
    }
}