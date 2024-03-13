class Solution {
    public int pivotInteger(int n) {
        if (n == 1) return 1;
        int leftP = 1;
        int rightP = n;
        int leftSum = 1;
        int rightSum = n;

        while (rightP - leftP >= 1) {
            if (rightP - leftP == 2) {
                if (leftSum == rightSum) return leftP + 1;
                else return -1;
            }
            
            if (leftSum <= rightSum) {
                leftP++;
                leftSum += leftP;
                continue;
            } else {
                rightP--;
                rightSum += rightP;
                continue;
            }
        }

        return -1;
    }
}