class Solution {
    public int solution(int[] numbers, int k) {
        int index = 2 * (k-1);
        int circularIndex = index%numbers.length;
        return numbers[circularIndex];
    }
        
}