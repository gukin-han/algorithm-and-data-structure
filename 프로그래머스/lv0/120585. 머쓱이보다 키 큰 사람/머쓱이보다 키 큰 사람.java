//review?-no-2023-02-26-sun
class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        for (int classMateHeight: array) {
            if (classMateHeight > height) {
                answer++;
            }
        }
        return answer;
    }
}