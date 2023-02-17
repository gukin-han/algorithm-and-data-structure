class Solution {
    public int solution(int n) {
        int answer = 0;
        int givenLimit = 10;
        
        for (int i = 0; i <= givenLimit; i++) {
            if (n == fac(i)) {
                return i;
            } else if (n < fac(i)) {
                answer = i;
                break;
            }
        }
        return answer - 1;
    }
    
    public int fac(int num) {
        int answer = 1;
        
        if (num == 0) {
            return 0;
        }
        
        if (num == 1) {
            return 1;
        }
        
        for (int i = 1; i <= num; i++) {
            answer *= i;
        }
        
        return answer;
    }
}