class Solution {
    public int maxScore(String s) {
        int zeros = 0;
        int ones = 0;
        
        for (char c: s.toCharArray()) {
            if (c == '0') zeros++;
            else ones++;
        }
        
        int result = 0;
        int left = 0;
        int right = ones;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') left++;
            else right--;
            result = Math.max(result, left + right);
        }
        
        return result;
    }
}