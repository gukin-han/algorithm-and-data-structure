class Solution {
    public int solution(int n) {
        int answer = 0;
        
        // for loop through given n from 1 (1 -> n)
        // create method to find the number of divisor of given number.
            // loop through from 1 to itself by checking the result of modulo 0 -> divisor
        // check the number of divisor is greater than 3 that is composite numbers
        // count up from 0 how many composite numbers can be found
        answer = getNumOfCompositeNumUpTo(n);
        
        return answer;
    }
    
    public int getNumOfCompositeNumUpTo(int num) {
        int numOfCompositeNum = 0;
        for (int i = 1; i <= num; i++) {
            if(isCompositeNumber(i)) {
                numOfCompositeNum++;
            }
        }
        return numOfCompositeNum;
    }
    
    public boolean isCompositeNumber(int num) {
        int numOfDivisor = getNumOfDivisor(num);
        if(numOfDivisor >= 3) {
            return true;
        } else {
            return false;
        }
    }
    
    public int getNumOfDivisor(int num) {
        int numOfDivisor = 0;
        for (int i = 1; i <= num ; i++) {
            if(num % i == 0) {
                numOfDivisor++;
            }
        }
        return numOfDivisor;
    }
}