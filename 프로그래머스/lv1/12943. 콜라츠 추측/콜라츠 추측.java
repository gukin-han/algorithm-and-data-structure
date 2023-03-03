class Solution {
    public int solution(long num) {
        int answer = 0;
        while (num != 1) {
            answer++;
            if (isOdd(num)) {
                num = (num * 3) + 1;
            } else {
                num = num / 2;
            }
            if (num != 1 && answer == 500) {
                answer = -1;
                break;
            }
        }
        
        return answer;
    }
    
    private boolean isOdd (long x) {
        if (x % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }
}