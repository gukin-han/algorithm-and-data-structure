class Solution {
    public int[] solution(int brown, int yellow) {
        
        for (int row = yellow; row >= 1; row--) {
            if (yellow % row == 0) {
                int col = yellow / row;
                if (getBrown(row, col) == brown) {
                    return new int[]{row+2, col+2};
                }
            }
        }
        return null;
    }
    
    private int getBrown(int row, int col) {
        return 4 + row * 2 + col * 2;
    }
}