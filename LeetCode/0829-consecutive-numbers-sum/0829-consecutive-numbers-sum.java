class Solution {
    public int consecutiveNumbersSum(int n) {
//         int leftP = 1;
//         int rightP = 1;
//         int sum = 1;
//         int count = 1;
//         while (leftP <= n/2) {
//             if (sum < n) {
//                 sum += ++rightP;
//             } else if (sum == n) {
//                 count++;
//                 sum -= leftP++;
//             } else {
//                 sum -= leftP++;
//             }
//         }
        
//         return count;
        
        int answer = 1;
        int count = 1;
        n -= count;
        while (n > 0) {
            count++;
            n -= count;
            if (n % count == 0) answer++;
        }
        return answer;
    }
}