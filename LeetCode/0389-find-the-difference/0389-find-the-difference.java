class Solution {
    public char findTheDifference(String s, String t) {
        int[] charMemo = new int[(int) 'z' + 1];
        for (char c: s.toCharArray()) {
            charMemo[(int) c]++;
        }
        
        for (char c: t.toCharArray()) {
            charMemo[(int) c]--;
            if (charMemo[(int) c] < 0) {
                return c;
            }
        }
        
        return 'q';
    }
}