import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        int numDuplicate = 0;
        for (int lostEach: lost) {
            for (int reserveEach: reserve) {
                if (lostEach == reserveEach) {
                    numDuplicate++;
                }
            }
        }
        
        int[] newLost = new int[lost.length - numDuplicate];
        int[] newReserve = new int[reserve.length - numDuplicate];
        
        int temp = 0;
        for (int lostEach: lost) {
            boolean containFlag = false;
            for (int reserveEach: reserve) {
                if (lostEach == reserveEach) {
                    containFlag = true;
                    continue;
                }
            }
            if (!containFlag) {
                newLost[temp++] = lostEach;
            }
        }
        
        temp = 0;
        for (int reserveEach: reserve) {
            boolean containFlag = false;
            for (int lostEach: lost) {
                if (lostEach == reserveEach) {
                    containFlag = true;
                    break;
                }
            }
            if (!containFlag) {
                newReserve[temp++] = reserveEach;
            }
            
        }
        
        
        // n=5 -> 0,1,2,3,4,5,6 -> 0과 6은 더미
        boolean[] isLost = new boolean[n + 2]; 
        for (int victim: newLost) {
            isLost[victim] = true;
        }
        int answer2 = 0;
        boolean[] isLost2 = isLost.clone();
    
        for (int lender: newReserve){
            if (isLost[lender + 1]) { // 오른쪽 사람 체크
                isLost[lender + 1] = false;
            } else if(isLost[lender - 1]) { // 왼쪽 사람 체크
                isLost[lender - 1] = false;
            }
        }
        
        for (int lender: newReserve){
            if (isLost2[lender - 1]) { // 왼쪽 사람 체크
                isLost2[lender - 1] = false;
            } else if(isLost[lender + 1]) { // 오른쪽 사람 체크
                isLost2[lender + 1] = false;
            }
        }
        
        // check how many students are available
        for (int i = 0; i < isLost.length; i++) {
            if (!isLost[i]) {
                answer++;
            }
        }
        
        for (int i = 0; i < isLost2.length; i++) {
            if (!isLost2[i]) {
                answer2++;
            }
        }
        
        return Math.max(answer,answer2) - 2;
    }
}