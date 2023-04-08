class Solution {
    public int solution(int n) {
        int[] primes = new int[n + 1];
        primes[0] = -1;
        primes[1] = -1;
        
        for (int i = 2; i*i <= n; i++) {
            for (int j = i * i; j <= n; j += i) {
                primes[j] = -1;
            }
        }
        
        int answer = 0;
        for (int i = 0; i < primes.length; i++) {
            if (primes[i] == 0) {
                answer++;
            }
        }
        
        return answer;
    }
}