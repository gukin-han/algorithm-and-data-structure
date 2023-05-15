class Solution {
    public int rob(int[] nums) {
        
        int[] dp = new int[nums.length];
        
        if (nums.length == 1) {
            return nums[0];
        } else if (nums.length >= 2) {
        
            dp[0] = nums[0];
            dp[1] = Math.max(nums[0], nums[1]);

            for (int i = 2; i < nums.length; i++) {
                int caseOfRobCurrentHouse = dp[i - 2] + nums[i];
                int caseOfSkipCurrentHouse = dp[i - 1];
                dp[i] = Math.max(caseOfRobCurrentHouse, caseOfSkipCurrentHouse);
            }
        }
        return dp[nums.length - 1];
    }
}