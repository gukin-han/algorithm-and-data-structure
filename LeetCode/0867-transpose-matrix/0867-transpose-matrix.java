class Solution {
    public int[][] transpose(int[][] matrix) {
        int rowSize = matrix.length;
        int colSize = matrix[0].length;
        
        int[][] result = new int[colSize][rowSize];
        for (int i = 0; i < matrix.length;i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        
        return result;
    }
}