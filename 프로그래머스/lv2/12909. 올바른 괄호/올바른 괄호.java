class Solution {
    boolean solution(String s) {
        int balance = 0;
        for (char ch: s.toCharArray()) {
            if (ch == '(') balance++;
            else balance--;
            
            if (balance < 0) return false;
        }
        if (balance != 0) return false;
        return true;
    }
}