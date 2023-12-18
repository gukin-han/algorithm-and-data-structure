class Solution {
    public int maxProductDifference(int[] nums) {
        int max = 0;
        int maxSecond = 0;
        int min = 10001;
        int minSecond = 10001;

        for (int num: nums) {
            if (max <= num) {
                maxSecond = max;
                max = num;
            } else if (maxSecond <= num){
                maxSecond = num;
            }

            if (min >= num) {
                minSecond = min;
                min = num;
            } else if (minSecond >= num){
                minSecond = num;
            }
        }

        

        return (max * maxSecond) - (min * minSecond);
    }
}