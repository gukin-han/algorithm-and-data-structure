class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = getGCD(n, m);
        answer[1] = (int) (n * m / getGCD(n,m));
        return answer;
    }
    
    int getGCD(int n, int m) {
        if (n < m) {
            int temp = n;
            n = m;
            m = temp;
        }
        
        if (m == 0) {
            return n;
        } else {
            return getGCD(m, n%m);
        }
    }
}