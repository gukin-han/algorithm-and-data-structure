class Solution {
    public int solution(int n) {
        int target = getNumOfOnes(n++);
        
        while (target != getNumOfOnes(n)) {
            n++;
        }
        return n;
    }
    
    public int getNumOfOnes(int n) {
        int numOfOnes = 0;
        while (n != 0) {
            if (n % 2 == 1) numOfOnes++;
            n /= 2;
        }
        return numOfOnes;
    }
}