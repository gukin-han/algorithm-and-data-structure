class Solution {
    public int findDuplicate(int[] nums) {
        
        int[] count = new int[nums.length + 1];
        
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            count[current]++;
            if (count[current] >= 2) return current;
        }
        
        return -1;
    }
}