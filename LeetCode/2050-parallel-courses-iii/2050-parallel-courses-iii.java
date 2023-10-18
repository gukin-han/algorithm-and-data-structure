class Solution {
    private List<List<Integer>> requiredPrev = new ArrayList<>();
    private int n;
    private int[][] relations;
    private int[] time;
    private int[] dp;
    public int minimumTime(int n, int[][] relations, int[] time) {
        this.n = n;
        this.relations = relations;
        this.time = time;
        
        for (int i = 0; i < n + 1; i++) {
            requiredPrev.add(new ArrayList<Integer>());
        }
        
        for (int[] relation: relations) {
            int prev = relation[0];
            int next = relation[1];
            requiredPrev.get(next).add(prev);
        }
        boolean[] visited = new boolean[n+1];
        dp = new int[n+1];
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (visited[i]) continue;
            visited[i] = true;
            int calculated = dfs(i);
            answer = Math.max(calculated, answer);
        }
        
        return answer;
    }
    
    private int dfs(int course) {
        List<Integer> requiredPrevCourses = requiredPrev.get(course);
        if (requiredPrevCourses.isEmpty()) return time[course-1];
        if (dp[course] != 0) return dp[course];
        
        int maxValue = 0;
        for (int prev: requiredPrevCourses) {
            maxValue = Math.max(maxValue, dfs(prev) + time[course-1]);
        }
        dp[course] = maxValue;
        
        return dp[course];
    }
}