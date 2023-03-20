import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                arrayList.add(i);
            }
        }
        
        answer = new int[arrayList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arrayList.get(i);
        }
                
        return answer;
    }
}