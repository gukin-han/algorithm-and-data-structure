class Solution {
    public String reverseWords(String s) {
        
        StringBuilder answer = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(char c: s.toCharArray()) {
            if (c ==' ') {
                while(!stack.isEmpty()) {
                    answer.append(stack.pop());
                }
                answer.append(c);
            } else {
                stack.push(c);
            }
        }
        
        while(!stack.isEmpty()) {
            answer.append(stack.pop());
        }
        
        return answer.toString();
    }
}