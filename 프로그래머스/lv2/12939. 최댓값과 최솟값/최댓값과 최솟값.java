class Solution {
    public String solution(String s) {
        String[] strArr = s.split(" ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for (int i = 0; i < strArr.length; i++) {
            int cur = Integer.parseInt(strArr[i]);
            max = Math.max(cur, max);
            min = Math.min(cur, min);
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(min))
            .append(" ")
            .append(String.valueOf(max));
        
        return sb.toString();
    }
}