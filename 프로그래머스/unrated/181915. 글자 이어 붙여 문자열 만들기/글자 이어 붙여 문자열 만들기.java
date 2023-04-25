class Solution {
    public String solution(String my_string, int[] index_list) {
        char[] charArr = my_string.toCharArray();
        
        StringBuilder sb = new StringBuilder(index_list.length);
        for (int idx: index_list) {
            sb.append(charArr[idx]);
        }
        
        return sb.toString();
    }
}