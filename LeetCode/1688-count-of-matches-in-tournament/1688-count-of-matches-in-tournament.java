class Solution {
    public int numberOfMatches(int n) {
        return getMatches(n, 0);
    }

    public int getMatches(int curMatches, int totalMatches) {
        if (curMatches == 1) return totalMatches;
        int nextMatches = curMatches / 2;
        totalMatches += nextMatches;
        if (curMatches % 2 == 0) {
            return getMatches(nextMatches, totalMatches);
        } else {
            return getMatches(nextMatches + 1, totalMatches);
        }
    }
}