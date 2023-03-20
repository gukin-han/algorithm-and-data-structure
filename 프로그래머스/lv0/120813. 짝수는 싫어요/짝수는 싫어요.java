class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        int arraySize = -1;
        
        if (n % 2 == 0) {
            arraySize = n/2;
        }else {
                arraySize = n/2 + 1;
        }
        
        answer = new int [arraySize];
        int startNum = 1;
        for (int i = 0; i < arraySize; i++) {
            answer[i] = startNum;
            startNum += 2;
        }
                
        return answer;
    }
}