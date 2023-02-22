// Try-2-2023-02-22-java original
class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 1) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}

// // Try-1-2023-02-22-stream
// import java.util.stream.*;

// class Solution {
//     public int solution(int n) {
//         int answer = 0;
//         return IntStream.range(1, n).filter(num -> n % num == 1).min().getAsInt();
//     }
// }