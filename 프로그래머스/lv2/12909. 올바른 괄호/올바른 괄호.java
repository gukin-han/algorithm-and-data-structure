class Solution {
    boolean solution(String s) {
        int balance = 0;
        for (char ch: s.toCharArray()) {
            switch(ch) {
                case '(': balance++; break;
                case ')': balance--; break;
            }
            if (balance < 0) {
                return false;
            }
        }
        if (balance == 0) {
            return true;
        }

        return false;
    }
}