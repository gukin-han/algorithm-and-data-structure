class Solution {
    public int findSpecialInteger(int[] arr) {
        int n = arr.length;
        int expected = n / 4;
        if (n >= 4) {
            for (int i = 0; i < n - expected; i++) {
                if (arr[i] == arr[i+expected]) return arr[i];
            }
        }

    return arr[0];
    }
}