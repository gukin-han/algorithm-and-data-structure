class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        // turn num into String to loop through with charAt method.
        // make boolean isIn to check if the number is in the num
        // if it matchs then return the index
        // if the loop ends and there isn't in.
        // answer = -1
        
        String numString = "" + num;
        boolean isInTheString = true;
        char charNeedToFind = (char) (k + '0');
        for (int i = 0; i < numString.length(); i++) {
            if (numString.charAt(i) == charNeedToFind) {
                answer = i + 1;
                return answer;
            } 
        }
        answer = -1;
        
        return answer;
    }
}