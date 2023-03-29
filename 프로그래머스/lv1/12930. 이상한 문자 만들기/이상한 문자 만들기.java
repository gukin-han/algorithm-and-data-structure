class Solution {
    public String solution(String s) {
        String answer = "";
        s = s.toLowerCase();
        
        int wordIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                wordIndex = 0;
                answer += ch;
                continue;
            } else if (isEven(wordIndex)) {
                ch = (char) (ch + 'A'-'a');
            }
        
            answer += ch;
            wordIndex++;
        }
        return answer;
    }
    
    boolean isEven(int i) {
        return (i % 2 == 0);
    }
}