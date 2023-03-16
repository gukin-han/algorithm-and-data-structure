import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[][] clothes) {
        
        Map<String,Integer> map = new HashMap();
        int initialValue = 2;
        
        for (String[] cloth: clothes) {
            if (!map.containsKey(cloth[1])) {
                map.put(cloth[1], initialValue);
            } else {
                map.put(cloth[1], (map.get(cloth[1]) + 1));
            }  
        }
        
        
        int answer = 1;

        for (Map.Entry<String, Integer> item : map.entrySet()) {
            answer *= item.getValue();
        }


        return answer - 1;
    }
}