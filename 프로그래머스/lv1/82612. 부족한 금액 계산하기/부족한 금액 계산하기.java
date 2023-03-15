class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        
        long moneyRequired = 0;
        for (int i = 1; i <= count; i++) {
            moneyRequired += (long) i * price; 
        }
        
        return (moneyRequired <= money)? 0: moneyRequired - money;

    }
}