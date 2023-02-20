class Solution {
    public long solution(String numbers) {
        // Use replace method
        // Systax
        // myStr.replace('l', 'p'),  it returns String object.
        String[] numberAlphabetArray = new String[] {"zero", "one", "two", 
                                                     "three", "four", "five", 
                                                     "six", "seven", "eight", 
                                                     "nine"};
        int index = 0;
        String stringIndex = "";
        for (String numberAlphabet: numberAlphabetArray) {
            stringIndex = "" + index;
            numbers = numbers.replace(numberAlphabet, stringIndex);
            index++;
        }
        long answer = Long.parseLong(numbers);
        return answer;
        
    }
}