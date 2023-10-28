class Solution {
    private final static long MOD = 1_000_000_000 + 7;
    public int countVowelPermutation(int n) {
        long[][] aeiou = new long[n + 1][5];
        for (int i = 0; i < 5; i++) {
            aeiou[1][i]++;
        }

        for (int j = 2; j <= n; j++) {
            long a = aeiou[j - 1][0];
            long e = aeiou[j - 1][1];
            long i = aeiou[j - 1][2];
            long o = aeiou[j - 1][3];
            long u = aeiou[j - 1][4];

            aeiou[j][0] = (e + i + u) % MOD;
            aeiou[j][1] = (a + i) % MOD;
            aeiou[j][2] = (e + o) % MOD;
            aeiou[j][3] = i% MOD; 
            aeiou[j][4] = (i + o)% MOD; 
        }

        long result = 0;
        for (int i = 0; i < 5; i++) {
            result += aeiou[n][i];
            result %= MOD;
        }

        return (int) result;
    }
}