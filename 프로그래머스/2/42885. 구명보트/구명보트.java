import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        int l = 0;
        int r = people.length - 1;
        int answer = 0;
        
        while (l <= r) {
            if (people[l] + people[r] > limit) {
                r--;
                answer++;
            } else {
                l++;
                r--;
                answer++;
            }
        }
        
        return answer;
    }
}