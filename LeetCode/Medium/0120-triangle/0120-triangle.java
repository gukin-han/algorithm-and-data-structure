class Solution {
    static Integer[][] cache;
    public int minimumTotal(List<List<Integer>> triangle) {
        int rowSize = triangle.size();
        cache = new Integer[rowSize][rowSize];
        
        return dfs(triangle, 0, 0);
    }
    
    int dfs(List<List<Integer>> triangle, int row, int col) {
        if (cache[row][col] != null) return cache[row][col];
        
        if (row + 1 >= triangle.size()) return triangle.get(row).get(col);
        
        return cache[row][col] = triangle.get(row).get(col) + Math.min(dfs(triangle, row + 1, col), dfs(triangle, row + 1, col + 1));
    }
}