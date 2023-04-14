class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle == null || triangle.size() == 0) return 0;
        Integer[][] cache = new Integer[triangle.size()][triangle.size()];
        return dfs(0, 0,triangle, cache);
    }
    
    
    int dfs(int row, int pos, List<List<Integer>> triangle, Integer[][] cache){
        //Out of bounds so just return sum previous value must be leaf node
        if (row+1 >= triangle.size()) {
            return triangle.get(row).get(pos); 
        }
        if(cache[row][pos] != null) return cache[row][pos];
        
      cache[row][pos] =  triangle.get(row).get(pos) + Math.min ( dfs(row+1, pos,triangle, cache), dfs(row+1, pos+1,triangle, cache));
        
        return cache[row][pos];
        
    }
}