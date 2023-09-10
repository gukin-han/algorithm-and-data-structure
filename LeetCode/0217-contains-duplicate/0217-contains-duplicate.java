class Solution {
    public boolean containsDuplicate(int[] nums) {
//         Arrays.sort(nums);
        
//         for(int i = 1; i < nums.length; i++) {
//             if (nums[i-1] == nums[i]) return true;
//         }
        
//         return false;
        
        Map<Integer, Integer> map = new HashMap<>();
        for (int num:nums) {
            if (map.containsKey(num)) return true;
            map.put(num, num);
        }
        return false;
    }
}