// Try-1-2023-02-22-Wed-stream
import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        return Arrays.stream(numlist).filter(num -> num % n == 0).toArray();
    }
}