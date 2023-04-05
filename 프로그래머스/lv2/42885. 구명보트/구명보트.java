import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int leftP = 0;
        int rightP = people.length - 1;
        while (leftP <= rightP) {
            if (people[leftP] + people[rightP] <= limit) {
                leftP++;
                rightP--;
            } else {
                rightP--;
            }
            answer++;
            
        }
        
        return answer;
    }
}