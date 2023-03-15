class Solution {
    public boolean solution(String s) {
        return (isFourOrSix(s) && isAllDigit(s));
    }
    
    boolean isFourOrSix (String s) {
        return (s.matches("[0-9]{4}") || s.matches("[0-9]{6}"));
    }
    
    boolean isAllDigit (String s) {
        char[] c = s.toCharArray();
        for (char ch:c) {
            int temp = (int) (ch - '0');
            if (!(temp >= 0 && temp <= 9)) {
                return false;
            }
        }
        return true;
    }
}