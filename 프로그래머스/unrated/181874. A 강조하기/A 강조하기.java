class Solution {
    public String solution(String myString) {
        StringBuilder answer = new StringBuilder();
        myString = myString.toLowerCase();
        for(int i = 0; i < myString.length(); i++) {
            char ch = myString.charAt(i);
            if (ch == 'a') ch = 'A';
            answer.append(ch);
        }
        return answer.toString();
    }
}