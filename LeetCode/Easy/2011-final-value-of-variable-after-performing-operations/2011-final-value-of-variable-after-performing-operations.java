class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int ret = 0;
        for (String str: operations) {
            switch (str) {
                case "--X": ret--; break;
                case "X--": ret--; break;
                case "++X": ret++; break;
                case "X++": ret++; break;
            }
        }
        return ret;
    }
}