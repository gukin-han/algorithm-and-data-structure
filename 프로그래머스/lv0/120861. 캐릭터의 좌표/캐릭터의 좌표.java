//review?-yes-try-1-2023-02-26-sun-native
class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] currentPosition = new int[2];
        for (String key: keyinput) {
            if (key.equals("left") && currentPosition[0] > -(board[0] - 1)/2) {
                currentPosition[0]--;
            } else if (key.equals("right") && currentPosition[0] < (board[0] - 1)/2) {
                currentPosition[0]++;
            } else if (key.equals("down") && currentPosition[1] > -(board[1] - 1)/2) {
                currentPosition[1]--;
            } else if (key.equals("up") && currentPosition[1] < (board[1] - 1)/2) {
                currentPosition[1]++;
            }
        }
        return currentPosition;
    }
}