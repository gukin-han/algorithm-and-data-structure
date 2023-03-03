class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        for (int i = 1; i < sides[0] + sides[1]; i++) {
            int a = sides[0];
            int b = sides[1];
            
            int theLongestSide = getLongestSide(a, b, i);
            if (theLongestSide < (a + b + i - theLongestSide)) {
                answer++;
            }
        }
        return answer;
    }
    
    private int getLongestSide(int a, int b, int i) {
        int tempLongest = Math.max(a, b);
        tempLongest = Math.max(tempLongest, i);
        
        return tempLongest;
    }
}