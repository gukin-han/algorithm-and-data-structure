class Solution {
    public String removeOuterParentheses(String s) {
        String answer = "";
        String temp = "";
        int balance = 0;
        for (char ch: s.toCharArray()) {
            if(ch == '(') {
                balance++;
                temp += ch;
            } else if (ch == ')') {
                balance--;
                temp += ch;
            }
            
            if (balance == 0) {
                answer += temp.substring(1, temp.length() - 1);
                temp = "";
            }
        }
        
        return answer;
        
    }
}