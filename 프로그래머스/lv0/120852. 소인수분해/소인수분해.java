import java.util.ArrayList;
import java.util.HashSet;
import java.util.Arrays;


class Solution {
    public int[] solution(int n) {
        
        HashSet<Integer> set = new HashSet<Integer>();
        while(!isShareOne(n)) {
            set.add(getDivisor(n));
            n = getShare(n);
        }
        int[] answer = set.stream().mapToInt(Integer::intValue).toArray();
        
        Arrays.sort(answer);

        return answer;
    }
    
    public int getDivisor(int share) {
        for (int divisor = 2; divisor <= share; divisor++) {
            if (share%divisor == 0) {
                return divisor;
            }
        }
        return -1;
    }
    
    public int getShare(int share) {
        for (int divisor = 2; divisor <= share; divisor++) {
            if (share%divisor == 0) {
                return share/divisor;
            }
        }
        return -1;
    }
    
    public boolean isShareOne(int share) {
        if (share == 1) {
            return true;
        } else {
            return false;
        }
    }
    
}