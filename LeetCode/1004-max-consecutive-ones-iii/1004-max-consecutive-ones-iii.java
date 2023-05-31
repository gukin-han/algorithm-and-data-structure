class Solution {
    public int longestOnes(int[] nums, int k) {
        int oneCount = 0;
        int zeroCount = 0;
        int oneMaxCount = 0;
        
        int leftP = 0;
        int rightP = 0;
        
        if (nums[leftP] == 0) zeroCount++;
        else oneCount++;
        oneMaxCount = Math.max(oneMaxCount, oneCount);
        
        while (rightP < nums.length) {
            if (zeroCount <= k) {
                rightP++;
                if (rightP == nums.length) break;
                if (nums[rightP] == 0) {
                    zeroCount++;
                } else {
                    oneCount++;
                    oneMaxCount = Math.max(oneMaxCount, oneCount);
                }
            } else {
                if(nums[leftP] == 0) {
                    zeroCount--;
                    leftP++;
                } else {
                    oneCount--;
                    leftP++;
                }
            }
        }
        return oneMaxCount + zeroCount;
    }
}