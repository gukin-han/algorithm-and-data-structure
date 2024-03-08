class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] counts = new int[101];
        int max = 0;
        for (int num: nums) {
            counts[num]++;
            max = Math.max(counts[num], max);
        }

        int result = 0;
        for (int count: counts) {
            if (count == max) result += max;
        }

        return result;
    }
}