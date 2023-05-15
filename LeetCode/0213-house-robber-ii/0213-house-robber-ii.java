class Solution {
    public int rob(int[] nums) {
        int[] dpCaseOne = new int[nums.length];
        int[] dpCaseTwo = new int[nums.length];
        
        if (nums.length == 1) {
            return nums[0];
        } else if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        
        dpCaseOne[0] = nums[0];
        dpCaseOne[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length - 1; i++) {
            dpCaseOne[i] = Math.max(dpCaseOne[i-2] + nums[i], dpCaseOne[i-1]);
        }
        
        dpCaseTwo[1] = nums[1];
        dpCaseTwo[2] = Math.max(nums[1], nums[2]);
        for (int i = 3; i < nums.length; i++) {
            dpCaseTwo[i] = Math.max(dpCaseTwo[i-2] + nums[i], dpCaseTwo[i-1]);
        }
        
        return Math.max(dpCaseOne[nums.length - 2], dpCaseTwo[nums.length - 1]);
        
    }
}