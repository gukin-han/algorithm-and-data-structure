class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m > 0 && n == 0) return;
        else if (m == 0 && n > 0) {
            for (int i = 0 ; i < nums2.length; i++) {
                nums1[i] = nums2[i];
            }
            return;
        }
        
        int nums1P = 0; // pointer
        int nums2P = 0;
        int endIdx = m - 1;
        while (m > 0 || n > 0) 
            if (m > 0 && n == 0) return;
            else if (m == 0 && n > 0) {
                nums1[nums1P++] = nums2[nums2P++];
                n--;
            }else {
                if (nums1[nums1P] <= nums2[nums2P]) {
                    nums1P++;
                    m--;
                }else {
                    nums1 = rightShift(nums1, nums1P, endIdx);
                    endIdx++;
                    nums1[nums1P++] = nums2[nums2P++];
                    n--;
                }
            }
        }
    
    private int[] rightShift(int[] nums, int startIdx, int endIdx) {
        for (int i = endIdx; i >= startIdx; i--) {
            nums[i+1] = nums[i];
        }
        return nums;
    }
}