class Solution {
    public boolean isPathCrossing(String path) {
        Set<Pair<Integer, Integer>> visited = new HashSet();
        int x = 0;
        int y = 0;
        visited.add(new Pair(x, y));
        
        for (char c: path.toCharArray()) {
            switch (c) {
                case 'N': x++; break;
                case 'S': x--; break;
                case 'W': y--; break;
                case 'E': y++; break;
                default: break;
            }
            Pair<Integer, Integer> pair = new Pair(x, y);
            if (visited.contains(pair)) return true;
            visited.add(pair);
        }
        
        return false;
    }
    
}