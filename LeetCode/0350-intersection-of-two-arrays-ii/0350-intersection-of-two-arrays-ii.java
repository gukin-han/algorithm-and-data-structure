import java.util.*;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int p1 = 0, p2 = 0;
        int n = nums1.length, m = nums2.length;
        List<Integer> list = new ArrayList<>();
        while (n > p1 && m > p2) {
            int num1 = nums1[p1], num2 = nums2[p2];
            if (num1 == num2) {
                list.add(num1);
                p1++;
                p2++;
            } else if (num1 > num2) {
                p2++;
            } else if (num1 < num2) {
                p1++;
            }
        }
        
        int[] ret = new int[list.size()];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = list.get(i);
        }
        return ret;
    }
}