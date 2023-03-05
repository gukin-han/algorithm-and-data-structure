class Solution {
    public int solution(int[] common) {
        int answer = 0;
        // check if it's arithmetic sequence or not
        if (isArithmeticSequence(common)) {
            return common[common.length - 1] + (common[common.length - 1] - common[common.length - 2]);
        } else {
            return common[common.length - 1] * (common[common.length - 1] / common[common.length - 2]);
        }
    
    }
    
    boolean isArithmeticSequence (int[] common) {
        for (int i = 0; i < common.length - 2; i++) {
            if ((common[i] - common[i+1]) == (common[i+1] - common[i+2])) {
                return true;
            }  
        }
         return false;
    }
}