class Solution {
    public int solution(int order) {
        // int to String
        // check every charater
        // if it's 3 or 6 or 9 then count up
        // return the count
        String givenOrder = "" + order;
        int answer = 0;
        char ch = '0';
            
        for (int i = 0; i < givenOrder.length(); i++) {
            ch = givenOrder.charAt(i);
            if(ch=='3' || ch=='6' || ch=='9') {
                answer++;
            }
        }
        
        return answer;
    }
}