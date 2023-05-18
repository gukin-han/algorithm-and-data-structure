class Solution {
    public int solution(int[] num_list) {
        int multiplication = 1;
        int sum = 0;
        
        for (int i: num_list) {
            multiplication *= i;
            sum += i;
        }
        
        sum *= sum;
        return (multiplication < sum)? 1: 0;
    }
}