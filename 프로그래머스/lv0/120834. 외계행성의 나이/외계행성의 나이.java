import java.util.*;

class Solution {
    public String solution(int age) {
        String ageDigit = "" + age;
        String ageAlphabet = "";
        
        for(int i = 0; i < ageDigit.length(); i++) {
            int intAge = (int) ageDigit.charAt(i) + 49;
            char charAge = (char) intAge;
            ageAlphabet = ageAlphabet + charAge;
        }
        return ageAlphabet;
    }
}