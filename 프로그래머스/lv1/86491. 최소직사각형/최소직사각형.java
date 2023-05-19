class Solution {
    public int solution(int[][] sizes) {
        int w = 0; // 가로 길이
        int h = 0; // 세로 길이
        for (int[] size: sizes) {
            w = Math.max(w, Math.max(size[0], size[1]));
            h = Math.max(h, Math.min(size[0], size[1]));
        }
        return w*h;
    }
}