import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        // for loop through given number as the index from 0 to n/2 
        // use modulo(%) to find divisor (i % divisor == 0)
        // we don't know the size of array - > better use ArrayList<Integer>
        ArrayList<Integer> divisors = new ArrayList<Integer>();
        for (int i = 1; i <= (n/2); i++) {
            if (n % i == 0) {
                divisors.add(i);
            }
        }
        
        divisors.add(n);
        
        int[] answer = new int[divisors.size()];
        for (int i = 0; i < divisors.size(); i++) {
            answer[i] = divisors.get(i).intValue();
        }
        
        return answer;
    }
}