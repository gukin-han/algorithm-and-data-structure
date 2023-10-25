class Solution {
    public int kthGrammar(int n, int k) {
        n = n - 1;
        k = k - 1;
        
        return recursive(n, k);
    }
    
    private int recursive(int n, int k) {
        if (n == 0 && k == 0) return 0;
        
        int prevK = k / 2;
        int siblings = k % 2;
        int prevValue = recursive(n - 1, prevK);
        if (prevValue == 0) {
            if (siblings == 0) {
                return 0;
            } else {
                return 1;
            }
        } else {
            if (siblings == 0) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}