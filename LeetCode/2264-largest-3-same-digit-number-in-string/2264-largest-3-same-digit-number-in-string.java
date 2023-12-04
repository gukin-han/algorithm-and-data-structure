class Solution {
    public String largestGoodInteger(String num) {
        String result = "";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            
            if (stack.isEmpty() || stack.peek() == c) {
                stack.push(c);
                System.out.println(c);
            } else if (!stack.isEmpty() && stack.peek() != c) {
                stack.clear();
                stack.push(c);
                continue;
            }
            
            if (stack.size() == 3) {
                String temp = getThreeSameDigits(stack);
                System.out.println(temp);
                stack.clear();
                if(result == "" || Integer.parseInt(temp) > Integer.parseInt(result)) {
                    result = temp;
                    continue;
                }
            }
        }
        
        return result;
    }
    
    private String getThreeSameDigits (Stack<Character> stack) {
        StringBuilder sb = new StringBuilder();
        int n = stack.size();
        for (int i = 0; i < n; i++) {
            sb.append(stack.pop());
        }
        
        return sb.toString();
    }
}