class Solution {
    public int solution(int[] box, int n) {
        int answer = 0;
        
        // the number of dices that can fit into the box can be calculated by multiplying divide shares.
        int numOfDiceAlongWidth = box[0] / n;
        int numOfDiceAlongDepth = box[1] / n;
        int numOfDiceAlongHeight = box[2] / n;
        
        answer = numOfDiceAlongWidth * numOfDiceAlongDepth * numOfDiceAlongHeight;
        return answer;
    }
}