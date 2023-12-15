class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n - 1; i++) {
            for (int j = i + 1; j <= n; j++) {
                int sum = getSum(i, j);
                if (sum == n) answer++;
                if (sum >= n) break;
            }
        }
        return answer + 1;
    }
    
    private int getSum(int from, int to) {
        int n = to - from + 1;
        return (n * (from + to) / 2);
    }
}