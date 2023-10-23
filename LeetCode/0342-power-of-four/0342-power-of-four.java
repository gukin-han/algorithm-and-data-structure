class Solution {
    public boolean isPowerOfFour(int n) {
        if (n == 1) return true;
        int x = 1; 
        for (int i = 1; i < 16; i++) {
            x = x << 2;
            if (n == x) return true;
        }
         return false;
        
    }
}