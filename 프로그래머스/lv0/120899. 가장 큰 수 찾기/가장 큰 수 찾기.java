class Solution {
    public int[] solution(int[] array) {
        int greatestNumber = -1;
        int greatestNumberIndex = -1;
        
        int[] answer = new int[2];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > greatestNumber) {
                greatestNumber = array[i];
                greatestNumberIndex = i;
            }
        }
        
        answer[0] = greatestNumber;
        answer[1] = greatestNumberIndex;
        
        return answer;
    }
}