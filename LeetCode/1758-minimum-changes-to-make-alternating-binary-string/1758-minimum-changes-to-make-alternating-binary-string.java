class Solution {
    public int minOperations(String s) {
        int startOne = 0;
        int startZero = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (i % 2 == 0) {
                if (c != '0') startOne++;
                else startZero++;
            } else {
                if (c != '1') startOne++;
                else startZero++;
            }
        }

        return Math.min(startOne, startZero);
    }
}