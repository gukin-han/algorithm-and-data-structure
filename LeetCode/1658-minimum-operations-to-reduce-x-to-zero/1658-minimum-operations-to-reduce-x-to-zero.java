class Solution {
    public int minOperations(int[] nums, int x) {
        int totalSum = Arrays.stream(nums).sum();
        if (totalSum == x) return nums.length;
        if (totalSum < x) return -1;
        
        int left = 0;
        int right = 0;
        int targetSum = totalSum - x;
        int currentSum = nums[left];
        int maxAnswer = -1;
        
        if (currentSum == targetSum){
                maxAnswer = Math.max(right - left + 1, maxAnswer);
        }
        
        while (right < nums.length && left <= right) {
            
            if (currentSum <= targetSum && right < nums.length - 1) {
                currentSum += nums[++right];
            } else {
                if (left == right && right < nums.length - 1) {
                    currentSum += nums[++right];
                }
                currentSum -= nums[left++];
            }
            
            if (currentSum == targetSum){
                
                maxAnswer = Math.max(right - left + 1, maxAnswer);
            }
            System.out.println(left + " " + right);
        }
        
        return maxAnswer == -1? -1: nums.length - maxAnswer;
    }
}

