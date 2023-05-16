class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] charCount = new int[(int) ('z' - 'a' + 1)];

        for (Character ch: s.toCharArray()) {
            charCount[(int) (ch - 'a')]++;
        }
        
        for (Character ch: t.toCharArray()) {
            charCount[(int) (ch - 'a')]--;
            if (charCount[(int) (ch - 'a')] < 0) return false;
        }
        
        return true;
    }
}