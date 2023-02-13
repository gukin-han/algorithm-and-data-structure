class Solution {
    public String solution(String rsp) {
        String answer = "";
        for(int i = 0; i < rsp.length(); i++) {
            answer += getAnswer(rsp.charAt(i));
        }
        return answer;
    }
    
    public int getAnswer(char c) {
        switch (c) {
            case '0': return 5;
            case '2': return 0;
            case '5': return 2;
        }
        return -1;
    }
}