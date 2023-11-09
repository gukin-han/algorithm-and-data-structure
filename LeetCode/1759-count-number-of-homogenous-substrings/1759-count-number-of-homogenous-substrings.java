class Solution {
    public int countHomogenous(String s) {
        Stack<Character> stack = new Stack<>();
        long result = 0;
        long mod = 1_000_000_007;
        for (char cur: s.toCharArray()) {
            if (stack.isEmpty() || stack.peek() == cur) stack.push(cur);
            else {
                int count = stack.size();
                result = (getSum(count) + result) % mod;
                stack.clear();
                stack.push(cur);
            }
        }
        int count = stack.size();
        result = (getSum(count) + result) % mod;
        
        return (int) result;
    }
    
    private long getSum(int count) {
        return (long) count * (count + 1) / 2;
    }
}