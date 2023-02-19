class Solution {
    public String solution(String cipher, int code) {
        // while loop
        // check char at every given number(code-1)
        // code += code
        
        String answer = "";
        for (int i = code - 1; i < cipher.length(); i += code) {
            answer += cipher.charAt(i);
        }
        return answer;
    }
}