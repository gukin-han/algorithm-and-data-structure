import java.util.Arrays;

class Solution {

    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        int firstMax = numbers[numbers.length -1]; 
        int secondMax = numbers[numbers.length -2];
        
        answer = firstMax * secondMax;
        return answer;
    }
}