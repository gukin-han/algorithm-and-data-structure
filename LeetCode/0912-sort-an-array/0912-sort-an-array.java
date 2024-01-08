class Solution {
    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);

        return nums;
    }

    private void quickSort(int[] nums, int lowest, int highest) {
        if (lowest < highest) {
            
            int mid = (highest + lowest) / 2;
            swap(nums, mid, highest);

            int left = lowest - 1;
            for (int right = lowest; right < highest; right++) {
                if (nums[highest] > nums[right]) {
                    swap(nums, ++left, right);
                }
            }
            swap(nums, ++left, highest);
            quickSort(nums, lowest, left - 1);
            quickSort(nums, left + 1, highest);
        }
    }

    private void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}