class Solution {
    public boolean find132pattern(int[] nums) {
        
        int second = Integer.MIN_VALUE;
        Stack<Integer> s = new Stack<>();
        
        for (int i = nums.length - 1; i >= 0; i--) {
            
            while (!s.isEmpty() && s.peek() < nums[i]) {
                second = s.pop();
            }
            
            if (second > nums[i]) {
                return true;
            }
            
            
            s.push(nums[i]);
        }
        
        return false;
    }
}