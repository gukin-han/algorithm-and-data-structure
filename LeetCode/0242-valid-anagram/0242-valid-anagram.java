class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] charCount = new int[(int) ('z' - 'a' + 1)];

        for (char ch: s.toCharArray()) {
            charCount[(int) (ch - 'a')]++;
        }
        
        for (char ch: t.toCharArray()) {
            charCount[(int) (ch - 'a')]--;
            if (charCount[(int) (ch - 'a')] < 0) return false;
        }
        
        return true;
    }
}