class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] answer = new int[n];
        Stack<Integer> s = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
 
            while(!s.isEmpty()) {
                int prevIndex = s.peek();
                int prevValue = temperatures[prevIndex];
                int currentValue = temperatures[i];
                if (currentValue < prevValue) {
                    answer[i] = prevIndex - i;
                    break;
                } else {
                    s.pop();
                }
            }
            s.push(i);
        }

        return answer;
    }
}