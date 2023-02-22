// try-1-2023-02-22-wed-java original
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        for (int i = 1; i <= 9; i++) {
            boolean isIn = false;
            for (int num: numbers) {
                if (i == num) {
                    isIn = true;
                    break;
                }
            }
            if (!isIn) {
                answer += i;
            }
        }
        
        return answer;
    }
}