// Try-1-2023-02-22-stream
import java.util.stream.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        return IntStream.range(1, n).filter(num -> n % num == 1).min().getAsInt();
    }
}