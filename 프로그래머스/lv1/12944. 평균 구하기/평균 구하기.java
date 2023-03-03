class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        double sum = 0;
        int count = arr.length;
        for (int item: arr) {
            sum += item;
        }
        
        answer = sum / count;
        return answer;
    }
}