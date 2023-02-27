class Solution {
    public int solution(int[][] board) {
        // get boardLimit
        // flip over danger area into -1 if it's not one of the mines
        // count up the area with 0
        for (int i = 0; i < board[0].length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (isMine(board, i, j)) {
                    board = flipOver(board, i, j);
                }
            }
        }
        
        int answer = countUpSafeZone(board);
        return answer;
    }
    private int[][] flipOver (int[][] board, int x, int y) { // Cartesian Coordinate
        int boardLimit = getBoardLimit(board);
        for (int i = x - 1; i <= x + 1; i++) { // Search around x, y
            for (int j = y - 1; j <= y + 1; j++) {
                if (isOutOfBoard(boardLimit, i, j) || isMine(board, i, j)) {
                    continue; // if it's out of board or the mine, pass.
                } else {
                    board[i][j] = -1;
                }
            }
        }
        
        return board;
    }
    
    private int getBoardLimit (int[][] board) {
        int boardLimit = board[0].length - 1; // 0, ..., n
        return boardLimit;
    }
    
    private boolean isOutOfBoard (int boardLimit, int x, int y) {
        if (x < 0 || y < 0 || x > boardLimit || y > boardLimit) {
            return true;
        } else {
            return false;
        }
    }
    
    private boolean isMine (int[][] board, int x, int y) {
        if (board[x][y] == 1) {
            return true;
        } else {
            return false;
        }
    }
    
    private int countUpSafeZone (int[][] board) {
        int count = 0;
        for (int i = 0; i < board[0].length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 0) {
                    count++;
                }
            }
        }
        return count;
    }
    
}