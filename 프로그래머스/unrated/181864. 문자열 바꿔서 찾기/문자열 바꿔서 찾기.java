class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        StringBuilder newPat = new StringBuilder();
        for (char ch: pat.toCharArray()) {
            if (ch == 'A') newPat.append('B');
            else newPat.append('A');
        }
        return myString.contains(newPat.toString())? 1: 0;
    }
}