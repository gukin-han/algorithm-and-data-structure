class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        
        int[] count = new int[(int) 'z' + 1];
        
        for (char c: s.toCharArray()) {
            count[(int) c]++;
        }
        
        for (char c: t.toCharArray()) {
            int index = (int) c;
            count[index]--;
            if (count[index] < 0) return false; 
        }
        
        return true;
    }
}