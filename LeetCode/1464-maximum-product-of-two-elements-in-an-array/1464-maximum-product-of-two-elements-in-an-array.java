class Solution {
    public int maxProduct(int[] nums) {
        // Arrays.sort(nums);
        // int n = nums.length - 1;
        // return (nums[n] - 1) * (nums[n-1] - 1);
        
        int max = 0;
        int prevMax = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= max) {
                prevMax = max;
                max = nums[i];
            } else if (nums[i] >= prevMax && nums[i] <= max) {
                prevMax = nums[i];
            }
        }
        
        return (max - 1) * (prevMax - 1);
    }
}