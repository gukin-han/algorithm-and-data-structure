import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int i = 0; i < commands.length; i++) {
            answer[i] = getKthValue(array, commands[i]);
        }
        return answer;
    }
    int getKthValue(int[] arr, int[] command) {
        int i = command[0] - 1;
        int j = command[1] - 1;
        int k = command[2] - 1;
        int kthValue = 0;
        int[] subArray = getSubArray(arr, i, j);
        Arrays.sort(subArray);
        kthValue = subArray[k];
        return kthValue;
    }
    
    int[] getSubArray(int[] arr, int i, int j) {
        int[] subArray = new int[j - i + 1];
        for(int k = i; k <= j; k++) {
            subArray[k-i] = arr[k];
        }
        return subArray;
    }
}