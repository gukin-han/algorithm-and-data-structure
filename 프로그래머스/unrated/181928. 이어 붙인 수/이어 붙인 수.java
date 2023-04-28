class Solution {
    public int solution(int[] num_list) {
        StringBuilder oddSum = new StringBuilder();
        StringBuilder evenSum = new StringBuilder();
        
        for (int num: num_list) {
            if (num % 2 == 1) oddSum.append(num);
            else if (num % 2 == 0) evenSum.append(num);
        }
            
        int answer = Integer.parseInt(oddSum.toString()) + Integer.parseInt(evenSum.toString());
        return answer;
    }
}