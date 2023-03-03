class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        answer = isHarshadNum(x);
        return answer;
    }
    
    boolean isHarshadNum (int x) {
        if (x % getDigitSum (x) == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    int getDigitSum (int x) {
        int digitSum = 0;
        int share = x;
        while (share != 0) {
            digitSum += share % 10;
            share = share / 10;
        }
        
        return digitSum;
    }
}