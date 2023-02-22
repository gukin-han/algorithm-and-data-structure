// Try-2-2023-02-22
class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int numbersSum = 0;
        double numberCnt = 0;
        
        for (int num: numbers) {
            numbersSum += num;
            numberCnt++;
        }
        
        answer = numbersSum / numberCnt;
        return answer;
    }
}

// // Try-1
// class Solution {
//     public double solution(int[] numbers) {
//         int sum = 0;
        
//         for(int number: numbers) {
//             sum += number;
//         }
        
//         double arrayLength = numbers.length;
        
        
//         double answer = (sum/arrayLength);
//         return answer;
//     }
// }