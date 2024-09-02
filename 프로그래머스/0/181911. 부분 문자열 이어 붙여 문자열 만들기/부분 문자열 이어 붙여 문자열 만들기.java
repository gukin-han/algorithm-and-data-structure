class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        StringBuilder sb = new StringBuilder();
        int size = parts.length;
        for (int i = 0; i < size; i++) {
            sb.append(my_strings[i].substring(parts[i][0], parts[i][1]+ 1));
        }
        return sb.toString();
    }
}