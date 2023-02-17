class Solution {
    public int solution(String t, String p) {
        // get length of String p as int
        int lengthOfStringP = p.length();
        long pInt = Long.parseLong(p);
        int intElementsNum = t.length() - (lengthOfStringP - 1);
        int answer = 0;
        
        // based on the length of string p, get substring of String t of Integer array
        long[] subDigits = new long[intElementsNum];
        for (int i=0; i < intElementsNum; i++) {
            subDigits[i] = Long.parseLong(t.substring(i,i + lengthOfStringP));
        }
        
        // based on the returned boolean value, count up how many substring can be bigger than given number
        for (long digit: subDigits) {
            if (isSmallerThan(digit, pInt)) {
                answer++;
            }
        }
        return answer;
    }
        
    
    // create method to compare two numbers and return boolean
    public boolean isSmallerThan(long num1, long num2){
        if (num1 <= num2) {
            return true;
        } else {
            return false;
        }
    }
}