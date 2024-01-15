class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> answer = new ArrayList<>();
        answer.add(new ArrayList<>());
        answer.add(new ArrayList<>());

        int[] win = new int[100001];
        int[] lost = new int[100001];
        for (int[] match: matches) {
            win[match[0]]++;
            lost[match[1]]++;
        }

        for (int i = 1; i <= 100000; i++) {
            if (win[i] != 0 && lost[i] == 0) answer.get(0).add(i);
            else if (lost[i] == 1) answer.get(1).add(i);
        }

        return answer;
    }
}