// 정규식으로 다시 풀어볼것
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        my_string += "A";
        int i = 0;
        int j = 0;
        
        while (i < my_string.length()) {
            if (isDigit(my_string.charAt(i))) {
                j = i;
                while (j < my_string.length()) {
                    if (isDigit(my_string.charAt(j))) {
                        j++;
                    } else {
                        answer += Integer.parseInt(my_string.substring(i, j));
                        i = j;
                        break;
                    }
                }
            } else {
                i++;
            }
        }
        return answer;
    }
    
    boolean isDigit(char c) {
        if ( ((int) c) >= 48 && ((int) c) <= 57) {
            return true;
        } else {
            return false;
        }
    }
}