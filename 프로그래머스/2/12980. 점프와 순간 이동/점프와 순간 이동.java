import java.util.*;

public class Solution {
    public int solution(int n) {
        return recursive(n);
    }
    
    private int recursive (int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n % 2 == 1) return recursive(n - 1) + 1;
        return recursive(n / 2);
    }
}