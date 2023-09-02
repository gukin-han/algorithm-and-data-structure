class Solution {
    
    private List<Integer> answer = new ArrayList<>();
    private List<List<Integer>> answers = new ArrayList<>();
    private int currentSum = 0;
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        dfs(candidates, target, 0);
        
        return answers;
    }
    
    private void dfs(int[] candidates, int target, int start) {
        if (currentSum > target) return;
        if (currentSum == target) {
            List<Integer> newest = new ArrayList<>(); 
            copy(answer, newest);
            answers.add(newest);
            return;
        }
        
        for (int i = start; i < candidates.length; i++) {
            int currentValue = candidates[i];
            answer.add(currentValue);
            currentSum += currentValue;
            dfs(candidates, target, i);
            currentSum -= currentValue;
            answer.remove(answer.size() - 1);
        }
    }
    private void copy(List<Integer> from, List<Integer> to) {
        for (int element: from) {
            to.add(element);
        }
    }
}