class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int m = -1;
        int g = -1;
        int p = -1;
        
        for (int j = garbage.length - 1; j >= 0; j--) {
            String gb = garbage[j];
            for (char c: gb.toCharArray()) {
                if (c == 'M') {
                    m = Math.max(m, j);
                }
                if (c == 'G') {
                    g = Math.max(g, j);
                }
                if (c == 'P') {
                    p = Math.max(p, j);
                }
            }
            if (m != -1 && g != -1 && p != -1) break;
        }
        
        int result = 0; 
        for (int i = 0; i < m; i++) {
            result += travel[i];
        }
        
        for (int i = 0; i < g; i++) {
            result += travel[i];
        }
        
        for (int i = 0; i < p; i++) {
            result += travel[i];
        }
        
        for (String gb: garbage) {
            result += gb.length();
        }
        
        return result;
    }
}