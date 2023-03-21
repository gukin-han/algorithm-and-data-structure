import java.util.Hashtable;
import java.util.Map;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        Hashtable<String, Integer> ht = new Hashtable<>();
        for (String[] clothSet: clothes) {
            String currentCloth = clothSet[1];
            if (ht.containsKey(currentCloth)) {
                ht.put(currentCloth, (ht.get(currentCloth) + 1));
            } else {
                ht.put(currentCloth, 1);
            }
        }
        
        for (Map.Entry<String, Integer> item: ht.entrySet()) {
            answer *= (item.getValue() + 1);
        }
        
        return answer - 1;
    }
}