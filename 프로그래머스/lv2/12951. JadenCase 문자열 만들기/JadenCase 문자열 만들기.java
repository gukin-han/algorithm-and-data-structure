class Solution {
    public String solution(String s) {
        s = s.toLowerCase();
        
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (i == 0) {
                
                if (isAlphabet(cur)) {
                    answer.append(capitalize(cur));
                    continue;
                } else {
                    answer.append(cur);
                    continue;
                }
            }

            
            if (i >= 1) {
                char prev = s.charAt(i-1);
                if (prev == ' ' && isAlphabet(cur)) {
                    answer.append(capitalize(cur));
                    continue;
                }
                
                answer.append(cur);
            } 
            
        }
        
        return answer.toString();
    }
    
    private boolean isAlphabet(char c) {
        return (c >= 'a' && c <= 'z');
    }
    
    private char capitalize(char c) {
        return (char) (c - 32);
    }
}