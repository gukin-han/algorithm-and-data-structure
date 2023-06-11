class Solution {
    public int solution(int[] num_list) {
        int oddMax = 0;
        int evenMax = 0;
        
        for (int i = 1; i < num_list.length; i += 2) {
            oddMax += num_list[i];
        }
        
        for (int i = 0; i < num_list.length; i += 2) {
            evenMax += num_list[i];
        }
        
        return Math.max(evenMax, oddMax);
    }
}