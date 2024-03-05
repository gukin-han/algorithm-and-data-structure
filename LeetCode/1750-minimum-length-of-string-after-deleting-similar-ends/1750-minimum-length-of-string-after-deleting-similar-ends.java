class Solution {
    public int minimumLength(String s) {
        if (s.length() == 1) return 1;
        int leftP = 0;
        int rightP = s.length() - 1;
        char common = ' ';
        while (leftP <= rightP) {
            if (s.charAt(leftP) == s.charAt(rightP)) {
                common = s.charAt(leftP);
                leftP++;
                rightP--;
            } else {
                if (common == s.charAt(leftP)) {
                    leftP++;
                    continue;
                }
                else if (common == s.charAt(rightP)) {
                    rightP--;
                    continue;
                } else {
                    break;
                }
            }
        }

        if (leftP > rightP) {
            if (s.charAt(leftP) == common && s.charAt(rightP) == common) return 0;
            else return 1;
        }

        return rightP - leftP + 1;

    }
}