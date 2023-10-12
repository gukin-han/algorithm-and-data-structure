/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        
        int lengthOfMountain = mountainArr.length();
        
        // find the top of mountain
        int left = 0;
        int right = lengthOfMountain - 1;  
        int topIndex = -1;
        while (left < right) {
            int mid = (left + right) / 2;
            int midLeftValue = mountainArr.get(mid - 1);
            int midRightValue = mountainArr.get(mid + 1);
            int midValue = mountainArr.get(mid);
            
            if (midLeftValue <= midValue && midValue >= midRightValue) {
                topIndex = mid;
                break;
            } else if (midLeftValue <= midValue && midValue <= midRightValue) {
                left = mid + 1;
            } else if (midLeftValue >= midValue && midValue >= midRightValue) {
                right = mid;
            }
            
            if (left == right) topIndex = left;
        }
        
        System.out.println("topAt" + topIndex);
        
        if (target == mountainArr.get(topIndex)) return topIndex;
        
        // find the targetValue on the left side
        left = 0;
        right = topIndex;
        while (left < right) {
            int mid = (left + right) / 2;
            int midValue = mountainArr.get(mid);
            
            if (midValue < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        
        if (mountainArr.get(right) == target) return right;
        
        // find the targetValue on the right side
        left = topIndex;
        right = lengthOfMountain - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            int midValue = mountainArr.get(mid);
            
            
            if (midValue > target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        System.out.print(mountainArr.get(left) + " ");
        
        if (mountainArr.get(right) == target) return right;
        else return -1;
    }
    
}