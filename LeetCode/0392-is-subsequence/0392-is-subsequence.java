class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() > t.length()) return false;
        else if (s.length() == t.length()) return s.equals(t);
        else if (s.length() == 0) return true;
        
        int sPointer = 0;
        int tPointer = 0;
        
        while (sPointer < s.length() && tPointer < t.length()) {
            char sChar = s.charAt(sPointer);
            char tChar = t.charAt(tPointer);
            
            if (sChar == tChar) {
                sPointer++;
                tPointer++;
            } else {
                tPointer++;
            }
            
            if (s.length() - sPointer > t.length() - tPointer) break;
            
        }
        
        return sPointer == s.length();
        
//         int[][] dp = new int[s.length() + 1][t.length() + 1];
//         for (int i = 1; i < s.length() + 1; i++) {
//             char sChar = s.charAt(i - 1);
//             for (int j = 1; j < t.length() + 1; j++) {
//                 char tChar = t.charAt(j - 1);
                
//                 if (tChar == sChar) dp[i][j] = dp[i- 1][j - 1] + 1;
//                 else dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                
//                 if (dp[i][j] == s.length()) return true;
//             }
//         }
        
//         return false;
        
    }
}