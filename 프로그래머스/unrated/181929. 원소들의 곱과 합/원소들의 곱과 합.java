class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        int mult = 1;
        for (int i = 0; i < num_list.length; i++ ) {
            sum += num_list[i];
            mult *= num_list[i];
        }
        return (sum*sum > mult)? 1:0;
    }
}