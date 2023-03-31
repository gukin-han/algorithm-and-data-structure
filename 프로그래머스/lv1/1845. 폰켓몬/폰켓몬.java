import java.util.*;

class Solution {
    public int solution(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        HashMap<Integer, Integer> youHave = new HashMap<>();
        int numYouCanGet = nums.length / 2;
        int limit = numYouCanGet;
        int answer = 0;
        
        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
            youHave.put(nums[i], 0);
        }
        
        
        while(numYouCanGet > 0) {
            for (Map.Entry<Integer, Integer> pick: youHave.entrySet()) { //중복x
                int mon = pick.getKey(); // ex, 1 2 3
                
                if (answer == limit) {
                    break;
                }
                
                if (hm.get(mon) > 0) { // 1개 이상 남아있으면
                    numYouCanGet--; // 가질 수 있는 갯수 제한을 감소 시켜주기
                    if (youHave.get(mon) == 0) { // 하나도 가지고 있지 않다면
                        answer++;
                    }
                    youHave.put(mon, youHave.get(mon) + 1);
                    hm.put(mon, hm.get(mon) - 1);
                } else { // 0개 남아 있으면 pass
                    continue;
                }
            }
        }
        
        
        

        return answer;
    }
}