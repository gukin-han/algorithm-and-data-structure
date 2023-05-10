class Solution {
    public String solution(String my_string, String alp) {
        StringBuilder sb = new StringBuilder(my_string.length());
        for (String str: my_string.split("")) {
            if (str.equals(alp)) {
                str = str.toUpperCase();
            }
            sb.append(str);
            
        }
        return sb.toString();
    }
}