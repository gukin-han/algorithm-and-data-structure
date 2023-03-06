class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        answer = 1;
        // check if it's integer
        if (a >= b && a%b == 0) {
            return 1; // finite decimal
        }
        
        // get (b / gcd)
        int denominator = (b / getGCD(a, b));
        for (int i = 2; i <= denominator; i++) {
            if ((denominator % i == 0) && isPrime(i)) {
                if (i != 2 && i !=5) {  
                    answer = 2;
                }
            }
        }
        return answer;
    }
    
    int getGCD(int a, int b){
        int tmp;
        int n;
        if(a<b){
            tmp = a;
            a = b;
            b = tmp;
        }
        while(b!=0){
            n = a%b;
            a = b;
            b = n;
        }
    return a;
    }
    
    boolean isPrime(int givenNum) {
        for (int i = 2; i < givenNum; i++) {
            if (givenNum % i == 0) {
                return false;
            }
        }
        return true;
    }
}