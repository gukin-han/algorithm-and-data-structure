class Solution {
    public int[] solution(int[] numlist, int n) {
        // find max value in the numlist
        // get the array with the element of (num - n) to make it easy to sort
        // loop through from 0, 1, -1, 2, -2, ..., -(maxvalue - n)
        int[] answer = new int[numlist.length];
        
        for (int i = 0; i < numlist.length; i++) {
            numlist[i] = numlist[i] - n;
        }
        
        int indexCount = 0;
        int maxValue = getMaxValue(numlist);
        
        if (isInArray(numlist, 0)) {
                answer[indexCount++] = 0 + n;

            }
        
        for (int i = 1; i <= maxValue; i++) {
            
            
            if (isInArray(numlist, i)) {
                answer[indexCount++] = i + n;
            }
            
            if (isInArray(numlist, -i)) {
                answer[indexCount++] = -i + n;
            }
        }
        
        return answer;
    }
    
    int getMaxValue (int[] numlist) {
        int maxValue = 1;
        for (int i = 0; i < numlist.length; i++) {
            if (Math.abs(numlist[i]) > maxValue) {
                maxValue = Math.abs(numlist[i]);
            }
        }
        return maxValue;
    }
    
    boolean isInArray (int[] numlist, int x) {
        for (int num: numlist) {
            if (num == x) {
                return true;
            }
        }
        return false;
    }
}