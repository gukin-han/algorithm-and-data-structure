class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        boolean found = false;
        
        while (start <= end) {
            int mid = (end + start) / 2;
            if (nums[mid] == target) {
                start = mid;
                end = mid;
                found = true;
                break;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            }
        }
        
        if (!found) return new int[]{-1, -1};
        else {
            while (true) {
                if (start - 1 >= 0 && nums[start - 1] == target) start--;
                else break;
            }
            while (true) {
                if (end + 1 < nums.length && nums[end + 1] == target) end++;
                else break;
            }
        }
        
        
        return new int[]{start, end};
    }
}