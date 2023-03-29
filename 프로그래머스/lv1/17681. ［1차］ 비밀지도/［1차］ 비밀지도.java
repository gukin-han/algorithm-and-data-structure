import java.util.Arrays;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for (int i = 0; i < arr1.length; i++) {
            answer[i] = Integer.toBinaryString(arr1[i]|arr2[i]); 
        }
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = answer[i].replace("1","#").replace("0"," ");
            if (answer[i].length() < n) {
                int temp = n - answer[i].length();
                String tempString = "";
                for (int j = 0; j < temp; j++) {
                    tempString += " ";
                }
                answer[i] = tempString + answer[i];
            }
        }
        return answer;
    }
}