class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        if (num_list.length >= 11) {
            for (int x: num_list) {
                answer+= x;
            }
        } else {
            answer++;
            for (int x: num_list) {
                answer*= x;
            }
        }
        return answer;
    }
}