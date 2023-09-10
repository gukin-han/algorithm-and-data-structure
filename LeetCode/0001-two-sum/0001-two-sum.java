class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int num: nums) {
            map.put(num, count++);
        }
        
        for (int i= 0; i < nums.length; i++) {
            int foundIdx = map.getOrDefault(target - nums[i], -1);
            if ( foundIdx != -1 && foundIdx != i) {
                return new int[]{i, map.get(target - nums[i])};
            }
        }
        return null;
    }
}