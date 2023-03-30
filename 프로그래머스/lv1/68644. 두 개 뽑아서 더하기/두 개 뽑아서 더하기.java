import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
        Set set = new Set();
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        int[] answer = new int[set.values.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = set.values.get(i);
        }
        Arrays.sort(answer);
        
        return answer;
    }
    
    class Set {
        ArrayList<Integer> values;
        
        Set(){
            this.values = new ArrayList<>();
        }
        
        void add(int value) {
            if (!values.contains(value)) {
                values.add(value);
            }
        }
        
    }
}