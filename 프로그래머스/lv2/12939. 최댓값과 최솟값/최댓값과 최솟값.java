import java.util.*;

class Solution {
    public String solution(String s) {
        String[] strArray = s.split(" ");
        int[] intArray = new int[strArray.length];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = Integer.parseInt(strArray[i]);
        }
        
        Arrays.sort(intArray);
        
        return "" + intArray[0] + " " + intArray[intArray.length - 1];
    }
}