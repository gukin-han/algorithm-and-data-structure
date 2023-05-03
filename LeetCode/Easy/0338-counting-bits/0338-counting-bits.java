class Solution {
    public int[] countBits(int n) {
        int[] answer = new int[n+1];
        
        for (int i = 0; i < answer.length; i++) {
            int index = i;
            while (index != 0) {
                answer[i] += index % 2;
                index = index / 2;
            }
        }
        return answer;
    }
}