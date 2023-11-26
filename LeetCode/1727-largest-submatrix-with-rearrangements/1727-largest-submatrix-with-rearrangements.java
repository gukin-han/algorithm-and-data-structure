class Solution {
    public int largestSubmatrix(int[][] matrix) {
        int result = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == 0 || row == 0) continue;
                matrix[row][col] += matrix[row - 1][col];
            }

            int[] arr = matrix[row].clone();
            Arrays.sort(arr);
            for (int i = arr.length - 1; i >= 0; i--) {
                result = Math.max(result, (arr.length - i) * arr[i]);
            }   
        }
        return result;
    }
}