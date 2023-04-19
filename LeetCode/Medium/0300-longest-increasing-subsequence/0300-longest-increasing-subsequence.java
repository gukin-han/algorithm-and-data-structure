class Solution {
    public int lengthOfLIS(int[] nums) {
        
        int numsLength = nums.length;
        
        if (numsLength == 1) {
            return 1;
        }
        
        int[] memo = new int[numsLength];
        
        memo[0] = 1;
        int result = 0;
        
        for (int i = 1; i < numsLength; i++) {
            int tempMax = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (nums[i] > nums[j] && tempMax < memo[j]) {
                    tempMax = memo[j];
                }
            }
            
            memo[i] = tempMax + 1;
            if (result < memo[i]) {
                result = memo[i];
            }
        }
        
        return result;
    }
}