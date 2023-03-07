class Solution {
    boolean solution(String s) {
        boolean answer = false;
        String sUpperCase = s.toUpperCase();
        
        if (howManyChar(sUpperCase, 'P') == howManyChar(sUpperCase, 'Y')) {
            return true;
        } 

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.

        return answer;
    }
    
    int howManyChar (String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(c == str.charAt(i)) {
                count++;
            }
        }
        
        return count;
    }
}