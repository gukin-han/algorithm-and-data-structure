class Solution {
    public int[] shortestToChar(String s, char c) {
        int[] result = new int[s.length()];
        int distance = 100_000;
        for (int i = 0 ; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                distance = 0;
                result[i] = distance;
            } else {
                result[i] = ++distance;
            }
        }
        
        distance = 100_000;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == c) {
                distance = 0;
                result[i] = distance;
            } else {
                result[i] = Math.min(++distance, result[i]);
            }
        }
        
        return result;
    }
}