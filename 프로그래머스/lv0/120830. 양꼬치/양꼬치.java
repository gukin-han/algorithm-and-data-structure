//try-2-2023-02-23-thu-native
class Solution {
    public int solution(int n, int k) {
        k -= n/10;
        int answer = n * 12000 + k * 2000;
        return answer;
    }
}

// class Solution {
//     public int solution(int n, int k) {
        
//         int freeBeverageNum = n/10;
        
//         int foodOneServing = 12000;
//         int beverage = 2000;
        
//         int total = foodOneServing * n + beverage * (k - freeBeverageNum);

//         return total;
//     }
// }