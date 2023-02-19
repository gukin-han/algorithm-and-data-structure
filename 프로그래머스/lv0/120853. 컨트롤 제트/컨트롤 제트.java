class Solution {
    public int solution(String s) {
        
        int answer = 0;
        // String to array by spliting it (" ")
        String[] stringArray = s.split(" ");
        // scan Array backwards to make it easier to solve than forwards
        int i = stringArray.length - 1;
        // look for 'Z'. if it's not, parse it int and add to the sum then move onto next index by adding -1
        // if it's, then skip index by -2
        while(i >= 0) {
            if(stringArray[i].equals("Z")) {
                i = i - 2;
            } else {
                answer += Integer.parseInt(stringArray[i]);
                i = i - 1;
            }
        }
        
        return answer;
    }
}