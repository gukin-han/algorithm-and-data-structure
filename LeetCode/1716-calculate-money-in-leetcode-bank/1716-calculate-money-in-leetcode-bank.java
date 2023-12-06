class Solution {
    public int totalMoney(int n) {
        int[] days = new int[1001];
        for (int i = 1; i <= 7; i++ ) {
            days[i] = i;
        }

        if (n > 7) {
            for (int i = 8; i <= n; i++) {
                days[i] = days[i - 7] + 1;
            }
        }

        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += days[i];
        }

        return result;
    }
}