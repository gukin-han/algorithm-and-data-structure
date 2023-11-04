import java.util.OptionalInt;

class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        int result = -1;
        
        if (left.length != 0) {
            Arrays.sort(left);
            result = left[left.length - 1];
        }
        
        if (right.length != 0) {
            Arrays.sort(right);
            result = Math.max(result, n - right[0]);
        }
        
        return result;

    }

}