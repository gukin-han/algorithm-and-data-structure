//review?-yes-try-1-2023-02-26-sun-native

class Solution {
    public String[] solution(String my_str, int n) {

        // create start, end int variables with n int gap        
        int startIndex = 0;
        int endIndex = n; //  exclusive
        int i = 0;
        int arraySize = 0;
        

        // substring(start, end) and add to answer array[i++]
        if (my_str.length()%n == 0) {
            arraySize = my_str.length()/n;
        } else {
            arraySize = my_str.length()/n + 1;
        }
        String[] answer = new String[arraySize];
        
        // if end > my_str.length -> end = my_str
        // else start, end += n
        // break
        while (i < arraySize) {
            answer[i++] = my_str.substring(startIndex, endIndex);
            endIndex += n;
            startIndex += n;
            
            if (endIndex >= my_str.length()) {
                endIndex = my_str.length();
            } 
        }        
        return answer;
    }
}