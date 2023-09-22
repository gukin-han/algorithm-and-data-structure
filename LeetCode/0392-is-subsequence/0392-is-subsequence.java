class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() > t.length()) return false;
        else if (s.length() == t.length()) return s.equals(t);
        
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
            
        }
        
        return sPointer == s.length();
    }
}