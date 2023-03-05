class Solution {
    public int solution(int n) {
        // multiple of 3 -> 3, 6, 9, 12, 15
        // num % 3 == 0 -> multiple of 3
        // number of 3 -> 3, 13, 23, 30, 31, 32
        // 
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            answer++;
            while(is3X(answer)) {
                answer++;
            }
        }
        
        return answer;
    }
    
    boolean is3X (int decimalNum) {
        if (decimalNum % 3 == 0) {
            return true;
        }
        
        while (decimalNum != 0) {
            if ((decimalNum % 10) == 3) {
                return true;
            } else {
                decimalNum /= 10;
            }
        }
        
        return false;
    }
}