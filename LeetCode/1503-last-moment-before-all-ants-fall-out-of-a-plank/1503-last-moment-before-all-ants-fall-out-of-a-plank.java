import java.util.OptionalInt;

class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        int max = findMaxLeft(left);
        int min = findMinRight(right);

        if (max == -1) return n - min;
        if (min == -1) return max;
        else {
            return Math.max(max - 0, n - min);
        }
    }

    int findMaxLeft(int[] left) {
        OptionalInt max = Arrays.stream(left).max();
        if (max.isPresent()) return max.getAsInt();
        else return -1;
    }

    int findMinRight(int[] right) {
        OptionalInt min = Arrays.stream(right).min();
        if (min.isPresent()) return min.getAsInt();
        else return -1;
    }
}