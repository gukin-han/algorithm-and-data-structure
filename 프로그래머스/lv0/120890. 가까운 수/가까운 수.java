import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        // look for the minimum difference of n and element of array
        // return the corresponding element found
        int minimumGap = Integer.MAX_VALUE;
        int minimumGapIndex = 0;
        Arrays.sort(array);
        
        for (int i = 0; i < array.length; i++) {
            int currentGap = Math.abs(array[i] - n);
            if (currentGap < minimumGap) {
                minimumGapIndex = i;
                minimumGap = currentGap;
            }
        }
        
        int answer = array[minimumGapIndex];    
        return answer;
    }
}