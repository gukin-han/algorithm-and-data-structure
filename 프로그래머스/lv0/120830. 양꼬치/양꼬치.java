class Solution {
    
    private final int priceOfFood = 12_000;
    private final int priceOfBeverage = 2_000;
    
    public int solution(int n, int k) {
        int numServiceBeverage = n / 10;
        int answer = n * priceOfFood + (k - numServiceBeverage) * priceOfBeverage;
        return answer;
    }
}