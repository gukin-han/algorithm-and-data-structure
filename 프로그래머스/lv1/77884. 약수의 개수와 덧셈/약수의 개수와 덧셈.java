//try-1-2023-02-23-thu-native
class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; i++) {
            if (isOdd(getNumOfDivisor(i))) {
                answer -= i;
            } else {
                answer += i;
            }
        }
        return answer;
    }
    
    boolean isOdd (int num) {
        if (num % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }
    
    int getNumOfDivisor (int num) {
        int result = 1;
        for (int i = 1; i <= num/2; i++) {
            if (num % i == 0) {
                result++;
            }
        }
        return result;
    }
    
}