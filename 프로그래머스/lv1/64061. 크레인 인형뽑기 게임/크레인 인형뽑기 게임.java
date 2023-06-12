import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> bucket = new Stack<>();

        for (int move: moves) {
            int pick = pickUp(board, move-1);
            if (pick == 0) {
                continue;
            } else if (bucket.size() == 0) {
                bucket.push(pick);
            } else if (bucket.peek() == pick) {
                bucket.pop();
                answer += 2;
            } else {
                bucket.push(pick);
            }
        }
        return answer;
    }
    
    public int pickUp(int[][] board, int move) {
        for (int i = 0; i < board.length; i ++) {
            int pick = board[i][move];
            if (pick != 0) {
                board[i][move] = 0;
                return pick;
            }
        }
        return 0;
    }
}