//try-2-2023-02-23-thu-java native
class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 2 ; i <= n; i += 2) {
            answer += i;
        }
        return answer;
    }
}

// class Solution {
//     public int solution(int n) {
//         int answer = 0;
        
//         for (int i = 0; i <= n; i++) {
//             if (isEven(i)) {
//                 answer += i;
//             }
//         }
//         return answer;
//     }
//     public boolean isEven(int n){
//         return (n%2 == 0);
//     }
// }