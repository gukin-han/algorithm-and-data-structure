class Solution {
    public int numberOfBeams(String[] bank) {
        int cur = 0;
        int prev = -1;
        int result = 0;
        for (String row: bank) {
            if (prev == -1) {
                prev = getOneCount(row);
                continue;
            }
            cur = getOneCount(row);
            if (cur != 0) {
                result += cur * prev;
                prev = cur;
            }
        }
        return result;
    }

    public int getOneCount(String row) {
        int result = 0;
        for (char c: row.toCharArray()) {
            if (c == '1') result++;
        }
        return result;
    }
}