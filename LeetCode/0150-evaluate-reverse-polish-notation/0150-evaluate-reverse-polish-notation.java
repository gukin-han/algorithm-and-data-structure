class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int answer = 0;
        
        
        for (String token: tokens) {

            if (!token.equals("+") && !token.equals("-") 
                &&!token.equals("*") &&!token.equals("/")) {
                stack.push(Integer.parseInt(token));
            } else {
                int right = stack.pop();
                int left = stack.pop();
                if (token.equals("+")) {
                    stack.push(left+right);
                } else if (token.equals("-")) {
                    stack.push(left-right);
                } else if (token.equals("*")) {
                    stack.push(left*right);
                } else {
                    stack.push(left/right);
                }
            }
        }
        
        return stack.pop();
    }
}