class Solution {
    public int[] shortestToChar(String s, char c) {
        int[] result = new int[s.length()];
        for(int i = 0; i < result.length; i++) {
            result[i] = Integer.MAX_VALUE;
        }
        
        for (int i = 0 ; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                result[i] = 0;
                for(int j = 0; j < s.length(); j++){
                    result[j] = Math.min(result[j], Math.abs(i - j));
                }            
            }
        }
        
        return result;
    }
}