class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);

        int result = 0;
        for (int i = 0; i < nums.length/2; i++) {
            int last = nums.length - i - 1;
            result = Math.max(result, nums[last] + nums[i]);
        }

        return result;
    }
}