class Solution {
    public int solution(int n) {
        // 1. turn it into trinary digit
        // 2. flip it over
        
        int answer = 0;
        return threeToDec(decToThree(n));
    }
    
    long decToThree(int n) {
        String output = "";
        
        long temp = 1;
        while (n != 0) {
            if (temp > n) {
                temp /= 3;
                output += "" + (n/temp);
                n %= temp;
            } else {
                temp *= 3;
            }
        }
        
        output = new StringBuilder(output).reverse().toString(); 
        return Long.parseLong(output);
    }
    
    int threeToDec(long n) {
        int output = 0;
        int three = 1;
        while (n != 0) {
            output += (n % 10) * three;
            n /= 10;
            three *= 3;
        }
        
        return (int) output;
    }
}