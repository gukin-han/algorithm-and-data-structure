import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int number = 0;
        int round = 1;
        Set<String> set = new HashSet<>();
        set.add(words[0]);
        
        for (int i = 1; i < words.length; i++) {
            
            if (i % n == 0) round++;
            
            String cur = words[i];
            String prev = words[i - 1];
            
            if (set.contains(cur) || prev.charAt(prev.length() - 1) != cur.charAt(0)) {
                number = i % n + 1;
                return new int[]{number, round};
            }
            
            set.add(cur);
        }

        return new int[]{0, 0};
    }
}