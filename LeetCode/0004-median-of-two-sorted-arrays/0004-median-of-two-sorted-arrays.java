class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalNums = nums1.length + nums2.length;
        int targetIndexToStop = totalNums/2;
        int[] mergedArray = new int[totalNums];
        int currentIndex = 0;
        
        int pointer1 = 0;
        int pointer2 = 0;
        while (currentIndex <= targetIndexToStop) {
            
            if (nums1.length <= pointer1) {
                mergedArray[currentIndex++] = nums2[pointer2++];
                continue;
            } else if (nums2.length <= pointer2) {
                mergedArray[currentIndex++] = nums1[pointer1++];
                continue;
            }
            
            if (nums1[pointer1] < nums2[pointer2]) {
                mergedArray[currentIndex++] = nums1[pointer1++];
            }else if (nums1[pointer1] > nums2[pointer2]) {
                mergedArray[currentIndex++] = nums2[pointer2++];
            }else {
                mergedArray[currentIndex++] = nums1[pointer1++];
                mergedArray[currentIndex++] = nums2[pointer2++];
            }
        }
        
        if (totalNums % 2 == 0) return (mergedArray[targetIndexToStop] + mergedArray[targetIndexToStop - 1]) / (double) 2;
        else return (double) mergedArray[targetIndexToStop];
    }
}