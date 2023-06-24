class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int pCount = 0;
        int yCount = 0;
        s = s.toLowerCase();
        for (int i = 0; i < s.length() ; i++) {
            char ch = s.charAt(i);
            if (ch == 'y') yCount++;
            else if (ch == 'p') pCount++;
        }

        return yCount == pCount;
    }
}