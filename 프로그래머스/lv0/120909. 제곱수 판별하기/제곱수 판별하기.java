//try-1-2023-02-22-wed-java original
class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 2; i <= n/2; i++) {
            answer = 2;
            if ((i*i) == n) {
                answer = 1;
                break;
            }
        }
        return answer;
    }
}