class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] answer = new int[nums.length];
        int odd = nums.length - 1;
        int even = 0;
        
        for (int num: nums) {
            if (num % 2 == 0) answer[even++] = num;
            else answer[odd--] = num;
        }
        
        return answer;
    }
}