class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (currentChar == ' ') {
                answer += currentChar;
            } else if (currentChar >= 'A' && currentChar <= 'Z') {
                answer += (char) ((currentChar + n - 'A') % ('Z'-'A' + 1) + 'A');
            } else if (currentChar >= 'a' && currentChar <= 'z') {
                answer += (char) ((currentChar + n - 'a') % ('z'-'a' + 1) + 'a');
            }
        }
        return answer;
    }
}