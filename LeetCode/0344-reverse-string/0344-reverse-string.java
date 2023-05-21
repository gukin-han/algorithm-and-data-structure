class Solution {
    public void reverseString(char[] s) {
        byte temp;
        for(int i = 0; i < s.length/2; i++) {
            temp = (byte) s[s.length - 1 - i];
            s[s.length - 1 - i] = s[i];
            s[i] = (char) temp;
        }
    }
}