import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        int arraySize = getArraySize(arr, divisor);
        if (arraySize == 0) return new int[]{-1};
        int[] answer = new int[arraySize];
                
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                answer[index++] = arr[i];
            }
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
    
    int getArraySize (int[] arr, int divisor) {
        int countUp = 0;
        for (int x: arr) {
            if (x % divisor == 0) {
                countUp++;
            }
        }
        
        return countUp;
    }
}