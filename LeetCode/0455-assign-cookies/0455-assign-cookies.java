class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int givenCount = 0;
        int gP = 0;
        int sP = 0;
        while (sP <= s.length - 1 && gP <= g.length - 1) {
            if (s[sP] >= g[gP]) {
                givenCount++;
                gP++;
                sP++;
            } else {
                sP++;
            }
        }
        return givenCount;
    }
}