class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> answer = new ArrayList<>();

        int targetIndex = 0;
        for (int i = 1; i <= n; i++ ) {
            int targetValue = target[targetIndex];
            if (targetValue == i) {
                answer.add("Push");
                targetIndex++;
            }
            else {
                answer.add("Push");
                answer.add("Pop");
            }

            if (target[target.length - 1] == i) break;
        }

        return answer;
    }
}