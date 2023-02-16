import java.math.BigInteger;

class Solution {
    public BigInteger solution(int balls, int share) {
        BigInteger mFac = fac(balls - share).multiply(fac(share));
        return fac(balls).divide(mFac);
    }
    
    public BigInteger fac(int n) {
        BigInteger result = BigInteger.valueOf(1);
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
    
}