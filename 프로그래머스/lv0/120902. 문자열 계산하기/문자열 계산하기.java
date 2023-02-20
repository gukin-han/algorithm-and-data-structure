class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String[] my_stringArray = my_string.split(" ");
        answer += Integer.parseInt(my_stringArray[0]);
        
        for (int i = 2; i < my_stringArray.length; i += 2) {
            if (my_stringArray[i-1].equals("+")) {
                answer += Integer.parseInt(my_stringArray[i]);
            } else if (my_stringArray[i-1].equals("-")){
                answer -= Integer.parseInt(my_stringArray[i]);                
            }
        }
        return answer;
    }
}