class Solution {
    public int solution(String[] orders) {
        int answer = 0;
        for (String order: orders) {
            switch (order) {
                case "icecafelatte": answer += 5000; break;
                case "cafelatteice": answer += 5000; break;
                case "hotcafelatte": answer += 5000; break;
                case "cafelattehot": answer += 5000; break;
                case "cafelatte": answer += 5000; break;
                default: answer += 4500;
            }
        }
        return answer;
    }
}