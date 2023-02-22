//try-1-2023-02-22-wed-java original
class Solution {
    public int solution(int n, int t) {
        int answer = n;
        for (int i = 0; i < t; i++) {
            answer = answer * 2;
        }
        return answer;
    }
}