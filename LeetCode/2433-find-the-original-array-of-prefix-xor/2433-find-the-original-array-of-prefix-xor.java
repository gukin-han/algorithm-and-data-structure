class Solution {
    public int[] findArray(int[] pref) {
        int[] dp = new int[pref.length];
        dp[0] = pref[0];
        if(pref.length == 1) return dp;
        
        for (int i = 1; i < dp.length; i++) {
            int prev = pref[i - 1];
            dp[i]= pref[i] ^ prev;
  
        }
        
        
        return dp;
    }
}