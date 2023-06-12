class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        int answer = 0;
        
        
        for (String token: tokens) {

            if (!token.equals("+") && !token.equals("-") 
                &&!token.equals("*") &&!token.equals("/")) {
                stack.push(token);
            } else {
                int right = Integer.parseInt(stack.pop());
                int left = Integer.parseInt(stack.pop());
                if (token.equals("+")) {
                    stack.push(String.valueOf(left+right));
                } else if (token.equals("-")) {
                    stack.push(String.valueOf(left-right));
                } else if (token.equals("*")) {
                    stack.push(String.valueOf(left*right));
                } else {
                    stack.push(String.valueOf(left/right));
                }
            }
        }
        
        return Integer.parseInt(stack.pop());
    }
}