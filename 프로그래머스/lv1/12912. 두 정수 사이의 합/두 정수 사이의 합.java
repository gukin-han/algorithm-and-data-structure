class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        if (a == b) {
            return (long) a;
        }
        
        answer = sumBetween(a, b);
        
        return answer;
    }
    
    long sumBetween(int a, int b) {
        int bigger = 0;
        int smaller = 0;
        
        if (isBiggerThan(a, b)) {
            bigger = a;
            smaller = b;
        } else {
            bigger = b;
            smaller = a;
        }
        
        long sum = 0;
        for (int i = smaller; i <= bigger; i++) {
            sum += i;
        }
        
        return sum;
    }
    
    boolean isBiggerThan(int a, int b) {
        if (a > b) {
            return true;
        }
        return false;
    }
}