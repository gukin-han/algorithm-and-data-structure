import java.util.*;

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        
        int[] charCountingArray = new int[(int) ('z' - 'a' + 1)];
        
        for (char ch: s.toCharArray()) {
            charCountingArray[(int) (ch - 'a')]++;
        }
        for (char ch: t.toCharArray()) {
            charCountingArray[(int) (ch - 'a')]--;
            if (charCountingArray[(int) (ch - 'a')] < 0) return false;
        }
        
        return true;
    }
}