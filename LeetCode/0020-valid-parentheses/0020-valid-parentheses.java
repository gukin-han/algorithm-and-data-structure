class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        
        for (int i = 1; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (stack.peek() == '(' && ch == ')') {
                stack.pop();
            } else if (stack.peek() == '[' && ch == ']') {
                stack.pop();
            } else if (stack.peek() == '{' && ch == '}') {
                stack.pop();
            } else {
                stack.push(ch); 
                continue;
            }
            
            if (stack.isEmpty() && i + 1 < s.length()) {
                i += 1;
                stack.push(s.charAt(i));
            }
            
        }
        System.out.println(stack.size());
        if (stack.size() == 0) return true;
        return false;
    }
}