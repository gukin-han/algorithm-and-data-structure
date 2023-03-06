import java.util.*;

class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        String concatenatedA = A + A;
        if (!concatenatedA.contains(B)) {
            return -1;
        }
        
        if (A.equals(B)) {
            return 0;
        }
        
        int pushCount = 0;
        while(!A.equals(B)) {
            A = moveOnce(A);
            pushCount++;
        }
        
       
        return pushCount;
    }
    
    String moveOnce(String givenString) {
        String temp = "" + givenString.charAt(givenString.length()-1);
        for (int i = 0; i < givenString.length() - 1; i++) {
            temp += givenString.charAt(i);
        }
        
        return temp;
    }
}