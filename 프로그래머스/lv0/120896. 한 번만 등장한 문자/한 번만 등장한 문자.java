class Solution {
    public String solution(String s) {
        // create 0 int array with 26 element which is the number of Alphabet
        // cf.) (int) 'a' == 97 and (int) 'z' == 122. 
        // loop through String s by using charAt() method
        // count up the the number of frequency of the Alphabet
        // from the int array, loop through from the index 0
        // if its value == 1 then transform it into Alphabet with Uni code
        // concatenate them.
        
        int[] alphabetArray = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int index = (int) s.charAt(i) - 97; // (int) 'a' -> 0
            alphabetArray[index]++;
        }
        
        String answer = "";
        for (int i = 0; i < alphabetArray.length; i++) {
            if (alphabetArray[i] == 1) { //  happened once
                answer += (char) (i + 97); // int -> char
            }
        }
            
        
        return answer;
    }
}