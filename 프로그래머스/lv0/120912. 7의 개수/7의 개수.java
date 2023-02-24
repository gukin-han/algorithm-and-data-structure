class Solution {
    public int solution(int[] array) {
        // use modulo 10
        // divide array element by 10.
        // if the share == 0 -> break!
        int answer = 0;
        int share = -1;
        int remainder = -1;
        for (int item: array) {
            share = item;
            while(share != 0) {
                remainder = share % 10;
                share = share / 10;
                if (remainder == 7) {
                    answer++;
                }
                
                if (share == 0) {
                    break;
                }
            }  
        }
        return answer;
    }
}