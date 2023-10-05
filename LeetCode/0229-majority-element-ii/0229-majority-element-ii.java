class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num: nums) {
            map.put(num, map.getOrDefault(num ,0) + 1);
        }
        
        int criteria = nums.length / 3;
        List<Integer> answer = new ArrayList<>();
        for (int key: map.keySet()) {
            if (map.get(key) > criteria) answer.add(key);
        }
        
        return answer;
    }
}