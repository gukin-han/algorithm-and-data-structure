class Solution {
    public String solution(int num) {
        String answer = "";
        if (isOdd(num)) {
            answer += "Odd";
        } else {
            answer += "Even";
        }
        return answer;
    }
    
    boolean isOdd(int num) {
        return (num % 2 != 0);
    }
}