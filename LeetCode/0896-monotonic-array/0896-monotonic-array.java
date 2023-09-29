class Solution {
    public boolean isMonotonic(int[] nums) {
        if (nums.length == 1) return true;
        
        boolean isIncreasing = true;
        boolean isDecreasing = true;
        
        for (int i = 1; i < nums.length; i++) {
            int diff = nums[i] - nums[i-1];
            if (diff > 0) isDecreasing = false;
            if (diff < 0) isIncreasing = false;
        }
        
        return (isDecreasing || isIncreasing);
    }
}