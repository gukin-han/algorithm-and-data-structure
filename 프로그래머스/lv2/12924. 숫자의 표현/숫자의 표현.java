class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int leftFixedIdx = 1;
        int rightMovingIdx = leftFixedIdx;
        
        int twoSum = leftFixedIdx;
        while(leftFixedIdx <= n) {
            if (twoSum < n) { // 투썸이 작으면 오른쪽 포인터 오른쪽으로 이동
                rightMovingIdx++;
                twoSum += rightMovingIdx;
            } else if(twoSum == n) { // 같으면 카운트 업 후 초기화
                answer++;
                leftFixedIdx++;
                rightMovingIdx = leftFixedIdx;
                twoSum = leftFixedIdx;
            } else { // 투썸이 크면 카운트 업 없이 초기화
                leftFixedIdx++;
                rightMovingIdx = leftFixedIdx;
                twoSum = leftFixedIdx;
            }
        }
        
        
        return answer;
    }
}