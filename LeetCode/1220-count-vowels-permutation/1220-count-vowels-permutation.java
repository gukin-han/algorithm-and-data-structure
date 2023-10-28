class Solution {
    private final static long MOD = 1_000_000_000 + 7;
    public int countVowelPermutation(int n) {
        long[][] aeiou = new long[n + 1][5];
        for (int i = 0; i < 5; i++) {
            aeiou[1][i]++;
        }

        for (int j = 2; j <= n; j++) {
            // ended with a
            long a = aeiou[j - 1][0] % MOD;
            long e = aeiou[j - 1][1] % MOD;
            long i = aeiou[j - 1][2] % MOD;
            long o = aeiou[j - 1][3] % MOD;
            long u = aeiou[j - 1][4] % MOD;

            aeiou[j][0] = (e + i + u); // ended with a
            aeiou[j][1] = (a + i); // ended with e
            aeiou[j][2] = (e + o); // ended with i
            aeiou[j][3] = i; // ended with o
            aeiou[j][4] = (i + o); // ended with u
        }

        long result = 0;
        for (int i = 0; i < 5; i++) {
            result += aeiou[n][i];
            result %= MOD;
        }

        return (int) result;
    }
}