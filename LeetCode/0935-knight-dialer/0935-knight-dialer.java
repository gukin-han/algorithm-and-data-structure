class Solution {
    private final int MOD = (int) 1e9 + 7;
    public int knightDialer(int n) {
        long[][] count = new long[n + 1][10];
        Arrays.fill(count[1], 1);
        
        for (int i = 2; i <= n; i++) {
            long[] prev = count[i - 1];
            long[] cur = count[i];
            cur[0] = (prev[4] + prev[6]) % MOD;
            cur[1] = (prev[6] + prev[8]) % MOD;
            cur[2] = (prev[7] + prev[9]) % MOD;
            cur[3] = (prev[4] + prev[8]) % MOD;
            cur[4] = ((prev[0] + prev[3]) % MOD + prev[9]) % MOD;
            cur[6] = ((prev[0] + prev[1]) % MOD + prev[7]) % MOD;
            cur[7] = (prev[2] + prev[6]) % MOD;
            cur[8] = (prev[1] + prev[3]) % MOD;
            cur[9] = (prev[2] + prev[4]) % MOD;
        }
        
        long result = 0; 
        for (int i = 0 ; i <= 9; i++) {
            result = (result + count[n][i]) % MOD;
        }
        return (int) result;
    }
}