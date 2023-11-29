public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int temp = n;
        if (n < 0) {
            temp = ~n;
        }
        int result = 0;
        
        while (temp != 0) {
            result += temp % 2;
            temp /= 2;
        }

        if (n < 0) {
            return 32 - result;
        }

        return result;
    }
}