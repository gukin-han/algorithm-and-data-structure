class Solution {
    public int solution(int n) {
        // Create int array with the size of n
        // Find the divisor of n and assign it to the int array
        // Return the number of the divisor
        int numOfTheDivisor = 0;
        for (int divisor = 1; divisor <= n; divisor++) {
            if (n % divisor == 0) {
                numOfTheDivisor++;
            }
        }
        return numOfTheDivisor;
    }
}