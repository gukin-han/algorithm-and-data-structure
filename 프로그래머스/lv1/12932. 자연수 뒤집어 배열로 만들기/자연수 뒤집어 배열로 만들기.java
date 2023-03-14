public class Solution {
    public int[] solution(long n) {
        return getDigit(n);
    }
    
    private int[] getDigitAndReturnAsIntArray (long n) {
        return getDigit(n);
    }
    
    private int[] getDigit (long n) {
        int[] digits = new int[new String("" + n).length()];
        
        int tempInt = 0;
        while (n != 0) {
            digits[tempInt++] = (int) (n%10);
            n /=10;
        }
 
        return digits;
    }
}