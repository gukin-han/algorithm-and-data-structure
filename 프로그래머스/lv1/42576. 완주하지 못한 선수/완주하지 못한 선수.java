import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        List<String> pList = new LinkedList<>(List.of(participant));
        List<String> cList = new LinkedList<>(List.of(completion));
        
        
        for(String c: cList) {
            pList.remove(c);
        }
        
        return pList.get(0);
    }
}