import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        
        if (!isDivisiable(arr, divisor)) {
            answer = new int[]{-1};
           return answer;
        }
        
        int arraySize = getArraySize(arr, divisor);
        
        answer = new int[arraySize];
        int temp = 0;
        
        for (int item: arr) {
            if (item % divisor == 0) {
                answer[temp++] = item;
            }
        }
        
        Arrays.sort(answer);
        
        
        return answer;
    }
    
    boolean isDivisiable (int[] arr, int divisor) {
        for (int item: arr) {
            if (item % divisor == 0) {
                return true;
            }
        }
        
        return false;
    }
    
    int getArraySize (int[] arr, int divisor) {
        int cnt = 0;
        for (int item: arr) {
            if (item % divisor == 0) {
                cnt++;
            }
        }
        
        return cnt;
    }
}