class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder answer = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        int balance = 0;
        for (char ch: s.toCharArray()) {
            if(ch == '(') {
                balance++;
                temp.append(ch);
            } else if (ch == ')') {
                balance--;
                temp.append(ch);
            }
            
            if (balance == 0) {
                answer.append(temp.toString().substring(1, temp.length() - 1));
                temp = new StringBuilder();
            }
        }
        
        return answer.toString();
        
    }
}