class Solution {
    public String solution(String my_string, int num1, int num2) {
        // create new String to store the answer
        // for loop through my_string and concatenate
        // if it runs into num1 and num2 then allocate the corresponding index
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            if(i == num1) {
                answer += my_string.charAt(num2);
            } else if (i == num2) {
                answer += my_string.charAt(num1);
            } else {
                answer += my_string.charAt(i);
            }
        }
        
        return answer;
    }
}