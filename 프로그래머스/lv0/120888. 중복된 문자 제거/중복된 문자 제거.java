import java.util.LinkedHashSet;

class Solution {
    public String solution(String my_string) {
        // Use LinkedHashSet to ignore duplicates while adding and to printout in the order.
        // Create instance of LinkedHashSet class where characters from my_string would be stored.
        // Put char of splited my_string in this object.
        // Concatenate chars to answer.
        
        LinkedHashSet<Character> linkedCharacterSet = new LinkedHashSet<Character>();
        for (int i=0; i < my_string.length(); i++) {
            linkedCharacterSet.add(my_string.charAt(i));
        }
        
        String answer = "";
        for (char ch: linkedCharacterSet) {
            answer += ch;
        }
        return answer;
    }
}