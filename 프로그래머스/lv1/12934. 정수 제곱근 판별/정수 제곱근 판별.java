class Solution {
    // for loop from 1 to x (only if x^2 less than or equal n)
    // if x^2 == n, then return x + 1;
    // it it's not return -1;
    public long solution(long n) {
        long answer = 0;
        while (answer * answer < n) {
            answer++;
            if (answer * answer == n) {
                return (answer + 1) * (answer + 1);
            }
        }
        answer = -1;
        return answer;
    }
}