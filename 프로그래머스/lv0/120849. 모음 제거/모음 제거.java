class Solution {
    public String solution(String my_string) {
        String answer = "";
        // if there is 'a', 'e', 'i', 'o', 'u' - vowels check
        // not include this char in newly create object with StringBuffer class
        // use StringBuffer class for frequent adding and deleting instruction
        for (int i = 0; i < my_string.length(); i++) {
            if (isVowel(my_string.charAt(i))) {
                continue;
            } else {
                answer += my_string.charAt(i);
            }
        }
        
        return answer;
    }
    
    public boolean isVowel(char c) { 
        // check - https://www.wordexample.com/list/most-common-vowels
        // e -> a -> i -> o -> u is the most frequently used vowels
        if (c == 'e' || c == 'a' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        } else {
            return false;
        }
    }
}