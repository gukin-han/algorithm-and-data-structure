import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        
        if (cacheSize == 0) return cities.length * 5;
        LinkedList<String> list = new LinkedList<>();
        for(String city: cities) {
            city = city.toLowerCase();
            int idx = list.indexOf(city);
            if (idx == -1) { // not exist
                answer+= 5;
                if (list.size() >= cacheSize) {
                    list.removeLast();
                } 
                list.addFirst(city);
            } else { // exist
                answer++;
                list.remove(idx);
                list.addFirst(city);
            }
        }
        return answer;
    }
}