class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int totalCokesGetFromMart = 0;
        int cokesReturnToMart = 0;
        int cokesGetFromMart = 0;
        
        while (n >= a) {
            cokesReturnToMart = n - (n%a);
            cokesGetFromMart = (n/a)*b;
            totalCokesGetFromMart += cokesGetFromMart;
            n = n - cokesReturnToMart + cokesGetFromMart;
        }
        
        
        answer = totalCokesGetFromMart;
        return answer;
    }
}