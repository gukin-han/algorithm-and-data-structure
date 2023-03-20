class Solution {
    private String[] placeHolderFrom = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    public int solution(String s) {
        
        for (int i = 0; i < placeHolderFrom.length; i++) {
            s = s.replace(placeHolderFrom[i], String.valueOf(i));
        }
        
        int answer = Integer.parseInt(s);
        return answer;
    }
}