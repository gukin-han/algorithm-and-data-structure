class Solution {
    public int[] solution(int n) {
        int numCount = n/2;
        if (n % 2 == 1) numCount += 1;
        int[] answer = new int[numCount];
        
        int tempIdx = 0;
        for (int i = 1; i <= n; i += 2) {
            answer[tempIdx++] = i;
        }
        return answer;
    }
}