class Solution {
    public int splitArray(int[] nums, int k) {
        int leftPoint = getMax(nums);
        int rightPoint = getSum(nums);
        int midPointMin = Integer.MAX_VALUE;
        
        while (leftPoint <= rightPoint) {
            int midPoint = (leftPoint + rightPoint)/2;
            int givenK = getSubArrayCount(nums, midPoint);
            System.out.println(givenK);
            if(givenK <= k && midPointMin > midPoint) {
                midPointMin = midPoint;
                rightPoint = midPoint - 1;
            } else leftPoint = midPoint + 1;
        }
        
        return midPointMin;
    }
    
    private int getSubArrayCount(int[] nums, int midPoint) {
        int sum = 0;
        int count = 1;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum > midPoint) {
                count++;
                sum = nums[i];
            }
        }
        return count;
    }
    
    private int getMax(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int num: nums) {
            if (num > max) max = num;
        }
        return max;
    }
    
    private int getSum(int[] nums) {
        int sum = 0;
        for (int num: nums) {
            sum += num;
        }
        return sum;
    }
}