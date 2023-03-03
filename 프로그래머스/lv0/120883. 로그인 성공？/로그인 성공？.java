class Solution {
    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        String inputId = id_pw[0];
        String inputPw = id_pw[1];
        
        for (String[] givenIdPwSet: db) {
            String givenId = givenIdPwSet[0];
            String givenPw = givenIdPwSet[1];
            
            if (isMatchedAandB(inputId, givenId) && isMatchedAandB(inputPw, givenPw)) {
                return "login";
            }
            
            if (isMatchedAandB(inputId, givenId) && !isMatchedAandB(inputPw, givenPw)) {
                return "wrong pw";
            }
            
            if (!isMatchedAandB(inputId, givenId) && !isMatchedAandB(inputPw, givenPw)) {
                answer = "fail";
            }

            
        }
        return answer;
    }
    
    private boolean isMatchedAandB (String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                return false;
            }
        }
        
        return true;
    }
}