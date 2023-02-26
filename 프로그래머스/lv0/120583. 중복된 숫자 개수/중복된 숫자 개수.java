//review?-no-2023-02-26-sun-naitve
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int[] possibleElement = new int[1000];
        for (int item: array) {
            possibleElement[item]++;
        }
        answer = possibleElement[n];
        return answer;
    }
}