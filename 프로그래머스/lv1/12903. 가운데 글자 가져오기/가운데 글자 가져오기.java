class Solution {
    public String solution(String s) {
        String answer = "";
        if (s.length() % 2 == 0) { // even
            answer += s.charAt((s.length()-1)/2);
            answer += s.charAt((s.length()-1)/2 + 1);
        } else {
            answer += s.charAt(s.length()/2);
        }
        return answer;
    }
}