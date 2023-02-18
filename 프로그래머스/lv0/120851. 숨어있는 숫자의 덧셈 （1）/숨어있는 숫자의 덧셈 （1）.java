class Solution {
    public int solution(String my_string) {
        int answer = 0;

        String onlyDigit = my_string.replaceAll("[\\D]", "");
        for (int i = 0; i < onlyDigit.length(); i++) {
            answer += (int) onlyDigit.charAt(i) - 48; // explicitly convert char to int
        }
            
        return answer;
    }
}