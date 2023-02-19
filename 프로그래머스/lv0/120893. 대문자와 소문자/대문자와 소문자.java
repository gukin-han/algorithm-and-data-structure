class Solution {
    public String solution(String my_string) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            if (isLowerCase(my_string.charAt(i))) {
                answer += (char) (my_string.charAt(i) - 32);
            } else {
                answer += (char) (my_string.charAt(i) + 32);
            }
        }
        return answer;
    }
    public boolean isLowerCase(char ch) {
        if ((int) ch >= 97 && (int) ch <= 122) {
            return true;
        } else {
            return false;
        }
    } 
}