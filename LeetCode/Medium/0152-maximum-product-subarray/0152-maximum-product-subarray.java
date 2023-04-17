class Solution {
    public int maxProduct(int[] nums) {
        int min = 1;
        int max = 1;
        int maxValue = nums[0];
        
        for (int i = 0; i < nums.length; i++) {
            int maxTemp = max;
            max = Math.max(nums[i], Math.max(max * nums[i], min * nums[i]));
            min = Math.min(nums[i], Math.min(maxTemp * nums[i], min * nums[i]));
            maxValue = Math.max(maxValue, max);
        }
        
        return maxValue;
    }
}