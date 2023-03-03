class Solution {
    public int solution(int i, int j, int k) {
        // for loop from i to j (inclusive)
        // use contains method
        int answer = 0;

        for (int num = i; num <= j; num++) {
            String temp = "" + num;
            temp = temp.replaceAll("" + k,"A");
            for (int a = 0; a < temp.length(); a++) {
                if (temp.charAt(a) == 'A') {
                    answer++;
                }
            }
        }
        return answer;
    }
}