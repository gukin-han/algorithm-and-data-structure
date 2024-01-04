class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int num: nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        int result = 0;
        for (int v: map.values()) {
            if (v == 1) return -1;
            else if (v <= 3) result += 1;
            else if (v <= 6) result += 2;
            else {
                int rest = v % 3;
                if (rest == 1) {
                    result += (v - 4) / 3;
                } else if (rest == 2)  {
                    result += (v - 5) / 3;
                } else {
                    result += (v - 6) / 3;
                }
                result += 2;
            }
        }
        
        return result;
    }
}