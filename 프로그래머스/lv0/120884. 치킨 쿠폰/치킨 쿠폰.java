class Solution {
    public int solution(int chicken) {
        int answer = 0;
        
        int numOfCoupon = chicken;
        while(numOfCoupon >= 10) {
            int serviceChicken = numOfCoupon / 10;
            answer += serviceChicken;
            numOfCoupon = numOfCoupon % 10 + serviceChicken;
        } 
        
        return answer;
    }
}