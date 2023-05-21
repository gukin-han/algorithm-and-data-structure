class Solution {
    public int[] solution(int[] arr) {
        int listSize = 0;
        for (int i:arr) {
            listSize += i;
        }
        int[] answer = new int[listSize];
        int idx = 0;
        for (int i: arr) {
            for (int j = 0 ; j < i ; j++) {
                answer[idx++] = i;
            }
        }
        return answer;
    }
}