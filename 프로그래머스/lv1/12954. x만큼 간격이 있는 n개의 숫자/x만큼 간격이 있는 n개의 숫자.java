//review?-no-try-1-2023-02-23-thu-native
class Solution {
    public long[] solution(int x, int n) {
        // create Array with n elements
        // for loop from 0 to n
        // every time, answer[i] = (i+1) * x
        long[] answer = new long[n];
        for (int i = 0; i < n; i++) {
            answer[i] = (i+1) * (long) x;
        }
        return answer;
    }
}