class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        int kimIndex = 0;
        
        for (String lastName: seoul) {
            if (lastName.equals("Kim")) {
                break;
            } else {
                kimIndex++;
            }
        }
        
        answer = "김서방은 " + kimIndex + "에 있다";
        
        return answer;
    }
}