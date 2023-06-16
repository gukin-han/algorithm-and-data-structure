import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        StringBuilder answer = new StringBuilder();
        String[] numbersAsString = new String[numbers.length];
        boolean isAllZeros = true;
        for (int i = 0; i < numbers.length; i++) {
            numbersAsString[i] = String.valueOf(numbers[i]);
            if (numbers[i] != 0) isAllZeros = false;
        }
        
        Arrays.sort(numbersAsString, new Comparator<String>(){
            @Override 
            public int compare(String s1, String s2) {
                return (s1+s2).compareTo(s2+s1);
            }
        });
        
        for(int i = numbersAsString.length - 1; i >= 0; i--) {
            answer.append(numbersAsString[i]);
        }
        
        if(isAllZeros) return "0";
        return answer.toString();
    }
}